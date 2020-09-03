package com.hata.mailnotifier.service;

import com.hata.mailnotifier.model.User;
import com.hata.mailnotifier.model.UserDTO;

import java.util.List;

public interface UserService {

    void saveUser(UserDTO userDTO);

    UserDTO getById(Integer id);

    List<User> getAll();

    void deleteById(Integer id);

    void deleteUserByEmail(String email);

}
