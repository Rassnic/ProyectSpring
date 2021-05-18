package com.app.proyectofinal.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.proyectofinal.Entity.telefono_c;

@Repository("TelefonoCRepository")
public interface TelefonoCRepository extends JpaRepository<telefono_c, Serializable>{

}
