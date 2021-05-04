package Entities;

import Abstract.Entity;

public class Game implements Entity {

	private int id;
	private String gameName;
	private Double priceOfGame;

	public Game() {

	}

	public Game(int id, String gameName, Double priceOfGame) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.priceOfGame = priceOfGame;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public Double getPriceOfGame() {
		return priceOfGame;
	}

	public void setPriceOfGame(Double priceOfGame) {
		this.priceOfGame = priceOfGame;
	}

}
