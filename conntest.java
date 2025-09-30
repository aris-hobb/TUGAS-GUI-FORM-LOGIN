import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conntest {
    public static void main(String[] args) {
        Connection con = null;

        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/OOP", // ganti dengan nama DB kamu
                "anonim01", // username dari screenshot kamu
                "anonim"  // isi dengan password PostgreSQL kamu
            );
            System.out.println("✅ Koneksi berhasil");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("❌ Koneksi gagal: " + e.getMessage());
        }
    }
}