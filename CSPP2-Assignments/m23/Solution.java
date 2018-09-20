import java.io.*;
import java.util.*;
import java.util.regex.*;
public final class Solution {

	public static String ConvertString(String fileContent) {
		String ret = "";
		Pattern p = Pattern.compile("[^0-9_]");
		Matcher match = p.matcher(fileContent);

		while(match.find()) {
			ret += match.group();
		}
		return ret.toLowerCase();
	}

	public static HashMap<String, Integer> generateHashMap(String input) {
		String[] inputs = input.split(" ");
		HashMap<String, Integer> map = new HashMap<>();
		for(int i = 0; i < inputs.length; i++) {
			int count = 1;
			for(int j = 0 ; j < inputs.length; j++) {
				if(inputs[i].equals(inputs[j]) && i!=j) {
					count += 1;
				}
			}
			if(map.containsKey(inputs[i])) {

			}
			else {
				map.put(inputs[i], count);
			}
		}
		// System.out.println(map);
		return map;
	}

	public static String fileRead(String folder, String name) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Desktop\\Git Repo\\6042_CSPP2\\cspp2-assignments\\m23\\"+folder+"\\"+name));
		String content = "";
		String line;
		try {
			while((line = br.readLine()) != null) {
				content += line;
			}
		} catch(IOException e) {
				e.printStackTrace();
		}finally {
			try {
				br.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		return content;		
	}
	public static void main(String[] args) throws Exception{
		Similarity sim = new Similarity();
		Scanner s = new Scanner(System.in);
		String folder = s.nextLine();
		//System.out.println(name);
		File file = new File("C:\\Users\\Lenovo\\Desktop\\Git Repo\\6042_CSPP2\\cspp2-assignments\\m23\\"+folder);
		String[] str = file.list();
		// String pri = Arrays.toString(str);
		// String str1 = pri.replace("[","").replace("]","").replace(","," ");
		// System.out.println(Arrays.toString(str1));
		for(String files : str) {
			String content = fileRead(folder,files);
			String inter = ConvertString(content);
			HashMap<String, Integer> hashmap = generateHashMap(inter);
			Document d = new Document(files, hashmap);
			sim.addDocument(d);
		}
		sim.documentSimilarity();
		
	}
}