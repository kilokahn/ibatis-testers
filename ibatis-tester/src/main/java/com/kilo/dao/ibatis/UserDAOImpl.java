
package com.kilo.dao.ibatis;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.kilo.dao.UserDAO;
import com.kilo.domain.User;

public class UserDAOImpl extends SqlMapClientDaoSupport implements UserDAO {

    @Override
    public List<User> getUsers() {
        @SuppressWarnings("unchecked")
        List<User> users = getSqlMapClientTemplate().queryForList(
                "User.getUsers");
        return users;
    }

    @Override
    public User getUser(Integer userId) {
        User user = (User) getSqlMapClientTemplate().queryForObject(
                "User.getUserById", userId);
        return user;
    }

    @Override
    public User getUserByName(String userName) {
        User user = (User) getSqlMapClientTemplate().queryForObject(
                "User.getUserByName", userName);
        return user;
    }

}
