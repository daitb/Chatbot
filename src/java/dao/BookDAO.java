package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BookDAO {
    public static String findBookByTitle(String title) {
        String sql = "SELECT description FROM Books WHERE title = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, title);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getString("description");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Không tìm thấy sách.";
    }
    
    public static void main(String[] args) {
        System.out.println(findBookByTitle("Clean Code"));
    }
}
