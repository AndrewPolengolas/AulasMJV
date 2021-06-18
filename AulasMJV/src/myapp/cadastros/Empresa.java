package myapp.cadastros;

public class Empresa{
	
	private Cadastro cadastroEmpresa;
	private Long im;
	private Long ie;
	
	public Empresa(Long im, Long ie) {
		this.im = im;
		this.ie = ie;
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
