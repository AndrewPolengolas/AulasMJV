package myapp.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Formatador {
	
	public static String formatCpfCnpj(String CpfCnpj) {
		if(CpfCnpj.length() == 11) {
			return CpfCnpj.replaceAll(("(\\d{3})(\\d{3})(\\d{3})(\\d{2})"), "$1.$2.$3-$4");
		}else {
			return CpfCnpj.replaceAll(("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})"), "$1.$2.$3/$4-$5");
		}
	}
	
	public static String formatIeIm(Long ieim) {
		if(ieim == 9) {
			return ieim.toString().replaceAll(("(\\d{3})(\\d{3})(\\d{3})"), "$1.$2.$3");
		}else {
			return ieim.toString().replaceAll(("(\\d{2})(\\d{3})(\\d{3})"), "$1.$2.$3");
		}
	}
	
	public static String formatData(Date data) {
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		return formatador.format(data);
	}
}
