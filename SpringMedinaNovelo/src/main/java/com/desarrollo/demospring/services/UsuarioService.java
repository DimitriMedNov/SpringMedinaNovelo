package com.desarrollo.demospring.services;

import com.desarrollo.demospring.entities.Product;
import com.desarrollo.demospring.entities.Usuario;

public interface UsuarioService {

    public boolean login(String user, String pass);

    public Usuario createUser(Usuario usuario);//regresar ID

}
