package br.com.fiap.entities;

public class GameObject {

	private Integer positionX;
	private Integer positionY;
	private Integer screenSize;

	public GameObject() {

	}

	public GameObject(Integer positionX, Integer positionY) {
		if (positionX < 0 || positionY < 0) {
			System.out.println("Nao foi possivel instanciar um GameObject, valores invalidos.");
		} else {
			this.positionX = positionX;
			this.positionY = positionY;
		}
	}

	public Integer getPositionX() {
		return positionX;
	}

	public void setPositionX(Integer positionX) {
		this.positionX = positionX;
	}

	public Integer getPositionY() {
		return positionY;
	}

	public void setPositionY(Integer positionY) {
		this.positionY = positionY;
	}

	public Integer getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(Integer screenSize) {
		this.screenSize = screenSize;
	}

}
