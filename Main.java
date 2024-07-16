import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Printando Linha!");


        System.out.println("Esse é o Screen Matcha");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        //System.out.println("Ano de lançamento:" +  anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8) / 3;
        System.out.println(media);
        String sinopse;
        //sinopse = "Filme de aventura com galã dos anos 80";

        sinopse = """
        Filme Top Gun
        Filme de aventura com galã dos anos 80
        Muito bom!
        Ano de Lançamento
        """ + anoDeLancamento;

        System.out.println(sinopse);


        //Chamar o método dobro

        int resultado = dobro(5);


        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));


        nome = "João";
        int aulas = 4;

        String mensagem = """
                  Olá, %s!
                  Boas vindas ao curso de Java.
                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                  """.formatted(nome, aulas);

        System.out.println(mensagem);

        //Montar um loop de 1 a 10
        for(int i = 1; i <= 10; i++)
        {
            System.out.println("Printando Linha " + i);
        }


        //Scanner para ler uma temperatura

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = converterParaFahrenheit(celsius);
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);

    }

    // montar um método que recebe um número e retorna o dobro dele
    public static int dobro(int numero)
    {
        return numero * 2;
    }


    //montar um metodo converta graus ce
    public static double converterParaFahrenheit(double celsius)
    {
        return celsius * 1.8 + 32;
    }
}