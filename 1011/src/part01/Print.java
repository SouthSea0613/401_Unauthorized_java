package part01;

public interface Print {
	public abstract void print(String str);
	public void show(String str);	// static 생략가능 > 대부분 이렇게 많이 씀
	void delete(String str);	// public static 생략가능
}
