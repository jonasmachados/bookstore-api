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

    public Livro update(Integer id, Livro obj) {
        Livro newObj = findById(id);
        updateData(newObj, obj);
        return livroRepository.save(newObj);
    }

    //Method taht tranfer update information of Livros
    private void updateData(Livro newObj, Livro obj) {
        newObj.setTitulo(obj.getTitulo());
        newObj.setNomeAuthor(obj.getNomeAuthor());
        newObj.setTexto(obj.getTexto());
    }

}
