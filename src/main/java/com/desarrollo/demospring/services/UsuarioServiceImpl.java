package com.desarrollo.demospring.services;

import com.desarrollo.demospring.entities.Product;
import com.desarrollo.demospring.entities.Usuario;
import com.desarrollo.demospring.repositories.ProductRepository;

import com.desarrollo.demospring.repositories.UsuarioRepository;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private UsuarioRepository UsuarioRepository;

    public boolean login(String user, String pass) {

        boolean result = false;
        List<Usuario> listusuario = usuarioRepository.findByNombre(user);
        Usuario usuario = listusuario.get(0);

        if(usuario != null) {
            if(usuario.getPassword().equals(pass))
                result  = true;
        }
        return result;
    }

    @Override
    public Usuario createUser(Usuario usuario) {
        return null;
    }
}
