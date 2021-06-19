package myapp.utils;

import myapp.cadastros.Empresa;
import myapp.pedidos.Pedido;
import myapp.pedidos.PedidoItem;

public class PrinterApp {
	
	public static void imprimirPedido(Pedido pedido) {
		
		Empresa empresa = pedido.getEmpresa();
		
		StringBuilder sb = new StringBuilder();
		sb.append(empresa.getCadastroEmpresa().getNome() + "\n");
		sb.append(empresa.getCadastroEmpresa().getEndereco().getRua() + ", ");
		sb.append(empresa.getCadastroEmpresa().getEndereco().getLogradouro() + ", ");
		sb.append(empresa.getCadastroEmpresa().getEndereco().getBairro() + " - ");
		sb.append(empresa.getCadastroEmpresa().getEndereco().getCidade() + " - ");
		sb.append(empresa.getCadastroEmpresa().getEndereco().getEstado() + "\n");
		sb.append("CNPJ: " + empresa.getCadastroEmpresa().getCpfCnpj() + "\n");
		sb.append(String.format("IE: %d\nIM: %d\n", empresa.getIe(), empresa.getIm()));
		sb.append("-------------------------------------------------------\n");
		sb.append(FormatadorDatas.dataFormatada(pedido.getData()));
		sb.append(String.format(" CCF:%06d CCO:%06d\n", empresa.getCcf(), empresa.getCco()));
		sb.append("-------------------------------------------------------\n");
		sb.append("QUANTIDADE  CÓDIGO  NOME          VL.UNIT  VL.TOTAL\n");
		sb.append("-------------------------------------------------------\n");
		for(PedidoItem item: pedido.getItens()) {
			sb.append(item.getQuantidade() + "           ");
			sb.append(item.getProduto().getId() + "      "); 
			sb.append(item.getProduto().getTitulo() + "    ");
			sb.append(String.format("%.2f", item.getValorVenda()) + "       ");
			sb.append(String.format("%.2f", item.getValorTotal()) + "      \n");
		}
		sb.append("-------------------------------------------------------\n");
		sb.append("TOTAL                                       R$ " + String.format("%.2f", pedido.getValorTotal()) + "\n\n");
		sb.append("OBRIGADO POR COMPRAR COM A " + empresa.getCadastroEmpresa().getNome());
		//COLOCAR EM UMA LINHA A DATA, O CCF (6) E O COO (6)
		
		System.out.println(sb.toString());
		
		/*
		System.out.println(empresa.getCadastroEmpresa().getNome());
		System.out.println(empresa.getCadastroEmpresa().getEndereco());
		System.out.println("CNPJ: " + empresa.getCadastroEmpresa().getCpfCnpj());
		System.out.println("IE: " + empresa.getIe());
		System.out.println("IM: " + empresa.getIm());
		*/
	}
}
