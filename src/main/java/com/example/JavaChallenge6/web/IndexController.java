package com.example.JavaChallenge6.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Controller
public class IndexController {

    @GetMapping
    public String index(Model model) {
        LocalDateTime today = LocalDateTime.now();
        String formattedDateTime = DateTimeFormatter.ofPattern("yyy年MM月dd日 HH時mm分ss秒").format(LocalDateTime.now());
        model.addAttribute("formattedDateTime", formattedDateTime);
        return "index";
    }
}
