package loadStringsJava;

import processing.core.PApplet;

public class Word {
	int x;
	int y;
	String word;

	public Word(int x, int y, String word) {
		this.x = x;
		this.y = y;
		this.word = word;
	}

	public void pintar(PApplet app) {
		app.text(word, x, y);
		y++;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	public String getWord() {
		return word;
	}

	public void setword(String word) {
		this.word = word;
	}
}
