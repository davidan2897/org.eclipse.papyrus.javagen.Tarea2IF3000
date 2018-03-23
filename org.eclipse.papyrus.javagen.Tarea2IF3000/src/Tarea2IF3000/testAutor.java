package Tarea2IF3000;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class testAutor {

static Autor  autorPrueba;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		autorPrueba = new Autor(null, null, null, null, 0);
	}

	@DisplayName("Probar getnombre después de setNombre")
	@Test
	void testSetGetnombre() {
		String nombre= "Juan";
		autorPrueba.setNombre(nombre);
	String retorno = autorPrueba.getNombre();
		assertEquals(nombre, retorno);
	}

}
