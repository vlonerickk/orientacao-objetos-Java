public class Filme {
    String titulo;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes ;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibeFicha(){
        System.out.println("Título: " + titulo);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
    }
    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double mediaAvaliacoes(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
