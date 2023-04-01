package com.desarrollo.demospring.controllers;

import com.desarrollo.demospring.entities.Product;
import com.desarrollo.demospring.entities.Usuario;
import com.desarrollo.demospring.services.UsuarioService;
import com.desarrollo.demospring.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


/**
 * Usuario controller.
 */
@Controller
public class UsuarioController {
     @Autowired
     private UsuarioService usuarioService;

    /*
     * List all Usuarios.
     * @param name
     * @return
     */
  /* @RequestMapping ("/")
    public String list(Model name, Model pass) {
       me na.addAttribute("Usuarios", usuarioService.login(name.toString(), pass.toString()));
        System.out.println("Returning Usuarios:");
        return "login";
    }
    /**
     * View a specific Usuario by its id.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/login")
    public String login(Model model) {
        //addAttribute("Usuario", usuarioService.login();
        return "login";
    }

    /**
     * Save usuario to database.
     *
     * @param username
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login( @RequestParam ("username") String name, @RequestParam ("password") String pass) {
        System.out.println(name);
        System.out.println(pass);
        if(usuarioService.login(name, pass)){
            return "redirect:/";
        }
        else{
            return "redirect:/login?error";
        }
    }

    @RequestMapping (value = "/createUser")
    public String createUser(@RequestParam("username") String name, @RequestParam("password") String pass, @RequestParam("email") String email) {
        System.out.println(name);
        System.out.println(pass);
        System.out.println(email);
        if (usuarioService.createUser(String name, String pass, String email)) {
            return "redirect:/";
        } else {
            return "redirect:/createUser?error";
        }
    }
}
