package generics;

public class Wrapper <T>{
	T val;
	
	public Wrapper (T val) {
		this.val = val;
	}
	
	public T getVal() {
		return val;
	}
}
