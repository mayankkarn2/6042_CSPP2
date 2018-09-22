class Todoist{
	
	Task[] tasks;
	int taskArray;

	Todoist() {
		tasks = new Task[25];
		taskArray = 0;
	}

	public void addTask(Task t) {
		tasks[taskArray++] = t;
	}

	public String toString() {
		if(taskArray == 0){
			System.out.println("kkk");
			return "";
		}
		for(int i = 0; i < taskArray; i++) {
			if(tasks[i].title.equals(null)) {
				break;
			}
			if(tasks[i].time == 0) {
				break;
			}
			if(tasks[i].status.equals(null)) {
				break;
			}
			String ret = tasks[i].toString();
			System.out.println(ret);
		}
		return "";
	}
	public Task getNextTask(String name) {
		for(int i = 0; i < taskArray; i++) {
			if(tasks[i].assignedTo.equals(name)) {
				if(tasks[i].status.equals("todo")&& tasks[i].important && (!tasks[i].urgent) && tasks[i].status.equals("todo")) {
					return tasks[i];
				}
				for(int j = i+1; j < taskArray; j++) {
					if(tasks[j].assignedTo.equals(name)) {
						Task t = tasks[j];
						if(t.important && (!t.urgent) && t.status.equals("todo") || t.important && (t.urgent) && t.status.equals("todo")) {
							return t;
						}
					}
				}	
			}
		}
		return null;
	}

	public Task[] getNextTask(String name, int count) {
		// System.out.println("1");
		Task[] ret = new Task[count];
		int i = 0;
		while(i < count) {
			ret[i] = getNextTask(name);
			i++;
		}
		return ret;
	}

	public int totalTime4Completion() {
		int total = 0;
		for(int i = 0; i < taskArray; i++) {
			if(tasks[i].status.equals("todo"))
				total += tasks[i].time;
		}
		return total;
	}
}