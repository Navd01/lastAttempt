package com.companyservice.beans;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "CompanyTable")
public class Company {

	private String companyCode;

	private String companyName;

	private String companyCEO;

	private String companyTurnover;

	private String companyWebsite;

	private String stockExchange;

	private String latestStockPrice;

	public Company() {

	}

	public Company(String companyCode, String companyName, String companyCEO, String companyTurnover,
			String companyWebsite, String stockExchange, String latestStockPrice) {

		this.companyCode = companyCode;
		this.companyName = companyName;
		this.companyCEO = companyCEO;
		this.companyTurnover = companyTurnover;
		this.companyWebsite = companyWebsite;
		this.stockExchange = stockExchange;
		this.latestStockPrice = latestStockPrice;
	}

	@DynamoDBHashKey(attributeName = "companyCode")
	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	@DynamoDBAttribute(attributeName = "companyName")
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@DynamoDBAttribute(attributeName = "companyCEO")
	public String getCompanyCEO() {
		return companyCEO;
	}

	public void setCompanyCEO(String companyCEO) {
		this.companyCEO = companyCEO;
	}

	@DynamoDBAttribute(attributeName = "companyTurnover")
	public String getCompanyTurnover() {
		return companyTurnover;
	}

	public void setCompanyTurnover(String companyTurnover) {
		this.companyTurnover = companyTurnover;
	}

	@DynamoDBAttribute(attributeName = "companyWebsite")
	public String getCompanyWebsite() {
		return companyWebsite;
	}

	public void setCompanyWebsite(String companyWebsite) {
		this.companyWebsite = companyWebsite;
	}

	@DynamoDBAttribute(attributeName = "stockExchange")
	public String getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}

	@DynamoDBAttribute(attributeName = "latestStockPrice")
	public String getLatestStockPrice() {
		return latestStockPrice;
	}

	public void setLatestStockPrice(String latestStockPrice) {
		this.latestStockPrice = latestStockPrice;
	}

}
