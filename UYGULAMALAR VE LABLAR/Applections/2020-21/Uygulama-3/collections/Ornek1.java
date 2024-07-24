package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Ornek1 {

	public static void main(String[] args) {
		
		ArrayList<String> listem = new ArrayList<String>();
		listem.add("Haydar Haydar");
		listem.add("Dalgalandım Da Duruldum");
		listem.add("Benzemez Kimse Sana");
		listem.add("Gamzedeyim Devam Bulmam");
		
		System.out.println("1.Yöntem : foreach ile yazdırma ...");
		for (String obj : listem) {
			System.out.println(obj);
		}
		
		
		Iterator<String> itr = listem.iterator();
		
		System.out.println("\n2.Yöntem : Iterator ile yazdırma ...");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
				
	}
}
