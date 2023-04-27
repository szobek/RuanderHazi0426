package hazi;

import java.util.HashMap;
import java.util.Map;

public abstract class MenuMehods {

	public static void methodChange(String menupont,HashMap<Zoldseg, Integer> zoldseges) {
		switch (menupont) {
		case "1" -> ujTermek();
		case "2" -> termekTorles();
		case "3" -> arModositasa();
		case "4" -> lista(zoldseges);
		case "5" -> vasarlas();
		}

	}

	private static Object vasarlas() {
		// TODO Auto-generated method stub
		return null;
	}

	private static void lista(HashMap<Zoldseg, Integer> zoldseges) {
		for (Map.Entry<Zoldseg, Integer> elem : zoldseges.entrySet()) {

			System.out.println(elem.getKey().getName()+" "+elem.getKey().getAr() + "Ft");
		}
		System.out.println();
	}

	private static Object termekTorles() {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object arModositasa() {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object ujTermek() {
		// TODO Auto-generated method stub
		return null;
	}
}
