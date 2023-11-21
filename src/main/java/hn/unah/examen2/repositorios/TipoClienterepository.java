package hn.unah.examen2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.examen2.modelos.TipoCliente;

public interface TipoClienterepository extends JpaRepository<TipoCliente, Integer> {

}
