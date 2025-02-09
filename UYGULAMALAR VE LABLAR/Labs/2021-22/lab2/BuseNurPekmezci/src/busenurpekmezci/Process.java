package busenurpekmezci;

public class Process {
	private String name;
	private int required_memory;
	private User user;
	
	public Process(String name, int required_memory, User user) {
		this.name = name;
		this.required_memory = required_memory;
		this.user = user;
	}
	
	public int getRequired_memory() {
		return required_memory;
	}

	public User getUser() {
		return user;
	}

	public String getName() {
		return name;
	}
	
	public String toString() {
		return "Process{name="+getName()+", required_memory="+getRequired_memory()+", user="+getUser()+"}";
	}
	
}
