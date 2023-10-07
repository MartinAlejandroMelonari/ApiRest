package com.example.demo.servicios;

import com.example.demo.entidades.Domicilio;
import com.example.demo.repositorios.BaseRepositorio;
import com.example.demo.repositorios.DomicilioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomicilioServiceImpl extends BaseServiceImpl<Domicilio, Long> implements DomicilioService{
    @Autowired
    private DomicilioRepositorio DomicilioRepositorio;
    public DomicilioServiceImpl(BaseRepositorio<Domicilio, Long> baseRepositorio) {
        super(baseRepositorio);
    }
}