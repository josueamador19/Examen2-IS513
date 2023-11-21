package hn.unah.examen2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import hn.unah.examen2.modelos.Cliente;

public interface Clienterepository extends JpaRepository<Cliente, Integer> {

}
