import java.util.Scanner;
public final class Solution {

	private Solution() {

	}
	public static void main(String[] args) {
		Fitbyte fb = new Fitbyte();
		Scanner s = new Scanner(System.in);

		while(s.hasNext()) {
			String line = s.nextLine();
			String[] tokens = line.split(" ");
			// System.out.println(tokens[0]);
			// System.out.println(tokens[1]);
			switch(tokens[0]) {
				case "Food":
				String[] t = tokens[1].split(",");
				Food f = new Food(t[0],t[1],t[2],t[3]);
				fb.addFood(f);
				break;
				case "PhysicalActivity":
				String[] t1 = tokens[1].split(",");
				if(t1.length == 4) {
					Activity a = new Activity(t1[0],t1[1],t1[2],t1[3]);
					fb.addActivity(a);
				} else {
					Activity a = new Activity(t1[0],t1[1],t1[2],t1[3],t1[4]);
					fb.addActivity(a);
				}
				break;
				case "Water":
				String[] t2 = tokens[1].split(",");
				Water w = new Water(t2[0], t2[1], t2[2]);
				fb.addWater(w);
				break;
				case "Weight":
				String[] t3 = tokens[1].split(",");
				Weight wt = new Weight(t3[0],t3[1],t3[2],t3[3]);
				fb.addWeight(wt);
				break;
				case "Sleep":
				String[] t4 = tokens[1].split(",");
				Sleep sl = new Sleep(t4[0],t4[1],t4[2]);
				fb.addSleep(sl);
				break;
				case "Foodlog":
				Food[] fo = fb.getFood();
				System.out.println("Food");
				for(int i = 0; i < fo.length; i++) {
					System.out.print(fo[i].foodLog());					
				}
				System.out.println("\n");
				break;
				case "Waterlog":
				Water[] wa = fb.getWater();
				System.out.println("Water");
				for(int i = 0; i < wa.length; i++) {
					// String poo = wa[i].WaterLog();
					// System.out.println(poo);
					System.out.print(wa[i].WaterLog());
					System.out.println();
				}
				System.out.println();
				break;
				case "PhysicalActivitylog":
				Activity[] ac = fb.getActivity();
				System.out.println("PhysicalActivity");
				if(ac.length == 0){
					System.out.println("None");
					// return;
				}
				else{
					for(int i = 0; i < ac.length; i++) {
						System.out.print(ac[i].ActivityLog());
						System.out.println();
					}
				}
				System.out.println();
				break;
				case "Sleeplog":
				Sleep[] sle = fb.getSleep();
				System.out.println("Sleep");
				for(int i = 0; i < sle.length; i++) {
					System.out.print(sle[i].SleepLog());
				}
				System.out.println("\n");
				break;
				case "Weightlog":
				Weight[] wei = fb.getWeight();
				System.out.println("Weight");
				for(int i = 0; i < wei.length; i++) {
					System.out.print(wei[i].WeightLog());
				}
				System.out.println("\n");
				break;
				case "Summary":
				// System.out.println(tokens[2]);
				if(tokens.length == 1) {
					Food[] fo2 = fb.getFood();
					System.out.println("Food");
					for(int i = 0; i < fo2.length; i++) {
						System.out.print(fo2[i].foodLog());					
					}
					System.out.println();
					Water[] wa2 = fb.getWater();
					System.out.println("Water");
					for(int i = 0; i < wa2.length; i++) {
						System.out.print(wa2[i].WaterLog());
					}
					System.out.println();
					Activity[] ac2 = fb.getActivity();
					System.out.println("PhysicalActivity");
					if(ac2.length == 0){
						System.out.print("None");
						// return;
					}
					else {
						for(int i = 0; i < ac2.length; i++) {
							System.out.print(ac2[i].ActivityLog());
						}
					}
					System.out.println();
					Weight[] wei2 = fb.getWeight();
					System.out.println("Weight");
					for(int i = 0; i < wei2.length; i++) {
						System.out.print(wei2[i].WeightLog());
					}
					System.out.println();
					Sleep[] sle2 = fb.getSleep();
					System.out.println("Sleep");
					for(int i = 0; i < sle2.length; i++) {
						System.out.print(sle2[i].SleepLog());
					}
					System.out.println();
				}
				// System.out.println("hi");
				else {
					String date1 = tokens[1];
					// System.out.println(date1);
					Food[] fo1 = fb.getFood();
					Water[] wa1 = fb.getWater();
					Activity[] ac1 = fb.getActivity();
					Sleep[] sle1 = fb.getSleep();
					Weight[] wei1 = fb.getWeight();
					for(Food foods : fo1) {
						// System.out.println(foods.getDate());
						if(foods.getDate().equals(date1)) {
							// System.out.println("kk");
							System.out.println(foods.foodLog());
						}
					}
					System.out.println();
					for(Water waters : wa1) {
						if(waters.getDate().equals(date1)) {
							System.out.println(waters.WaterLog());
						}
					}
					for(Activity acti : ac1) {
						if(acti.getDate().equals(date1)) {
							System.out.println(acti.ActivityLog());
						}
					}
					for(Sleep slee : sle1) {
						if(slee.getDate().equals(date1)) {
							System.out.println(slee.SleepLog());
						}
					}
					for(Weight wts : wei1) {
						if(wts.getDate().equals(date1)) {
							System.out.println(wts.WeightLog());
						}
					}
				}
				break;
			}
		}
	}
}