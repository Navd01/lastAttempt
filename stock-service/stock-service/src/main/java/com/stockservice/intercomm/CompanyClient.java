package com.stockservice.intercomm;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.stockservice.beans.Company;



@FeignClient(name="company-service" ,url="http://localhost:8081")



public interface CompanyClient {
	@RequestMapping(method = RequestMethod.GET, value = "/company/info/{companyCode}")
    Company getCompany(@PathVariable("companyCode") String companyCode);

	
    
	@RequestMapping(method = RequestMethod.POST, value = "/company/register")
    Company postLatestStock(Company company);
	
	@RequestMapping(method = RequestMethod.GET, value = "/company/gettingCheckedFromStock")
	String getFromCompany();
}




