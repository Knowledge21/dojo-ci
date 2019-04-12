package br.com.k21;

import org.junit.Assert;
import org.junit.Test;

public class TestCalculadoraComissao {

	@Test
	public void teste_calcular_comissao_de_venda_5perc_menor_10k() {

		int venda = 5000;
		int comissao = 250;

		int retorno = CalculadoraComissao.calcular(venda);

		Assert.assertEquals(comissao, retorno);
	}

	@Test
	public void teste_calcular_comissao_de_venda_6perc_maior_10k() {

		int venda = 20000;
		int comissao = 1200;

		int retorno = CalculadoraComissao.calcular(venda);

		Assert.assertEquals(comissao, retorno);
	}

	@Test
	public void teste_calcular_comissao_de_venda_5perc_igual_10k() {

		int venda = 10000;
		int comissao = 500;

		int retorno = CalculadoraComissao.calcular(venda);

		Assert.assertEquals(comissao, retorno);
	}

	@Test
	public void teste_calcular_comissao_de_venda_5perc_55_59() {

		double venda = 55.59;
		double comissao = 2.77;

		double retorno = CalculadoraComissao.calcular(venda);

		Assert.assertEquals(comissao, retorno, 0);
	}

}