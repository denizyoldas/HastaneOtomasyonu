package DataAccess.Abstract;

import Entities.Concrete.Product;

import java.util.List;

public interface IProductDal {
    List<Product> GetAll();
    void Add(Product product);
    void Delete(int product);
}
