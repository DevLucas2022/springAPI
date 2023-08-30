package com.fatec.produto;

import com.fatec.produto.model.Produto;
import com.fatec.produto.service.IProdutoServico;
import com.fatec.produto.service.ProdutoServico;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ProdutoApplicationTests {

	@Autowired
	IProdutoServico produtoServico;

	@Test
	void contextLoads() {
	}
	@Test
	void ct01_verifica_custo(){
		Produto produto = new Produto();
		produto.setCusto(12);
		assertEquals(12,produto.getCusto());

	}
	@Test
	void ct02_consulta_com_sucesso(){
		List<Produto> produtos = produtoServico.consultaCatalogo();
		assertEquals(1,produtos.size());
	}
}
