package FormUI;

import Business.Concrete.ProductManager;
import DataAccess.Concrete.ProductDal;
import Entities.Concrete.Product;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;

//javax.swing.JFrame
public class gts {
    private JButton firstBtn;
    private JPanel content;
    private JLabel label;
    private JTable productList;

    ProductManager pp = new ProductManager(new ProductDal());

    public gts() {
        firstBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int sayi = Integer.parseInt(label.getText());
                sayi += sayi;
                label.setText(Integer.toString(sayi));
                Product p = new Product();
                p.setProductName("nizo");
                pp.Add(p);
                ProductList();
            }
        });
    }

    public static void main(String[] args) {
        gts gt = new gts();
        JFrame frame = new JFrame("My first Frame");
        frame.setContentPane(gt.content);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(500, 500);
        frame.setLocation(200, 200);
        frame.setVisible(true);
        gt.ProductList();
    }

    void ProductList() {
        var result = pp.GetAll();
        Object[] baslik = {"Id", "ProductName"};
        Object[][] veri = new Object[result.size()][2];

        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < 1; j++) {
                veri[i][j] = result.get(i).getId();
                veri[i][j + 1] = result.get(i).getProductName();
            }
        }

        productList.setModel(new DefaultTableModel(veri, baslik));
//        for (Product p : result) {
//            System.out.println(p.getId());
//            System.out.println(p.getProductName());
//        }
    }

}
