package br.com.desafio.repository;

import java.math.BigInteger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.desafio.entity.Associado;

@Repository
public interface AssociadoRepository extends JpaRepository<Associado, BigInteger> {

}
