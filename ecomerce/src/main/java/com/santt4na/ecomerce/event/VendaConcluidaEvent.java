package com.santt4na.ecomerce.event;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class VendaConcluidaEvent {
	private String pedidoId;
	private String clienteId;
	private BigDecimal valorTotal;
	private LocalDateTime dataVenda;
	
	public VendaConcluidaEvent() {
	}
	
	public VendaConcluidaEvent(String pedidoId, String clienteId, BigDecimal valorTotal, LocalDateTime dataVenda) {
		this.pedidoId = pedidoId;
		this.clienteId = clienteId;
		this.valorTotal = valorTotal;
		this.dataVenda = dataVenda;
	}
	
	public String getPedidoId() {
		return pedidoId;
	}
	
	public void setPedidoId(String pedidoId) {
		this.pedidoId = pedidoId;
	}
	
	public String getClienteId() {
		return clienteId;
	}
	
	public void setClienteId(String clienteId) {
		this.clienteId = clienteId;
	}
	
	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public LocalDateTime getDataVenda() {
		return dataVenda;
	}
	
	public void setDataVenda(LocalDateTime dataVenda) {
		this.dataVenda = dataVenda;
	}
}
