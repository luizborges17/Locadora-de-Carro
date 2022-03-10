/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja;

/**
 *
 * @author User
 */
public class Cliente {
    String nome;
    String endereço;
    float debito;
    int cpf;
    
    public float get_debito(){
        return debito;
    }
    public void set_debito(float novo_debito){
        debito=novo_debito;
    }
    
    public static void main(String[]args){
        Cliente N1 = new Cliente();
        N1.nome="Jordan";
        N1.endereço="Rua Madeira,345";
        N1.cpf=12;
        N1.set_debito(1233);
        System.out.println("O seu nome é:"+N1.nome);
        System.out.println("O seu endereço é:"+N1.endereço);
        System.out.println("O seu cpf é:"+N1.cpf);
        System.out.println("R$ "+N1.get_debito());
    }
}
