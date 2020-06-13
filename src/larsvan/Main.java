package larsvan;

import java.util.Locale;
import java.util.Scanner;

import larsvan.model.TrafficRule;
import larsvan.model.Van;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String stoppFlag = "-1 -1 -1 -1";
		
		Van van = new Van();
		TrafficRule rule = new TrafficRule();
		
		
		String actual = "";
		do {
			String line = sc.nextLine();
			actual = line;
			
			if(!actual.equals(line)) {
				break;
			}
			String[] lineBreaked = line.split(" ");
			
			Integer checkPoints = Integer.valueOf(lineBreaked[0]);
			Integer length = Integer.valueOf(lineBreaked[1]);
			Integer maxAcceleration = Integer.valueOf(lineBreaked[2]);
			Integer minAcceleration = Integer.valueOf(lineBreaked[3]);
			
			for(int i = 1; i <= checkPoints; i++) {
				String[] linesRoute = sc.nextLine().split(" ");
				Integer distanceEndFinal = Integer.valueOf(linesRoute[0]);
				Integer minSpeed = Integer.valueOf(linesRoute[1]);
				Integer maxSpeed = Integer.valueOf(linesRoute[2]);
				
				rule.setMaxAcceleration(maxAcceleration);
				rule.setMinorAcceleration(minAcceleration);
				
				van.setAcceleration(Double.valueOf(maxAcceleration));
				van.setSpeed(Double.valueOf(maxSpeed));
				
				Double sp = van.calculateSpeed(van.getSpeed(), van.getAcceleration(), 0.0);
				Integer dS = distanceEndFinal;
				Double t = van.calculateTime(dS, sp);
				Double md = van.calculateMoveDistance(van.getAcceleration(), t, van.getSpeed());
				van.setPosition(md);

				Double mp = (double) Math.round(length / sp);
				
				if (t < 1) {
					System.out.println(TrafficRule.impossible);
				} else {
					System.out.println(String.format(Locale.US,"%.2f", mp));
				}
			}
			

		} while(!actual.equals(stoppFlag));
		

		
		sc.close();
		
		
	}

}
