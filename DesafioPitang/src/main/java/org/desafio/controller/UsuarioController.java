package org.desafio.controller;

import org.desafio.model.UsuariosModel;
import org.desafio.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @GetMapping
    public List<UsuariosModel> listarUsuarios(){

        return usuarioRepository.findAll();
    }
    @PostMapping
    public UsuariosModel adicionar(@RequestBody UsuariosModel usuario){
        return usuarioRepository.save(usuario);
    }
}
