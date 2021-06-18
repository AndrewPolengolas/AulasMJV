package myapp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import myapp.cadastros.CD;
import myapp.cadastros.Cadastro;
import myapp.cadastros.Empresa;
import myapp.factory.FabricaCadastro;
import myapp.pedidos.Pedido;
import myapp.pedidos.PedidoItem;

public class Application {
	public static void main(String[] args) {
		Cadastro artista = FabricaCadastro.criarCadastro("BRUCE DICKSON", "bruce@gmail", 989089090L);
		
		CD p1 = new CD(); // Livro()
		p1.setCodigoBarras("989789789");
		p1.setTitulo("IRON MAIDEN");
		p1.setValorVenda(199.90);
		p1.setFaixa(10);
		p1.setArtista(artista);
		
		artista = FabricaCadastro.criarCadastro("PINK FLOYD", "pink@gmail", 989089090L);
		
		CD p2 = new CD(); // Livro()
		p2.setCodigoBarras("989789789");
		p2.setTitulo("THE WALL");
		p2.setValorVenda(157.90);
		p2.setFaixa(8);
		p2.setArtista(artista);
		
		Empresa empresa = new Empresa(90584L, 98789L);
		Cadastro cadEmpresa = new Cadastro();
		cadEmpresa.setCpfCnpj("12345678900001");
		cadEmpresa.setEmail("pedidos@gmail");
		cadEmpresa.setEndereco("Rua inacio, 1036, centro - SP");
		cadEmpresa.setNome("IFOOD COMIDAS E RESTAURANTES");
		cadEmpresa.setTelefone(11954702059L);
		empresa.setCadastroEmpresa(cadEmpresa);
		
		Pedido pedido = new Pedido();
		pedido.setEmpresa(empresa);
		Cadastro comprador = FabricaCadastro.criarCadastro("Andrew", "andrew@gmail", 954702059L);
		
		pedido.setComprador(comprador);
		pedido.setData(new Date(2021,6,16));
		pedido.setValorTotal(325.0);
		pedido.setId(23234);
		
		List<PedidoItem> itens = new ArrayList<>();
		PedidoItem item = new PedidoItem();
		item.setProduto(p1);
		item.setQuantidade(2.0);
		item.setValorVenda(p1.getValorVenda());
		item.setValorTotal(item.getQuantidade() * item.getValorVenda());
		
		itens.add(item);
		
		item= new PedidoItem();
		item.setProduto(p2);
		item.setQuantidade(4.0);
		item.setValorVenda(p2.getValorVenda());
		item.setValorTotal(item.getQuantidade() * item.getValorVenda());
		
		itens.add(item);
		
		pedido.setItens(itens);
		
		PrinterApp.imprimirPedido(pedido);
	}
}






 



