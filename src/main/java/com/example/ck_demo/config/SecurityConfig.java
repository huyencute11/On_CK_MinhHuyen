package com.example.ck_demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Autowired
    public void globalConfig(AuthenticationManagerBuilder auth, PasswordEncoder passwordEncoder) throws Exception {
        auth.inMemoryAuthentication()
                .withUser(User.withUsername("admin")
                .password(passwordEncoder().encode("admin"))
                        .roles("ADMIN").build())
                .withUser(User.withUsername("teo")
                        .password(passwordEncoder.encode("teo"))
                        .roles("USER")
                        .build()
                );

    }
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
       http.authorizeHttpRequests(auth ->auth.requestMatchers( "/index").permitAll()
               .requestMatchers("/api/**", "/").hasAnyRole("ADMIN", "USER")
               .requestMatchers("/admin/**").hasRole("ADMIN")
               .anyRequest().authenticated() // dang nhap o bat ky role nao
       );
       http.httpBasic(Customizer.withDefaults());

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
