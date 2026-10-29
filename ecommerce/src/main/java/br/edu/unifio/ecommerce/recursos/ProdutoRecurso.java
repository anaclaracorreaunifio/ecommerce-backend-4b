package br.edu.unifio.ecommerce.recursos;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unifio.ecommerce.entidades.Produto;
import br.edu.unifio.ecommerce.repositorios.ProdutoRepositorio;


import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;



@RestController 
@RequestMapping ("/produtos")
public class ProdutoRecurso {
private final ProdutoRepositorio produtoRepositorio;

    public ProdutoRecurso(ProdutoRepositorio produtoRepositorio) {
        this.produtoRepositorio = produtoRepositorio;
    }


  @GetMapping 
   public List<Produto> listar () {
    return produtoRepositorio.findAll(Sort.by("nome")); 
   }
}
