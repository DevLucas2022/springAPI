package com.fatec.produto.service;

import com.fatec.produto.model.IProdutoRepository;
import com.fatec.produto.model.Produto;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


@Configuration
public class LoadDatabase {
    @Bean
    CommandLineRunner initDatabase (IProdutoRepository repository){
        return args -> {
            Produto produto1 = new Produto("Tirante Brastemp", "maquina de lavar", 51.86, 14);
            repository.saveAll(Arrays.asList(produto1));
        };
    }
}
