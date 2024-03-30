package Entities;

public class ListaDeCursos {
    int Quant;
    Curso[] Cursos;
    public ListaDeCursos (int quant){
        Quant = quant;
        this.Cursos = new Curso[quant];
    }
    
    public void EntrandoComDados(Curso entrada, int i){
        Cursos[i] = entrada;
    }

    public void Mostrar(){
        for (int i = 0; i < Quant; i++){
            System.out.println(Cursos[i].toString());
            System.out.println();
        }
    }
}
