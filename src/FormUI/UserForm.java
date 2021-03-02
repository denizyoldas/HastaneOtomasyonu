package FormUI;

import Business.Concrete.UserManager;
import DataAccess.Concrete.UserDal;
import Entities.Concrete.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class UserForm {
    private JButton silButton;
    private JButton ekleButton;
    private JButton getirButton;
    private JPanel content;
    UserManager manager = new UserManager(new UserDal());

    public UserForm() {
        ekleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ;
                User user = new User();
                user.setName("Ahmet");
                user.setSurname("hakan");
                user.setStatus(1);

                manager.Add(user);
            }
        });
        getirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                List<User> users = manager.GetAll();

                for (User user : users) {
                    System.out.println("Name " + user.getName());
                    System.out.println("Surname " + user.getSurname());
                    System.out.println("Status " + user.getStatus());
                }
            }
        });
        silButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                manager.Delete(3);
            }
        });
    }

    public static void main(String[] args) {
        UserForm form = new UserForm();
        JFrame frame = new JFrame("My first Frame");
        frame.setContentPane(form.content);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(500, 500);
        frame.setLocation(200, 200);
        frame.setVisible(true);
    }
}
