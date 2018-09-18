class Sleep {
	private String startTime;
	private String endTime;
	private String date;

	Sleep(String date,String startTime, String endTime) {
		this.date = date;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public String getstartTime() {
		return startTime;
	}

	public String getendTime() {
		return endTime;
	}

	public String getDate() {
		return date;
	}

	public String SleepLog() {
		// System.out.println("Sleep");
		String s = "Date:"+getDate()+"\n"+"Starttime:"+getstartTime()+"\n"+"Endtime:"+getendTime();
		return s;
	}
}