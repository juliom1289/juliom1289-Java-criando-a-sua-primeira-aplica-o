import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println();
        double totalPontosDosFilmes = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {

            System.out.println("Dê uma nota para o filme ou -1 para encerrar");
            nota = leitura.nextDouble();

            if (nota != -1) {
                totalPontosDosFilmes += nota;
                totalDeNotas++;
            }
        }

        double media = totalPontosDosFilmes / totalDeNotas;

        System.out.println("A média da avaliação é: " + media);
    }
}
