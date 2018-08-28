class factorial{
	public static int fact(int a) {
		if(a==1){
			return 1;
		}
		else{
			return a * fact(a-1);
		}
		
	}
	public static void main(String args[]){
		int a = 10;
		System.out.print(fact(a));

	}
} 