package com.gmail.michelecipriano.scenari;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.gmail.michelecipriano.classi.Corso;

public class TesterCorso {
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(new File("TuttiCorsi.txt"));
		Corso c = Corso.read(sc);
		c.print(System.err);
	}

	
}
