//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        //sout-> System.out.println();
        System.out.println();

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;

        boolean a = true;
        if (!a) {
            // Este código não será executado, já que a é verdadeiro.
        }

        double media = (9.8 +6.3 + 8) / 3;
        System.out.println(String.format("%.2f", media));

        //transformando variaveis numéricas
        int classificacao;
        classificacao = (int) (media/2);
        System.out.println(classificacao);

        String sinopse;
        // String box == atribui parágrado, espaço, (sintaxe)... na própria string
        sinopse = """
                Filme a
                       Filme b
                Filme c
                Ano de lançamento: """ + anoDeLancamento;
        System.out.println(sinopse);

        //mais uso de variaveis para serem impressas no terminal sem concatenação
        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));

    }

}