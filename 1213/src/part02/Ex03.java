package part02;

import java.util.Arrays;
import java.util.List;

public class Ex03 {
	public static void main(String[] args) {
		List<TravelCustomer> customerList = Arrays.asList(new TravelCustomer("김남해", 10, 100), new TravelCustomer("김서해", 20, 150), new TravelCustomer("김동해", 30, 200));
		
		customerList.stream().forEach(c -> System.out.printf("%s\n", c));
		customerList.stream().map(c -> c.getName()).forEach(s -> System.out.printf("%s\n", s));
		System.out.printf("%d\n", customerList.stream().mapToInt(c -> c.getPrice()).sum());
		customerList.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted().forEach(System.out::println);
	}
}