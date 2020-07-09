package br.com.concessionaria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.concessionaria.model.Carro;

public interface CarroRepository extends JpaRepository<Carro, Long> {
	
	List<Carro> findByPlacaContainingIgnoreCaseAndFabricanteVeiculoContainingIgnoreCaseAndMarcaVeiculoContainingIgnoreCase(String placa, String fabricanteVeiculo, String marcaVeiculo);
}
