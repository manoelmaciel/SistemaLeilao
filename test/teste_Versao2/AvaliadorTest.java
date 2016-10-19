/* 
 * Sistema Leilão - Versão 2.0 - Finalizado, 
 * Adaptado para o Tutorial
 * Por: Manoel Braz Maciel
 */

package teste_Versao2;
import junit.framework.Assert;

import org.junit.Test;

import fontes_Versao2.Avaliador;
import fontes_Versao2.Lance;
import fontes_Versao2.Leilao;
import fontes_Versao2.Usuario;

@SuppressWarnings("deprecation")
public class AvaliadorTest {

	@Test
	public void lancesOrdemCrescente() {
        
        Usuario user1 = new Usuario("User1");
        Usuario user2 = new Usuario("User2");
        Usuario user3 = new Usuario("User3");

        Leilao leilao = new Leilao("Playstation 3 Novo");

        leilao.propoe(new Lance(user1, 1100.0));
        leilao.propoe(new Lance(user2, 1200.0));
        leilao.propoe(new Lance(user3, 1300.0));        

        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);

        double maiorLanceEsperado = 1300.0;              
        Assert.assertEquals(leiloeiro.getMaiorLance(), maiorLanceEsperado);
        double menorLanceEsperado = 1100.0;              
        Assert.assertEquals(leiloeiro.getMenorLance(), menorLanceEsperado);
        
    }	
	
}





