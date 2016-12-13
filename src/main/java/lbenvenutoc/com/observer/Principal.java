package lbenvenutoc.com.observer;

public class Principal {
	public static void main(String[] args) {

		Libro libro = new Libro();
		libro.setTitulo("Windows 7");
		libro.setEstado("MALO");

		Biblioteca biblioteca = new Biblioteca();
		biblioteca.devuelveLibro(libro);
	}
}
