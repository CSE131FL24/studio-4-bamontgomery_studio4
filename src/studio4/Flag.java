package studio4;

import java.awt.Color;
import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		StdDraw.setXscale(0, 22);
		StdDraw.setYscale(0, 22);
		
		StdDraw.setPenColor(255,0,255);
		StdDraw.filledRectangle(11, 11, 5.5 , 5.5);
		
		StdDraw.setPenColor(0,0,255);
		StdDraw.filledCircle(11, 11, 2.5);
	}
}