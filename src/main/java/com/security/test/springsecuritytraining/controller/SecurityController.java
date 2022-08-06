package com.security.test.springsecuritytraining.controller;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@Log4j2
@RequestMapping("/sample")
public class SecurityController {

    @GetMapping("/all")
    public void exAll() {
        log.info("exAll .......");
    }

    @GetMapping("/member")
    public void exMember() {
        log.info("exMember.....");
    }

    @GetMapping("/admin")
    public void exAdmin() {
        log.info("exAdmin......");
    }
}
