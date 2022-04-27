package prova;


public class Sofa {
	private String marca;
	private String cor;
	private String tecido;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTecido() {
		return tecido;
	}

	public void setTecido(String tecido) {
		this.tecido = tecido;
	}

	public Sofa(String marca, String cor, String tecido) {
		super();
		this.marca = marca;
		this.cor = cor;
		this.tecido = tecido;
	}
	
	public void list (Sofa s) {
		System.out.println("\nmarca:"+ marca +"\ncor:"+cor+"\ntecido:"+ tecido);	
}
	public static void main(String[] args) {
		
		
		 Sofa s1 = new Sofa ("Arca sofás", "Preto", "Camurça");
		 
		 s1.list(s1);
		
		 

	}

}
