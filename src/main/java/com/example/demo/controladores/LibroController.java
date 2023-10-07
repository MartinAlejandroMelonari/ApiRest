package com.example.demo.controladores;

import com.example.demo.entidades.Libro;
import com.example.demo.servicios.LibroServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/libros")
public class LibroController extends BaseControllerImpl<Libro, LibroServiceImpl>{
}
