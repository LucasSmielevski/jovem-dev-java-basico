package avaliacao.semana2;

import java.util.Random;

import javax.swing.JOptionPane;

import avaliacao.semana2.Inimigos;
import avaliacao.semana2.exceptions.PersonagemDerrotadoException;

public abstract class Personagem {
	String nome;
	int maxHP;
	int hp;
	int ataque;
	int defesa;

	public Personagem(String nome, int maxHP, int hp, int ataque, int defesa) {
		super();
		this.nome = nome;
		this.maxHP = maxHP;
		this.hp = hp;
		this.ataque = ataque;
		this.defesa = defesa;
	}

	public String getNome() {
		return nome;
	}

	public int getMaxHP() {
		return maxHP;
	}

	public int getHp() {
		return hp;
	}

	public int getAtaque() {
		return ataque;
	}

	public int getDefesa() {
		return defesa;
	}

	public String Batalhar(Inimigos inimigo) {
		String msg = "";
		int hp = inimigo.getMaxHP();
		int hpPersonagem = this.getMaxHP();
		int dano = 0;
		int danoinimigo = 0;
		do {
			int ataque = atacar(inimigo);
			if (ataque > inimigo.defesa) {
				dano = ataque - inimigo.getDefesa();
				hp -= dano;
				try {
					if (hp <= 0) {
						throw new PersonagemDerrotadoException(inimigo.getNome() + " foi derrotado por " + this.nome + "\n");
					}else {
						msg +="A vida restante do inimigo é " + hp + "/" + inimigo.getMaxHP() + "\n";
						int ataqueInimigo = atacar(inimigo);
						if(ataqueInimigo > this.defesa) {
							danoinimigo = ataqueInimigo - this.defesa;
							hpPersonagem -= danoinimigo;
							try {
								if(hpPersonagem < 0) {
									throw new PersonagemDerrotadoException(this.nome + " foi derrotado por " + inimigo.getNome() + "\n");
								}else {
									msg +="A vida restante do Personagem é " + hpPersonagem + "/" + this.maxHP + "\n";
								}
							} catch (PersonagemDerrotadoException e) {
								msg += e.getMessage().toUpperCase();
							}
						}				
					}
				} catch (PersonagemDerrotadoException e) {
					msg+= e.getMessage();
				}
			} else {
				msg += "O ataque do " + this.nome + "Falhou ";
			}
		} while ( hpPersonagem > 0 && hp >0);
		return msg;		
 
	}

	public int atacar(Inimigos inimigo) {
			Random num = new Random();
			int dado = num.nextInt(6);
			int ataque = this.ataque + dado;
				
		return ataque;		
	}

}
