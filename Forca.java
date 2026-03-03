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
        String letrasRestantes = palavraSorteada;
        int tamanhoPalavra = palavraSorteada.length();
        int letrasFaltando = palavraSorteada.length();
        String caracterCoringa = "_ ";
        String dicaPalavra = "";
        int letrasAcertadas = 0;
        int letrasErradas = 0;
        String caracterAtual = caracterCoringa;
        String letraVerificada = "";
        int numeroTentativas = 7;

        System.out.println("Bem vindo ao jogo de Forca!");
        System.out.println("Você ainda tem " + numeroTentativas + " tentativa(s).");
        while (sair == false) {
            if (numeroTentativas == 0) {
                System.out.println("Você perdeu e alcançou o número máximo de tentativas! Tente outra vez...");
                break;
            }

            dicaPalavra = "";
            for (int i = 0; i < palavraSorteada.length(); i++) {
                caracterAtual = caracterCoringa;
                letraVerificada = String.valueOf(palavraSorteada.charAt(i));
                for (int l = 0; l < letrasJogadas.size(); l++) {
                    if (letraVerificada.equals(letrasJogadas.get(l))) {
                        caracterAtual = letraVerificada;
                    }
                }
                dicaPalavra += caracterAtual + " ";
            }

            System.out.println("Dica: a palavra: " + dicaPalavra + " tem " + tamanhoPalavra + " letra(s).");
            System.out.println("Digite uma letra e tecle Enter para jogar.");
            respostaUsuario = inputScanner.nextLine().trim().toLowerCase();
            letrasJogadas.add(respostaUsuario);
            System.out.println("Você jogou a(s) letra(s): " + letrasJogadas.toString());
            
            if (letrasRestantes.indexOf(respostaUsuario) > -1) {
                letrasRestantes = letrasRestantes.replace(respostaUsuario, "");
                letrasAcertadas++;
                letrasFaltando = tamanhoPalavra - letrasAcertadas;
            } else {
                letrasErradas++;
            }
            System.out.println("Você acertou " + letrasAcertadas + " letra(s).");
            System.out.println("Você errou " + letrasErradas + " letra(s).");
            System.out.println("Faltam " + letrasFaltando + " letra(s) pra você acertar.");

            if (letrasRestantes.length() == 0) {
                System.out.println("Você venceu, Parabéns!");
                break;
            }

            System.out.println("Continuar?");
            System.out.println("Digite s para sim e n para não, e tecle Enter");
            respostaUsuario = inputScanner.nextLine().trim().toLowerCase();
            if (respostaUsuario.equals("n")) {
                sair = true;
            }
            numeroTentativas--;
        }
        inputScanner.close();
    }
}
