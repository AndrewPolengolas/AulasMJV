package myapp.pedidos;

import java.util.Date;
import java.util.List;

import myapp.cadastros.Cadastro;
import myapp.cadastros.Empresa;

public class Pedido {
	
	private Integer id;
	private Date data;
	private Integer ccf;
	private Integer coo;
	private Empresa empresa;
	private Cadastro comprador;
	private List<PedidoItem> itens;
	
	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Integer getCcf() {
		return ccf;
	}

	public void setCcf(Integer ccf) {
		this.ccf = ccf;
	}

	public Integer getCoo() {
		return coo;
	}

	public void setCoo(Integer coo) {
		this.coo = coo;
	}

	public Cadastro getComprador() {
		return comprador;
	}
	
	public void setComprador(Cadastro comprador) {
		this.comprador = comprador;
	}
	
	public void setItens(List<PedidoItem> itens) {
		this.itens = itens;
	}
	
	public List<PedidoItem> getItens() {
		return itens;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	
	public Double getValorTotal() {
		Double total = 0.0;
		for(PedidoItem item: itens) {
			total += item.getValorTotal();
		}
		return total;
	}
	
}
