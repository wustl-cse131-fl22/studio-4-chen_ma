package studio4;

import java.awt.Color;
import java.awt.Font;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setCanvasSize(800, 800);
		StdDraw.setScale(0, 800);
		

//		StdDraw.setPenColor(Color.PINK);	
//		StdDraw.filledRectangle(280, 320, 120, 80 );
//		Font font = new Font("Arial", Font.BOLD, 60);
//		   StdDraw.setFont(font);
//		StdDraw.text(400, 400, "CM");
//		
//		StdDraw.setPenColor(Color.BLACK);
//		//StdDraw.rectangle(0.5, 0.5, 0.3, 0.2);
//		StdDraw.rectangle(400, 400, 240, 160 );

		
		// crossing
		StdDraw.setCanvasSize(800, 800);
		StdDraw.setScale(0, 800);
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(380, 400, 40, 160 );
		StdDraw.filledRectangle(400, 400, 240, 40 );
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.rectangle(400, 400, 240, 160 );
		
		StdDraw.setPenColor(Color.PINK);
		Font font = new Font("Arial", Font.BOLD, 60);
   	    StdDraw.setFont(font);
		StdDraw.text(400, 400, "Straykids");
		
	}
}