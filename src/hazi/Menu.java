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
			System.out.println("V�lasszon men�t!");
			System.out.println("1 - �j term�k/�r felvitel ");
			System.out.println("2 - term�k t�rl�se");
			System.out.println("3 - �rv�ltoz�s");
			System.out.println("4 - term�klista");
			System.out.println("5 - V�s�rl�s");
			System.out.println("6 - kil�p�s");
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
