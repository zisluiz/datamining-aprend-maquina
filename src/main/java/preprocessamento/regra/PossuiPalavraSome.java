package preprocessamento.regra;

import preprocessamento.model.Pagina;

public class PossuiPalavraSome implements Regra {

	@Override
	public String getNome() {
		return "possuiPalavraSome";
	}

	@Override
	public String[] getPossibilidades() {
		return new String[] {"s", "n"};
	}

	@Override
	public String getValor(Pagina pagina) {
		return pagina.getOcorrenciasDePalavras().containsKey("some") ? "s" : "n";
	}

	@Override
	public boolean ative() {
		return false;
	}
}
