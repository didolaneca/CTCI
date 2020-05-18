package com.diyan.ctci;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileManager {
    private final Environment env;

    public ProfileManager(Environment env) {
        this.env = env;
    }

    @GetMapping("envdetails")
    public String envDetails(){
        return env.toString();
    }
}
