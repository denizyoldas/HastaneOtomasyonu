package DataAccess.Concrete;

import DataAccess.Abstract.IProductDal;
import Entities.Concrete.Product;

import java.sql.*;

import java.util.ArrayList;
import java.util.List;

public class ProductDal implements IProductDal {
    private Connection connection;

    public ProductDal() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_db","root","");
            System.out.println("db Connection Success");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    @Override
    public List<Product> GetAll() {
        List<Product> products = new ArrayList<Product>();
        try {
            PreparedStatement ps = connection.prepareStatement("select * from test");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Product product = new Product();
                product.setId(rs.getInt(1));
                product.setProductName(rs.getString(2));
                products.add(product);
            }

            return products;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return null;
    }

    @Override
    public void Add(Product product) {
        PreparedStatement ps= con.prepareStatement(
                "update user905 set name=?,password=?,email=?,country=? where id=?");
        ps.setString(1,e.getName());
        ps.setString(2,e.getPassword());
        ps.setString(3,e.getEmail());
        ps.setString(4,e.getCountry());
        ps.setInt(5,e.getId());

        status = ps.executeUpdate();

        con.close();
    }

    @Override
    public void Delete(int product) {

    }
}
