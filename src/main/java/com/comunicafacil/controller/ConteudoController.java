package com.comunicafacil.controller;

import com.comunicafacil.model.Conteudo;
import com.comunicafacil.service.ConteudoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/conteudos")
public class ConteudoController {

    @Autowired
    private ConteudoService conteudoService;

    @PostMapping
    public Conteudo salvarConteudo(@RequestBody Conteudo conteudo) {
        return conteudoService.salvar(conteudo);
    }

    @GetMapping("/{id}")
    public Conteudo buscarPorId(@PathVariable Long id) {
        return conteudoService.buscarPorId(id);
    }

    @GetMapping
    public List<Conteudo> listarTodos() {
        return conteudoService.listarTodos();
    }
}
