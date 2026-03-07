/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.repository;

import java.util.List;
import main.model.EventoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author nerea
 */
public interface EventoRepository extends JpaRepository<EventoModel, Integer> {

   @Query("SELECT e FROM EventoModel e WHERE e.IDUsuario = :idUsuario")
    List<EventoModel> findByIDUsuario(@Param("idUsuario") int idUsuario);

    @Query("SELECT e FROM EventoModel e WHERE e.Estado = :estado")
    List<EventoModel> findByEstado(@Param("estado") String estado);
}