package com.Jonas.bookstore.config;

import com.Jonas.bookstore.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 *
 * @author Jonas, created 26/02/2021
 */
@Configuration
@Profile("test")
public class TestConfig {

    @Autowired
    private DBService dbService;

    //Toda fez que estartaermos o perfil de Test, instancia automaticamente
    @Bean
    public void instanciaBaseDeDados() {
        this.dbService.instanciaBaseDeDados();
    }
}
