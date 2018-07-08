import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Writer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Arquivo {

	public static void gravarBinario(String arquivo) {

		try {

			File file = new File(arquivo);
			System.out.println("-" + arquivo);
			FileOutputStream fileO = new FileOutputStream(file);
			ObjectOutputStream objetoO = new ObjectOutputStream(fileO);

			Aluno aluno = new Aluno();
			aluno.setAg(909090909);
			aluno.setNome("jose");

			objetoO.writeObject(aluno);

			objetoO.flush();
			objetoO.close();

		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] ARQUIVO NÃO ENCONTRADO");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] ERRO AO TENTAR LER O ARQUIVO");
			e.printStackTrace();
		}

	}

	public static void gravarXml(String arquivo) {
		try {

			File file = new File(arquivo);
			FileOutputStream fileO = new FileOutputStream(file);
			XMLEncoder objetoO = new XMLEncoder(fileO);

			Aluno aluno = new Aluno();
			aluno.setAg(111111);
			aluno.setNome("testexml");

			objetoO.writeObject(aluno);

			objetoO.flush();
			objetoO.close();

		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] ARQUIVO NÃO ENCONTRADO");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] ERRO AO TENTAR LER O ARQUIVO");
			e.printStackTrace();
		}

	}

	public static void gravarJSon(String arquivo) {

		try {

			Writer writer = new FileWriter(arquivo);

			Gson gson = new GsonBuilder().create();
			Aluno alunos[] = new Aluno[2];

			Aluno aluno = new Aluno();
			aluno.setAg(111111);
			aluno.setNome("json");

			Aluno aluno2 = new Aluno();
			aluno.setAg(22222);
			aluno.setNome("json 2");

			alunos[0] = aluno;
			alunos[1] = aluno2;

			gson.toJson(aluno, writer);

			writer.close();
		} catch (IOException e) {
			System.out.println("[ERROR] ERRO AO TENTAR LER O ARQUIVO");
			e.printStackTrace();
		}

	}

	public static String LerBinario(String arquivo) {
		File file = new File(arquivo);

		try {
			FileInputStream fileO = new FileInputStream(file);
			ObjectInputStream objetoO = new ObjectInputStream(fileO);

			Aluno aluno = new Aluno();
			aluno = (Aluno) objetoO.readObject();

			objetoO.close();
			return (aluno.getAg() + " " + aluno.getNome());

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "erro";

	}

	public static String lerXml(String arquivo) {

		File file = new File(arquivo);

		try {
			FileInputStream fileO = new FileInputStream(file);
			ObjectInputStream objetoO = new ObjectInputStream(fileO);
			XMLDecoder decodificador = new XMLDecoder(objetoO);
			Aluno aluno = new Aluno();
			aluno = (Aluno) decodificador.readObject();

			objetoO.close();
			return (aluno.getAg() + " " + aluno.getNome());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		}

		return "erro";

	}

}
