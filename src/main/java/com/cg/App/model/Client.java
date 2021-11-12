package com.cg.App.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="Client")
public class Client {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long clientId;
	@Column(name="client_name", nullable = false, length = 255)
	private String clientName;
	@Column(name="client_email", nullable = false, length = 255)
	private String clientEmail;
	
	@Column(name="client_contact", nullable = false, length = 255)
	private long clientContact;
	
//	@OneToMany(targetEntity=Bill.class,cascade=CascadeType.ALL)
//	@JoinColumn(name="inId_fk",referencedColumnName="invoiceNo")
//	private List<Bill> bill;
	
	public Client() {
		super();
	}

	public Client(long clientId, String clientName, String clientEmail, long clientContact) {
		super();
		this.clientId = clientId;
		this.clientName = clientName;
		this.clientEmail = clientEmail;
		this.clientContact = clientContact;
	}

	public long getClientId() {
		return clientId;
	}

	public void setClientId(long clientId) {
		this.clientId = clientId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientEmail() {
		return clientEmail;
	}

	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}

	public long getClientContact() {
		return clientContact;
	}

	public void setClientContact(long clientContact) {
		this.clientContact = clientContact;
	}

//	public List<Bill> getBill() {
//		return bill;
//	}
//
//	public void setBill(List<Bill> bill) {
//		this.bill = bill;
//	}

	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", clientName=" + clientName + ", clientEmail=" + clientEmail
				+ ", clientContact=" + clientContact + "]";
	}
	

}

