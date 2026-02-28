import java.util.*;
public class Forca {
    public static void main(String[] args) {
        String[] palavras = {"teste","aleatorio"};
        boolean sair = false;
        boolean acertouPalavra = false;
        Scanner inputScanner = new Scanner(System.in);
        String respostaUsuario;
        ArrayList<String> letrasJogadas = new ArrayList<>();
        String palavraSorteada = palavras[2];
        int letrasAcertadas = 0;
        while (acertouPalavra == false) {
            System.out.println("Bem vindo ao jogo de Forca!");
            System.out.println("Digite uma palavra e tecle Enter para jogar.");
            respostaUsuario = inputScanner.nextLine().trim().toLowerCase();
            letrasJogadas.add(respostaUsuario);
            System.out.println("Você jogou as letras: " + letrasJogadas.toString());
            if (respostaUsuario.contains(respostaUsuario)) {
                letrasAcertadas++;
            }
        }
    }
}
