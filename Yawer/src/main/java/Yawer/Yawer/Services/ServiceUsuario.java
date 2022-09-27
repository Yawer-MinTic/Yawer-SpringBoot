package Yawer.Yawer.Services;


import Yawer.Yawer.Domains.Usuario;
import Yawer.Yawer.Domains.entityPermisos;
import Yawer.Yawer.Enums.Roles;
import Yawer.Yawer.Repositories.UsuarioRepository;
import Yawer.Yawer.Repositories.repositoryPermisos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ServiceUsuario {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    repositoryPermisos RepositoryPermisos;




    public List<Usuario> consultarListaUsuarios() {
        List<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios.addAll(usuarioRepository.findAll());

        return usuarios;
    }


    public void crearUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }


    public Usuario buscarUsuario(int id) {

        Usuario usuario = null;

        for (Usuario p : consultarListaUsuarios()) {
            if (p.getId() == id) {
                return p;
            }
        }

        return usuario;
    }


    public void editarUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }


    public void eliminarrUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }


    public Boolean insertarUsuarioRol(Usuario usuario) {

        if (usuario.getRol().equals(Roles.Administrador)) {
            usuarioRepository.save(usuario);
            entityPermisos temp = new entityPermisos(true, true, true,
                    true, usuario);
            RepositoryPermisos.save(temp);

        } else if (usuario.getRol().equals(Roles.Usuario)) {

            usuarioRepository.save(usuario);
            entityPermisos  temp = new entityPermisos(true, false, false,
                    false, usuario);
            RepositoryPermisos.save(temp);

        }else {
            System.err.println("No se permite ese Usuario ");
            return Boolean.FALSE;
        }
        return  Boolean.TRUE;
        }


}
