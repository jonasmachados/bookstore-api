package com.Jonas.bookstore.service;

import com.Jonas.bookstore.domain.Categoria;
import com.Jonas.bookstore.service.exceptions.ObjectNotFoundException;
import com.Jonas.bookstore.repositories.CategoriaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jonas, created 28/02/2021
 */
@Service
public class CategoriaService {

    //injecao de dependencia
    @Autowired
    private CategoriaRepository repository;

    public Categoria findById(Integer id) {
        Optional<Categoria> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));

    }

    public List<Categoria> findAll() {
        return repository.findAll();
    }
}
