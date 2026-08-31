package br.com.fiap.aluno_cadastro.repository;

import br.com.fiap.aluno_cadastro.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
