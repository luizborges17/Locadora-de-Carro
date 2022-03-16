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
   
    public void imprimir(){
        System.out.println("O seu nome é:"+nome);
        System.out.println("O seu endereço é:"+endereço);
        System.out.println("O seu cpf é:"+cpf);
        System.out.println("R$ "+get_debito());
    }
}