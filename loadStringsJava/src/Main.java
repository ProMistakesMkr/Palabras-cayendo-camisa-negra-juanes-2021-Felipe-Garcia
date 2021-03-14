import java.util.ArrayList;
import java.util.Iterator;

import processing.core.PApplet;


public class Main extends PApplet {
	
	String[] texts;
	ArrayList<String>words;

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
		
	}

	
	public void settings() {
		size (400,400);
		
	}


	public void setup() {
		ArrayList<String> words = new ArrayList<>();  
		background(0);
		texts = loadStrings("./data/strings.txt");
		for (int i = 0; i < texts.length; i++) {
			String[] arrayWords = texts[i].split(" ");
			for (int j = 0; j < arrayWords.length; j++) {
				words.add(arrayWords[j]);
			}

				}
				
		for (int k = 0; k < words.size(); k++) {
			fill (255);
			textSize(10);
			text(words.get(k), random(10, 350), random(10, 350));
			System.out.println(words.get(k));
			}
		}
		

	public void draw() {
		
		
		
	}

}