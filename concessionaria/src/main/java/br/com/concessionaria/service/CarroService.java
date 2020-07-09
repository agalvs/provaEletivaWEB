package br.com.concessionaria.service;

import br.com.concessionaria.repository.CarroRepository;

import java.util.List;

import br.com.concessionaria.model.Carro;

public class CarroService {
	
	private CarroRepository repository;
	
	public void save(Carro carro) {
		repository.save(carro);		
	}
	
	public Carro findById(long id) {
		return repository.findById(id).orElse(null);
	}
	
	public List<Carro> findAll() {
		return repository.findAll();
	}
	
	public void saveAll(List<Carro> carros) {
		repository.saveAll(carros);
	}
	/*
	public List<Carro> findByPlaca(Carro carro) {
		return repository.findByPlacaContainingIgnoreCase(carro.getPlaca());
	}
	
	public List<Carro> findByFabricanteVeiculo(Carro carro) {
		return repository.findByFabricanteVeiculoContainingIgnoreCase(carro.getFabricanteVeiculo());
	}
	
	public List<Carro> findByMarcaVeiculo(Carro carro) {
		return repository.findByMarcaVeiculoContainingIgnoreCase(carro.getMarcaVeiculo());
	}
	*/
	
	public List<Carro> findByPlacaAndFabricanteVeiculoAndMarcaVeiculo(Carro carro) {
		return repository.findByPlacaContainingIgnoreCaseAndFabricanteVeiculoContainingIgnoreCaseAndMarcaVeiculoContainingIgnoreCase(carro.getPlaca(), carro.getFabricanteVeiculo(), carro.getMarcaVeiculo());
	}
	
}
