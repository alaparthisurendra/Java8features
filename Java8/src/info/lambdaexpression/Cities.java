package info.lambdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Cities {

	public static void main(String[] args) {
		
		List<String> allCities=Arrays.asList("Hyderabad","Bangalore","chennai","pune","mumbai","delhi");
		
		allCities.stream().filter(city -> city.equals("pune")).forEach(city -> System.out.println("pune is exists"));
		//allCities.stream().filter(c -> c.length() > 7)
		
		System.out.println("---------------------------------");
		
		//optional is nothing but wrapper around the object
		Optional<String> optional = allCities.stream().filter(cities -> cities.equals("chennai")).findFirst();
		if(optional.isPresent()) //here chennai is not available also this loop will not fail.
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}

	}

}
