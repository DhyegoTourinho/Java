package Entities;

public class Curso {
    public String Nome;
    public int Codigo;
    public char Periodo;
    public int SemestreTotais;

    public Curso (String nome, int codigo, char periodo, int semestresTotais){
        Nome = nome;
        Codigo = codigo;
        Periodo = periodo;
        SemestreTotais = semestresTotais;
    }
    
    @Override
    public String toString() {
        return 
        "Nome: " +
        Nome +
        "\nCodigo: " +
        Codigo +
        "\nPeriodo: " +
        Periodo +
        "\nQuantidade de periodos: " +
        SemestreTotais;
        
    }
}
