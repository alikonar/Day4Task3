package Entities;

import java.time.LocalDate;
import java.time.LocalTime;

import Abstract.Entity;

public class Order implements Entity {

	private int id;
	private int customerId;
	private int gameId;
	private int campaignId;
	private LocalDate orderDate;
	private LocalTime orderTime;

	public Order() {

	}

	public Order(int id, int customerId, int gameId, int campaignId, LocalDate orderDate, LocalTime orderTime) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.gameId = gameId;
		this.campaignId = campaignId;
		this.orderDate = orderDate;
		this.orderTime=orderTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	
	public LocalTime getOrderTime() {
		return orderTime;
	}
	
	public void setOrderTime(LocalTime orderTime) {
		this.orderTime=orderTime;
	}

}
