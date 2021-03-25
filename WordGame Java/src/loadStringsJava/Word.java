package loadStringsJava;

import processing.core.PApplet;
import processing.core.PConstants;

public class Word {
	int x;
	int y;
	boolean dragged;
	String word;

	public Word(int x, int y, String word) {
		this.x = x;
		this.y = y;
		this.word = word;
		dragged = false;
	}

	public void pintar(PApplet app) {
		if(dragged) {
			app.textAlign(PConstants.LEFT);
			app.text(word, app.mouseX, app.mouseY);
		} else {
			app.text(word, x, y);
		}
		
		y += 20;
		
		if(y>550) {
			y=0;
		}
	}
	
	public void pintarMatch(PApplet app) {
		app.text(word,x, y);
	}

	public void wordClicked(PApplet app) {
		if(app.dist(this.x, this.y, app.mouseX, app.mouseY) < 20) {
			dragged = !true;
		}
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
// estado - retorno - nombre (param)
	public void setWord(String word) {
		this.word = word;
	}

	public boolean isDragged() {
		return dragged;
	}

	public void setDragged(boolean dragged) {
		this.dragged = dragged;
	}
}
