package Business.Abstract;

import Entities.Concrete.User;

import java.util.List;

public interface IUserService {
    List<User> GetAll();
    void Add(User user);
    void Delete(int id);
}
