package com.jwt.api.example.jwtdemo;

import com.jwt.api.example.jwtdemo.domain.Role;
import com.jwt.api.example.jwtdemo.domain.User;
import com.jwt.api.example.jwtdemo.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class JwtDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtDemoApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}


	@Bean
	CommandLineRunner run(UserService userService){
		return args ->{
			userService.saveRole(new Role(null,"ROLE_USER"));
			userService.saveRole(new Role(null,"ROLE_MANAGER"));
			userService.saveRole(new Role(null,"ROLE_ADMIN"));
			userService.saveRole(new Role(null,"ROLE_SUPER_ADMIN"));

			userService.saveUser(new User(null, "name_1", "username_1", "password_1", new ArrayList<Role>()));
			userService.saveUser(new User(null, "name_2", "username_2", "password_2", new ArrayList<Role>()));
			userService.saveUser(new User(null, "name_3", "username_3", "password_3", new ArrayList<Role>()));
			userService.saveUser(new User(null, "name_4", "username_4", "password_4", new ArrayList<Role>()));

			userService.addRoleToUser("username_1", "ROLE_USER");
			userService.addRoleToUser("username_1", "ROLE_MANAGER");
			userService.addRoleToUser("username_2", "ROLE_MANAGER");
			userService.addRoleToUser("username_3", "ROLE_ADMIN");
			userService.addRoleToUser("username_4", "ROLE_USER");
			userService.addRoleToUser("username_4", "ROLE_ADMIN");
			userService.addRoleToUser("username_4", "ROLE_SUPER_ADMIN");
		};
	}
}
