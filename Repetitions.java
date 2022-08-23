import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Repetitions {
	public static void howMany(ArrayList<Integer> arr) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int number : arr) {
			hm.put(number, hm.containsKey(number) ? hm.get(number) + 1 : 1);
		}
		
		for (Map.Entry<Integer, Integer> item : hm.entrySet()) {
			System.out.println(item.getKey() + " : " + item.getValue());
		}
		
	}
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(3);
		numbers.add(2);
		numbers.add(1);
		howMany(numbers);

	}

}
