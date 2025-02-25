package me.dio.domain.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_account")
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String agency;
	
	@Column(unique = true)
	private String number;
	
	@Column(name = "addition_limit",precision = 2,scale = 13)
	private BigDecimal balance;
	
	@Column(precision = 2,scale = 13)
	private BigDecimal limit;
	
	

	public Long getId() {return id;}
	public void setId(Long id) {this.id = id;}

	public String getNumber() {return number;}
	public void setNumber(String number) {this.number = number;}

	public BigDecimal getBalance() {return balance;}
	public void setBalance(BigDecimal balance) {this.balance = balance;	}

	public BigDecimal getLimit() {return limit;}
	public void setLimit(BigDecimal limit) {this.limit = limit;	}
	
	public String getAgency() {return agency;}
	public void setAgency(String agency) {this.agency = agency;}
	

}
