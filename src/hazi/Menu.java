package hazi;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Menu {
	
	String menupont;

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public void show() {
		do {
			System.out.println("V�lasszon men�t!");
			System.out.println("1 - �j term�k/�r felvitel ");
			System.out.println("2 - term�k t�rl�se");
			System.out.println("3 - �rv�ltoz�s");
			System.out.println("4 - term�klista");
			System.out.println("5 - V�s�rl�s");
			System.out.println("6 - kil�p�s");
			switch(menupont) {
			case "1" -> ujTermek(); 
			case "2" -> termekTorles(); 
			case "3" -> arModositasa(); 
			case "4" -> lista(); 
			case "5" -> vasarlas(); 
			}
		} while (menupont.equals("6"));
		
	}
	private Object vasarlas() {
		// TODO Auto-generated method stub
		return null;
	}
	private Object lista() {
		// TODO Auto-generated method stub
		return null;
	}
	private Object termekTorles() {
		// TODO Auto-generated method stub
		return null;
	}
	private Object arModositasa() {
		// TODO Auto-generated method stub
		return null;
	}
	private Object ujTermek() {
		// TODO Auto-generated method stub
		return null;
	}
}
