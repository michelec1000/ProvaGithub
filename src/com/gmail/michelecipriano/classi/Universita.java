package com.gmail.michelecipriano.classi;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

import com.gmail.michelecipriano.util.docenteNotFountExcception;

public class Universita {
	
private Universita(ArrayList<Corso> corsi, ArrayList<Docente> docenti) {
		
		this.corsi = corsi;
		this.docenti = docenti;
	}

public Universita(Scanner sc1 , Scanner sc2)
{
	Docente d = Docente.read(sc1);
	
	while(d!=null)
	{
		this.docenti.add(d);
		d = Docente.read(sc1);
	}
	
	Corso c = Corso.read(sc2);
	
	while(c!=null)
	{
		try
		{
			Docente doc = searchDocente(c.getCodiceFiscale());
			c.setDocente(doc);
			doc.addCorso(c);
			
			this.corsi.add(c);
		}
		catch(docenteNotFountExcception e)
		{
			System.out.println("docente non trovato");
			
		}
	
		c = Corso.read(sc2);
	}
}

public void print(PrintStream ps)
{
	for (Docente docen : docenti) {
		
		docen.print(ps);
		
	}
	
	for (Corso corso : corsi) {
		
		corso.print(ps);
	}
}


public Docente searchDocente(String codFisc)
{
	int i;
	Boolean flag = false;
	
	for(i=0; i <this.docenti.size(); i++)
	
	{
		if(this.docenti.get(i).getCodiceFiscale().equals(codFisc)) flag=true;
		
		if(flag) return this.docenti.get(i);
	}

	
	throw new docenteNotFountExcception();
	
}
public void printDocenteConCorsi(PrintStream ps)
{
	if(docenti.isEmpty() && corsi.isEmpty())
	{
		System.out.println("tutto vuoto");
	}
	else
	{
	for (Docente d : docenti) {
		d.print(ps);
		
		if(!(d.getArrayCorsi().isEmpty()))
		{
			for (Corso corso : d.getArrayCorsi()) {
				
				corso.print(ps);
			}
		}
		
	}
	}
}

public void printCorsoconDocente(PrintStream ps)
{
	if(docenti.isEmpty() && corsi.isEmpty())
	{
		System.out.println("tutto vuoto");
	}
	else
	{
		for (Corso corso : corsi) {
			
			corso.print(ps);
			
			System.out.println("stampa del suo docente");
			Docente d = corso.getDocente();
			
			d.print(ps);
		}
	}
}

public Universita filtroDocente(Predicate<Docente> doc)
{
	ArrayList<Docente> docenti = new ArrayList<>();
	for (Docente d : this.docenti) {
		
		if(doc.test(d))
		{
			docenti.add(d);
		}
	}
	this.docenti = docenti;
	
	return new Universita(corsi, docenti);
}

public Universita filtroCorso(Predicate<Corso> cor)
{
	ArrayList<Corso> corsi = new ArrayList<>();
	
	for (Corso corso : this.corsi) {
		
		if(cor.test(corso))
		{
			corsi.add(corso);
		}
	}
	this.corsi = corsi;
	
	return new Universita(corsi, docenti);
}

public Universita cercaCorsoPerCodice(String codice)
{
	CercaCorsoperCodice c = new CercaCorsoperCodice(codice);
	return filtroCorso(c);
}

public Universita cercaCorsoconCorsoLaurea(String laurea)

{
	CercaCorsoPerLaurea c = new CercaCorsoPerLaurea(laurea);
	return filtroCorso(c);
	
}

public Universita CercaDocPerCF(String codiceFiscale)
{
	CercaDocentePerCF c = new CercaDocentePerCF(codiceFiscale);
	return filtroDocente(c);
}

	private ArrayList<Corso> corsi = new ArrayList<>();
	private ArrayList<Docente> docenti = new ArrayList<>();
}
