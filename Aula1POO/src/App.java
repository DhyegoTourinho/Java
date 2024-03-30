import Entities.Curso;
import Entities.ListaDeCursos;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Quantos cursos deseja adicionar? ");
            int quant = sc.nextInt(); 
            sc.nextLine();

            ListaDeCursos listaDeCursos = new ListaDeCursos(quant);

            for (int i = 1; i <= quant; i++){
                    System.out.println("Entre com os dados do "+ i + " curso.");
                    System.out.print("Nome do curso: ");
                    String nome = sc.nextLine();
                    
                    System.out.print("Codigo: ");
                    int codigo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Periodo (M/V/N/I): ");
                    char periodo = sc.nextLine().charAt(0);
                    System.out.print("Quantidade Total de Semestres: ");
                    int semestresTotais = sc.nextInt();
                    sc.nextLine();
                    Curso curso = new Curso(nome, codigo, periodo, semestresTotais);
                    listaDeCursos.EntrandoComDados(curso, (i-1));
                }
            System.out.println("Os Cursos cadastrados são: ");
            listaDeCursos.Mostrar();
        }
    }
}
