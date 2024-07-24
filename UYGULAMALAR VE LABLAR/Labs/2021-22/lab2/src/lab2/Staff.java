package lab2;

public abstract class Staff {
	private String mail;
	private String name;
	private int staff_id;
	private String web;
	
	public Staff(int staff_id,String web,String name) {
		this.name=name;
		this.staff_id=staff_id;
		this.web=web;
	}
	public Staff(int staff_id,String name,String web,String mail) {
		this.staff_id=staff_id;
		this.name=name;
		this.web=web;
		this.mail=mail;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStaff_id() {
		return staff_id;
	}
	
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public void print_staff_information() {
		
	}
	
	

}
