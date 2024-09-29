package com.JwtJpa.Authentication.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.JwtJpa.Authentication.Model.UserModel;
import com.JwtJpa.Authentication.Repository.UserModelRepositry;

@Service
public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    private UserModelRepositry userModelRepositry;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserModel user = this.userModelRepositry.findByUserName(username).orElseThrow(() -> new RuntimeException("User Not Found"));
        return user;
    }
}
