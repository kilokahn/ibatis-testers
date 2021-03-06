
package com.kilo.dao;

import java.util.List;

import com.kilo.domain.User;

public interface UserDAO {

    List<User> getUsers();

    User getUser(Integer userId);

    User getUserByName(String userName);
}
