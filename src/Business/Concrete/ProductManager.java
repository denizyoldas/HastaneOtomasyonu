package Business.Concrete;

import Business.Abstract.IProductService;
import DataAccess.Abstract.IProductDal;
import Entities.Concrete.Product;

import java.util.List;

public class ProductManager implements IProductService {
    private final IProductDal productDal;

    public ProductManager(IProductDal productDal) {
        this.productDal = productDal;
    }

    @Override
    public List<Product> GetAll() {
        return productDal.GetAll();
    }

    @Override
    public void Add(Product product) {
        productDal.Add(product);
    }

    @Override
    public void Delete(Product product) {
        productDal.Delete(product.getId());
    }
}
