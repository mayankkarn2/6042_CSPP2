class area_of_Circle
{
   public static double area(int r)
   {
	  double pii = pi();
	  return pii * r * r;
   }
   public static double pi()
   {
	  return 3.14;
   }
   public static void main(String args[])
   {
	  area_of_Circle a = new area_of_Circle();
	  double ar = a.area(15);
	  System.out.println(ar);
   }
}