package dnd_inventory;

import java.awt.Image;

public class Card {
	private int width;
	private int length;
	private Image pic;

	public Card(Image pic, int width, int length){
		this.pic = pic;
		this.width = width;
		this.length = length;
	}
}
