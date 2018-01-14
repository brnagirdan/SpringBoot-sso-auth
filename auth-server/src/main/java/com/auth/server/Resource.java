package com.auth.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/rest/principal")
public class Resource {

    @GetMapping("/principal")
    public Principal user(Principal principal){   // retrieve user datas
      return principal;
    }

}
