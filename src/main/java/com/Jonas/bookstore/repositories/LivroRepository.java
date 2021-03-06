package com.Jonas.bookstore.repositories;

import com.Jonas.bookstore.domain.Livro;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jonas, created 21/02/2021
 */
@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer> {

    @Query("SELECT obj FROM Livro obj WHERE obj.categoria.id = :id_cat ORDER BY titulo")
    List<Livro> findAllByCategoria(@Param(value = "id_cat") Integer id_cat);

}
