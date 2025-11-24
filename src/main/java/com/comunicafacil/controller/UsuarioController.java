package com.comunicafacil.controller;

import com.comunicafacil.model.Cidadao;
import com.comunicafacil.model.Administrador;
import com.comunicafacil.model.UsuarioAbstrato;
import com.comunicafacil.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/cidadao")
    public Cidadao cadastrarCidadao(@RequestBody Cidadao usuario) {
        return usuarioService.criarCidadao(usuario);
    }

    @PostMapping("/admin")
    public Administrador cadastrarAdmin(@RequestBody Administrador usuario) {
        return usuarioService.criarAdmin(usuario);
    }

    @GetMapping
    public List<UsuarioAbstrato> listar() {
        return usuarioService.listar();
    }

    @GetMapping("/{id}")
    public UsuarioAbstrato buscar(@PathVariable Long id) {
        return usuarioService.buscar(id);
    }
}
