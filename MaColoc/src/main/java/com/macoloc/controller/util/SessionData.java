package com.macoloc.controller.util;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;

import com.macoloc.domain.Colocation;
import com.macoloc.domain.Roommate;
import com.macoloc.service.contract.RoommateService;

/**
 * @author mdekeys
 * Helper class designed to wrap access to session data
 */
public class SessionData {
	
	@Autowired
	private static RoommateService roommateService;
	
	public static Colocation findColocation(HttpSession session) {
		Colocation coloc = (Colocation) session.getAttribute("colocation");
		if (coloc != null) {
			return coloc;
		}
		Roommate user = findRoommate(session);
		coloc = user.getColocation();
		session.setAttribute("colocation", coloc);
		return coloc;
	}
	
	public static Roommate findRoommate(HttpSession session) {
		Roommate user = (Roommate) session.getAttribute("user");
		if (user != null) {
			return user;
		}
		user = roommateService.findByEmail(SecurityContextHolder.getContext().getAuthentication().getName());
		session.setAttribute("user", user);
		return user;
	}
}
