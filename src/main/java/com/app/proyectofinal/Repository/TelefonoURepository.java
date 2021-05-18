package com.app.proyectofinal.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.proyectofinal.Entity.telefono_u;

@Repository("TelefonoURepository")
public interface TelefonoURepository extends JpaRepository<telefono_u, Serializable>{

}
