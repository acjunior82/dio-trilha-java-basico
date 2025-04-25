import java.util.Scanner;
public class Contador {
    
 public static void main(String[] args) {
     Scanner terminal = new Scanner(System.in);

     System.out.println("Digite o primeiro parâmetro:");
     int parametroUm = terminal.nextInt();

     System.out.println("Digite o segundo parâmetro:");
     int parametroDois = terminal.nextInt();

     try {
         // Chamando o método contendo a lógica de contagem
         contar(parametroUm, parametroDois);

     } catch (ParametrosInvalidosException exception) {
         // Imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
         System.out.println("O segundo parâmetro deve ser maior que o primeiro");
     }

     terminal.close();
 }

 static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
     // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
     if (parametroUm > parametroDois) {
         throw new ParametrosInvalidosException();
     }

     // Imprimir os números entre parametroUm e parametroDois
     for (int i = parametroUm; i <= parametroDois; i++) {
         System.out.println("Imprimindo o número " + i);
     }
 }
}

//Classe da exceção personalizada
class ParametrosInvalidosException extends Exception {
 // Pode ser deixada vazia ou adicionar uma mensagem personalizada se quiser
}