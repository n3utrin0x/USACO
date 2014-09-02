/*
ID: n3utrin1
LANG: JAVA
TASK: ride
*/
import java.io.*;
public class ride {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new FileReader("ride.in"));
		BufferedWriter out = new BufferedWriter(new FileWriter("ride.out"));
		String group;
		while((group = in.readLine()) != null) {
			out.write(number(group) % 47 == number(in.readLine()) % 47 ? "GO" : "STAY");
			out.newLine();
		}
		in.close();
		out.close();
	}

	public static int number(String name) {
		int num = 1;
		for(char c : name.toCharArray())
			num *= c - 'A' + 1;
		return num;
	}
}