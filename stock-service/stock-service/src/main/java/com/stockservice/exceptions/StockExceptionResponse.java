package com.stockservice.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StockExceptionResponse {
	
	private String stockCode;

}
