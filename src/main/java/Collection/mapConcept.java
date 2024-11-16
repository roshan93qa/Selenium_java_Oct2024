package Collection;

import java.util.HashMap;
import java.util.Map;

public class mapConcept {
	public static void main(String[] args) {
		Map<String ,String>studentMap=new HashMap<String, String>();
		studentMap.put("Tom", "A");
		studentMap.put("Lisa", "B");
		studentMap.put("Roshan", "C+");
		studentMap.put("Rahul", "D");
		studentMap.put("Deshmukh", "A++");
		System.out.println(studentMap);
		System.out.println(studentMap.size());
		System.out.println(studentMap.get("Tom"));
		System.out.println(studentMap.remove("Tom"));
		System.out.println(studentMap);
		System.out.println(studentMap.containsKey("Roshan"));
		System.out.println(studentMap.containsValue("A++"));
		System.out.println(studentMap.keySet());
		System.out.println(studentMap.values());
		System.out.println(studentMap.isEmpty());
		studentMap.clear();
		System.out.println(studentMap);
	}

}
