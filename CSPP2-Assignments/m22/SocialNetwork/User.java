class User {
	private String name;
	private String[] connections = new String[10];
	private int size = 0;

	User(String name, String[] connections) {
		this.name = name;
		for(int i = 0; i < connections.length; i++) {
			this.connections[i] = connections[i];
		}
		size = connections.length;
	}

	public void addConnections(String names) {
		connections[size++] = names;
	}
	public String[] getConnections() {
		String ret[] = new String[size];
		for(int i = 0; i < size; i++){
			ret[i] = connections[i];
		}
		return ret;
	}

	public String getName() {
		return name;
	}
}