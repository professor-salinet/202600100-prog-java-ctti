import java.util.*;
public class While {
    public static void main (String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        String respostaUsuario;
        Boolean sair = false;
        while (sair == false) {
            System.out.println("Digite o primeiro número a ser somado e tecle Enter");
            respostaUsuario = inputScanner.nextLine().trim();
            int numeroUm = Integer.valueOf(respostaUsuario);
            System.out.println("Digite o segundo número a ser somado e tecle Enter");
            respostaUsuario = inputScanner.nextLine().trim();
            int numeroDois = Integer.valueOf(respostaUsuario);
            System.out.println("O resultado da soma é: " + (numeroUm + numeroDois));
            System.out.println("Deseja realizar outra soma?");
            System.out.println("Digite s para sim ou n para não, e tecle Enter");
            respostaUsuario = inputScanner.nextLine().trim().toLowerCase();
            if (respostaUsuario.equals("n")) {
                sair = true;
            }
        }
        inputScanner.close();
    }
}
