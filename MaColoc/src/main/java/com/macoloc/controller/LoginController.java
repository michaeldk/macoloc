package com.macoloc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.macoloc.controller.util.CustomAuthenticationProvider;
import com.macoloc.controller.util.LoginDetail;
import com.macoloc.controller.util.User;
 
@Controller
public class LoginController {
 
	@Autowired
    private CustomAuthenticationProvider customAuthenticationProvider;
 
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public @ResponseBody LoginDetail login(@RequestParam(value="userName") String userName, @RequestParam(value="password") String password) {
    	User user = new User(userName, password);
        Authentication authenticationToken =
                new UsernamePasswordAuthenticationToken(user.getUserName(), user.getPassword());
        try {
            Authentication authentication = customAuthenticationProvider.authenticate(authenticationToken);
            SecurityContextHolder.getContext().setAuthentication(authentication);
            LoginDetail ld = new LoginDetail().success().principal(authentication.getName());
            ld.setRoles(authentication.getAuthorities());
            return ld;
        } catch (AuthenticationException ex) {
            return new LoginDetail().failed();
        }
    }
}