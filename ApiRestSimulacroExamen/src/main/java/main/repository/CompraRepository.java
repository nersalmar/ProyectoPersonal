/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.repository;

import java.util.List;
import main.model.CompraModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author nerea
 */
public interface CompraRepository extends JpaRepository<CompraModel, Integer> {

    @Query("SELECT c FROM CompraModel c WHERE c.Producto = :producto")
    List<CompraModel> findByProducto(@Param("producto") String producto);

    @Query("SELECT c FROM CompraModel c WHERE c.Estado = :estado")
    List<CompraModel> findByEstado(@Param("estado") String estado);

    @Query("SELECT c FROM CompraModel c WHERE c.IDUsuario = :idUsuario")
    List<CompraModel> findByIDUsuario(@Param("idUsuario") int idUsuario);
}
