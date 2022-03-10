/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja;

/**
 *
 * @author User
 */
public class Funcionario {
    String atendente;
    String mecanico;
    String manobrista;
    float salario;
    float horario;
    
    public void receber(){
        System.out.println("Recebe 1000 R$");
    } 
    public void ponto(){
        System.out.println("Chegar as 8:00 da manhã");
    }
    
    public float get_salario(){
        return salario;
    }
    public void set_salario(float novo_salario){
        salario=novo_salario;
    }
      
    public static void main (String[]args){
        Funcionario F1 = new Funcionario();
        Funcionario F2 = new Funcionario();
        Funcionario F3 = new Funcionario();
        F1.atendente="Marcia";
        F2.manobrista="Geraldo";
        F3.mecanico="Roberto";
        F1.receber();
        F2.ponto();
       System.out.println(F1.atendente);
        
        
        
    }
}

