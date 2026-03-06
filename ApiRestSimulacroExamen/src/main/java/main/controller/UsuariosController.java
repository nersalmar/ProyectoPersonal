/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.controller;

import java.util.List;
import main.model.UsuarioModel;
import main.servicies.UsuariosServicies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nerea
 */
@RestController
@RequestMapping("/nerea/usuarios")
public class UsuariosController {
    @Autowired
    public UsuariosServicies servi;

    public UsuariosController(UsuariosServicies servi) {
        this.servi = servi;
    }

    @GetMapping("/nerea/usuarios")
    public List<UsuarioModel> listarTodos() {
        return servi.listarTodosUsuarios();
    }
    
  /*  @GetMapping("/nerea/usuarios/{nombre}")
    public List<UsuarioModel> buscarNombre(String nombre) {
        return servi.buscaPorNombreUsuario(nombre);
    }
*/
}
