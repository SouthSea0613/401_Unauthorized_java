package test;

public class Nam {
	public static void main(String[] args) {
		int[] arr = { 3, 2, 1, 5, 4 };
			for(int i=0; i<arr.length; i++) {
				for(int j=i+1; j<arr.length;j++) {
					if(arr[i]>arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						
					}
				}
			}
	}
}

//화요일
//package exam;
//
//public class Ex01 {
//   public static void main(String[] args) {
//      int[] arr = { 3, 2, 1, 5, 4 };
//      int[] jieun = new int[5];
//      int min = arr[0];   // 3
//      int idx = 0;
//
//      for (int j = 1; j < arr.length; j++) {
//         min = arr[j];   // 3   2   6
//         idx = j;
//         for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < min) {   
//               min = arr[i];   
//               idx = i;
//            }
//         }
//         arr[idx] = 6;   
//         jieun[j] = min;
//      }
//   
//      for(int j : jieun) {
//         System.out.println(j);
//      }








//public static void main(String[] args) {
//    int[] arr = { 3, 2, 1, 5, 4 };
//    int[] jieun = new int[5];
//    int min = arr[0];   // 3
//    int idx = 0;
//
//    for (int j = 1; j < arr.length; j++) {
//       min = arr[j];   // 3   2   6
//       idx = j;
//       for (int i = 0; i < arr.length; i++) {
//          if (arr[i] < min) {   
//             min = arr[i];   
//             idx = i;
//          }
//       }
//       arr[idx] = 6;   
//       jieun[j] = min;
//    }
// 
//    for(int j : jieun) {
//       System.out.println(j);
