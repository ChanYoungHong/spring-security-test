package com.security.test.springsecuritytraining.security;

import java.io.IOException;
import java.time.LocalDateTime;
import javax.servlet.FilterChain;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

public class AuthenticationFilter extends UsernamePasswordAuthenticationFilter {



    @Autowired
    public AuthenticationFilter(AuthenticationManager authenticationManager) {
        super.setAuthenticationManager(authenticationManager);
        setFilterProcessesUrl("/user/login");
    }

    public Authentication attemptAuthentication(HttpServletRequest request,
                                                HttpServletRequest response) throws AuthenticationException {

        return null;

        //todo 인증정보조회
        //todo 유저아이디를 통해서 유저가 있는지 없는지?
        //todo 유저패스워드가 request 패스워드와 일치하는지?

        //todo 예외처리 ( 유저가 없는 경우 )
        //todo 토큰발행

    }

    public void successfulAuthentication(HttpServletRequest request, HttpServletResponse response,
                                         FilterChain chain, Authentication authResult) throws IOException {
        // todo

//        UserDto userDto = userService.getUser(userId);

        LocalDateTime localDateTime = LocalDateTime.now();
    }


}
