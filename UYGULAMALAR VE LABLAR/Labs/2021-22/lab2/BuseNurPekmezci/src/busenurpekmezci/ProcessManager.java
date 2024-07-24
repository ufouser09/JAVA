package busenurpekmezci;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;

public class ProcessManager implements IProcessManager{
	private int used_memory_size;
	private int max_memory_size;
	private HashMap<String, Process> processMaps;
	private LinkedList<Process> waitingProcessList;
	
	public ProcessManager(int max) {
		this.max_memory_size = max;
		used_memory_size = 0;
		processMaps = new HashMap<>();
		waitingProcessList = new LinkedList<>();
	}

	@Override
	public int getUsed_memory_size() {
		return used_memory_size;
	}

	@Override
	public boolean add_process(User u, String processname, int required_memory) {
		if(processMaps.get(processname) == null) {
			if((used_memory_size + required_memory) <= max_memory_size) {
				Process process = new Process(processname, required_memory, u);
				processMaps.put(processname, process);
				used_memory_size+=required_memory;
				return true;
			}
			else {
				for(Process proc : waitingProcessList) {
					if(proc.getName() == processname) {
						return false;
					}
				}
				Process process = new Process(processname, required_memory, u);
				waitingProcessList.add(process);
				return true;
			}
		}
		else {
			return false;
		}
	}

	@Override
	public boolean remove_process(String name) throws Exception{
		LinkedList<Process> willRemove = new LinkedList<>();
		if(processMaps.get(name) != null) {
			used_memory_size-=processMaps.get(name).getRequired_memory();
			processMaps.remove(name);
			for(Process pro: waitingProcessList) {
				if(add_process(pro.getUser(),pro.getName(),pro.getRequired_memory()) == true) {
					willRemove.add(pro);
				}
			}
			waitingProcessList.removeAll(willRemove);
			return true;
		}
		else {
			throw new Exception("Process cannot found!");
		}
	}

	@Override
	public void print_processes() {
		for (Entry<String, Process> m : processMaps.entrySet()) {
			System.out.println(m.getValue().getName()+" -> "+m.getValue());
		}
	}

	@Override
	public void print_waiting_processes() {
		for(Process pro: waitingProcessList) {
			System.out.println(pro);
		}
	}
	
	
	
	
}
