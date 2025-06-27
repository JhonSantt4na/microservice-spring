package com.santt4na.notification.service;

import com.santt4na.notification.event.VendaConcluidaEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class VendaConsumerService {
	
	@KafkaListener(
		topics = "ecommerce-venda-concluida",
		groupId = "${spring.kafka.consumer.group-id}",
		containerFactory = "vendaKafkaListenerContainerFactory"
	)
	public void processarVenda(VendaConcluidaEvent evento) {
		System.out.println("Venda recebida no Notification:");
		System.out.println("Pedido ID: " + evento.getPedidoId());
		System.out.println("Cliente ID: " + evento.getClienteId());
		System.out.println("Valor Total: " + evento.getValorTotal());
		System.out.println("Data da Venda: " + evento.getDataVenda());
		
		// Aqui pode implementar envio de e-mail, SMS, push notification etc.
	}
}
