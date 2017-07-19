package com.websystique.springmvc.controllers;

import com.websystique.springmvc.domain.Message;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Qiushi on 7/18/2017.
 */
@RestController
public class HelloWorldRestController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcome() {
        return "Welcome to RestTemplate Example";
    }

    @RequestMapping("/hello/{player}")
    public Message message(@PathVariable String player) {
        Message message = new Message(player, "hello " + player);
        return message;
    }
}
