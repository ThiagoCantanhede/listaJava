package lista;

public class empregado {
	Integer ID;
	String nome;
	private Double salario;
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public void aumentarSalario(Double porcentagem){
		this.setSalario(((porcentagem /100)*this.getSalario()) + this.getSalario());
	}
}
