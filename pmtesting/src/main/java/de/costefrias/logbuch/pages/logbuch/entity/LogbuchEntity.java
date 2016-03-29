package de.costefrias.logbuch.pages.logbuch.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LogbuchEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String name; // Das Projekt
	private String acronym; // Kürzel
	private String status; //
	private String customer; // Auftraggeber
	private String orderDate; // Auftragsdatum
	private String desiredDate; // Wünchdatum
	private String testStartDate; // Test begin
	private String testEndDate; // Test ende
	private String comment; //
	private float cost;
	private int pt;

	protected LogbuchEntity() {}

	public LogbuchEntity(String name, String acronym) {
		this.name = name;
		this.acronym = acronym;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the acronym
	 */
	public String getAcronym() {
		return acronym;
	}

	/**
	 * @param acronym the acronym to set
	 */
	public void setAcronym(String acronym) {
		this.acronym = acronym;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the customer
	 */
	public String getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(String customer) {
		this.customer = customer;
	}

	/**
	 * @return the orderDate
	 */
	public String getOrderDate() {
		return orderDate;
	}

	/**
	 * @param orderDate the orderDate to set
	 */
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	/**
	 * @return the desiredDate
	 */
	public String getDesiredDate() {
		return desiredDate;
	}

	/**
	 * @param desiredDate the desiredDate to set
	 */
	public void setDesiredDate(String desiredDate) {
		this.desiredDate = desiredDate;
	}

	/**
	 * @return the testStartDate
	 */
	public String getTestStartDate() {
		return testStartDate;
	}

	/**
	 * @param testStartDate the testStartDate to set
	 */
	public void setTestStartDate(String testStartDate) {
		this.testStartDate = testStartDate;
	}

	/**
	 * @return the testEndDate
	 */
	public String getTestEndDate() {
		return testEndDate;
	}

	/**
	 * @param testEndDate the testEndDate to set
	 */
	public void setTestEndDate(String testEndDate) {
		this.testEndDate = testEndDate;
	}

	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * @return the cost
	 */
	public float getCost() {
		return cost;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost(float cost) {
		this.cost = cost;
	}

	/**
	 * @return the pt
	 */
	public int getPt() {
		return pt;
	}

	/**
	 * @param pt the pt to set
	 */
	public void setPt(int pt) {
		this.pt = pt;
	}

	@Override
	public String toString() {
		return String.format(
				"LogbuchEntity[id=%d, name='%s', acronym='%s']",
				id, name, acronym);
	}
}
