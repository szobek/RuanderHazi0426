package hazi;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Menu {
	
	String menupont;

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public void show() {
		do {
			System.out.println("Válasszon menüt!");
			System.out.println("1 - új termék/ár felvitel ");
			System.out.println("2 - termék törlése");
			System.out.println("3 - árváltozás");
			System.out.println("4 - terméklista");
			System.out.println("5 - Vásárlás");
			System.out.println("6 - kilépés");
			switch(menupont) {
			case "1" -> ujTermek(); 
			case "2" -> termekTorles(); 
			case "3" -> arModositasa(); 
			case "4" -> lista(); 
			case "5" -> vasarlas(); 
			}
		} while (menupont.equals("6"));
		
	}
}
