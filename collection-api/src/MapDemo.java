import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("jack", "jill");
		map.put("scott", "tiger");
		map.put("polo", "lili");
		map.put("jack", "rose");
		
		for(String key : map.keySet())
			System.out.println(key + ": " + map.get(key));
		
//		System.out.println("scott: " + map.get("scott"));
//		System.out.println("polo: " + map.get("polo"));
//		System.out.println("jack: " + map.get("jack"));
	}
}
