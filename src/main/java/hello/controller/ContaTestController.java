package hello.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import hello.model.Conta;
import hello.repository.ContaRepository;

@Controller
@RequestMapping("/conta")
public class ContaTestController {

	@Autowired
	private ContaRepository contaRep;
	
	@PostMapping("/incluir")
	public @ResponseBody String incluir(@RequestBody Conta contaReq) {
		
		Conta conta = new Conta();
		conta = contaReq;
		conta.setDataHora(LocalDateTime.now());
		
		contaRep.save(conta);
		
		return "{\"sucess\": \"true\"}";
	}
	
}
