package br.com.fiap.primeira_api.model;

import jakarta.persistence.*;

@Entity //anotação JPA para dizer que o objeto, classe livro, tem que ser mapeada
@Table(name = "TB_LIVROS")
public class Livro {
    @Id //precisamos avisar ao sistema qual atributo se trata do ID. E isso se faz pela anotação @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "livro_titulo")
    private String titulo;
    @Column(name = "livro_autor")
    private String autor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
