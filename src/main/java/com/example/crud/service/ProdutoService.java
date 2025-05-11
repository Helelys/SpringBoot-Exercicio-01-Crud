package com.example.crud.service;

import com.example.crud.model.Produto;
import com.example.crud.repository.ProdutoRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@AllArgsConstructor
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ResponseEntity<List<Produto>> verTodosOsProdutos() {
        return ResponseEntity.ok(produtoRepository.findAll());
    }

    public ResponseEntity<Produto> adicionarProduto(@RequestBody Produto produto) {
        return ResponseEntity.ok(produtoRepository.save(produto));
    }

    public ResponseEntity<Void> deletarProdutoPorId(@PathVariable String id) {
        if (produtoRepository.existsById(id)) {
            produtoRepository.deleteById(id);
        }
        return ResponseEntity.noContent().build();
    }
}
