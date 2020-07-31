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

public class Assessment2Practice {


 public static HashMap<Integer, String> espanol() {
	 
	 HashMap<Integer, String> espanol = new HashMap<>();
	 espanol.put(1, "uno");
	 espanol.put(2, "does");
	 espanol.put(3, "tres");
	 return espanol;
 	} 	
public static int lift (LinkedList<String> words) {
	int wordCount = 0;
	for (int i =0; i < words.size(); i++) {
		String newWord = words.get(i);
		newWord.toUpperCase();
		wordCount++;
	} return wordCount;
	}
public static boolean takeItAway (HashMap<String, String> foodColors, String color) {
	
	if (foodColors.containsKey(color)) {
		foodColors.remove(color);
	} return true;
	}
public static Set<String> listToSet (List<String> match) {
	Set<String> newSet = new HashSet<>();
	for (int i = 0; i < match.size(); i++) {
		newSet.addAll(match);
		} return newSet;
}
}

