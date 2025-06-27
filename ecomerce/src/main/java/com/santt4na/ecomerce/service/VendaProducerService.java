package com.santt4na.ecomerce.service;

import com.santt4na.ecomerce.event.VendaConcluidaEvent;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class VendaProducerService {
	
	private final KafkaTemplate<String, VendaConcluidaEvent> kafkaTemplate;
	private static final String TOPIC = "ecommerce-venda-concluida";
	
	public VendaProducerService(KafkaTemplate<String, VendaConcluidaEvent> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}
	
	public void enviarEvento(VendaConcluidaEvent evento) {
		kafkaTemplate.send(TOPIC, evento.getPedidoId(), evento);
	}
}