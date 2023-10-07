package com.example.demo.servicios;

import com.example.demo.entidades.Libro;
import com.example.demo.repositorios.BaseRepositorio;
import com.example.demo.repositorios.LibroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro, Long> implements LibroService{
    @Autowired
    private LibroRepositorio libroRepositorio;
    public LibroServiceImpl(BaseRepositorio<Libro, Long> baseRepositorio) {
        super(baseRepositorio);
    }
}