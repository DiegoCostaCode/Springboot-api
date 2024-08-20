package br.com.fiap.primeira_api.repository;

import br.com.fiap.primeira_api.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Indica que esta classe é um repositorio
public interface Livro_repository extends JpaRepository<Livro, Long> {
    //JPARespository -> disponibiliza divermos métodos FindAll, findById, entre outros. Sem a necessidade de criar na mão.


}
