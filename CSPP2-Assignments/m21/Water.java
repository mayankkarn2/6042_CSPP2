class Water {
	private String consumption;
	private String time;
	private String date;
	Water(String consumption, String date, String time) {
		this.consumption = consumption;
		this.date = date;
		this.time = time;
	}

	public String getConsumption() {
		return consumption;
	}

	public String getTime() {
		return time;
	}

	public String getDate() {
		return date;
	}

	public String WaterLog() {
		// System.out.println("Water2");
		String s = "Date:"+getDate()+"\n"+"Quantity:"+getConsumption()+"ml";
		return s;
	}

	
}