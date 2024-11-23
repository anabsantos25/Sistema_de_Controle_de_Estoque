package Projeto.SCV.controller;

import Projeto.SCV.model.Produto;
import Projeto.SCV.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
@CrossOrigin(origins = "http://localhost:63342")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<Produto> cadastrarProduto(@RequestBody Produto produto) {
        if (produto.getId() != null) {
            Optional<Produto> produtoExistente = produtoService.buscarProdutoPorId(produto.getId());
            if (produtoExistente.isPresent()) {
                return ResponseEntity.badRequest().body(null);
            }
        }
        Produto novoProduto = produtoService.cadastrarProduto(produto);
        return ResponseEntity.ok(novoProduto);
    }

    @GetMapping
    public ResponseEntity<List<Produto>> listarProdutos() {
        List<Produto> produtos = produtoService.listarProdutos();
        return ResponseEntity.ok(produtos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscarProdutoPorId(@PathVariable Long id) {
        Optional<Produto> produto = produtoService.buscarProdutoPorId(id);
        return produto.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> editarProduto(@PathVariable Long id, @RequestBody Produto produtoAtualizado) {
        Optional<Produto> produtoExistente = produtoService.buscarProdutoPorId(id);
        if (produtoExistente.isPresent()) {
            Produto produtoEditado = produtoService.editarProduto(id, produtoAtualizado);
            return ResponseEntity.ok(produtoEditado);
        }
        return ResponseEntity.status(404).body("Produto com ID " + id + " não encontrado.");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirProduto(@PathVariable Long id) {
        if (produtoService.buscarProdutoPorId(id).isPresent()) {
            produtoService.excluirProduto(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}


