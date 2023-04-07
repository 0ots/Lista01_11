import java.util.Scanner;

import java.lang.Math;

public class Exercicio_11 {

    public static void main(String[] args) throws Exception {

        int numint1, numint2;

        double numreal, dobroprimmetadeseg, triploprimeiromaisterceiro, terceirocubo, terceirocubodc;

        Scanner input;

        input = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");

        numint1 = input.nextInt();

        System.out.println("Digite o segundo número inteiro: ");

        numint2 = input.nextInt();

        System.out.println("Digite um número real: ");

        numreal = input.nextDouble();

        input.close();

        dobroprimmetadeseg = (numint1 * 2) + numint2 /2;

        System.out.println("O valor do produto do dobro do primeiro com metade do segundo é: " + dobroprimmetadeseg);

        triploprimeiromaisterceiro = (numint1 * 3) + numreal;

        System.out.println("O valor da soma do triplo do primeiro com o terceiro é: " + triploprimeiromaisterceiro);

        terceirocubo = Math.pow(numreal, 3);

        terceirocubodc = Math.ceil(terceirocubo * 100) / 100;

        System.out.println("O valor do terceiro elevado ao cubo é: " + terceirocubodc);

    }

}
