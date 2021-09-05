package lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List <empregado> empregados = new ArrayList();
	
		
		for(int i=0; i<2; i++) {
			empregado empregado = new empregado();
			System.out.println("Informe o Id do empregado");
			empregado.ID = sc.nextInt();
			System.out.println("Informe o nome do empregado");
			sc.nextLine();
			empregado.nome = sc.nextLine();
			System.out.println("Informe o salário do empregado");
			empregado.setSalario(sc.nextDouble());
			empregados.add(empregado);
		}
		
		System.out.println("Informe o ID do empregado que vai ter o salário aumentado");
		Integer IDEmpregado = sc.nextInt();
		
		System.out.println("Informe a porcentagem de aumento");
		Double porcentagem = sc.nextDouble();
		
		for(empregado emp:empregados) {
			if(emp.ID.equals(IDEmpregado)) {
				emp.aumentarSalario(porcentagem);
			}
		}

		for(empregado emp:empregados) {
			System.out.println(emp.ID);
			System.out.println(emp.nome);
			System.out.println(emp.getSalario());
	
		}
	}

}
