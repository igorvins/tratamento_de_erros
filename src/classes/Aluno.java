package classes;

public class Aluno extends Pessoa {
	//Pessoa pessoa_aluno = new Pessoa();
	//----------declarando atributos(variaveis)----------------SS
	//atributo privado do RA:
	private long RA;
	//-------------------criando metodos----------------------------
	
	// criando o construtor para classe aluno e chamando o construtor da classe Pessoa 
	// pois aluno é uma pessoa e precisamos registrar o nomedo aluno
	// para chamar o construtor da classe herdada, usamos o "super()"
	public Aluno(String nome) throws Exception {
		super(nome);
	}
	//metodo para atribuir RA
	public void AtribuirRA(long ra)throws IllegalArgumentException {
		if(ra <= 0) throw new IllegalArgumentException("RA <= 0"); 
		RA = ra;
	}
	//metodo para imprimir info do aluno:
	
// ? PORQUE VERIFICAMOS AQUI NOVAMENTE SE O RA <= 0 SENDO QUE JA VERIFICAMOS NA ATRIBUIÇAO?
// O METODO ATRIBUIR NAO VAI DEIXAR ESSE CENARIO OCORRER!
// O QUE É ESSE PREFIXO QUE TODAS ESTAO RECEBENDO?
    public void Imprimir(String prefixo)throws Exception {
    	if(RA<=0) throw new Exception("RA <= 0");
        System.out.printf("%s%s (RA %d)[%d]\n", prefixo, nome, RA, id);
    }
}

