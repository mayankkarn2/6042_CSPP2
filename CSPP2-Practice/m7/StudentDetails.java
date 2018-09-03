class StudentDetails {
	private String student;
	private String rollNo;
	private double sub1;
	private double sub2;
	private double sub3;
	public StudentDetails(String student, String rollNo, double sub1,double sub2 ,double sub3 ) {
		this.student = student;
		this.rollNo = rollNo;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	public double GPA() {
		return (sub1+sub2+sub3)/3;
	}
	public static void main(String args[]) {
		StudentDetails s1 = new StudentDetails("Mayank", "1", 10.0, 10.0, 10.0);s
		System.out.println(s1.GPA());
		StudentDetails s2 = new StudentDetails("Vipul", "2", 8.0, 7.0, 10.0);
		System.out.println(s2.GPA());
		StudentDetails s3 = new StudentDetails("Anurag", "3", 10.0, 9.0, 10.0);
		System.out.println(s3.GPA());
	}
}
