import java.util.*;
public class Forca {
    public static void main(String[] args) {
        String[] palavra = {"teste","aleatorio","jogo","forca"};
        boolean sair = false;
        boolean acertouPalavra = false;
        Scanner inputScanner = new Scanner(System.in);
        String respostaUsuario;
        ArrayList<String> letrasJogadas = new ArrayList<>();
        String palavraSorteada = palavra[2];
        int tamanhoPalavra = palavraSorteada.length();
        int letrasFaltando = palavraSorteada.length();
        String caracterCoringa = "_ ";
        String dicaPalavra = "";
        for (int i = 0; i < tamanhoPalavra; i++) {
            dicaPalavra += caracterCoringa;
        }
        int letrasAcertadas = 0;
        String caracterAtual = caracterCoringa;
        String letraVerificada = "";

        while (acertouPalavra == false) {
            System.out.println("Bem vindo ao jogo de Forca!");

            dicaPalavra = "";
            System.out.println("letrasJogadas.toString(): " + letrasJogadas.toString());
            for (int i = 0; i < palavraSorteada.length(); i++) {
                caracterAtual = caracterCoringa;
                letraVerificada = String.valueOf(palavraSorteada.charAt(i));
                // System.out.println("letraVerificada: " + letraVerificada);
                for (int l = 0; l < letrasJogadas.size(); l++) {
                    if (letraVerificada.equals(letrasJogadas.get(l))) {
                        caracterAtual = letraVerificada;
                        System.out.println("achou: " + letraVerificada);
                    }
                }
                dicaPalavra += caracterAtual + "";
            }

            System.out.println("Dica: a palavra: " + dicaPalavra + " tem " + tamanhoPalavra + " letras.");
            System.out.println("Digite uma palavra e tecle Enter para jogar.");
            respostaUsuario = inputScanner.nextLine().trim().toLowerCase();
            letrasJogadas.add(respostaUsuario);
            System.out.println("Você jogou a(s) letra(s): " + letrasJogadas.toString());
            
            if (palavraSorteada.indexOf(respostaUsuario) > -1) {
                palavraSorteada = palavraSorteada.replace(respostaUsuario, "");
                letrasAcertadas++;
                letrasFaltando = tamanhoPalavra - letrasAcertadas;
            }
            System.out.println("Você acertou " + letrasAcertadas + " letras.");
            
            System.out.println("Continuar?");
            System.out.println("Digite s para sim e n para não, e tecle Enter");
            respostaUsuario = inputScanner.nextLine().trim().toLowerCase();
            if (respostaUsuario.equals("n")) {
                sair = true;
            }
        }
        inputScanner.close();
    }
}
