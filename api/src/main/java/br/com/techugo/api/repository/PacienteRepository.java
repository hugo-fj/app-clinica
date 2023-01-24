package br.com.techugo.api.repository;

import br.com.techugo.api.model.Medico;
import br.com.techugo.api.model.Paciente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente,Long>{
    Page<Paciente> findAllByAtivoTrue(Pageable paginacao);
}
