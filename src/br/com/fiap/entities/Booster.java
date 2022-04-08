package br.com.fiap.entities;

public class Booster extends Item {
	private Integer boostTime;

	public Booster() {

	}

	public Booster(Integer positionX, Integer positionY) {
		super(positionX, positionY);
	}

	public Integer getInvecibleTime() {
		return boostTime;
	}

	public void setInvecibleTime(Integer boostTime) {
		this.boostTime = boostTime;
	}
	
	public void boost(Player player) {
		player.setInvencible(true);
	}

}
