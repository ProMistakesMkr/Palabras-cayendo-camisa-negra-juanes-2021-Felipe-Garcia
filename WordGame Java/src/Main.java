import java.util.ArrayList;
import loadStringsJava.Word;
import processing.core.PApplet;

public class Main extends PApplet {

	String[] texts;
	// ArrayList<String>arrayWords;
	ArrayList<Word> words = new ArrayList<>();
	Word palabra;
	int numero = 0;
	ArrayList<Word> chooseW = new ArrayList<>();
	String[] arrayWords;

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
	}

	public void settings() {
		size(600, 600);
	}

	public void setup() {
		frameRate(60);

		background(255);
		texts = loadStrings("./data/strings.txt");

		for (int i = 0; i < texts.length; i++) {
			arrayWords = texts[i].split(" ");

			for (int j = 0; j < arrayWords.length; j++) {
				words.add(new Word((int) random(10, 550), (int) random(10, 300), arrayWords[j]));
			}

		}

		for (int k = 0; k < 4; k++) {
			chooseW.add(new Word(80 + 150 * k, 580, words.get((int) random(words.size())).getWord())); // =
		}

		fill(0);
		textSize(15);
	}

	public void draw() {

		
		if (frameCount % 10 == 0) {
			background(255);
			
			for (int k = 0; k < words.size(); k++) {
			
				if (k < numero) {
					palabra = words.get(k);
					fill(0);
					palabra.pintar(this);
				
				}
			}
			numero++;
		}
		fill(51, 255, 156);
		rect(0, 550, 600, 100);
		for (int i = 0; i < chooseW.size(); i++) {
			fill(0);
			textSize(10);
			chooseW.get(i).pintarMatch(this);

		}
	}

	public void mousePressed() {
		for (int i = 0; i < words.size(); i++) {
			Word w = words.get(i);
			w.wordClicked(this);
			
		}
	}
	
	public void mouseReleased() {
		for (int i = 0; i < words.size(); i++) {
			matchPalabras();
			
		}
	}

	public void matchPalabras() {
		for (int i = 0; i < words.size(); i++) {
			for (int j = 0; j < chooseW.size(); j++) {
				// true : word x dragged = true
				// words = arreglo, get(i) elemento Word, metodos de Word
				if (words.get(i).isDragged()) {
					
					// x1 mouseX, y1 mouseY, x2 xpalabra,y2 ypalabra
					if (dist( words.get(i).getX(),words.get(i).getY(),chooseW.get(j).getX(), chooseW.get(j).getY()) < 50) {
						
						//word seleccionada es identidad a la palabra del march retorne true
						if(words.get(i).getWord().contentEquals(chooseW.get(j).getWord())) {
							System.out.println("Match");
							words.get(i).setDragged(false);
							chooseW.remove(j);
							
						} 
						
					}else {
						//System.out.println("No match");
						//words.get(i).setDragged(false);
					}
				}
			}

		}
	}

}