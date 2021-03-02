package DataAccess.Abstract;

import Entities.Concrete.User;

import java.util.List;

public interface IUserDal {
    List<User> GetAll();
    void Add(User user);
    void Delete(int id);
}
