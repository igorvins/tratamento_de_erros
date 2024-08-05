package classes;

import java.util.ArrayList;

public class Curso {
	//--------instanciando propriedades---------------------
	public static String universidade = "UFABC";
	private String nome;
	private ArrayList<Disciplina> disciplinas= new ArrayList<Disciplina>();
	//-----------criando metodos----------------
	//criando metodo estatico:
	static String gerarCodigoDisciplina(String nomeDisciplina) {
		return universidade + "_" + nomeDisciplina;
	}
	//metodo construtor:
	public Curso(String nome_curso) {
		this.nome=nome_curso;
	}
	//metodo para incluir uma disciplina:>
	public void Incluir(Disciplina disciplina_incluir) throws NullPointerException {
		if(disciplina_incluir==null) throw new NullPointerException("");
		disciplinas.add(disciplina_incluir);
	}
	//metodo para imprimir 
	
// ? PORQUE ESTAMOS COLOCANDO UM TRY CATCH DENTRO DE UM METODO APENAS DE IMPRESSAO?
//ELE NAO FAZ NADA ALEM DISSO!
    public void Imprimir() {
    	try {
        	System.out.printf("%s\n", universidade);
            System.out.printf("Curso de %s:\n", nome);
            System.out.println("\tDisciplinas:");
            if (disciplinas.size() > 0) {
                for (Disciplina d: disciplinas) {
                    d.Imprimir("\t\t");
                }
            } else {
                System.out.println("\t\t-vazio-");
            }
    	}
    	//QUE MENSAGEM É ESSA?? SENDO QUE O TRY NAO CHAMA NENHUM METODO!
    	catch(Exception e) {
    		e.getMessage();
    	}
    }
}
