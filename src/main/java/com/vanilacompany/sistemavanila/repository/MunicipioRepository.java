/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vanilacompany.sistemavanila.repository;

import com.vanilacompany.sistemavanila.modelo.Municipio;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Esteban Castillo
 */
public interface MunicipioRepository extends JpaRepository <Municipio, Integer>{
    
}
