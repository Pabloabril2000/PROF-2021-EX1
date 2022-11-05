package es.upm.grise.profundizacion.control_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LibraryTest {

	@Test
	public void addTwoBookTest() {
		Library library = new Library();
		Book libro1 = new Book("Blancanieves");
		Book libro2 = new Book("Blancanieves");
		assertThrows(DuplicatedBookException.class,()->{library.addBook(libro1); library.addBook(libro2);},"Libro duplicado");
	}
	
	@Test
	public void eliminarLibroListaVacia() {
		Library library = new Library();
		assertThrows(EmptyLibraryException.class,()->library.getBook("Blancanieves"));
	}
	
	@Test
	public void test() {
		fail("Esto tiene que falla");
	}

}
