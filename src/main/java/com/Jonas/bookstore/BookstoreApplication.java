package com.Jonas.bookstore;

import com.Jonas.bookstore.domain.Categoria;
import com.Jonas.bookstore.domain.Livro;
import com.Jonas.bookstore.repositories.CategoriaRepository;
import com.Jonas.bookstore.repositories.LivroRepository;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner {

    //Summon class Repository for add H2
    @Autowired
    private CategoriaRepository categoriaRepository;
    
    //Summon class Repository for add H2
    @Autowired
    private LivroRepository livroRepository;
    
    public static void main(String[] args) {
        SpringApplication.run(BookstoreApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Categoria cat1 = new Categoria(null, "Informatica", "Livro de TI");

        Livro l1 = new Livro(null, "Clean code", "Robert Martin", "Loren I.", cat1);

        cat1.getLivros().addAll(Arrays.asList(l1));

        this.categoriaRepository.saveAll(Arrays.asList(cat1));
        this.livroRepository.saveAll(Arrays.asList(l1));
    }

}
