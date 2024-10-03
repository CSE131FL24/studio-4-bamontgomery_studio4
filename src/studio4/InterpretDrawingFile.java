package studio4;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shape = in.next();
		
		
		
		if (shape.equals("rectangle")) {
			
			int R = in.nextInt();
			int G = in.nextInt();
			int B = in.nextInt();
			
			boolean filled = in.nextBoolean();
			
			double x = in.nextDouble();
			double y = in.nextDouble();
			double w = in.nextDouble();
			double h = in.nextDouble();
			
			StdDraw.setPenColor(R,G,B);
			
			if(filled) {
				StdDraw.filledRectangle(x, y, w, h);
			}
			
			else {
				
				StdDraw.rectangle(x, y, w, h);
			}
			
		}
		
		else if (shape.equals("triangle")) {
			
			int R = in.nextInt();
			int G = in.nextInt();
			int B = in.nextInt();
			
			StdDraw.setPenColor(R,G,B);
			
			boolean filled = in.nextBoolean();
			
			double x1 = in.nextDouble();
			double y1 = in.nextDouble();
			double x2 = in.nextDouble();
			double y2 = in.nextDouble();
			double x3 = in.nextDouble();
			double y3 = in.nextDouble();
			
			double[] x = {x1,x2,x3};
			double[] y = {y1,y2,y3};
			
			if (filled) {
				
				StdDraw.line(x1, y1, x2, y2);
				StdDraw.line(x2, y2, x3, y3);
				StdDraw.line(x3, y3, x1, y1);
				StdDraw.filledPolygon(x, y);
				
				
			}
			
			else {
				
				StdDraw.line(x1, y1, x2, y2);
				StdDraw.line(x2, y2, x3, y3);
				StdDraw.line(x3, y3, x1, y1);
			}
			
			
		}
		
		else if (shape.equals("ellipse")) {
			
			int R = in.nextInt();
			int G = in.nextInt();
			int B = in.nextInt();
			
			boolean filled = in.nextBoolean();
			
			double x = in.nextDouble();
			double y = in.nextDouble();
			double w = in.nextDouble();
			double h = in.nextDouble();
			
			StdDraw.setPenColor(R,G,B);
			
			if (filled) {
				
				StdDraw.filledEllipse(x, y, w, h);
			}
			
			else {
				
				StdDraw.ellipse(x, y, w, h);
			}
		}
	}
}
