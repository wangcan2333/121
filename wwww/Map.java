package wwww;

import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
			HashMap<String,String> m = new HashMap<String,String>();
			
			m.put("����","uzi");
			m.put("����", "18");
			m.put("�Ա�", "��");
			
			String value1 = m.get("����");
			String value2 = m.get("����");
			String value3 = m.get("�Ա�");
			System.out.println(value1);
			System.out.println(value2);
			System.out.println(value3);
	}

}
