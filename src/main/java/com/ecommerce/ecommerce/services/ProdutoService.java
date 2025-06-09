package com.ecommerce.ecommerce.services;

import com.ecommerce.ecommerce.model.Produto;
import com.ecommerce.ecommerce.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProdutoService {
    private final ProdutoRepository repository;

    public Produto salvar (Produto produto){
        return repository.save(produto);
    }

    public List <Produto> listar(){
        return repository.findAll();
    }

    public Produto acharPorId (long id){
        return repository.findById(id).orElseThrow(()->new RuntimeException("Nenhum resultado encontrado"));
    }

    public void deletar (long id){
        repository.deleteById(id);
    }
    }