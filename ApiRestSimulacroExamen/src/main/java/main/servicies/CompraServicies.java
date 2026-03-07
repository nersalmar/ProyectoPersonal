/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.servicies;

import java.util.List;
import java.util.Optional;
import main.model.CompraModel;
import main.model.UsuarioModel;
import main.repository.CompraRepository;
import main.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author nerea
 */
@Service
public class CompraServicies {
      
    @Autowired
    public CompraRepository respository;

    public List<CompraModel> listarTodosCompra(){
        return respository.findAll();
    }
   
    public List<CompraModel> buscaPorProducto(String producto){
       return respository.findByProducto(producto);
    }
    
     public List<CompraModel> buscarPorUsuario(int idUsuario) {
        return respository.findByIDUsuario(idUsuario);
    }
    
    public List<CompraModel> buscarPorEstado(String estado) {
        return respository.findByEstado(estado);
    }
    
    public CompraModel guardar(CompraModel compraModel){
       return respository.save(compraModel);
    }
    
    public void eliminar(int id){
        respository.deleteById(id);
    }
}
