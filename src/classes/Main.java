package classes;

//a classe main é sempre a que vai chamar as outras classes!!!
public class Main {
//o metodo public static void main(String[] args) é sempre padrao dessa forma na main
	public static void main(String[] args) {
		try {
			Disciplina disciplina1 = new Disciplina("Matematica");
			
			Professor professor1 = new Professor("Matheus");
			professor1.AtribuirSIAPE(5);
			
			Aluno aluno1 = new Aluno("Igor");
			aluno1.AtribuirRA(2);
			
			disciplina1.IncluirProfessor(professor1);
			disciplina1.IncluirAluno(aluno1);
			disciplina1.Imprimir("-");

		}
		catch(Exception e) {
			System.out.println("Error: "+e.getMessage());
		}
	}
}
