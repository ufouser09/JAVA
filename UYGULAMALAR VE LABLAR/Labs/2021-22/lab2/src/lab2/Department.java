package lab2;
import java.util.*;
public class Department {
	private String name;
	private String history;
	private String mission_and_vision;
	List<Academic_staff>academic_staffs=new ArrayList<Academic_staff>();
	List<Commission>commissions=new ArrayList<Commission>();
	public Department(String name,String history,String mission_and_vision) {
		this.name=name;
		this.history=history;
		this.mission_and_vision=mission_and_vision;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHistory() {
		return history;
	}
	public void setHistory(String history) {
		this.history = history;
	}
	public String getMission_and_vision() {
		return mission_and_vision;
	}
	public void setMission_and_vision(String mission_and_vision) {
		this.mission_and_vision = mission_and_vision;
	}
	public List<Academic_staff> getAcademic_staffs() {
		return academic_staffs;
	}
	
	public List<Commission> getCommissions() {
		return commissions;
	}
	public void print_academic_staffs_information() {
		Academic_staff[] list = null;
		for(Academic_staff name:list) {
			System.out.println()
		}
			
		
	}
	public void print_commission_information(){
		Commission[] list=null;
		for(Commission name:list) {
			System.out.println();
		}
	}
	
}
