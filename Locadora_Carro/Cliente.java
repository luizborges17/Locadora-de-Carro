public class Cliente {
    String nome;
    String endere�o;
    float debito;
    int cpf;
    
    public float get_debito(){
        return debito;
    }
    public void set_debito(float novo_debito){
        debito=novo_debito;
    }
   
    public void imprimir(){
        System.out.println("O seu nome �:"+nome);
        System.out.println("O seu endere�o �:"+endere�o);
        System.out.println("O seu cpf �:"+cpf);
        System.out.println("R$ "+get_debito());
    }
}