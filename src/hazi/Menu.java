package hazi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Menu {
	
	String menupont;

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public void show(HashMap<Zoldseg, Integer> zoldseges) {
		do {
			System.out.println("Válasszon menüt!");
			System.out.println("1 - új termék/ár felvitel ");
			System.out.println("2 - termék törlése");
			System.out.println("3 - árváltozás");
			System.out.println("4 - terméklista");
			System.out.println("5 - Vásárlás");
			System.out.println("6 - kilépés");
			try {
				menupont = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		MenuMehods.methodChange(menupont,zoldseges,br);	
		} while (!menupont.equals("6"));
		
	}
	
}
