class TitleException extends Exception {
	public TitleException(String s) {
		super(s);
	}
}
class TimeException extends Exception {
	public TimeException(String s) {
		super(s);
	}
}
class todoException extends Exception {
	public todoException(String s) {
		super(s);
	}
}

class Task {
	String title;
	String assignedTo;
	int time;
	Boolean important;
	Boolean urgent;
	String status;
	int flag = 0;

	Task(String title, String assignedTo, int time, Boolean important, Boolean urgent, String status) {
		this.title = title;
		this.assignedTo = assignedTo;
		this.time = time;
		this.important = important;
		this.urgent = urgent;
		this.status = status;
		flag = 1;
	}

	public String toString() {
		String ret = title+", "+assignedTo+", "+time+", ";
		if(important) {
			ret = ret +"Important, ";	
		}
		else {
			ret = ret+ "Not Important, ";
		}
		if(urgent) {
			ret = ret + "Urgent, ";	
		}
		else {
			ret = ret +"Not Urgent, ";
		}
		ret = ret + status;
		return ret;

		
	}
}