package br.com.concessionaria.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.concessionaria.model.Carro;
import br.com.concessionaria.repository.CarroRepository;

@Controller
public class CarroController {

	@Autowired
	private CarroRepository carroRepository;
	
	@GetMapping("/cadastro")
	public String cadastroForm(Model model) {
		model.addAttribute("carro", new Carro());
		model.addAttribute("pesquisa", new Carro());
		return "cadastro";
	}

	@PostMapping("/cadastro")
	public String cadastroSubmit(@ModelAttribute Carro carro, Model model) {
		model.addAttribute("carro", carro);
		carroRepository.save(carro);
		model.addAttribute("carros", carroRepository.findAll());
		return "resultado";
	}
	
	@GetMapping("/resultado")
	public String tabelaGet(Model model) {
		model.addAttribute("carros", carroRepository.findAll());
		return "resultado";
	}
	
	@GetMapping("/resultado/placa")
	public String pesquisaGetPlaca(@ModelAttribute Carro pesquisa, Model model) {
		model.addAttribute("pesquisa", pesquisa);
		model.addAttribute("carros", carroRepository.findByPlacaContainingIgnoreCase(pesquisa.getPlaca()));
		return "resultado";
	}
	
	@GetMapping("/resultado/fabricante")
	public String pesquisaGetFabricante(@ModelAttribute Carro pesquisa, Model model) {
		model.addAttribute("pesquisa", pesquisa);
		model.addAttribute("carros", carroRepository.findByFabricanteVeiculoContainingIgnoreCase(pesquisa.getFabricanteVeiculo()));
		return "resultado";
	}
	
	@GetMapping("/resultado/marca")
	public String pesquisaGetMarca(@ModelAttribute Carro pesquisa, Model model) {
		model.addAttribute("pesquisa", pesquisa);
		model.addAttribute("carros", carroRepository.findByMarcaVeiculoContainingIgnoreCase(pesquisa.getMarcaVeiculo()));
		return "resultado";
	}
}
