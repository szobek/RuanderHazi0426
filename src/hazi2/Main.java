package hazi2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
	static List<Integer> nums = new ArrayList<Integer>();
	static Random random = new Random();

	public static void main(String[] args) {
		new Main().run();

	}
	

	private void run() {
		listUploadWithRandomNums();
		
		listAllOddNumbers();

	}
	
	private void simpleList() {
		for (int num : this.nums) {
			System.out.println(num + " ");
		}
		
	}

	
	private void listUploadWithRandomNums() {
		for (int i = 0; i < 30; i++) {
			nums.add(random.nextInt(0, 100));
		}

	}

	private void listThreeLines() {
		for (int i = 1; i <= nums.size(); i++) {
			System.out.print(nums.get(i - 1) + "\t" + ((i % 10 == 0) ? "\n" : ""));
		}

	}

	private void allEvenNumQuantity() {
		int paroosDarab = 0;
		for (int num : this.nums) {
			if (num % 2 == 0) {
				paroosDarab++;
			}
		}
		System.out.println(paroosDarab + " páros szám van");
	}

	private void hasNumEqualListLength() {
		int index = this.nums.indexOf(this.nums.size() > -1);
		System.out
				.println((index > -1) ? "van a hosszal egyenlõ szám(" + index + " )" : "nincs a hosszal egyenlõ szám");

	}

	private void centerOfList() {
		List<Integer> center = this.nums.subList(9, 19);
		for (int i = 0; i < center.size(); i++) {

			System.out.print(center.get(i) + ((i < 9) ? "-" : ""));
		}
	}

	private void deleteAllUnderTwenty() {
		List<Integer> under = new ArrayList<Integer>();
		System.out.println();
		for (int i = 0; i < this.nums.size(); i++) {
			if(this.nums.get(i)<20 && this.nums.get(i)%2>0) {
				under.add(this.nums.get(i));
			}
			
		}
		System.out.println();
		for(int i=0;i<under.size();i++) {
			this.nums.remove(under.get(i));
		}
		System.out.println();
		simpleList();

	}
	
	private void listAllOddNumbers() {
		StringBuilder write =  new StringBuilder("");
		
		System.out.println("Páratlan számok:");
		for (int i = 0; i < this.nums.size(); i++) {
			if(this.nums.get(i)%2>0) {
				write.append(this.nums.get(i) );
				if(i<this.nums.size()-1) {
					write.append("-");
				}else {
					write.append("");
				}
			}
			
		}
		
		

		System.out.println(write.substring(0, this.nums.size()-1));
		System.out.println();
	}

}
