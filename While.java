import java.util.*;
public class While {
    public static void main(String[] args) {
        boolean sair = false;
        Scanner inputScanner = new Scanner(System.in);
        String respostaUsuario = "";
        int contador = 0;
        while (sair == false) {
            System.out.println("Tentativa número " + contador);
            System.out.println("Digite sair para sair do sistema ou c para continuar, depois tecle Enter");
            respostaUsuario = inputScanner.nextLine().trim().toLowerCase();
            if (respostaUsuario.equals("s")) {
                sair = true;
            }
            contador++;
        }
        inputScanner.close();
    }
}