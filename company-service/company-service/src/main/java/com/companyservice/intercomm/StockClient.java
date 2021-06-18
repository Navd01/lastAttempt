package com.companyservice.intercomm;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.companyservice.beans.Company;

@FeignClient(name = "stock-service", url = "http://localhost:8082")

public interface StockClient {
	@RequestMapping(method = RequestMethod.DELETE, value = "/stock/deleteStock")
	void deleteStock(Company company);

	@RequestMapping(method = RequestMethod.GET, value = "/stock/gettingCheckedFromCompany")
	String getFromStock();

}
