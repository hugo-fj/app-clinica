package br.com.techugo.api.controller.dto.medicoDto;

import br.com.techugo.api.enumeration.Especialidade;
import br.com.techugo.api.model.Endereco;
import br.com.techugo.api.model.Medico;
public record DadosDetalhamentoMedico(Long id,
                                      String nome,
                                      String email,
                                      String crm,
                                      String telefone,
                                      Especialidade especialidade,
                                      Endereco endereco) {
    public DadosDetalhamentoMedico(Medico medico){
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(),medico.getTelefone(), medico.getEspecialidade(), medico.getEndereco());
    }
}
