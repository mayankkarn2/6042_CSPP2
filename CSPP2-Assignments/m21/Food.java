class Food {
	private String foodName;
	private String quantity;
	private String date;
	private String time;
	// private String day;
	Food(String foodName, String quantity, String date, String time) {
		this.foodName = foodName;
		this.quantity = quantity;
		this.time = time;
		this.date = date;
	}
	public String getFoodname() {
		return foodName;
	}
	public String getQuantity() {
		return quantity;
	}
	public String getTime() {
		return time;
	}
	public String getDate() {
		return date;
	}

	public String foodLog() {
		// System.out.println("Food");
		String s = "Date:"+getDate()+"\n"+"Time:"+getTime()+"\n"+"Name:"+getFoodname()+"\n"+"Quantity:"+getQuantity();
		return s;
	}
}