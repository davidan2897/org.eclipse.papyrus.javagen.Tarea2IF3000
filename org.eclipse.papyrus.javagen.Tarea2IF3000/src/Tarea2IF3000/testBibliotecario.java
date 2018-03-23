package Tarea2IF3000;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class testBibliotecario {
static Usuarios  bibliotecarioPrueba;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		bibliotecarioPrueba = new Bibliotecario(null, null, null, null, 0);
	}

	@DisplayName("Probar getTipoIdentificacion después de setTipoIdentificacion")
	@Test
	void testSetGetnombre() {
		String tipoIdentificacion= "Cedula";
		bibliotecarioPrueba.setTipoIdentificacion(tipoIdentificacion);
	String retorno =bibliotecarioPrueba.getTipoIdentificacion();
		assertEquals(tipoIdentificacion , retorno);
	}
}
