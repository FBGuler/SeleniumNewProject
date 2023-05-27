import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CallableStatement01 {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "1234");
        Statement statement = connection.createStatement();

        //1. Örnek: Selamlama yapan bir function'ı Callable Statement ile çağırınız
        //1. Adim : Function i olusturan kodu yaziniz.
        String sql = "CREATE FUNCTION selamlama(x TEXT) RETURNS TEXT $$\n" +
                "BEGIN RETURN 'Merhaba '|| x||', nasilsin?'; END; $$ LANGUAGE plpgsql;" ;

        //2. Adim : Function kodunu calistiriniz
        statement.execute(sql);



        connection.close();
        statement.close();
    }
}
