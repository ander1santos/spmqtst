package hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import hello.model.Usuario;
import hello.repository.UsuarioRepository;

@Controller
@RequestMapping("/demo")
public class MainController {
	
	@Autowired
	private UsuarioRepository userRep;
	
	@GetMapping(path="/incluir")
	public @ResponseBody String adicionarUsuario (@RequestParam String nome, @RequestParam String email) {
		
		Usuario user = new Usuario();
		user.setNome(nome);
		user.setEmail(email);
		
		userRep.save(user);
		
		return "Usuario adicionado";
	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<Usuario> listarTodosUsuarios(){
		return userRep.findAll();
	}
	
	

}
