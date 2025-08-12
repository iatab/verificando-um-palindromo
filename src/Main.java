import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println( "insira a palavra desejada: ");

    String palavra = ler.nextLine();
    char[] letras = palavra.toCharArray();
    char[] letrasInvertida = new char[letras.length];
    String letrasInvertidas ;



    // verificar se a palavra é um palindromo

        if(letras.length > 0) {
            if(letras[0] == letras[letras.length-1]) {

                if (letras[1] == letras[letras.length-2]){

                    System.out.println("a primeira letra é igual a ultima e a segunda é igual a penultima");
                    System.out.println("é um palindromo");

                    for (int i =0 ; i < letras.length ; i++) {

                        letrasInvertida[i] = letras[letras.length-1-i];


                    }
                    letrasInvertidas = new String(letrasInvertida);
                    System.out.println("a palavra invertida é: " + letrasInvertidas);



                }else {
                    System.out.println("nao é um palindromo");
                }


            }
            else {
                System.out.println("nao é um palindromo");
            }

        } else if (letras.length == 0) {
            System.out.println("é um palindromo de 0 letras");
        }




    }
}