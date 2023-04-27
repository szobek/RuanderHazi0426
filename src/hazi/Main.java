package hazi;

import java.util.HashMap;

public class Main {
static HashMap<Zoldseg, Integer> zoldseges = new HashMap<Zoldseg,Integer>();
	public static void main(String[] args) {
		
		zoldseges.put(new Zoldseg("Eper", 2900), 102);
		zoldseges.put(new Zoldseg("Alma", 590), 12);
		zoldseges.put(new Zoldseg("Burgony", 350), 36);
		zoldseges.put(new Zoldseg("Gomba", 890), 22);
		zoldseges.put(new Zoldseg("Cukkini", 750), 17);
		zoldseges.put(new Zoldseg("Kivi", 850), 20);
		new Menu().show(zoldseges);
		/*
		zoldseges.put("Eper", 2900);
		zoldseges.put("Alma", 590);
		zoldseges.put("Burgonya", 350);
		zoldseges.put("Cukkini", 890);
		zoldseges.put("Gomba", 750);
		zoldseges.put("Kivi", 850);
*/
	}
}
