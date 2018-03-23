package Tarea2IF3000;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class testUsuarios {

static Usuarios  usuariosPrueba;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		usuariosPrueba = new Usuarios(null, null, null, null, 0) {};
	}

	@DisplayName("Probar getnombre después de setNombre")
	@Test
	void testSetGetnombre() {
		String nombre= "Juan";
		usuariosPrueba.setNombre(nombre);
	String retorno = usuariosPrueba.getNombre();
		assertEquals(nombre, retorno);
	}
}
