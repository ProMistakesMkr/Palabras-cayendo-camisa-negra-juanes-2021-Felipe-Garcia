import java.util.ArrayList;
import loadStringsJava.Word;
import processing.core.PApplet;

public class Main extends PApplet {

	String[] texts;
	// ArrayList<String>arrayWords;
	ArrayList<Word> words = new ArrayList<>();
	Word palabra;
	int numero = 0;
	int[] chooseW;

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
		chooseW = new int [4];

		for (int i = 0; i < texts.length; i++) {
			String[] arrayWords = texts[i].split(" ");

			for (int j = 0; j < arrayWords.length; j++) {
				words.add(new Word((int) random(10, 350), (int) random(10, 350), arrayWords[j]));
			}
		}
	for(int i= 0; i < chooseW.length; i++) {
		chooseW[i] = (int) random(words.size());
	}
		fill(255);
		textSize(10);
	}

	public void draw() {

		if (frameCount % 10 == 0) {
			background(0);
			for (int k = 0; k < words.size(); k++) {

				if (k < numero) {
					palabra = words.get(k);
					fill(255);
					palabra.pintar(this);
					fill(51, 255, 156);
					rect(0, 350, 400, 50);
				}
			}
			numero++;
		}
		for(int i= 0; i < chooseW.length; i++) {
			fill (255);
			textSize(10);
			text(words.get(chooseW[i]).getWord(),50 + 100*i,380);
			
		}
	}
	

	
	public void mousePressed() {
		for(int i = 0; i < words.size(); i++) {
			Word w = words.get(i);
			w.wordClicked(this);
		}
		
		/*for(Word w : words) { 
		}*/
	}
	
}