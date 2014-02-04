package com.macoloc.controller.util;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

public class LoginDetail {
 
    private boolean loggedIn;
    private String principal;
    private Collection<? extends GrantedAuthority> roles;
 
    public LoginDetail success() {
        loggedIn = true;
        return this;
    }
 
    public LoginDetail principal(String principal) {
        this.principal = principal;
        return this;
    }
 
    public LoginDetail failed() {
        loggedIn = false;
        return this;
    }
 
    public boolean isLoggedIn() {
        return loggedIn;
    }
 
    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }
 
    public String getPrincipal() {
        return principal;
    }
 
    public void setPrincipal(String principal) {
        this.principal = principal;
    }
 
    public Collection<? extends GrantedAuthority> getRoles() {
        return roles;
    }
 
    public void setRoles(Collection<? extends GrantedAuthority> roles) {
        this.roles = roles;
    }
}
