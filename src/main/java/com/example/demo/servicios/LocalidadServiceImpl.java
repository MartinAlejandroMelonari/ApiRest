package com.example.demo.servicios;

import com.example.demo.entidades.Localidad;
import com.example.demo.repositorios.BaseRepositorio;
import com.example.demo.repositorios.LocalidadRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService{
    @Autowired
    private LocalidadRepositorio localidadRepositorio;
    public LocalidadServiceImpl(BaseRepositorio<Localidad, Long> baseRepositorio) {
        super(baseRepositorio);
    }
}
