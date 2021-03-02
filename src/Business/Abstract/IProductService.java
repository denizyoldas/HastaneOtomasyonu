package Business.Abstract;

import Entities.Concrete.Product;

import java.util.List;

public interface IProductService {
    List<Product> GetAll();
    void Add(Product product);
    void Delete(Product product);
}
