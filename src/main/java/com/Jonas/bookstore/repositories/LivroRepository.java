package com.Jonas.bookstore.repositories;

import com.Jonas.bookstore.domain.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jonas, created 21/02/2021
 */

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer>{
    
}
