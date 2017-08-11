package generics;

import java.util.LinkedList;
import java.util.List;

public class Container <T> {
	List<T> values = new LinkedList<>();
	
	public void printByFilter (Filter<? super T> filter) {
		for (T val : values) {
			if (filter.apply(val)) {
				System.out.println(val);
			}
		}
	}
	
	public void add(T val) {
		values.add(val);
	}
	
	public void add(Wrapper<? extends T> w) {
		values.add(w.getVal());
	}
}
