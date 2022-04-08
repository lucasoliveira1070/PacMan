package br.com.fiap.entities;

import br.com.fiap.interfaces.Movement;

public class Ghost extends GameObject implements Movement {

	private Integer direction; // 0-> eixo X - 1->eixo Y
	private Integer hp;
	private Boolean invencible;

	public Ghost() {

	}

	public Ghost(Integer positionX, Integer positionY, Integer direction) {
		super(positionX,positionY);
		this.direction = direction;
	}
	
	

	public Integer getDirection() {
		return direction;
	}

	public void setDirection(Integer direction) {
		this.direction = direction;
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

	@Override
	public boolean canMove() {
		int newPositionX = this.getPositionX() + 10;
		int newPositionY = this.getPositionY() + 10;

		if (newPositionX > this.getScreenSize() || newPositionY > this.getScreenSize()) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public void move(Integer direction) {
		// TODO Auto-generated method stub

	}

}
