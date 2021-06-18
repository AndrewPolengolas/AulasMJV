package myapp;

import myapp.cadastros.Empresa;
import myapp.pedidos.Pedido;

public class PrinterApp {
	
	public static void imprimirPedido(Pedido pedido) {
		
		Empresa empresa = pedido.getEmpresa();
		
		StringBuilder sb = new StringBuilder();
		sb.append(empresa.getCadastroEmpresa().getNome() + "\n");
		sb.append(empresa.getCadastroEmpresa().getEndereco() + "\n");
		sb.append("CNPJ: " + empresa.getCadastroEmpresa().getCpfCnpj() + "\n");
		sb.append(String.format("IE: %d\nIM: %d", empresa.getIe(), empresa.getIm()));
		
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
