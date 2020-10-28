package com.neewrobert.monetarytransactions.api;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.neewrobert.monetarytransactions.api.request.TransactionDTO;

import lombok.extern.log4j.Log4j2;


@Log4j2
@RestController
public class TransactionAPI {
	
	
	@RequestMapping(value = "transacao", method = RequestMethod.POST)
	public ResponseEntity<?> transaction(@Valid @RequestBody TransactionDTO request){
		log.info("Cadastrando uma nova transacao: {}", request);
		return ResponseEntity.status(HttpStatus.CREATED).build();
		
	}

}
