package DataAccess.Concrete;

import DataAccess.Abstract.IUserDal;
import Entities.Concrete.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDal implements IUserDal {
    private Connection connection;

    public UserDal() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_db","root","");
            System.out.println("db Connection Success");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    @Override
    public List<User> GetAll() {
        List<User> users = new ArrayList<User>();
        try {
            PreparedStatement ps = connection.prepareStatement("select * from user");
            ResultSet rs = ps.executeQuery();


            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt(1));
                user.setName(rs.getString(2));
                user.setSurname(rs.getString(3));
                user.setStatus(rs.getInt(4));
                users.add(user);
            }
            return users;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return null;
    }

    @Override
    public void Add(User user) {
        PreparedStatement ps = null;
        int status = 0;
        try {
            ps = connection.prepareStatement(
                    "INSERT INTO user(name, surname, status) values(?, ?, ?)");
            ps.setString(1,user.getName());
            ps.setString(2,user.getSurname());
            ps.setInt(3,user.getStatus());

            status = ps.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void Delete(int id) {
        PreparedStatement ps = null;
        int status = 0;
        try {
            ps = connection.prepareStatement("DELETE FROM user WHERE Id=?");
            ps.setInt(1,id);

            status = ps.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
