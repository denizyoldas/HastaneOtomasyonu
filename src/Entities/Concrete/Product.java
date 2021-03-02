package Entities.Concrete;

import Entities.Abstract.IEntity;

public class Product implements IEntity {
    private int Id;
    private String ProductName;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }
}
