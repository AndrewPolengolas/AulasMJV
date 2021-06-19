package myapp.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatadorDatas {
	public static String dataFormatada(Date data) {
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		return formatador.format(data);
	}
}
