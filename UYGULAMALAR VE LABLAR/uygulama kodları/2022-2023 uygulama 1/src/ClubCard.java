
public class ClubCard {
	
	private static int counter = 2023001;
	private final int ID;
	private double credit;
	Sports sp[] = new Sports[7];
	
	
	public ClubCard(double credit) {
		
		this.credit = credit;
		ID = counter;
		counter++;
	}
	
	public void registerCourse(Sports sport) {
		int i=0;
		while(i<sp.length && sp[i]!=null) {
			i++;
		}
		
		if(i<sp.length) {
			sp[i]=sport;
			System.out.println("Registered to course: " + sport.getName());
		}else {
			System.out.println("You can enroll for a maximum of 7 courses.");
		}
	}
	
	public void listCourses() {
		int i=0;
		while(i<sp.length && sp[i]!=null) {
			System.out.println(i+1 +"." + sp[i].getName());
			i++;
		}
	}


	public static int getCounter() {
		return counter;
	}


	public static void setCounter(int counter) {
		ClubCard.counter = counter;
	}


	public double getCredit() {
		return credit;
	}


	public void setCredit(double credit) {
		this.credit = credit;
	}


	public int getID() {
		return ID;
	}
	
	
	
	

}
