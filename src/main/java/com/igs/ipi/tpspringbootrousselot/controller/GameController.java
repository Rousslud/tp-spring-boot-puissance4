package com.igs.ipi.tpspringbootrousselot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import model.GameModel;

@Controller
@RequestMapping("/game")
public class GameController {
	
	@Autowired
	private GameService gameService; 
	
	@GetMapping("/new")
    public ModelAndView newGame() {
		GameModel gm = gameService.newGame(); 
    	ModelAndView mav = new ModelAndView("game"); 
    	mav.addObject("gm", gm);
        return mav;     
    }
	

}
