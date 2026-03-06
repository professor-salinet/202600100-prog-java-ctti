import java.sql.*;
import java.util.*;
public class FazerLogin {
    public static void main(String[] args) {
        try {
            Scanner inputScanner = new Scanner(System.in);
            System.out.println("Digite o login e tecle Enter");
            String login = inputScanner.nextLine();
            System.out.println("Digite a senha e tecle Enter");
            String senha = inputScanner.nextLine();
            Connection conexao = MySQLConnector.conectar();
            String strSqlLogin = "select * from `senac`.`tbl_senac` where `login` = '" + login + "' and `senha` = '" + senha + "';";
            Statement stmSqlLogin = conexao.createStatement();
            ResultSet rstSqlLogin = stmSqlLogin.executeQuery(strSqlLogin);
            if (rstSqlLogin.next()) {
                System.out.println("Login " + rstSqlLogin.getString("nome") + " realizado com sucesso.");
            } else {
                System.out.println("Não foi possível encontrar o login e/ou senha digitados. Por favor, verifique e tente novamente.");
            }
            stmSqlLogin.close();
        } catch (Exception e) {
            System.err.println("Ops! Deu ruim, se liga no erro: " + e);
        }
    }
}
