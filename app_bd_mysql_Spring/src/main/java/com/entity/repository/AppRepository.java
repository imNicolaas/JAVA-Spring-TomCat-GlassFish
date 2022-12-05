/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Repository.java to edit this template
 */
package com.entity.repository;

import com.entity.usuarios;
import javax.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Nicolas Corredor Moya
 */

public interface AppRepository extends JpaRepository<usuarios, Id> {
    
    
}
