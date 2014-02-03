package com.macoloc.controller.util;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.macoloc.domain.Roommate;
import com.macoloc.service.contract.RoommateService;

public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private RoommateService roommateService;
	
	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		Roommate roommate = roommateService.findByEmail(username);
	    if (roommate == null) {
	    	throw new UsernameNotFoundException("Invalid username/password.");
	    }
	    Collection<? extends GrantedAuthority> authorities = AuthorityUtils.createAuthorityList("Role1","role2","role3");
	    return new User(roommate.getEmail(), roommate.getPassword(), authorities);
	}

}
