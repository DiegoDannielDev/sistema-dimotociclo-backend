package br.com.projeto.dimotociclo.adapters.core.impl.model.nfe;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class COFINSAliq {
	public int CST;
	public double vBC;
	public Date pCOFINS;
	public double vCOFINS;
}
