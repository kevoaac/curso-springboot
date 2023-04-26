package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Constructor;
import java.util.List;

@RestController
public class UsuarioController {
    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsurio(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Lucas");
        usuario.setApellido("Moy");
        usuario.setTelefono("09999999");
        usuario.setEmail("lucasmoy@gmail.com");
        usuario.setPassword("123456789");
        return usuario;
    }

    @RequestMapping(value = "usuarioo")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Lucas");
        usuario.setApellido("Moy");
        usuario.setTelefono("09999999");
        usuario.setEmail("lucasmoy@gmail.com");
        usuario.setPassword("123456789");
        return usuario;
    }

    @RequestMapping(value = "usuariooo")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Lucas");
        usuario.setApellido("Moy");
        usuario.setTelefono("09999999");
        usuario.setEmail("lucasmoy@gmail.com");
        usuario.setPassword("123456789");
        return usuario;
    }

    @RequestMapping(value = "usuarioooo")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Lucas");
        usuario.setApellido("Moy");
        usuario.setTelefono("09999999");
        usuario.setEmail("lucasmoy@gmail.com");
        usuario.setPassword("123456789");
        return usuario;
    }

}


