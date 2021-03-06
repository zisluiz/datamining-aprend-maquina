package preprocessamento.regra;

import preprocessamento.model.Pagina;

public class TituloPossuiPalavraProject implements Regra {

	@Override
	public String getNome() {
		return "tituloPossuiPalavraProject";
	}

	@Override
	public String[] getPossibilidades() {
		return new String[] {"s", "n"};
	}

	@Override
	public String getValor(Pagina pagina) {
		return pagina.getOcorrenciasDePalavras().containsKey("!project") ? "s" : "n";
	}

}
