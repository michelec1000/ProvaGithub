package com.gmail.michelecipriano.scenari;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.gmail.michelecipriano.classi.Universita;

//Dato il codice di un corso restituisca i dati del docente

public class Tester2 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
	Scanner sc1 = new Scanner(new File("TuttiDocenti.txt"));
	Scanner sc2 = new Scanner(new File("TuttiCorsi.txt"));
	
	Universita u = new Universita(sc1, sc2);
	
	String codice = "m89";
	u.cercaCorsoPerCodice(codice);
	
	u.printCorsoconDocente(System.out);

	}
}
