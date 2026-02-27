import java.util.*;
public class Condicional {
    public static void main (String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Digite sua idade e tecle Enter");
        String respostaUsuario = inputScanner.nextLine().trim();
        int idadeUsuario = Integer.valueOf(respostaUsuario);
        if (idadeUsuario >= 18) {
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você é menor de idade");
        }
        inputScanner.close();
    }
}
