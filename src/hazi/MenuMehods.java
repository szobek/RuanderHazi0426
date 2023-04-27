package hazi;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public abstract class MenuMehods {

	public static void methodChange(String menupont,HashMap<Zoldseg, Integer> zoldseges,BufferedReader br) {
		switch (menupont) {
		case "1" -> ujTermek(zoldseges,br);
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

	private static void ujTermek(HashMap<Zoldseg, Integer> zoldseges, BufferedReader br) {
		String name="";
		int ar=0;
		do {
			System.out.print("Adja meg az új termék nevét: ");
			try {
				name=br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} while (name.equals(""));
		
		do {
			System.out.print("Adja meg az új termék árát: ");
			try {
				ar=Integer.parseInt(br.readLine());
			} catch (Exception e) {
				// TODO: handle exception
			}
		} while (ar<10);
		
		zoldseges.put(new Zoldseg(name, ar), 1);
		System.out.println("Az új termék mentve");
		System.out.println();
	}
}
