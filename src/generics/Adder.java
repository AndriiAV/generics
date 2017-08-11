package generics;

public class Adder <T extends Number>{
	private double value;
	
	public void add(T val) {
		value += val.doubleValue();
	}

	@Override
	public String toString() {
		return String.format("Adder [value=%s]", value);
	}
	
	
}
