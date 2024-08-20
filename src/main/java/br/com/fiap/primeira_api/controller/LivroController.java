package br.com.fiap.primeira_api.controller;

import br.com.fiap.primeira_api.model.Livro;
import br.com.fiap.primeira_api.repository.Livro_repository;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//localhost:8080/livros
@RequestMapping(value = "/livros")
public class LivroController {

    @Autowired//Estamos basicamente estanciando o objeto repository aqui, para ter acesso aos metodos
     private Livro_repository livro_repository;

    //CRUD - CREATE, READ, UPDATE, DELETE
    //HTTP verbs - POST, GET, PUT, DELETE
    @PostMapping//Mesma coisa que @POST
    public ResponseEntity<Livro> createLivro(@RequestBody Livro livro) {
        Livro livroCriado = livro_repository.save(livro);
        return new ResponseEntity<>(livroCriado, HttpStatus.CREATED);
    }

    @GetMapping//Mesma coisa que o @GET
    public ResponseEntity<List<Livro>> readAllLivros() {
        List<Livro> listaLivros = livro_repository.findAll();
        return new ResponseEntity<>(listaLivros, HttpStatus.OK);
    }
}
