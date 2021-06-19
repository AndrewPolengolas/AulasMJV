package myapp.cadastros;

public class Empresa{
	
	private Cadastro cadastroEmpresa;
	private Long im;
	private Long ie;
	private Integer cco;
	private Integer ccf;
	
	public Empresa(Long im, Long ie, Integer cco, Integer ccf) {
		this.cco = cco;
		this.ccf = ccf;
		this.im = im;
		this.ie = ie;
	}
	
	public Integer getCco() {
		return cco;
	}

	public Integer getCcf() {
		return ccf;
	}

	public Cadastro getCadastroEmpresa() {
		return cadastroEmpresa;
	}
	
	public void setCadastroEmpresa(Cadastro cadastroEmpresa) {
		this.cadastroEmpresa = cadastroEmpresa;
	}
	
	public Long getIm() {
		return im;
	}

	public Long getIe() {
		return ie;
	}
	
}
