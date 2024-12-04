package part01;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.util.zip.GZIPInputStream;

public class Ex03 {
	public static void main(String[] args) {
		final String trainImagesURL = "http://yann.lecun.com/exdb/mnist/train-images-idx3-ubyte.gz";
		final String trainLabelsURL = "http://yann.lecun.com/exdb/mnist/train-labels-idx1-ubyte.gz";

		try {
		  URL url = new URL(trainImagesURL);
		  InputStream stream = url.openConnection().getInputStream();
		  InputStream imgIn = new GZIPInputStream(stream);

		  url = new URL(trainLabelsURL);
		  stream = url.openConnection().getInputStream();
		  InputStream lblIn = new GZIPInputStream(stream);

		  byte[] tempBuffer = new byte[16];
		  imgIn.read(tempBuffer, 0, 16);
		  lblIn.read(tempBuffer, 0, 16);

		  byte[] dataBuffer = new byte[1];
		  String[] labels = new String[60000];
		  float[][][] images = new float[60000][28][28];
		  for (int i = 0; i < 60000; i++){
		    System.out.printf("Iter: %d/60000\n", i + 1);
		    lblIn.read(dataBuffer, 0, 1);
		    labels[i] = Integer.toString(dataBuffer[0] & 0xFF);

		    for (int j = 0; j < 784; j++){
		      imgIn.read(dataBuffer, 0, 1);
		      float pixelVal = (dataBuffer[0] & 0xFF) / 255.f;
		      images[i][j / 28][j % 28] = pixelVal;
		    }
		  }
		} catch (IOException e) {
		  e.printStackTrace();
		}
	}
}
