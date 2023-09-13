package com.fatec.produto.service;

import com.fatec.produto.model.Catalogo;
import com.fatec.produto.model.IProdutoRepository;
import com.fatec.produto.model.Imagem;
import com.fatec.produto.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoServico implements IProdutoServico {

    @Autowired
    IProdutoRepository repositoryP;
    @Autowired
    ImagemServico imagemServico;
    public List<Catalogo> consultaCatalogo() {

        Catalogo c = null;
        List<Catalogo> lista = new ArrayList<Catalogo>();
        List<Produto> listaP = repositoryP.findAll();
        List<Imagem> listaI = imagemServico.getAll();
        for (Produto p : listaP) {
            for (Imagem i : listaI) {
                if (p.getId().equals(i.getId())) {
                    c = new Catalogo(p.getId(), p.getDescricao(), p.getCategoria(),
                            p.getCusto(),p.getQuantidadeNoEstoque(), i.getArquivo());
                    lista.add(c);
                }
            }
        }
        return lista;
    }
}
