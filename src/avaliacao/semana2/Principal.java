package avaliacao.semana2;

import java.util.ArrayList;
import java.util.List;

import avaliacao.semana2.Inimigos;

public class Principal {
	
	public static void main(String[] args) {
		new Principal();
	}
	
	public Principal() {
		List<Inimigos> inimigos = new ArrayList<Inimigos>();
 		Personagem mago = new Personagem("Mago",30,30,18,23) {
		};
		Personagem barbaro = new Personagem("Barbaro",100,100,20,18) {
		};
		Personagem paladino = new Personagem("Paladino",50,50,20,19) {
		};
		
		inimigos.add(new Inimigos("Morcegao", 10, 10, 5, 5));
		inimigos.add(new Inimigos("Zumbi", 22, 22, 6, 6));
		inimigos.add(new Inimigos("Urso", 30, 30, 8, 9));
		inimigos.add(new Inimigos("Vampiro", 35, 35, 10, 10));
		inimigos.add(new Inimigos("Arok, Mestre Supremo", 50, 50, 20, 20));
		
		//BARBARO
		System.out.println(barbaro.Batalhar(inimigos.get(0)));
		System.out.println(barbaro.Batalhar(inimigos.get(1)));
		System.out.println(barbaro.Batalhar(inimigos.get(2)));
		System.out.println(barbaro.Batalhar(inimigos.get(3)));
		System.out.println(barbaro.Batalhar(inimigos.get(4)));
		
		//MAGO
		System.out.println(mago.Batalhar(inimigos.get(0)));
		System.out.println(mago.Batalhar(inimigos.get(1)));
		System.out.println(mago.Batalhar(inimigos.get(2)));
		System.out.println(mago.Batalhar(inimigos.get(3)));
		System.out.println(mago.Batalhar(inimigos.get(4)));
		
		//PALADINO
		System.out.println(paladino.Batalhar(inimigos.get(0)));
		System.out.println(paladino.Batalhar(inimigos.get(1)));
		System.out.println(paladino.Batalhar(inimigos.get(2)));
		System.out.println(paladino.Batalhar(inimigos.get(3)));
		System.out.println(paladino.Batalhar(inimigos.get(4)));
	}
	

	
	
}
