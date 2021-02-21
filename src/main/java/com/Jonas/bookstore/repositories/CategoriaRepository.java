package com.Jonas.bookstore.repositories;

import com.Jonas.bookstore.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jonas, created 21/02/2021
 */

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
    
}
