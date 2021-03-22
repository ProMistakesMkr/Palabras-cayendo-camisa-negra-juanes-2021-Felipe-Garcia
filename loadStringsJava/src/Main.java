import java.util.ArrayList;
import java.util.Iterator;

import processing.core.PApplet;

public class Main extends PApplet {

	String[] texts;
	// ArrayList<String>arrayWords;
	ArrayList<String> words = new ArrayList<>();
	String palabra = "";
	int numero = 0;


	public static void main(String[] args) {
		PApplet.main(Main.class.getName());

	}

	public void settings() {
		size(400, 400);


	}

	public void setup() {
		frameRate(10);
		background(0);
		texts = loadStrings("./data/strings.txt");
		for (int i = 0; i < texts.length; i++) {
			String[] arrayWords = texts[i].split(" ");
			
			for (int j = 0; j < arrayWords.length; j++) {
				words.add(arrayWords[j]);	
				

			}
		}

			
		
		
	}

	public void draw() {
		

		
		if (frameCount % 10 == 0) { 
			
			for (int k = 0; k < words.size(); k++) {

					palabra = words.get(numero);
				
			}
			
			fill(255);
			textSize(10);
			text(palabra, random(10, 350), random(10, 350)); 
			numero ++;

		
		}
		



	}
}