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

	Task(String title, String assignedTo, int time, Boolean important, Boolean urgent, String status) {
		this.title = title;
		try{
			if(title.equals("")){
				throw new TitleException("Title not provided");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		this.assignedTo = assignedTo;
		this.time = time;
		try {
			if(time < 0) {
				throw new TimeException("Invalid time ToComplete");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage()+" "+time);
		}
		this.important = important;
		this.urgent = urgent;
		this.status = status;
		try{
			if(!(status.equals("todo") || status.equals("done"))) {
				throw new todoException("Invalid status");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage()+" "+status);
		}
	}

	public String toStrng() {
		String ret = title+", "+assignedTo+", "+time+", ";
		if(important) {
			System.out.print("Important, ");	
		}
		else {
			System.out.print("Not Important, ");
		}
		if(urgent) {
			System.out.print("Urgent, ");	
		}
		else {
			System.out.print("Not Urgent, ");
		}
		ret = ret + status;
		return ret;

		
	}
}