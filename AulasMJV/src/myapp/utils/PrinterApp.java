package myapp.utils;

import myapp.cadastros.Empresa;
import myapp.cadastros.Endereco;
import myapp.pedidos.Pedido;
import myapp.pedidos.PedidoItem;

public class PrinterApp {
	
	public static void imprimirPedido(Pedido pedido) {
		
		Empresa empresa = pedido.getEmpresa();
		Endereco endereco = empresa.getCadastroEmpresa().getEndereco();
		
		StringBuilder sb = new StringBuilder();
		sb.append(empresa.getCadastroEmpresa().getNome() + "\n");
		sb.append(String.format("%s, %s, %s - %s - %s\n", endereco.getLogradouro(), endereco.getNumero(), endereco.getBairro(), endereco.getCidade(), endereco.getEstado()));
		sb.append("CNPJ: " + Formatador.formatCpfCnpj(empresa.getCadastroEmpresa().getCpfCnpj()) + "\n");
		sb.append(String.format("IE: %s\nIM: %s\n", Formatador.formatIeIm(empresa.getIe()), Formatador.formatIeIm(empresa.getIm())));
		sb.append("-----------------------------------------------------------------\n");
		sb.append(String.format("%-43s CCF:%06d CCO:%06d\n", Formatador.formatData(pedido.getData()), empresa.getCcf(), empresa.getCco()));
		sb.append("-----------------------------------------------------------------\n");
		sb.append(String.format("%-29s%8s%8s%10s%10s\n", "NOME", "COD", "QUANT", "VL.UNIT", "VL.TOTAL"));
		sb.append("-----------------------------------------------------------------\n");
		for(PedidoItem item: pedido.getItens()) {
			String quant = String.format("%d", item.getQuantidade());
			String id = String.format("%d", item.getProduto().getId());
			String vlu = String.format("%.2f", item.getValorVenda());
			String vlt = String.format("%.2f", item.getValorTotal());
			sb.append(String.format("%-29s%8s%8s%10s%10s\n", item.getProduto().getTitulo(), id, quant, vlu, vlt));
		}
		sb.append("-----------------------------------------------------------------\n");
		String vlt = String.format("%.2f", pedido.getValorTotal());
		sb.append(String.format("%-55sR$ %7s\n", "TOTAL", "" + vlt));
		sb.append("\nOBRIGADO POR COMPRAR COM A " + empresa.getCadastroEmpresa().getNome());
		
		System.out.println(sb.toString());
	}
}
