package br.com.fiap.entities;

public class Item extends GameObject {

	private boolean visible;

	public Item() {

	}

	public Item(Integer positionX, Integer positionY) {
		super(positionX, positionY);
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

}
