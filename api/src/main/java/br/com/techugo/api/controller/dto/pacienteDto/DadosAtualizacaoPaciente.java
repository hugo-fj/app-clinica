package br.com.techugo.api.controller.dto.pacienteDto;

import br.com.techugo.api.controller.dto.medicoDto.DadosEndereco;
import jakarta.validation.constraints.NotNull;
public record DadosAtualizacaoPaciente(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
