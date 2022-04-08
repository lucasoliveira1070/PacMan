package br.com.fiap.entities;

public class Bomb extends Item {
	private Integer damage;

	public Bomb() {

	}

	public Bomb(Integer positionX, Integer positionY) {
		super(positionX, positionY);
	}

	public Integer getDamage() {
		return damage;
	}

	public void setDamage(Integer damage) {
		this.damage = damage;
	}
	
	public void dealDamage(Player player, Integer damage) {
		player.setHp(player.getHp()-damage);
	}
	

}
