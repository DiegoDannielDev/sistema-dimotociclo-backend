package br.com.projeto.dimotociclo.domain.model.nfe;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ICMSTot {
    public String vBC;
    public String vICMS;
    public String vICMSDeson;
    public String vFCP;
    public String vBCST;
    public String vST;
    public String vFCPST;
    public String vFCPSTRet;
    public String vProd;
    public String vFrete;
    public String vSeg;
    public String vDesc;
    public String vII;
    public String vIPI;
    public String vIPIDevol;
    public String vPIS;
    public String vCOFINS;
    public String vOutro;
    public String vNF;
    public String vTotTrib;
}
