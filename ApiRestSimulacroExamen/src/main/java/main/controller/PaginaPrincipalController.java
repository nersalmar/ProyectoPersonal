/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.controller;

import org.springframework.ui.Model;
import jakarta.servlet.http.HttpSession;
import main.model.UsuarioModel;
import main.servicies.CompraServicies;
import main.servicies.EventoServicies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author nerea
 */
@Controller
public class PaginaPrincipalController {

    @Autowired
    private EventoServicies eventoServicies;

    @Autowired
    private CompraServicies compraServicies;

    @GetMapping("/paginaPrincipal")
    public String paginaPrincipal(HttpSession inicioSesion, Model model) {
        UsuarioModel usuario = (UsuarioModel) inicioSesion.getAttribute("usuario");
        if (usuario == null) {
            return "redirect:/login";
        }

        model.addAttribute("usuario", usuario);
        model.addAttribute("eventos", eventoServicies.buscaPorIDUsuario(usuario.getId()));
        model.addAttribute("compras", compraServicies.buscarPorUsuario(usuario.getId()));

        return "paginaPrincipal";
    }

    
    
}
