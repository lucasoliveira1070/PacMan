package br.com.fiap.entities;

import br.com.fiap.interfaces.Movement;

public class Player extends GameObject implements Movement {
	private Integer direction;
	private Integer hp;
	private Boolean invencible;

	public Player() {

	}

	public Player(Integer positionX, Integer positionY, Integer direction) {
		super(positionX, positionY);
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
		switch (this.direction) {
		case 0:
			if (this.getPositionY() - 10 < 0)
				return false;
		case 90:
			if (this.getPositionX() + 10 > this.getScreenSize())
				return false;
		case 180:
			if (this.getPositionY() + 10 > this.getScreenSize())
				return false;
		case 270:
			if (this.getPositionX() - 10 < 0)
				return false;
		}
		return true;
	}

	public void move() {
		if (canMove()) {
			switch (direction) {
			case 0:
				this.setPositionY(this.getPositionY() - 10);
				System.out.println(getPositionY());
				break;
			case 90:
				this.setPositionX(this.getPositionX() + 10);
				System.out.println(this.getPositionX());
				break;
			case 180:
				this.setPositionY(this.getPositionY() + 10);
				System.out.println(this.getPositionY());
				break;
			case 270:
				this.setPositionX(this.getPositionX() - 10);
				System.out.println(this.getPositionX());
				break;
			}
		}
	}
}
