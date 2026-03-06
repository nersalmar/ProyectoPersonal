/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.repository;

import main.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Integer> {

    @Query("SELECT u FROM UsuarioModel u WHERE u.Nombre = :nombre")
    Optional<UsuarioModel> findByNombre(@Param("nombre")String nombre);
}
