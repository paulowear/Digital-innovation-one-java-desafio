// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.  

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A; 
        int N;
        int SOMA;
        
        Scanner input = new Scanner(System.in);
        
        A = input.nextInt();
        N = input.nextInt();
        
        N /= A;
        SOMA = N * (1 + N) * A / 2;

       System.out.println(SOMA);
        //TODO:  Retorne o valor da soma de todos múltiplos de "A" até o seu limite "N".
    }
}