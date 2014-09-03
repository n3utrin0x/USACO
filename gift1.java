/*
ID: n3utrin1
LANG: JAVA
TASK: gift1
*/
import java.io.*;
import java.util.*;
public class gift1 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new FileReader("gift1.in"));
		BufferedWriter out = new BufferedWriter(new FileWriter("gift1.out"));
		LinkedHashMap <String, Integer> map = new LinkedHashMap <String, Integer>();
		int np = Integer.parseInt(in.readLine());
		while(np-->0) {
			map.put(in.readLine(), 0);
		}
		String giver;
		while((giver = in.readLine()) != null) {
			String temp = in.readLine();
			int total = Integer.parseInt(temp.split(" ")[0]);
			int split = Integer.parseInt(temp.split(" ")[1]);
			if(split == 0)
				continue;
			for(int x = 0; x < split; x++) {
				String receiver = in.readLine();
				map.put(receiver, map.get(receiver) + total / split);
			}
			map.put(giver, map.get(giver) + (total % split) - total);
		}
		for(String key : map.keySet())
			out.write(key + " " + map.get(key) + "\n");
		in.close();
		out.close();
	}
}