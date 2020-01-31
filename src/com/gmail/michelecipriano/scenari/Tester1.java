package com.gmail.michelecipriano.scenari;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.gmail.michelecipriano.classi.Universita;


//dato il codice fiscale di un docente restituisca l'elenco dei suoi corsi erogati
public class Tester1 {

	public static void main(String[] args) throws FileNotFoundException {
	
		Scanner sc1 = new Scanner(new File("TuttiDocenti.txt"));
		Scanner sc2 = new Scanner(new File("TuttiCorsi.txt"));
		
		Universita u = new Universita(sc1, sc2);
		
	//	u.print(System.err);

    // u.printDocenteConCorsi(System.out);
		
		// u.printCorsoconDocente(System.out);
		
		String codF = "CPRMHL94P08";
		
		u.CercaDocPerCF(codF);
		
		u.printDocenteConCorsi(System.out);
	}

}
