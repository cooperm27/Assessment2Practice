import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MainMethods {


	
	
	public static void main(String[] args) {
		HashMap<String, String> foodColors = new HashMap<>();
		LinkedList <String> words = new LinkedList<>();
		List<String> numbers = new LinkedList<>();
		words.add("hi");
		words.add("Mom!");
		foodColors.put("Pea", "Green");
		foodColors.put("Cherry", "Red");
		foodColors.put("Plumb", "Purple");
		numbers.add("one");
		numbers.add("one");
		numbers.add("two");
		numbers.add("one");
		numbers.add("three");
		
		System.out.println(Assessment2Practice.espanol());
		System.out.println(Assessment2Practice.lift(words));
		System.out.println(Assessment2Practice.takeItAway(foodColors, "Cherry"));
		System.out.println(Assessment2Practice.listToSet(numbers));

	}

}
