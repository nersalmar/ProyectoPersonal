/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.controller;

import jakarta.servlet.http.HttpSession;
import java.util.Optional;
import main.model.CompraModel;
import main.model.UsuarioModel;
import main.servicies.CompraServicies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author nerea
 */
@Controller
public class CompraWebController {

 
    @Autowired
    private CompraServicies compraServices;

    @GetMapping("/compra/nuevo")
    public String mostrarParaGuardarCompra(HttpSession inicioSesion, Model model) {
        UsuarioModel usuario = (UsuarioModel) inicioSesion.getAttribute("usuario");
        if (usuario == null) {
            return "redirect:/login";
        }
        model.addAttribute("usuario", usuario);
        return "compraNueva";
    }

    @PostMapping("/compra/guardarNuevoProducto")
    public String procesarLogin(
            @RequestParam String producto,
            @RequestParam int cantidad,
            @RequestParam int idUsuario,
            @RequestParam String estado,
            HttpSession inicioSesion) {

        UsuarioModel usuario = (UsuarioModel) inicioSesion.getAttribute("usuario");
        if (usuario == null) {
            return "redirect:/login";
        }

        CompraModel compra = new CompraModel();
        compra.setProducto(producto);
        compra.setCantidad(cantidad);
        compra.setIDUsuario(idUsuario);
        compra.setEstado(estado);

        compraServices.guardar(compra);
        return "redirect:/paginaPrincipal";
    }

}
