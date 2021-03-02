package Business.Concrete;

import Business.Abstract.IUserService;
import DataAccess.Abstract.IUserDal;
import Entities.Concrete.User;

import java.util.List;

public class UserManager implements IUserService {
    private final IUserDal userDal;

    public UserManager(IUserDal userDal) {
        this.userDal = userDal;
    }

    @Override
    public List<User> GetAll() {
        return userDal.GetAll();
    }

    @Override
    public void Add(User user) {
        userDal.Add(user);
    }

    @Override
    public void Delete(int id) {
        userDal.Delete(id);
    }
}
