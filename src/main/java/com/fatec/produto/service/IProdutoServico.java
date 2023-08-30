package com.fatec.produto.service;

import com.fatec.produto.model.Produto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IProdutoServico {

    public List<Produto> consultaCatalogo();
}
