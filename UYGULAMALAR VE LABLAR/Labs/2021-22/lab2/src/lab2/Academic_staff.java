package lab2;
import java.util.*;
public class Academic_staff extends Staff{
	private int com_id;
	private String office;
	List<String>research_areas;
	
	
	public Academic_staff(int staff_id,String name,String web) {
		super(staff_id,name,web);
		
		
	}
	public Academic_staff(int staff_id,String name,String web,String mail,String office) {
		super(staff_id,name,web,mail);
		this.office=office;
		
		
	}
	public int getCom_id() {
		return com_id;
	}
	public void setCom_id(int com_id) {
		this.com_id = com_id;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public List<String> getResearch_areas() {
		return research_areas;
	}
	
	public void add_research(String name) {
		for(String name1:research_areas) {
			research_areas.add(name1);
		}
	}
	public boolean delete_research(String name) {
		for(String name1:research_areas) {
			research_areas.remove(name1);
			return true;
		}
		return false;
	}
	public boolean delete_research(int id) {
		for(String name1:research_areas) {
			research_areas.remove(name1);
			return true;
		}
		return false;
		
	}
	
}
