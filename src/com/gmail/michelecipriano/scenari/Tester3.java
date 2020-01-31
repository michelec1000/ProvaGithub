package com.gmail.michelecipriano.scenari;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.gmail.michelecipriano.classi.Universita;

//dato il nome di un corso di laurea restituisca l'elenco di tutti i corsi erogati nell'ambito
//di tale corso di laurea, ognuno con il relativo docente
public class Tester3 {
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc1 = new Scanner(new File("TuttiDocenti.txt"));
		Scanner sc2 = new Scanner(new File("TuttiCorsi.txt"));
		
		Universita u = new Universita(sc1, sc2);
		
		String laurea = "Ingneria informatica";
		
		u.cercaCorsoconCorsoLaurea(laurea);
		
		u.printCorsoconDocente(System.out);
	}

}
