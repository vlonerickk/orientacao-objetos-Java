public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.titulo = "Capitão América";
        filme.anoDeLancamento = 2012;
        filme.duracaoEmMinutos = 124;

        filme.exibeFicha();
        filme.avalia(9);
        filme.avalia(10);
        filme.avalia(8);

        System.out.println(filme.somaDasAvaliacoes);
        System.out.println(filme.totalDeAvaliacoes);
        System.out.println(filme.mediaAvaliacoes());
        filme.somaDasAvaliacoes = 10;
        filme.totalDeAvaliacoes = 1;
        System.out.println(filme.mediaAvaliacoes());
    }
}
