package com.JwtJpa.Authentication.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class AppConfig {

//    @Bean
//    public UserDetailsService userDetailsService() {
//        UserDetails userDetails1 = User.builder().
//                username("nagma")
//                .password(passwordEncoder().encode("password_nagma")).roles("ADMIN").
//                build();
//        UserDetails userDetails2 = User.builder().
//                username("nazmeen")
//                .password(passwordEncoder().encode("password_naaz")).roles("ADMIN").
//                build();
//        return new InMemoryUserDetailsManager(userDetails1, userDetails2);
//    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration builder) throws Exception {
        return builder.getAuthenticationManager();
    }
}
