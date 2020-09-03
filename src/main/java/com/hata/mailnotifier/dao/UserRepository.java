package com.hata.mailnotifier.dao;

import com.hata.mailnotifier.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    void deleteByEmail(String email);
}
