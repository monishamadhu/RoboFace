package week2.robotface;
import java.awt.*;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class RobotFace extends GraphicsProgram {
	private static final int HEAD_WIDTH = 200;
	private static final int HEAD_HEIGHT =300;
	private static final int EYE_RADIUS= 35;
	private static final int MOUTH_WIDTH = 100;
	private static final int MOUTH_HEIGHT = 45;
	
	public void run() {
		
			double width = getWidth()/2;
			double height = getHeight()/2;
						
			double headPosX = (double)(width - HEAD_WIDTH/2); //x-coordinate of rectangle head
			double headPosY = (double)(height- HEAD_HEIGHT/2);//y-coordinate of rectangle head
			
			GRect head = new GRect(headPosX,headPosY, HEAD_WIDTH, HEAD_HEIGHT);
			add(head);
		    head.setFilled(true);
		    head.setFillColor(Color.gray);
		     
		    double eyeRPosX = (double)(headPosX+(3*HEAD_WIDTH/4)-(EYE_RADIUS/2)); //x-coordinate of circle right eye
		    double eyeRPosY = (double)(headPosY+(HEAD_HEIGHT/4)-(EYE_RADIUS/2)); //y-coordinate of circle right eye
		     
		     GOval eyeR = new GOval(eyeRPosX, eyeRPosY, EYE_RADIUS,EYE_RADIUS );
		     add(eyeR);
		     eyeR.setFilled(true);
		     eyeR.setColor(Color.yellow);
	
		     double eyeLPosX = (double)(headPosX+(HEAD_WIDTH/4)-(EYE_RADIUS/2)); //x-coordinate of circle left eye
		     double eyeLPosY = (double)(headPosY+(HEAD_HEIGHT/4)-(EYE_RADIUS/2));//y-coordinate of circle left eye
		      
		      GOval eyeL = new GOval(eyeLPosX, eyeLPosY, EYE_RADIUS,EYE_RADIUS );
		      add(eyeL);
		      eyeL.setFilled(true);
		      eyeL.setColor(Color.yellow);  
		     
		      double mouthPosX = (double)(headPosX+(HEAD_WIDTH/2)-(MOUTH_WIDTH/2)); //x-coordinate of rectangle mouth
		      double mouthPosY = (double)(headPosY+(3*HEAD_HEIGHT/4)-(MOUTH_HEIGHT/2));//y-coordinate of rectangle mouth
		      
		      GRect mouth = new GRect(mouthPosX, mouthPosY, MOUTH_WIDTH, MOUTH_HEIGHT);
			  add(mouth);
			  mouth.setFilled(true);
			  mouth.setColor(Color.white); 
	}
}
