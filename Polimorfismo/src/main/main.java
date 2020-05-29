package main;

import model.Cachorro;
import model.Cavalo;
import model.Preguica;
import model.Veterinario;

public class main {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		Veterinario veterinario = new Veterinario();
		
		cachorro.setNome("luck");
		cachorro.setIdade(10);
		cachorro.emitirSom();
		cachorro.correr();
		System.out.println("\n------------------------\n");
		cavalo.setNome("Pé de Pano");
		cavalo.setIdade(10);
		cavalo.emitirSom();
		cavalo.correr();
		System.out.println("\n------------------------\n");
		preguica.setNome("Tarzan");
		preguica.setIdade(7);
		preguica.emitirSom();
		preguica.subirArvore();
		System.out.println("\n------------------------\n");
		veterinario.examinar(cachorro);
		System.out.println("\n------------------------\n");
		veterinario.examinar(cavalo);
		System.out.println("\n------------------------\n");
		veterinario.examinar(preguica);
	}
}