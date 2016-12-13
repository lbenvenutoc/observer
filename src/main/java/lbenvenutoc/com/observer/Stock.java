package lbenvenutoc.com.observer;

import java.util.Observable;
import java.util.Observer;

public class Stock implements Observer {

	public void update(Observable o, Object arg) {

		System.out.println(arg);
		System.out.print("Stock:");
		System.out.println("Le doy de baja...");

	}

}
