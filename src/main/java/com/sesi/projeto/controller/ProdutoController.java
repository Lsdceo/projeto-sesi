package com.sesi.projeto.controller;


import com.sesi.projeto.dto.ProdutoDto;
import com.sesi.projeto.entity.Produto;
import com.sesi.projeto.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("produto")
public class ProdutoController {

    @Autowired
    ProdutoRepository repo;

    @GetMapping
    public ResponseEntity<List<Produto>> mostrarTodos(){
        List<Produto> prod = repo.findAll();
        return ResponseEntity.ok(prod);
    }

  @GetMapping("/{id}")
    public ResponseEntity<?> mostrarporid(@PathVariable Long id){
        Produto prod = repo.getById(id);
        return ResponseEntity.ok(prod);
  }

  @PostMapping
    public ResponseEntity<Produto> criar(@RequestBody ProdutoDto dto){
        Produto prod = new Produto(dto);
        return ResponseEntity.ok(prod);
  }

}
