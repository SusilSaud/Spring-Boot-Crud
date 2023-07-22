package com.coder.springbootcrud.repositories;


import com.coder.springbootcrud.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {//db ko interface ho for user. store and retreive data from db

}
