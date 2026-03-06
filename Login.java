import java.sql.*;
public class Login {
    public static void main(String[] args) {
        try {
            Connection conexao = MySQLConnector.conectar();
            String strSqlPopularCbxId = "select * from `senac`.`tbl_senac` order by `id` asc;";
            Statement stmSqlPopularCbxId = conexao.createStatement();
            ResultSet rstSqlPopularCbxId = stmSqlPopularCbxId.executeQuery(strSqlPopularCbxId);
            while (rstSqlPopularCbxId.next()) {
                System.out.println(rstSqlPopularCbxId.getString("nome"));
            }
            stmSqlPopularCbxId.close();
        } catch (Exception e) {
            System.err.println("Erro: " + e);
        }
    }
}
