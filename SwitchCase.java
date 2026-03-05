import java.util.*;
public class SwitchCase {
    public static void main(String[] args) {
        mapaPessoal();
    }

    public static void mapaPessoal() {
        String[] mes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Bem vindo ao seu Mapa Pessoal!");
        System.out.println("Escolha seu mês de nascimento e Digite a opção numérica respectiva abaixo e tecle Enter");
        for (int i = 0; i < mes.length; i++) {
            System.out.println("[" + i + "] - " + mes[i]);
        }
        int respostaUsuario = 0;
        try {
            respostaUsuario = inputScanner.nextInt();
            switch (respostaUsuario) {
                case 0:
                    System.out.println("Você digitou a opção de: " + mes[respostaUsuario]);
                    break;
                case 1:
                    System.out.println("Você digitou a opção de: " + mes[respostaUsuario]);
                    break;
                case 2:
                    System.out.println("Você digitou a opção de: " + mes[respostaUsuario]);
                    break;
                case 3:
                    System.out.println("Você digitou a opção de: " + mes[respostaUsuario]);
                    break;
                case 4:
                    System.out.println("Você digitou a opção de: " + mes[respostaUsuario]);
                    break;
                case 5:
                    System.out.println("Você digitou a opção de: " + mes[respostaUsuario]);
                    break;
                case 6:
                    System.out.println("Você digitou a opção de: " + mes[respostaUsuario]);
                    break;
                case 7:
                    System.out.println("Você digitou a opção de: " + mes[respostaUsuario]);
                    break;
                case 8:
                    System.out.println("Você digitou a opção de: " + mes[respostaUsuario]);
                    break;
                case 9:
                    System.out.println("Você digitou a opção de: " + mes[respostaUsuario]);
                    break;
                case 10:
                    System.out.println("Você digitou a opção de: " + mes[respostaUsuario]);
                    break;
                case 11:
                    System.out.println("Você digitou a opção de: " + mes[respostaUsuario]);
                    break;
            
                default:
                    System.out.println("Ops! Opção inválida. Tente novamente...");
                    mapaPessoal();
                    break;
            }
        } catch (Exception e) {
            System.out.println("Ops! Você não digitou um número. Vamos tentar de novo...");
            mapaPessoal();
        }
        inputScanner.close();
    }
}
