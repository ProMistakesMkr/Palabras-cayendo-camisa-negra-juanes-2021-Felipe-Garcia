import java.util.ArrayList;
import loadStringsJava.Word;
import processing.core.PApplet;

public class Main extends PApplet {

	String[] texts;
	// ArrayList<String>arrayWords;
	ArrayList<Word> words = new ArrayList<>();
	Word palabra;
	int numero = 0;


	public static void main(String[] args) {
		PApplet.main(Main.class.getName());

	}

	public void settings() {
		size(400, 400);


	}

	public void setup() {
		frameRate(60);
		background(0);
		texts = loadStrings("./data/strings.txt");
		
		for (int i = 0; i < texts.length; i++) {
			String[] arrayWords = texts[i].split(" ");
			
			for (int j = 0; j < arrayWords.length; j++) {
				words.add(new Word ( (int)random(10, 350), (int)random(10, 350), arrayWords[j]));	
			}
		}

			
		fill(255);
		textSize(10);
		
	}

	public void draw() {
		
		
		if (frameCount % 10 == 0) { 
			background(0);
			for (int k = 0; k < words.size(); k++) {

				if(k < numero) {
					palabra = words.get(k);
					palabra.pintar(this);
				}
				
			}
			
			
			numero ++;

		
		}
		

	}
}