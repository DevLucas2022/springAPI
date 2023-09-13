package com.fatec.produto.service;

import com.fatec.produto.model.Imagem;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface IImagemServico {
    public Optional<Imagem> salvar(MultipartFile arquivo, Long id) throws IOException;
    public List<Imagem> getAll();
    public byte[] getImagem( String nomeArquivo);
    public byte[] getImagemBy(Long id);
}
