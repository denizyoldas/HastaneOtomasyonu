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
        PreparedStatement ps = null;
        int status = 0;
        try {
            ps = connection.prepareStatement(
                    "INSERT INTO test(productName) values(?)");
            ps.setString(1,product.getProductName());

            status = ps.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void Delete(int product) {
        PreparedStatement ps = null;
        int status = 0;
        try {
            ps = connection.prepareStatement("DELETE FROM test WHERE Id=?");
            ps.setInt(1,product);

            status = ps.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
