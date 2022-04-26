package br.com.projeto.dimotociclo.adapters.core.impl.model.nfe;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class emit {
	public double CNPJ;
	public String xNome;
	public enderEmit enderEmit;
	public int IE;
	public int CRT;
}
