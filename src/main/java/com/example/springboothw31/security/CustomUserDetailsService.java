package com.example.springboothw31.security;

import com.example.springboothw31.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    private List<User> users = new ArrayList<>();

    public CustomUserDetailsService(PasswordEncoder passwordEncoder){
        users.add(new User(1,"Khue","khue@gmail.com",passwordEncoder.encode("123"),List.of("USER","ADMIN")));
        users.add(new User(2,"Khue1","khue1@gmail.com",passwordEncoder.encode("123"),List.of("USER")));
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        return users.stream()
                .filter(user -> user.getUsername().equals(username))
                .findFirst()
                .map(CustomUserDetails::new)
                .orElseThrow(()->new UsernameNotFoundException("User Not Found"));
    }
}