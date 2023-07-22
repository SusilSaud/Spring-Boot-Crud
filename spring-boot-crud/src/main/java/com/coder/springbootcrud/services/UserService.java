package com.coder.springbootcrud.services;

import com.coder.springbootcrud.entities.User;
import com.coder.springbootcrud.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

// all business logic in service method
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    // we are using list instead of db for sample
    private List<User> users = new ArrayList<>();


//public User getUser(int id){
//    for(User user1:users){
//        if(id == user1.getId()){
//            return user1;
//        }
//    }
//    return null;
//}

    public User getUser(int id) {
        return userRepository.findById(id).get();
    }

    public List<User> getAllUSer() {
        return userRepository.findAll();

    }

//public List<User> getAllUSer(){
//    return users;
//
//}
//public String addUser(User user){
//    users.add(user);
//    return "User added";
//}


    public String addUser(User user) {
        userRepository.save(user);
        return "User added";
    }

    public String updateUser(User user) {
        // one way
//        for (User user1 : userRepository.findAll()) {
//            if (user.getId() == user1.getId()) {
//
//                userRepository.delete(user1);
//                userRepository.save(user);
//                return "Updated successfully";
//
//            }
//        }
//           return "User not found";


        if (userRepository.findById(user.getId()).isPresent()) {
            userRepository.save(user);
            return "Updated successfully";
        }

        return "User not found";
    }


//    public String updateUser(User user) {
//        for (User user1 : users) {
//            if (user.getId() == user1.getId()) {
//
//                users.remove(user1);
//                users.add(user);
//                return "Updated successfully";
//
//            }
//        }
//        return "User not found";
//    }


//    public String deleteUser(int id){
//        for(User user1:users) {
//            if (id == user1.getId()) {
//                users.remove(user1);
//                return "user deleted";
//            }
//        }
//        return "User not found";
//    }
//
//}

//    public String deleteUser(int id) {
//
//        if (userRepository.findById(id).isPresent()) {
//            userRepository.deleteById(id);
//            return "Deleted successfully";
//        }
//
//        return "User not found";
//    }
//}


// another way

    public String deleteUser(int id) {
        for (User user1 : userRepository.findAll()) {
            if (id == user1.getId()) {

                userRepository.deleteById(id);

                return "Deleted successfully";

            }
        }
        return "User not found";
    }
}