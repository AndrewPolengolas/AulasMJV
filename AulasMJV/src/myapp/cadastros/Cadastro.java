package myapp.cadastros;

public class Cadastro {
	
	private Integer id;
	private String nome;
	private Long telefone;
	private String email;
	
	public Cadastro(){
		
	}
	
	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}
	
	public Long getTelefone() {
		return telefone;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	private Integer getId() {
		return id;
	}
	
	private void setId(Integer id){
		this.id = id;
	}
}
