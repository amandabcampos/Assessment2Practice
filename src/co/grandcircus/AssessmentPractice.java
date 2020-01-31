package co.grandcircus;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AssessmentPractice {
	
	public static Map<Integer,String> espanol(){
		Map<Integer,String> espanolMap = new HashMap<>();
		espanolMap.put(1, "Uno");
		espanolMap.put(2, "Dos");
		espanolMap.put(3, "Tres");
		return espanolMap;	
	}
	
	public static int lift(List<String> words) {		
		for (int i=0; i<words.size(); i++) {
			String newWord = words.get(i).toUpperCase();
			words.remove(i);
			words.add(i,newWord);
		}
		return words.size();
	}
	

	public static boolean takeItAway(Map<String,String> map, String key) {
		boolean containedKey = map.containsKey(key);	
		map.remove(key);	
		return containedKey;	
	}
	
	public static <T> Set<T> listToSet(List<T> elements){ 
		Set<T> theSet = new HashSet<>();
		for (T element : elements) {
			theSet.add(element);
		}
		return theSet;
	}
	
	public static int howFarApart(List<String> theList, String itemOne, String itemTwo) {
		if (theList.contains(itemOne) && theList.contains(itemTwo)) {
			int indexDifference = theList.indexOf(itemTwo) - theList.indexOf(itemOne);
			return indexDifference;
		}
		throw new IllegalArgumentException();
	}
	
	public static double makeADifference(double[] array, int indexOne, int indexTwo) {
		try {
			double difference = array[indexOne] - array[indexTwo];
			return difference;
		} catch(ArrayIndexOutOfBoundsException e) {
			return 0.0;
		}
	}
	
	public static Set<Integer> neverTellMeTheOdds(int[] numbers){
		Set<Integer> evenNumbers = new HashSet<>();
		for (int number: numbers) {
			if (number %2 ==0) {
				evenNumbers.add(number);
			}
		}
		return evenNumbers;
	}
	
	public static int fleeZero(int[] numbers) {
		int positives = 0;
		for (int i =0; i < numbers.length; i++) {
			if (numbers[i] > 0) {
				numbers[i]+=1;
				positives++;
			} else if (numbers[i] <0) {
				numbers[i]-=1;
			}
		}
		System.out.println(Arrays.toString(numbers));
		return positives;	
	}

}
