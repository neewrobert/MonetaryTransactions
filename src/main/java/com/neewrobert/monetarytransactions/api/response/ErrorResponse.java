package com.neewrobert.monetarytransactions.api.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ErrorResponse {
	
	private final String message;
	private final int code;
	private final String status;
	private final String object;
	private final List<ObjectError> errors;

}
