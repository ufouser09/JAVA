package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Ornek2 {

	public static void main(String[] args) {
		Student s1 = new Student(17011001,"Mehmet Akif Ersoy", 20);  
		Student s2 = new Student(17011010,"Abdülhak Hamit Tarhan", 22);  
		Student s3 = new Student(17011100,"Mithat Cemal Kuntay", 19); 

		ArrayList<Student> stu_list = new ArrayList<Student>();
		stu_list.add(s1);
		stu_list.add(s2);
		stu_list.add(s3);
		
		System.out.println("İlk listenin Öğrencilerin isimleri...");
		ListeGoster(stu_list);
		
		ArrayList<Student> stu_list2 = new ArrayList<Student>();
		stu_list2.add(new Student(16011001, "Hamza Yerlikaya", 21));
		stu_list2.add(new Student(16011010, "Naim Süleymanoğlu", 18));
		stu_list2.add(new Student(16011020, "Hidayet Türkoğlu", 30));
		
		stu_list.addAll(stu_list2);
		
		System.out.println("\nİki listenin tüm öğrencilerin isimleri ...");
		ListeGoster(stu_list);
		
		stu_list.remove(3);
		System.out.println("\n3 nolu öğrenci silindikten sonra liste ...");
		ListeGoster(stu_list);
		
		stu_list.removeAll(stu_list2);
		System.out.println("\n2. listeyi sildikten sonra liste ...");
		ListeGoster(stu_list);
		
		stu_list.addAll(stu_list2);
		stu_list.retainAll(stu_list2);
		System.out.println("\n2. listeyi retain yaptıktan sonra liste ...");
		ListeGoster(stu_list);
	}
	
	public static void ListeGoster(ArrayList<Student> stu_) {
		Iterator<Student> stu_itr = stu_.iterator();
		while(stu_itr.hasNext()) {
			Student std = stu_itr.next();
			System.out.println(std.getName() + ", " + 
							   std.getNo() + ", " +
							   std.getAge());
		}
		
		//for each yapısı ile yazdırmak isteseydik:
//		for(Student std: stu_){
//			System.out.println(std.getName() + ", " + 
//					   std.getNo() + ", " +
//					   std.getAge());
//		}
	}

}
