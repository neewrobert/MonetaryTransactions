package com.neewrobert.monetarytransactions.api.request;


import java.time.LocalDateTime;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;

import org.apache.logging.log4j.message.Message;

import lombok.Data;

@Data
public class TransactionDTO {
	
	@NotNull(message = "{date.not.null}")
	@PastOrPresent (message = "{date.not.valid}")
	private final LocalDateTime dataHora;
	
	@NotEmpty(message = "{value.not.null}")
	@Pattern(regexp = "\\d+|\\d+.\\d+", message ="{value.not.valid}" )
	private final String valor;
	
}
