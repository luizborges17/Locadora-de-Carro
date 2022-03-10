/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package loja;

/**
 *
 * @author User
 */
public class carro {

    String placa;
    double potencia;
    String modelo;
    String cor;
    String marca;
    boolean cambio_automatico;
    int ano;
    float preco;
    /*
    public carro(
        String plac,
        double poten,
        String modelo,
        String cor,
        String marca,
        boolean cambio_automatico,
        int ano
    )
    {
        placa=plac;
        potencia=poten;
        this.modelo=modelo;
        this.cor=cor;
        this.marca=marca;
        this.cambio_automatico=cambio_automatico;
        this.ano=ano;
    }
    */
    // metodos -> ações
    public float get_preco(){
        return preco;
    }
    public void set_preco(float novopreco){
        preco=novopreco;
    }
    public void andar(){
        System.out.println("Andando");
    }
    public boolean freio ()
    {   System.out.println("Freando");
        return true;
        
    }
    public void correr(int velocidade)
    {
        System.out.println("Estou correndo"+ velocidade+"Km");
    }
    public static void main(String[]args)
    {
        
      carro C1 = new carro ();
      carro C2 = new carro();
      C1.ano=2020;
      C1.cor="vermelho";
      C1.andar();
      
      C2.marca="Ferrari";
      C2.correr(300);
      C2.freio();
      C2.set_preco(1000);
     System.out.println(C2.get_preco());
    }
}

    