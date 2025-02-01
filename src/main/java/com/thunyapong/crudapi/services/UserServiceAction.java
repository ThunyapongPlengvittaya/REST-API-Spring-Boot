package com.thunyapong.crudapi.services;
import com.thunyapong.crudapi.entity.User;
import com.thunyapong.crudapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceAction implements UserService{

    private UserRepository userRepository;

    @Autowired
    public UserServiceAction(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public  User save(User user) {
        return userRepository.save(user);//บันทึกลง database
    }
}
