package com.neewrobert.monetarytransactions.model.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class TransactionDTO {
	
	@NotBlank
	private LocalDateTime date;
	@NotBlank
	private BigDecimal value;
	
}
