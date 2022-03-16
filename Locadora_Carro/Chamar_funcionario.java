public class Chamar_funcionario {

	public static void main(String[] args) {
        Funcionario F1 = new Funcionario();
        Funcionario F2 = new Funcionario();
        Funcionario F3 = new Funcionario();
        F1.nome="Marcia";
        F1.cargo="Atendente";
        F1.set_salario(11111);
        
        F2.cargo="Manobrista";
        F2.nome="Geraldo";
        F2.set_salario(2222);
        
        F3.cargo="Mecanico";
        F3.nome="Roberto";
        F3.set_salario(33333);


        
        F1.imprimr();
        F2.imprimr();
        F3.imprimr();
	}

}
