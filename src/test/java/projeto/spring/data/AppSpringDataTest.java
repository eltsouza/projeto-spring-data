package projeto.spring.data;

import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import projeto.spring.data.dao.InterfaceSpringDataUser;
import projeto.spring.data.dao.InterfaceTelefone;
import projeto.spring.data.model.Telefone;
import projeto.spring.data.model.UsuarioSpringData;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:META-INF/spring-config.xml" })
public class AppSpringDataTest {
	
	@Autowired
	private InterfaceSpringDataUser interfaceSpringDataUser;
	
	@Autowired
	private InterfaceTelefone interfaceTelefone;
	
	
	@Test
	public void testeConsulta() {
	
		Optional<UsuarioSpringData> usuarioSpringData = interfaceSpringDataUser.findById(2L);
	
		System.out.println(usuarioSpringData.toString());
		
		for (Telefone telefone : usuarioSpringData.get().getTelefones()){
			 System.out.println(telefone.getNumero());
			 System.out.println(telefone.getTipo());
			 System.out.println(telefone.getId());
			 System.out.println(telefone.getUsuarioSpringData().getNome());
			 System.out.println("-----------------------------------------");
		}		
	
	}
	/*	@Test
	public void testeInsert() {

		UsuarioSpringData usuarioSpringData = new UsuarioSpringData();

		usuarioSpringData.setEmail("javaavancado@javaavancado.com");
		usuarioSpringData.setIdade(34);
		usuarioSpringData.setLogin("java");
		usuarioSpringData.setSenha("123");
		usuarioSpringData.setNome("Java SpringData");

		interfaceSpringDataUser.save(usuarioSpringData);

		System.out.println("Usuario cadastrado -> " + interfaceSpringDataUser.count());		
	}

	@Test
	public void testeConsulaTodos() {
		Iterable<UsuarioSpringData> lista = interfaceSpringDataUser.findAll();

		for (UsuarioSpringData usuarioSpringData : lista) {

			System.out.println(usuarioSpringData.toString());

			System.out.println("---------------------------------------------------");
		}
	}
	
	@Test
	public void testeUpdate() {

		Optional<UsuarioSpringData> usuarioSpringData = interfaceSpringDataUser.findById(5L);

		UsuarioSpringData data = usuarioSpringData.get();

		data.setNome("Alex Egidio Update Spring Data");
		data.setIdade(25);

		interfaceSpringDataUser.save(data);
	}

	@Test
	public void testeDelete() {
		Optional<UsuarioSpringData> usuarioSpringData = interfaceSpringDataUser.findById(6L);

		interfaceSpringDataUser.delete(usuarioSpringData.get());
	}
	
	
	@Test
	public void testeConsultaNome() {

		List<UsuarioSpringData> list = interfaceSpringDataUser.buscaPorNome("Alex");

		System.out.println("-- METODO BUSCA POR NOME --");

		for (UsuarioSpringData usuarioSpringData : list) {

			System.out.println(usuarioSpringData.toString());

			System.out.println("---------------------------------------------------");
		}
	}	
	
	@Test
	public void testeConsultaNomeParam() {

		System.out.println("-- METODO BUSCA POR PARAM --");

		UsuarioSpringData usuarioSpringData = interfaceSpringDataUser.buscaPorNomeParam("Egidio Alex");

		System.out.println(usuarioSpringData.toString());

		System.out.println("---------------------------------------------------");
	}

	@Test
	public void testeDeletePorNome(){
		interfaceSpringDataUser.deletePorNome("Java SpringData"); 
	}
	
	@Test
	public void testeUpdateEmailPorNome(){
		
		interfaceSpringDataUser.updateEmailPorNome("atualizandocondicional@javaavancado.com", "Alex Egidio Update Spring Data");
		
	}
	
	@Test
	public void testeInsertTelefone(){
		
		Optional<UsuarioSpringData> usuarioSpringData = interfaceSpringDataUser.findById(2L);
		
		Telefone telefone = new Telefone();
		telefone.setTipo("Celular");
		telefone.setNumero("312321332432");
		telefone.setUsuarioSpringData(usuarioSpringData.get());
		
		interfaceTelefone.save(telefone);
	}	*/
}
