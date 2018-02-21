package br.com.drogaria.test;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Test;

import br.com.drogaria.dao.ProdutoDAO;
import br.com.drogaria.domain.Fabricante;
import br.com.drogaria.domain.Produto;

public class ProdutoDAOTeste {
	
	// @Test
	public void salvar() throws SQLException{
		Produto p = new Produto();
		p.setDescricao("Novalgina com 10 comprimidos");
		p.setPreco(2.45D);
		p.setQuantidade(13L);
		
		Fabricante f = new Fabricante();
		f.setCodigo(1L);
		
		p.setFabricante(f); //Composição
		
		ProdutoDAO dao = new ProdutoDAO();
		dao.salvar(p);
	}
	
	// @Test
	public void listar() throws SQLException{
		ProdutoDAO dao = new ProdutoDAO();
		ArrayList<Produto> lista = dao.listar();
		for(Produto p: lista){
			System.out.println("Código: " + p.getCodigo());
			System.out.println("Descrição: " + p.getDescricao());
			System.out.println("Preço: " + p.getPreco());
			System.out.println("Quantidade: " + p.getQuantidade());
			System.out.println("Código Fab: " + p.getFabricante().getCodigo());
			System.out.println("Descrição Fab: " + p.getFabricante().getDescricao());
			System.out.println("");
		}
	}
	
	//@Test
	public void excluir() throws SQLException{
		Produto p = new Produto();
		p.setCodigo(8L);
		ProdutoDAO dao = new ProdutoDAO();
		dao.excluir(p);
	}
	
	@Test
	public void editar() throws SQLException {
		Produto p = new Produto();
		p.setCodigo(2L);
		p.setDescricao("Novalgina 500 mlg");
		p.setPreco(2.5D);
		p.setQuantidade(10L);
		Fabricante f = new Fabricante();
		f.setCodigo(4L);
		p.setFabricante(f);
		ProdutoDAO dao = new ProdutoDAO();
		dao.editar(p);
	}
	
}



