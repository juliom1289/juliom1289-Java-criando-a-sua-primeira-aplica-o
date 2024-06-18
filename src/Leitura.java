import java.util.Scanner;

public class Leitura {
    //psvm -> public static void main(String[] args) {
    //
    //    }
    public static void main(String[] args) {
        //leitura é uma declaração da classe scanner
        Scanner leitura = new Scanner(System.in);
        //input string
        System.out.println("Digite seu filme favorito");

        //armazenamento de scanner leitura em string filme
        String filme = leitura.nextLine();
        System.out.println("meu filme favorito é: " + filme);

        System.out.println("Qual é o ano de lançamento desse filme: ");
        //declara-se o que será lido
        int anoLancamento = leitura.nextInt();
        System.out.println(String.format("%d é o ano de lançamento de %s, meu filme favorito", anoLancamento, filme));
    }
}
