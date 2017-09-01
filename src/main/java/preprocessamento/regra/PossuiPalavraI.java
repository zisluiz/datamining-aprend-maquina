package preprocessamento.regra;

import preprocessamento.model.Pagina;

public class PossuiPalavraI implements Regra {

	@Override
	public String getNome() {
		return "possuiPalavraI";
	}

	@Override
	public String[] getPossibilidades() {
		return new String[] {"s", "n"};
	}

	@Override
	public String getValor(Pagina pagina) {
		return pagina.getOcorrenciasDePalavras().containsKey("i") ? "s" : "n";
	}

}
