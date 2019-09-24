package com.mellowp.spring.service.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mellowp
 * @date   2019-09-24
 */
@RestController
public class WebRestController {


    @GetMapping(value = {"/", "/main"})
    public String welcome(){
        return "Hello World !! ";
    }


}
