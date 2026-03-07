/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.servicies;

import java.util.List;
import java.util.Optional;
import main.model.UsuarioModel;
import main.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author nerea
 */
@Service
public class UsuariosServicies {
    
    @Autowired
    public UsuarioRepository respository;

    public List<UsuarioModel> listarTodosUsuarios(){
        return respository.findAll();
    }
   
    public Optional<UsuarioModel> buscaPorNombreUsuario(String Nombre){
       return respository.findByNombre(Nombre);
    }
    
    public UsuarioModel guardar(UsuarioModel usuarioModel){
       return respository.save(usuarioModel);
    }
    
    public void eliminar(int id){
        respository.deleteById(id);
    }
    
    
}
