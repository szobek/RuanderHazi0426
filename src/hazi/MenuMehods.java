package hazi;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public abstract class MenuMehods {

	public static void methodChange(String menupont,HashMap<Zoldseg, Integer> zoldseges,BufferedReader br) {
		switch (menupont) {
		case "1" -> ujTermek(zoldseges,br);
		case "2" -> termekTorles(zoldseges,br);
		case "3" -> arModositasa(zoldseges,br);
		case "4" -> lista(zoldseges);
		case "5" -> vasarlas(zoldseges,br);
		}

	}

	private static void vasarlas(HashMap<Zoldseg, Integer> zoldseges,BufferedReader br) {
		String name="";
		int darabSzam = 0;
		
		System.out.println("Melyik terméket venné meg?");
		try {
			name=br.readLine();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		Iterator it = zoldseges.entrySet().iterator();
		while(it.hasNext()) {
			Entry item = (Map.Entry)it.next();
			if(name.equals(((Zoldseg) item.getKey()).getName())) {
				System.out.println("A termék: "+((Zoldseg) item.getKey()).getName()+ ". Mennyit venne?");
				
				try {
					darabSzam=Integer.parseInt(br.readLine());
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Hibás mennyiség!");
					
				}
				if(darabSzam>Integer.parseInt(item.getValue().toString())) {
					System.out.println("Nincs ennyi!");
				} else {// lehetne egy sor de így átláthatóbb
					int ossz = ((Zoldseg) item.getKey()).getAr() * darabSzam;
					System.out.println("Összesen: "+ossz+"Ft ");	
				}
				
			}
		}
		
		System.out.println();
	}

	private static void lista(HashMap<Zoldseg, Integer> zoldseges) {
		for (Map.Entry<Zoldseg, Integer> elem : zoldseges.entrySet()) {

			System.out.println(elem.getKey().getName()+" "+elem.getKey().getAr() + "Ft");
		}
		System.out.println();
	}

	private static void termekTorles(HashMap<Zoldseg, Integer> zoldseges,BufferedReader br) {
		String name="";
		boolean talalat = false;
		System.out.println("Melyik terméket törölné?");
		try {
			name=br.readLine();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Iterator it = zoldseges.entrySet().iterator();
		while(it.hasNext()) {
			Entry item = (Map.Entry)it.next();
			if(name.equals(((Zoldseg) item.getKey()).getName())) {
				talalat=true;
				try {
					it.remove();	
				} catch (Exception e) {
					System.out.println("Rendszerhiba!");
				}
				
			}
		}
		
		if(!talalat) {
			System.out.println("Nincs ilyen termék");	
		}

		
	}

	private static void arModositasa(HashMap<Zoldseg, Integer> zoldseges,BufferedReader br) {
		String name="";
		int ar = 0;
		boolean talalat = false;
		System.out.println("Melyik termék ára módosul?");
		try {
			name=br.readLine();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for (Map.Entry<Zoldseg, Integer> elem : zoldseges.entrySet()) {
			if(name.equals(elem.getKey().getName())) {
				do {
					System.out.println("Adja meg az új árát ("+elem.getKey().getName()+")");
					try {
						ar=Integer.parseInt(br.readLine());
					} catch (Exception e) {
						// TODO: handle exception
					}
					
				} while (ar<1);
				talalat=true;
				elem.getKey().setAr(ar);
			}

		}
		if(!talalat) {
			System.out.println("Nincs ilyen termék");	
		}
		
	}

	private static void ujTermek(HashMap<Zoldseg, Integer> zoldseges, BufferedReader br) {
		String name="";
		int ar=0,darabSzam=0;
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

		do {
			System.out.print("Adja meg az új termék darabszámát: ");
			try {
				darabSzam=Integer.parseInt(br.readLine());
			} catch (Exception e) {
				// TODO: handle exception
			}
		} while (darabSzam<1);
		zoldseges.put(new Zoldseg(name, ar), darabSzam);
		System.out.println("Az új termék mentve");
		System.out.println();
	}
}
