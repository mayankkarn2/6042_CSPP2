class Activity {
	private String name;
	private String startTime;
	private String endTime;
	private String notes = "";
	private String date;

	Activity(String name, String startTime, String endTime, String date) {
		this.name = name;
		this.startTime = startTime;
		this.endTime = endTime;
		this.date = date;
	}

	Activity(String name, String notes, String date, String startTime, String endTime) {
		this.name = name;
		this.notes = notes;
		this.date = date;
		this.startTime = startTime;
		this.endTime = endTime;	
	}

	public String getName() {
		return name;
	}
	public String getstartTime() {
		return startTime;
	}
	public String getendTime() {
		return endTime;
	}
	public String getnotes() {
		return notes;
	}
	public String getDate() {
		return date;
	}

	public String ActivityLog() {
		// System.out.println("PhysicalActivity");
		String s = "Name:"+getName()+"\n"+"Notes:"+getnotes()+"\n"+"Date:"+getDate()+"\n"+"Starttime:"+getstartTime()+"\n"+"Endtime:"+getendTime();
		return s;
	}
}