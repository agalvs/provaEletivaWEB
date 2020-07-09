package br.com.concessionaria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.concessionaria.model.Carro;

public interface CarroRepository extends JpaRepository<Carro, Long> {
	/*
	List<Carro> findByPlacaContainingIgnoreCase(String placa);
	
	List<Carro> findByFabricanteVeiculoContainingIgnoreCase(String fabricanteVeiculo);
	
	List<Carro> findByMarcaVeiculoContainingIgnoreCase(String marcaVeiculo);
	*/
	
	List<Carro> findByPlacaContainingIgnoreCaseAndFabricanteVeiculoContainingIgnoreCaseAndMarcaVeiculoContainingIgnoreCase(String placa, String fabricanteVeiculo, String marcaVeiculo);
}
