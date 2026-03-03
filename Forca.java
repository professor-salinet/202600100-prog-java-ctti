import java.util.*;
import java.util.concurrent.*;
public class Forca {
    public static void main(String[] args) {
        limparTela();
        System.out.println("Bem vindo(a) ao jogo da Forca!");
        dormir(3000);
        jogarForca();
    }
    public static void jogarForca() {
        String[] palavra = {"teste","aleatorio","jogo","forca","otorrinolaringologista","inconstitucionalissimamente","paralelepipedo"};
        boolean sair = false;
        Scanner inputScanner = new Scanner(System.in);
        String respostaUsuario;
        ArrayList<String> letrasJogadas = new ArrayList<>();
        int indiceAleatorio = ThreadLocalRandom.current().nextInt(palavra.length);
        String palavraSorteada = palavra[indiceAleatorio];
        String letrasRestantes = palavraSorteada;
        int tamanhoPalavra = palavraSorteada.length();
        int letrasFaltando = palavraSorteada.length();
        String caracterCoringa = "_ ";
        String dicaPalavra = "";
        int letrasAcertadas = 0;
        int letrasErradas = 0;
        String caracterAtual = caracterCoringa;
        String letraVerificada = "";
        int numeroTentativas = 7 + palavraSorteada.length();
        String letraDigitada = "";
        boolean letraRepetida = false;

        while (sair == false) {
            limparTela();
            if (numeroTentativas == 0) {
                System.out.println("Você perdeu e alcançou o número máximo de tentativas! Tente outra vez...");
                jogarNovamente(); //?
                break;
            }

            if (letraRepetida) {
                System.out.println("Ops! Você já jogou essa letra... Que tal escolher outra letra?");
            }

            System.out.println("Você ainda tem " + numeroTentativas + " tentativa(s).");

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

            System.out.println("Você jogou " + letrasJogadas.size() + " letra(s) e acertou " + (tamanhoPalavra - letrasFaltando) + ".");
            System.out.println("Você errou " + letrasErradas + " letra(s).");
            System.out.println("Faltam " + letrasFaltando + " letra(s) pra você acertar.");

            System.out.println("Dica: a palavra: " + dicaPalavra + " tem " + tamanhoPalavra + " letra(s).");
            if (letrasJogadas.size() > 0) {
                System.out.println("Você jogou a(s) letra(s): " + letrasJogadas.toString());
            }
            System.out.println("Digite uma letra, ou a palavra inteira, e tecle Enter para jogar, ou digite \"sair\" e tecle Enter para sair do jogo.");

            respostaUsuario = inputScanner.nextLine().trim().toLowerCase();
            letraDigitada = respostaUsuario;

            if (respostaUsuario.equals("sair")) {
                sair = true;
                System.out.println("Até mais!");
                break;
            }

            if (respostaUsuario.equals(palavraSorteada)) {
                System.out.println("Uau! Você é demais, pois acertou a palavra \"" + palavraSorteada + "\" na mosca...");
                jogarNovamente(); //?
                break;
            }

            letraRepetida = false;
            for (int i = 0; i < letrasJogadas.size(); i++) {
                if (respostaUsuario.equals(letrasJogadas.get(i))) {
                    letraRepetida = true;
                }
            }

            letrasJogadas.add(respostaUsuario);
            
            if (letrasRestantes.indexOf(respostaUsuario) > -1) {
                letrasRestantes = letrasRestantes.replace(respostaUsuario, "");
                letrasAcertadas++;
                letrasFaltando = letrasRestantes.length();
            } else {
                letrasErradas++;
            }

            if (letrasRestantes.length() == 0) {
                System.out.println("Você venceu, Parabéns! A palavra é: " + palavraSorteada);
                jogarNovamente(); //?
                break;
            }
            numeroTentativas--;
        }
        inputScanner.close();
    }

    public static void jogarNovamente() {
        Scanner inputScanner = new Scanner(System.in);
        String respostaUsuario;
        System.out.println("Jogar novamente?");
        System.out.println("Digite s para sim e n para não, depois tecle Enter para confirmar.");
        respostaUsuario = inputScanner.nextLine().trim().toLowerCase();
        if (respostaUsuario.equals("s")) {
            jogarForca();
        } else {
            System.out.println("Até mais!");
            System.exit(0);
        }
        inputScanner.close();
    }

    public static void dormir(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (Exception e) {
            System.err.println("Erro: " + e);
        }
    }

    public static void limparTela() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
    }
}

/**
 * Terminal terminal = new DefaultTerminalFactory().createTerminal();
 * KeyStroke keyStroke = terminal.readInput();
 * if (keyStroke.getKeyType() == KeyType.ArrowUp) {
 *     // Seta para cima pressionada!
 * }
 */