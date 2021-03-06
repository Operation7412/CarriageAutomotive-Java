package com.carriageautomotive.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController 
{
	@GetMapping("/login")
	public String showLoginPage(HttpSession session)
	{
		Cart cart = new Cart();
		long cartID = new Date().getTime();
		cart.setCartId(Long.toString(cartID));
		session.setAttribute("cart", cart);
		return "login";
	}
	

}
