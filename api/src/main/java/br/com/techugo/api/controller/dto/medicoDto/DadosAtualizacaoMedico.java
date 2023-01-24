package br.com.techugo.api.controller.dto.medicoDto;

public record DadosAtualizacaoMedico(

        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
