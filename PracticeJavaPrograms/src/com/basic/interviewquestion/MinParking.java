package com.basic.interviewquestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Map;
import java.util.TreeMap;

//input
//4
//5,10,0,20,25,40,35,45
public class MinParking {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		int[][] parkingStartEndTimeList = new int[n][2];
		String[] parkingStartEndTimes = br.readLine().split(" ");
		System.out.println("parkingStartEndTimes :: " + parkingStartEndTimes);
		System.out.println("parkingStartEndTimeList :: " + parkingStartEndTimeList);
		for (int i = 0; i < n; i++) {
			String[] parkingStartEndTime = parkingStartEndTimes[i].split(",");
			for (int j = 0; j < parkingStartEndTime.length; j++) {
				parkingStartEndTimeList[i][j] = Integer.parseInt(parkingStartEndTime[j]);
			}
		}

		System.out.println("parkingStartEndTimeList" + parkingStartEndTimeList);

		int out = minParkingSpaces(parkingStartEndTimeList);
		System.out.println(out);

		wr.close();
		br.close();
	}

	private static int minParkingSpaces(int[][] parkingStartEndTimes) {
		// YOUR CODE HERE
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();

		for (int i = 0; i < parkingStartEndTimes.length; i++) {
			int count = 0;
			if (map.containsKey(parkingStartEndTimes[i][0])) {
				count = map.get(parkingStartEndTimes[i][0]);
				map.put(parkingStartEndTimes[i][0], count + 1);
			} else {
				map.put(parkingStartEndTimes[i][0], 1);
			}
			if (map.containsKey(parkingStartEndTimes[i][1])) {
				count = map.get(parkingStartEndTimes[i][1]);
				map.put(parkingStartEndTimes[i][1], count - 1);
			} else {
				map.put(parkingStartEndTimes[i][1], -1);
			}
		}

		int maxParking = 0, count = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			count += entry.getValue();
			maxParking = Math.max(maxParking, count);
		}
		return maxParking;
	}

}
