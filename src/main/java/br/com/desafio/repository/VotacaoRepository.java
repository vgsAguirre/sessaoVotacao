package br.com.desafio.repository;

import java.math.BigInteger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.desafio.entity.Pauta;

@Repository
public interface VotacaoRepository extends JpaRepository<Pauta, BigInteger>{

}
