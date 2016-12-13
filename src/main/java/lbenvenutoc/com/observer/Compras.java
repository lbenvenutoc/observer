package lbenvenutoc.com.observer;

import java.util.Observable;
import java.util.Observer;

public class Compras implements Observer{

	public void update(Observable o, Object arg) {
		
		System.out.println(arg);
		System.out.print("Compras:");
		System.out.println("Solicito nueva cotización...");
		
	}

}
