import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class ItemDAO {
    public Connection conn;

    public ItemDAO(Connection conn) {
        this.conn = conn;
    }

    public MusicItem searchById(int id) {
        String sql = "SELECT * FROM item WHERE item_id = " + id;
        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                return new MusicItem(rs.getInt(1), rs.getString(2),
                        rs.getString(3), rs.getString(4), rs.getFloat(5),
                        rs.getFloat(6), rs.getInt(7));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<MusicItem> searchByKeyWord(String key) {
        ArrayList<MusicItem> result = new ArrayList<>();
        String sql = "SELECT * FROM item WHERE title LIKE '%" + key + "%'";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                result.add(new MusicItem(rs.getInt(1), rs.getString(2),
                        rs.getString(3), rs.getString(4), rs.getFloat(5),
                        rs.getFloat(6), rs.getInt(7)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public int create(MusicItem item) {

        String sql = String.format(Locale.CANADA, "INSERT INTO item VALUES(%d, '%s', '%s', '%s', %f, %f, %d)", item.getId(),
                item.getName(), item.getAuthor(), item.getReleaseDate(),
                item.getListPrice(), item.getPrice(), item.getVersion());

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            return stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
