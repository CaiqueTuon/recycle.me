package com.recycleme.recycleme.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.recycleme.recycleme.model.Avaliacao;

@Repository
public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Long> {
	public List<Avaliacao>findAllByAvaliacao(Long avaliacao);
	
	@Query(value = "SELECT * FROM tb_avaliacoes WHERE avaliacao == 5", nativeQuery = true)
	public List<Avaliacao> findAllBylCassificacao();
}
