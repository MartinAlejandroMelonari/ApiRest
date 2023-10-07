package com.example.demo.repositorios;


import com.example.demo.entidades.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepositorio extends BaseRepositorio<Persona, Long> {

}

