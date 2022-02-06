package driver;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import main.Construction;

public class ConstructionDriverClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total no of floors in the building");
		int floor = sc.nextInt();
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for(int i=0;i<floor;i++) {
			System.out.println("enter the floor size given on day : "+(i+1));
			map.put(i+1, sc.nextInt());
		}
		Construction construction = new Construction();
		Map<Integer, Integer> sortedMap =	construction.defineConstructionOrder(map);
		construction.display(sortedMap, map);
		sc.close();
	}

}
