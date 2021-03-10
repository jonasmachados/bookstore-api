package com.Jonas.bookstore.dtos;

import com.Jonas.bookstore.domain.Categoria;
import java.io.Serializable;
import javax.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.Length;

/**
 *
 * @author Jonas, created 02/03/2021
 */
public class CategoriaDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    @NotEmpty(message = "Campo nome é requerido/ Name required ")
    @Length(min = 3, max = 100, message = "Campo deve ter entre 3 a 100 caracteres/ Name shoud between 3 to 100 caracter")
    private String nome;

    @NotEmpty(message = "Campo descricao é requerido/ Description required ")
    @Length(min = 3, max = 100, message = "Campo deve ter entre 3 a 300 caracteres/ Name shoud between 3 to 300 caracter")
    private String descricao;

    //CONSTRUCTOR
    public CategoriaDTO() {
    }

    //CONSTRUCTOR
    public CategoriaDTO(Categoria obj) {
        this.id = obj.getId();
        this.nome = obj.getNome();
        this.descricao = obj.getDescricao();
    }

    //GET AND SET
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
