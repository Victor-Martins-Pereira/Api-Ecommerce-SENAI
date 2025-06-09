package com.ecommerce.ecommerce.controller;

import com.ecommerce.ecommerce.model.Produto;
import com.ecommerce.ecommerce.services.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/produtos")
@RestController
@RequiredArgsConstructor
public class ProdutoController {

    private final ProdutoService service;
    @PostMapping
    public Produto salvar (@RequestBody Produto produto){
        return service.salvar(produto);
    }

    @GetMapping
    public List <Produto> listarTodos(){
        return service.listar();
    }

    @GetMapping("/{id}")
    public Produto acharPorID (@PathVariable long id) {
        return service.acharPorId(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar (@PathVariable long id) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
