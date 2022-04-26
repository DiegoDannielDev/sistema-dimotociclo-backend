package br.com.projeto.dimotociclo.adapters.core.impl.model.nfe;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class dest {
	public double CNPJ;
	public String xNome;
	public enderDest enderDest;
	public int indIEDest;
	public int IE;
	public String email;
}
