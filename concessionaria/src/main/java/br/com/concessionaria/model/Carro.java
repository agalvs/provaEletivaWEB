package br.com.concessionaria.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Carro {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "placa", nullable = false, unique = true)
	private String placa;

	@Column(name = "fabricante_veiculo", nullable = false)
	private String fabricanteVeiculo;

	@Column(name = "marca_veiculo", nullable = false)
	private String marcaVeiculo;

	@Column(name = "ano_fabricacao", nullable = false)
	private String anoFabricacao;

	@Column(name = "ano_modelo", nullable = false)
	private String anoModelo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getFabricanteVeiculo() {
		return fabricanteVeiculo;
	}

	public void setFabricanteVeiculo(String fabricanteVeiculo) {
		this.fabricanteVeiculo = fabricanteVeiculo;
	}

	public String getMarcaVeiculo() {
		return marcaVeiculo;
	}

	public void setMarcaVeiculo(String marcaVeiculo) {
		this.marcaVeiculo = marcaVeiculo;
	}

	public String getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public String getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(String anoModelo) {
		this.anoModelo = anoModelo;
	}

}
