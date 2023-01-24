package br.com.techugo.api.controller.dto.medicoDto;

import br.com.techugo.api.enumeration.Especialidade;
import br.com.techugo.api.model.Medico;

public record DadosListagemMedico(
        Long id,

        String nome,
        String email,
        String crm,
        Especialidade especialidade
) {
    public DadosListagemMedico(Medico medico){
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());

    }
}
