import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println();
        double totalPontosDosFilmes = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println(String.format("Dê uma nota para o filme %d", i+1));
            nota = leitura.nextDouble();
            totalPontosDosFilmes += nota;
        }

        double media = totalPontosDosFilmes / 3;

        System.out.println("A média da avaliação é: " + media);

    }
}
