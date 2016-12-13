package lbenvenutoc.com.observer;

import java.util.Observable;

public class AlarmaLibro extends Observable {

	public void disparaAlarma(Libro libro) {
		setChanged();
		notifyObservers("Rompieron el libro: " + libro.getTitulo());
	}

}
