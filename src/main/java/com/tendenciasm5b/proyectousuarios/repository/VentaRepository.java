/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tendenciasm5b.proyectousuarios.repository;


import com.tendenciasm5b.proyectousuarios.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author chris
 */
public interface VentaRepository extends JpaRepository<Venta, Integer>{
        @Query(value = "Select * from venta u where u.id_persona = :id_persona", nativeQuery = true)
    public Venta buscarVenta(String id_persona);
}
