public class Carro {

    String placa;
    double potencia;
    String modelo;
    String cor;
    String marca;
    boolean cambio_automatico;
    int ano;
    float preco;

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
        
      Carro C1 = new Carro ();
      Carro C2 = new Carro();
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
