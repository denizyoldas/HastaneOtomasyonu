package ConsoleUI;

import java.sql.*;

public class console {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_db","root","");
        PreparedStatement ps = connection.prepareStatement("CREATE TABLE `test` (\n" +
                "  `Id` int(11) NOT NULL,\n" +
                "  `ProductName` varchar(250) NOT NULL\n" +
                ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;\n");
        ResultSet rs = ps.executeQuery();
    }
}
