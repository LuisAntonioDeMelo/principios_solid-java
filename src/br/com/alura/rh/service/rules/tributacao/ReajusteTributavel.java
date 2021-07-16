package br.com.alura.rh.service.rules.tributacao;

import java.math.BigDecimal;

public interface ReajusteTributavel  extends Reajuste {

    BigDecimal valorImpostoDeRenda();
}
