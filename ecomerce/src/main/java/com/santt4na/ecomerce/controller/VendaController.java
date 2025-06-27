package com.santt4na.ecomerce.controller;

import com.santt4na.ecomerce.event.VendaConcluidaEvent;
import com.santt4na.ecomerce.service.VendaProducerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/venda")
public class VendaController {
	
	private final VendaProducerService producerService;
	
	public VendaController(VendaProducerService producerService) {
		this.producerService = producerService;
	}
	
	@PostMapping("/concluir")
	public ResponseEntity<String> concluirVenda(@RequestParam String pedidoId,
												@RequestParam String clienteId,
												@RequestParam BigDecimal valorTotal) {
		VendaConcluidaEvent evento = new VendaConcluidaEvent(
			pedidoId,
			clienteId,
			valorTotal,
			LocalDateTime.now()
		);
		
		producerService.enviarEvento(evento);
		return ResponseEntity.ok("Evento de venda concluída enviado com sucesso");
	}
}