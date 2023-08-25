import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        int numero1 = terminal.nextInt();

        System.out.println("Insira o segundo número: ");
        int numero2 = terminal.nextInt();

        terminal.close();

        try {
            contarDiferenca(numero1, numero2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo número deve ser maior que o primeiro");
        } 
    }
    static void contarDiferenca(int numero1, int numero2) throws ParametrosInvalidosException {
        if (numero1 > numero2) {
            throw new ParametrosInvalidosException();
        } else {
            int contagem = numero2 - numero1;
            for (int i = 1; i <= contagem; i++) {
                System.out.println("Imprimindo o número: "+i);
            }
        }
    }
}
