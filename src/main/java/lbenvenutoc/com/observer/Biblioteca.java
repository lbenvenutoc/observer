package lbenvenutoc.com.observer;

public class Biblioteca {

	public void devuelveLibro(Libro libro) {
		if (libro.getEstado().equals("MALO")) {
			AlarmaLibro alarma = new AlarmaLibro();
			alarma.addObserver(new Compras());
			alarma.addObserver(new Administracion());
			alarma.addObserver(new Stock());
			alarma.disparaAlarma(libro);
		}
	}

}
