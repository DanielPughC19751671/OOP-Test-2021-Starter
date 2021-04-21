package ie.tudublin;

import dff.minim.AudioOutput;
import ddf.minim.Mininm;
import ddf.minim.signals.Oscillator;
import ddf.minim.ugens.Oscil;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import com.jogamp.newt.Display;

import processing.core.PApplet;

public class ScoreDisplay extends PApplet
{
	
	
	String score = "DEFGABcd";
	//String score = "D2E2F2G2A2B2c2d2";
	//String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";
	String str[] = score.split(",");
	List<String> noteList = new ArrayList<String>();
	noteList = Arrays.asList(str);
	for(String s: noteList){
		System.out.println(s);
	}
	

	
	
	
	public void settings()
	{
		size(1000, 500);

		// How to convert a character to a number
		char c = '7'; // c holds the character 7 (55)
		int i = c - '0'; // i holds the number 7 (55 - 48) 
		println(i);
		s.charAt(c);

	}

	public void setup() 
	{
		size(200, 200);
	}

	public void draw()
	{
		background(255);
		float border;
		
		
		
		
	}

	void drawNotes()
	{
		float border = 0.1f * width;
		textAlign(CENTER, CENTER);
		for(int i = -5 ; i <=5 ; i ++)
        {
            float x = map(i, -5, 5, border, width - border);
            float y = map(i, -5, 5, border, height - border);
			stroke(0, 0, 255);
			line(x, border,x, height - border);
			line(x, border,x, height - border);
			line(x, border,x, height - border);
			line(x, border,x, height - border);
			line(x, border,x, height - border);
		}
	
	
	
	
	
	}


}
	