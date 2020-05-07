package com.michael.viana.process.system.services;


import com.michael.viana.process.system.domain.User;
import com.michael.viana.process.system.domain.dto.UserDTO;
import com.michael.viana.process.system.repository.UserRepository;
import com.michael.viana.process.system.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    //Returna todos usuarios
    public List<User> findAll() {
        return userRepository.findAll();
    }

    //Return um usuario específico pelo ID
    public User findById(String id){
        Optional<User> user = userRepository.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("User Not Found"));
    }

    //Criar um novo usuario
    public User create(User user){
        return userRepository.save(user);
    }

    //Editar Usuario
    public User update (User user){
        Optional<User> updateUser = userRepository.findById(user.getId());
        return updateUser.map(u -> userRepository.save(new User(u.getId(), user.getName(), user.getCpf(), user.getBirthDate(), user.getAddress(), user.getDistrict(), user.getCity(), user.getState(), user.getZipCode(), user.getEmail(), user.getPhone(), user.getSkype())))
                .orElseThrow(() -> new ObjectNotFoundException("User not Found"));
    }

    //Deletar Usuario
    public void delete(String id){
        userRepository.deleteById(id);
    }

    public User fromDTO (UserDTO userDTO){
        return new User(userDTO);
    }
}
