import java.util.HashMap;

public class MapTest {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("people", "���");
		map.put("baseball", "�߱�");
		
		System.out.println(map.get("people"));
		System.out.println(map.containsKey("people"));
		System.out.println(map.remove("people"));
		System.out.println(map.size());
	}
}
