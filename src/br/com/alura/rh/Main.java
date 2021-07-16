package br.com.alura.rh;

import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;
import br.com.alura.rh.service.PromocaoService;
import br.com.alura.rh.service.ReajusteService;

import java.math.BigDecimal;

public class Main {

    public static  void main(String[] args) {
        Funcionario f = new Funcionario("Luis Antonio","042.523.961-66", Cargo.GERENTE,new BigDecimal(4000));
        Funcionario f2 = new Funcionario("Jon no","042.523.961-66", Cargo.ASSISTENTE,new BigDecimal(2000));

        PromocaoService promocaoService = new PromocaoService();
        ReajusteService reajusteService = new ReajusteService();

        promocaoService.promover(f,true);
        reajusteService.reajustarSalarioFuncionario(f2, new BigDecimal("3000.0"));

        System.out.println(f.getSalario() +"@ > "+ f.getDataUltimoReajuste());
    }
}
