public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.nome = "Richard";
        pessoa.idade = 18;
        pessoa.sexo = "Masculino";
        pessoa.corCabelo = "Loiro";

        System.out.println("************************************");

        System.out.println("Nome: " + pessoa.nome + "\nIdade: " + pessoa.idade + "\nSexo: " + pessoa.sexo + "\nCor de cabelo: " + pessoa.corCabelo);
        pessoa.exibirMensagem();

        System.out.println("************************************");
        System.out.println("MULTIPLICAÇÃO");
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.calcular(10));

        System.out.println("************************************");
        System.out.println("MÚSICA");
        Musica musica = new Musica();

        musica.Artista = "Veigh";
        musica.Titulo = "Taylor";
        musica.anoDeLancamento = 2025;
        musica.Album = "Eu Venci o Mundo";
        musica.fichaTecnica();
        musica.avaliacao = 10;
        musica.mediaAvaliacao();

        System.out.println("************************************");

    }
}