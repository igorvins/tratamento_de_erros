package classes;

public class Professor extends Pessoa {
	//-------------instanciando atributos--------------------
	private long siape;
	//------------criando metodos---------------------------
	//metodo construtor:
	public Professor(String nome)throws Exception{
		super(nome);
	}
	//metodo para receber siape:
	public void AtribuirSIAPE(long num)throws IllegalArgumentException {
		if(num <= 0)throw new IllegalArgumentException("SIAPE <= 0");
		this.siape = num;
	}
	//metodo imprimir info professor:
	
//? PORQUE ADICIONAMOS AQUI TAMBEM A VERIFICAÇAO DE SIAPE <=0?
//O METODO DE ATRIBUIR NAO VAI DEIXAR ISSO ACONTECER!
    public void Imprimir(String prefixo)throws Exception {
    	if(siape <= 0)throw new Exception("SIAPE <= 0");
        System.out.printf("%s%s (SIAPE %d)[%d]\n", prefixo, nome, siape, id);
    }
}
