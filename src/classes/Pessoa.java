package classes;

//criando classe abstrata Pessoa que provavelmente sera utilizada nas outras classes

//esta armazenando as infos essenciais!

public abstract class Pessoa {
	//variavel privada statica do tipo long:
	private static long id_counter = 0;
	protected long id;
	//nome da pessoa do tipo protected string (protegido, acessivel apenas atraves de
	//uma classe que esta herdando a classe onde esta o atributo protegido)
	protected String nome;
	//construtor da classe:
	public Pessoa(String alguem) throws Exception {
		if(alguem.trim().equals(""))throw new Exception("nome=\"\""); 
		this.nome = alguem;
		id_counter++;
		id = id_counter;
	}
	public abstract void Imprimir(String impressao) throws Exception;
}

