class Fitbyte {
	private Food[] food;
	private Activity[] act;
	private Water[] water;
	private Sleep[] sleep;
	private Weight[] weight;
	private int foodSize = 0;
	private int actSize = 0;
	private int waterSize = 0;
	private int sleepSize = 0;
	private int weightSize = 0;

	//

	Fitbyte() {
		food = new Food[10];
		act = new Activity[10];
		water = new Water[10];
		sleep = new Sleep[10];
		weight = new Weight[10];
	}

	// Getters
	public Food[] getFood() {
		Food[] f = new Food[foodSize];
		for(int i = 0; i < foodSize; i++) {
			f[i] = food[i];
		}
		return f;
	}
	public Activity[] getActivity() {
		Activity[] ac = new Activity[actSize];
		for(int i = 0; i < actSize; i++) {
			ac[i] = act[i];
		}
		return ac;
	}
	public Water[] getWater() {
		Water[] wa = new Water[waterSize];
		for(int i = 0; i < waterSize; i++) {
			wa[i] = water[i];
		}
		return wa;
	}
	public Sleep[] getSleep() {
		Sleep[] sl = new Sleep[sleepSize];
		for(int i = 0; i < sleepSize; i++) {
			sl[i] = sleep[i];
		}
		return sl;
	}
	public Weight[] getWeight() {
		Weight[] w = new Weight[weightSize];
		for(int i = 0; i < weightSize; i++) {
			w[i] = weight[i];
		}
		return w;
	}
	public int getFoodSize() {
		return foodSize;
	}
	public int getActSize() {
		return actSize;
	}
	public int getWaterSize() {
		return waterSize;
	}
	public int getSleepSize() {
		return sleepSize;
	}
	public int getWeightSize() {
		return weightSize;
	}


	//Methods to add
	public void addFood(Food f) {
		food[foodSize++] = f;
	}
	public void addActivity(Activity a) {
		act[actSize++] = a;
	}
	public void addWater(Water w) {
		water[waterSize++] = w;
	}
	public void addSleep(Sleep s) {
		sleep[sleepSize++] = s;
	}
	public void addWeight(Weight wt) {
		weight[weightSize++] = wt;
	}

}