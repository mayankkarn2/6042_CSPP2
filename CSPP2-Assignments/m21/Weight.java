class Weight {
	private String weight;
	private String fat;
	private String date;
	private String time;

	Weight(String date, String time, String weight, String fat) {
		this.date = date;
		this.time = time;
		this.weight = weight;
		this.fat = fat;
		
	}

	public String getWeight() {
		return weight;
	}

	public String getFat() {
		return fat;
	}

	public String getDate() {
		return date;
	}

	public String getTime() {
		return time;
	}

	public String WeightLog() {
		String s = "Date:"+getDate()+"\n"+"Time:"+getTime()+"\n"+"Weight:"+getWeight()+"\n"+"Fat:"+getFat();
		return s;
	}
}