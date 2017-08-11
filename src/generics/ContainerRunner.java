package generics;

import java.util.LinkedList;
import java.util.RandomAccess;

public class ContainerRunner {
	public static void main(String[] args) {
		Container<Integer> cont = new Container<>();
		cont.add(3);
		cont.add(5);
		cont.add(7);
		cont.add(10);
		
		cont.printByFilter(new Filter<Number>() {
			@Override
			public boolean apply(Number val) {
				return val.doubleValue()<=7;
			}
		});
		System.out.println("------------");
		cont.printByFilter(x -> (x.doubleValue()<=5));
		System.out.println("------------");
		
		Container<Number> secondContainer = new Container<>();
		secondContainer.add(5);
		secondContainer.add(5.);
		secondContainer.add(new Wrapper<Integer>(5));
		secondContainer.add(new Wrapper<Double>(5.));
		secondContainer.add(new Wrapper<Number>(5.));
		secondContainer.printByFilter(x->true);
		System.out.println(new LinkedList<>() instanceof RandomAccess);
		
	}
}
