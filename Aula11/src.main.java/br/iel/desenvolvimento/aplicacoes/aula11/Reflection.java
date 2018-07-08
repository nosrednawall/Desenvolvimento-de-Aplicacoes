package br.iel.desenvolvimento.aplicacoes.aula11;

import java.lang.reflect.Field;

public class Reflection {

	public static void main(String[] args) {
		
		Class<ObjetoReflection> novoObj = ObjetoReflection.class;
		
		for(Field atributo : novoObj.getDeclaredFields()) {
			System.out.println(atributo.getName());
		}
		
	}
	
}
