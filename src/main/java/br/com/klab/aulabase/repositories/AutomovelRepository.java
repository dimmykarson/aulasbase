package br.com.klab.aulabase.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.klab.aulabase.models.Automovel;

@Repository
public interface AutomovelRepository extends JpaRepository<Automovel, Long> {

}
