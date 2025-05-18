public class Musica {

    String Titulo;
    String Artista;
    String Album;
    int anoDeLancamento;
    int numeroDeAvaliacao;
    double avaliacao;

    void fichaTecnica(){
        System.out.println("Titulo: " + Titulo + "\nArtista: " + Artista + "\nAlbum: " + Album + "\nAno de lançamento: " + anoDeLancamento);
        System.out.println("Avaliação: " + mediaAvaliacao());
    }
    void avaliacaoMusica(double avaliacao){
        avaliacao += avaliacao;
        numeroDeAvaliacao++;
    }
    double mediaAvaliacao(){
        double mediaAvaliacao = avaliacao*numeroDeAvaliacao;
        return mediaAvaliacao;
    }
}
