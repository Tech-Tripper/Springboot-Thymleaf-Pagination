package com.codeflix.springbootCRUD.controller;

import com.codeflix.springbootCRUD.service.PlayerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PlayerController {

    @Autowired
    private PlayerServiceImpl playerService;

    @GetMapping("/players")
    public String passListOfPlayersWithModel(Model model) {
        model.addAttribute("listOfPlayers", playerService.getAllPlayers());

        return "viewPage";
    }
}
