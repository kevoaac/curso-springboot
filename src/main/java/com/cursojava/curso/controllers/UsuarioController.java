package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {
    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsurios(){
        List<Usuario> usuarios = new ArrayList<>();

        Usuario usuario = new Usuario();
        usuario.setId(123L);
        usuario.setNombre("Lucas");
        usuario.setApellido("Moy");
        usuario.setTelefono("09999999");
        usuario.setEmail("lucasmoy@gmail.com");
        usuario.setPassword("123456789");

        Usuario usuario2 = new Usuario();
        usuario2.setId(234L);
        usuario2.setNombre("Jose");
        usuario2.setApellido("Luna");
        usuario2.setTelefono("09999999");
        usuario2.setEmail("joslu@gmail.com");
        usuario2.setPassword("123456789");

        Usuario usuario3 = new Usuario();
        usuario3.setId(456L);
        usuario3.setNombre("Martha");
        usuario3.setApellido("Castro");
        usuario3.setTelefono("09999999");
        usuario3.setEmail("marcastro@gmail.com");
        usuario3.setPassword("123456789");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        return usuarios;
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


