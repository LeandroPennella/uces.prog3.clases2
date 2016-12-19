package main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import aeropuertos.Aeropuerto;

public class Main {

	public static void main(String[] args) {

		/* El tipo del mapa es la clave(String) y el valor(Aeropuerto) */
		//Map<String, Aeropuerto> mapa = new TreeMap<String, Aeropuerto>(); //Lo mantiene ordenado
		Map<String, Aeropuerto> mapa = new HashMap<String, Aeropuerto>();

		/* El código de tres letras de los aeropuertos se llama codigo IATA */
		mapa.put("BRJ", new Aeropuerto("Barajas"));
		mapa.put("MDQ", new Aeropuerto("Mar del Plata"));
		mapa.put("EZE", new Aeropuerto("Ezeiza"));
		mapa.put("EST", new Aeropuerto("Estambul"));
		mapa.put("LAX", new Aeropuerto("Los Angeles"));

		/* mapa.keySet me devuelve un Set y lo puedo guardar en un set */
		/* Set<String> s = mapa.keySet(); */

		Iterator<String> i1 = mapa.keySet().iterator(); /*
														 * Obtengo el iterator
														 * de mi keySet
														 */

		while (i1.hasNext()) {

			String key = i1.next(); /* Obtengo la key */
			Aeropuerto a = mapa.get(key); /* Uso la key para acceder al valor */
			System.out.println(key + " " + a); /* Muestro el valor */

		}

	}

}
