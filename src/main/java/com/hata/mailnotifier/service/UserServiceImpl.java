package com.hata.mailnotifier.service;

import com.hata.mailnotifier.dao.UserRepository;
import com.hata.mailnotifier.model.Status;
import com.hata.mailnotifier.model.User;
import com.hata.mailnotifier.model.UserDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional
    public void saveUser(UserDTO userDTO) {
        User user = new User(userDTO.getId(), userDTO.getName(), userDTO.getEmail(), Status.valueOf(userDTO.getStatus()));
        userRepository.save(user);
    }

    @Override
    @Transactional
    public UserDTO getById(Integer id) {
        User user = userRepository.getOne(id);
        String current = "";

        try {
            current = user.getStatus().name();
        } catch (NullPointerException e) {
            current = null;
        } finally {
            return new UserDTO(user.getId(), user.getName(), user.getEmail(), current);

        }
    }

    @Override
    @Transactional
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    @Transactional
    public void deleteUserByEmail(String email) {
        userRepository.deleteByEmail(email);
    }
}
// нужно найти библиотеку которая отправляет имейлы 

