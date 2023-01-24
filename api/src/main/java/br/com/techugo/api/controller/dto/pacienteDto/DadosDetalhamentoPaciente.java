package br.com.techugo.api.controller.dto.pacienteDto;

import br.com.techugo.api.model.Endereco;
import br.com.techugo.api.model.Paciente;

public record DadosDetalhamentoPaciente(Long id, String nome, String email, String cpf, String telefone, Endereco endereco) {

    public DadosDetalhamentoPaciente(Paciente paciente) {
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getCpf(), paciente.getTelefone(), paciente.getEndereco());
    }
}