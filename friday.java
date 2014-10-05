/*
ID: n3utrin1
LANG: JAVA
TASK: friday
*/

import java.io.*;
import java.util.*;

class friday {
	public static void main(String[] args) throws Exception {
		BufferedReader r = new BufferedReader(new FileReader("friday.in"));
		BufferedWriter w = new BufferedWriter(new FileWriter("friday.out"));
		int n = Integer.parseInt(r.readLine());
		int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] answer = {0,0,0,0,0,0,0};
		int weekday = 2;
		for(int year = 0; year < n; year++) {
			int yearnum = 1900 + year;
			months[1] = (yearnum % 400 == 0) || (yearnum % 100 != 0 && yearnum % 4 == 0) ? 29 : 28;
			for(int month = 0; month < 12; month++) {
				for(int day = 0; day < months[month]; day++, weekday = (weekday+1) % 7)
					if(day == 12)
						answer[weekday]++;
			}
		}
		for(int x = 0; x < answer.length; x++) {
			w.write(answer[x] + ""); // How to convert int to String in java
			if(x != answer.length - 1)
				w.write(" ");
			else
				w.write("\n");
		}
		r.close();
		w.close();
	}
}