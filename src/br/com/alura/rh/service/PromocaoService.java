package br.com.alura.rh.service;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

public class PromocaoService {

    public void promover(Funcionario funcionario, Boolean metaBatida) {
        if(Cargo.GERENTE == funcionario.getCargo()){
            throw new ValidacaoException("Gerentes não foram promovidos!");
        }
        if(metaBatida) {
            Cargo novoCargo = funcionario.getCargo().getProximoCargo();
            funcionario.promover(novoCargo);
        }else {
            throw new ValidacaoException("Funcionario não bateu a meta!");
        }
    }
}
