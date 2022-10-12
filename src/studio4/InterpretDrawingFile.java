package studio4;

import java.awt.Color;
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
		  String shapeType = in.next();
		  int redComponent = in.nextInt();
		  int greenComponent =in.nextInt();
		  int blueComponent= in.nextInt();
		  boolean isFilled =in.nextBoolean();
		  StdDraw.setPenColor(redComponent,greenComponent,blueComponent);
		  if(shapeType.equals("rectangle") ) {
		   double x1 = in.nextDouble();
		   double x2 = in.nextDouble();
		   double x3 = in.nextDouble();
		   double x4 = in.nextDouble();
		   if(isFilled == true) {
		    StdDraw.filledRectangle(x1, x2, x3, x4);
		   }
		   else {
		    StdDraw.rectangle(x1, x2, x3, x4);
		   }
		  }
		  if(shapeType.equals("triangle")) {
		   double [] x_s = new double[3];
		   double [] y_s = new double[3];
		   for(int i = 0;i<3;i++) {
		    x_s[i] = in.nextDouble();
		    y_s[i] = in.nextDouble();
		   }
		   
		   if(isFilled == true) {
		    StdDraw.filledPolygon(x_s,y_s);
		   }
		   else {
		    StdDraw.polygon(x_s,y_s);
		   }}
		  if(shapeType.equals( "ellipse")) {
		   double e1 = in.nextDouble();
		   double e2 = in.nextDouble();
		   double e3 = in.nextDouble();
		   double e4 = in.nextDouble();
		  
		   if(isFilled == true) {
		    StdDraw.filledEllipse(e1,e2,e3,e4);
		   }
		   else {
		    StdDraw.ellipse(e1,e2,e3,e4);
		   }
		  }
	}
}
