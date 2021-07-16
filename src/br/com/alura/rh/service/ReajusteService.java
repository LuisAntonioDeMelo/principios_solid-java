package br.com.alura.rh.service;

import br.com.alura.rh.model.Funcionario;
import br.com.alura.rh.service.rules.ValidacaoReajuste;

import java.math.BigDecimal;
import java.util.List;

public class ReajusteService {

    private List<ValidacaoReajuste> validacoes;

    public ReajusteService() {}

    public ReajusteService(List<ValidacaoReajuste> validacoes) {
        this.validacoes = validacoes;
    }

    public void reajustarSalarioFuncionario(Funcionario funcionario, BigDecimal aumento){
        this.validacoes.forEach(v -> v.validar(funcionario,aumento));

        BigDecimal salarioAtualizado = funcionario.getSalario().add(aumento);
        funcionario.atualizarSalario(salarioAtualizado);
    }
}
