package com.michael.viana.process.system.config;

import com.michael.viana.process.system.domain.User;
import com.michael.viana.process.system.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;

import java.util.Arrays;
import java.util.Optional;

@Configuration
public class SetupDataLoader implements ApplicationListener <ContextRefreshedEvent> {
    @Autowired
    UserRepository userRepository;


    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        userRepository.deleteAll();
        User admin = new User ("Admin", "00000000000", "00/00/0000", "Rua Dev, 107", "São Jorge", "Belo Horizonte", "Minas Gerais", "00000000", "admin@admin.com", "999999999","test");
        //User userBase = new User ("User Base", "11111111111", "03/08/1997", "Rua Dev, 107", "São Jorge", "Belo Horizonte", "Minas Gerais", "11111111", "userbase@gmail.com",  null ,null);

       createUserIfNotFound(admin);
       // createUserIfNotFound(userBase);
    }
    private User createUserIfNotFound(final User user){
        //Optional<User> obj = userRepository.findByEmail(user.getEmail());

        /*if(obj.isPresent()){
            return obj.get();
        }*/
        return userRepository.save(user);
    }



}
