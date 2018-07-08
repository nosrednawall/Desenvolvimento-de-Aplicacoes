package br.iel.desenvolvimento.aplicacoes.prova.controller;

import br.iel.desenvolvimento.aplicacoes.prova.entity.Planetas;

public class CalculaPeso {

	public float calcular(Float peso, Planetas planeta) {

		switch (planeta) {
		case Júpiter:
			return (float) ((peso / 10) * 2.64);
	
		case Marte:
			return (float) ((peso / 10) * 0.38);

		case Mercúrio:
			return (float) ((peso / 10) * 0.37);

		case Saturno:
			return (float) ((peso / 10) * 1.15);

		case Urano:
			return (float) ((peso / 10) * 1.17);

		case Vênus:
			return (float) ((peso / 10) * 0.88);
		}
		return peso;
	}
}
