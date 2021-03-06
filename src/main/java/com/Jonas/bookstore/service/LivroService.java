package com.Jonas.bookstore.service;

import com.Jonas.bookstore.domain.Livro;
import com.Jonas.bookstore.repositories.LivroRepository;
import com.Jonas.bookstore.resource.LivroResource;
import com.Jonas.bookstore.service.exceptions.ObjectNotFoundException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jonas, created 06/03/2021
 */
@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;//that make a connection with DB

    @Autowired
    private CategoriaService categoriaService;

    public Livro findById(Integer id) {
        Optional<Livro> obj = livroRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Livro.class.getName()));
    }

    public List<Livro> findAll(Integer id_cat) {
        categoriaService.findById(id_cat);
        return livroRepository.findAllByCategoria(id_cat);
    }

}
