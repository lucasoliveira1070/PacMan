package br.com.fiap.entities;

import br.com.fiap.interfaces.Movement;

public class Player extends GameObject implements Movement {
	private Integer direction; // 0-> eixo X - 1->eixo Y
	private Integer hp;
	private Boolean invencible;

	public Player() {

	}

	public Player(Integer positionX, Integer positionY, Integer direction) {
		super(positionX,positionY);
		this.direction = direction;
	}

	public Integer getDirection() {
		return direction;
	}

	public void setDirection(Integer direction) {
		if (direction < 0) {
			System.out.println("Valor inválido");
		} else {
			this.direction = direction;
		}
	}

	public Integer getHp() {
		return hp;
	}

	public void setHp(Integer hp) {
		this.hp = hp;
	}

	public Boolean getInvencible() {
		return invencible;
	}

	public void setInvencible(Boolean invencible) {
		this.invencible = invencible;
	}

	public boolean canMove() {
		int newPositionX = this.getPositionX() + 10;
		int newPositionY = this.getPositionY() + 10;

		if (newPositionX > this.getScreenSize() || newPositionY > this.getScreenSize()) {
			return false;
		} else {
			return true;
		}
	}

	public void move(Integer direction) {
		if (canMove()) {
		}
	}
}
