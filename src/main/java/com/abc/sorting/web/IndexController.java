package com.abc.sorting.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/sort")
    public String sort() {
        return "sort";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/guestbook")
    public String guestbook() {
        return "guestbook";
    }

}
