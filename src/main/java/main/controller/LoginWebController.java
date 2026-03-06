/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.controller;

import jakarta.servlet.http.HttpSession;
import java.util.Optional;
import main.model.UsuarioModel;
import main.servicies.UsuariosServicies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author nerea
 */
@Controller
public class LoginWebController {

    @Autowired
    private UsuariosServicies usuarioServicies;

    @GetMapping("/login")
    public String mostrarLogin() {
        return "login";
    }

    @PostMapping("/login")
    public String procesarLogin(
            @RequestParam String nombre,
            @RequestParam String password,
            HttpSession inicioSesion){
           
        Optional<UsuarioModel> usuarioInicia = usuarioServicies.buscaPorNombreUsuario(nombre);
        
        if(usuarioInicia.isPresent() && usuarioInicia.get().getPassword().equals(password)){
            inicioSesion.setAttribute("usuario", usuarioInicia.get());
            return "redirect:/paginaPrincipal";
        }else{
            return "redirect:/login?error=true";
        }
    }
    
    @GetMapping("/logout")
    public String logout(HttpSession sesion){
        sesion.invalidate();
        return "redirect:/login";
    }

}
