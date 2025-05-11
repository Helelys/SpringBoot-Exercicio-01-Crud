package com.example.crud.controller;

import com.example.crud.model.Produto;
import com.example.crud.service.ProdutoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class ProdutoController {

    private final ProdutoService produtoService;

    @GetMapping
    public ResponseEntity<List<Produto>> verTodosOsProdutos() {
        return produtoService.verTodosOsProdutos();
    }

    @PostMapping
    public ResponseEntity<Produto> adicionarProduto(@RequestBody Produto produto) {
        return produtoService.adicionarProduto(produto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarProdutoPorId(@PathVariable String id) {
        return produtoService.deletarProdutoPorId(id);
    }
}
