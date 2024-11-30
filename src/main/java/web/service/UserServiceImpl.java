package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }

    @Override
    public void addUser (User user) {
        userDao.add(user);
    }

    @Override
    public void updateUser (User user) {
        userDao.update(user);
    }

    @Override
    public void deleteUser (Long userId) {
        userDao.delete(userId);
    }

    @Override
    public User getUserById(Long userId) {
        return userDao.getUserById(userId);
    }
}
