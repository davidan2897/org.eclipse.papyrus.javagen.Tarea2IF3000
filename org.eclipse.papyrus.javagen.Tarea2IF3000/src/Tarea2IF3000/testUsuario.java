package Tarea2IF3000;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class testUsuario {

static Usuario  usuarioPrueba;
	
	@BeforeAll
	static void usuarioPrueba() throws Exception {
		usuarioPrueba = new Usuario(null, null, null, null, 0);
	}

	@DisplayName("Probar getnombreUnico después de setnombreUnico")
	@Test
	void testSetGetnombreUnico() {
		String nombreUnico= "davidAn28";
		usuarioPrueba.setNombreUnico(nombreUnico);
	String retorno =usuarioPrueba.getNombreUnico();
		assertEquals(nombreUnico , retorno);

}
}