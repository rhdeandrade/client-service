package com.mastercard.clientservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by e068806 on 12/17/2018.
 */
@SpringBootApplication
@RestController
public class ClientServiceApplication {

    @Value("${db.h2.user}")
    private String user;

    @Value("${db.h2.password}")
    private String password;

    public static void main(String[] args) {
        SpringApplication.run(ClientServiceApplication.class, args);
    }

    @RequestMapping(value = "api/user", method = RequestMethod.GET)
    public ResponseEntity<String> getUser() {
        return ResponseEntity.ok(user);
    }

    @RequestMapping(value = "api/password", method = RequestMethod.GET)
    public ResponseEntity<String> getPassword() {
        return ResponseEntity.ok(password);
    }
}
