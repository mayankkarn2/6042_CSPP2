class Todoist{
	
	Task[] tasks;
	int taskArray;

	Todoist() {
		tasks = new Task[10];
		taskArray = 0;
	}

	public void addTask(Task t) {
		tasks[taskArray++] = t;
	}

	public String toString() {
		for(int i = 0; i < taskArray; i++) {
			String ret = tasks[i].toString();
			System.out.println(ret);
		}
		return "";
	}
}