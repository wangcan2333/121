package wwww;

import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
			HashMap<String,String> m = new HashMap<String,String>();
			
			m.put("姓名","uzi");
			m.put("年龄", "18");
			m.put("性别", "男");
			
			String value1 = m.get("姓名");
			String value2 = m.get("年龄");
			String value3 = m.get("性别");
			System.out.println(value1);
			System.out.println(value2);
			System.out.println(value3);
	}

}
