package Juego.Logica;

import Juego.Entidades.Enemigo;
import Juego.Entidades.Proyectil;
import Juego.Graficos.RecursosExternos;
import Juego.Graficos.VentanaPrincipal;
import Juego.Utils.Angulo;
import Juego.Utils.Circulo;
import Juego.Utils.Punto;

public class Partida {
	

	public Partida() {
		
		
		
	}
	
	
    public void iniciarPartida() {
    Mapa mapa = new Mapa();

	Enemigo enemigo1 = new Enemigo(new Circulo(new Punto(500, -50), 20), 100, 25, new Angulo(90),
			new Proyectil(new Circulo(new Punto(20, 20), 1), 1,RecursosExternos.laser),RecursosExternos.player);
	
	Enemigo enemigo2 = new Enemigo(new Circulo(new Punto(500, 200), 20), 100, 25, new Angulo(270),
			new Proyectil(new Circulo(new Punto(20, 20), 1), 1,RecursosExternos.laser),RecursosExternos.player);
	
	Enemigo enemigo3 = new Enemigo(new Circulo(new Punto(500, 600), 25), 40, 25, new Angulo(180),
			new Proyectil(new Circulo(new Punto(20, 20), 1), 1,RecursosExternos.laser),RecursosExternos.player);
	
	Enemigo jefe = new Enemigo(new Circulo(new Punto(500, 450), 5), 1000, 25, new Angulo(0),
			new Proyectil(new Circulo(new Punto(20, 20), 1), 1,RecursosExternos.laser),RecursosExternos.player);
	
    VentanaPrincipal ventana= new VentanaPrincipal(mapa);
    ventana.iniciar();
	
    mapa.aniadirEnemigos(6, enemigo1);
	
	mapa.aniadirEnemigos(2, enemigo2);
	mapa.aniadirEnemigos(3, enemigo3);
	mapa.aniadirEnemigos(1, jefe);
	
	mapa.ataqueEnemigo();
    
    
   }
    public static void main(String[] args) {
		Partida partida = new Partida();
		partida.iniciarPartida();
	}
    
    
	
}