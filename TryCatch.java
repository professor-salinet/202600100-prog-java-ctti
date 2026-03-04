import java.util.*;
public class TryCatch {
    public static void main(String[] args) {
        try {
            Scanner inputScanner = new Scanner (System.in);
            System.out.println("Digite um número e tecle Enter");
            int respostaUsuario = inputScanner.nextInt();
            System.out.println("O número digitado é: " + respostaUsuario);
            inputScanner.close();
            if (respostaUsuario < 5) {
                throw new Exception ("Número menor que 5");
            }
        } catch (InputMismatchException e) {
            System.out.println("Ops! Você não digitou um número... Erro: " + e);
        } catch (Exception e) {
            System.out.println("Erro genérico: " + e);
        } finally {
            System.out.println("Aconteceu o try catch.");
        }
    }
}
