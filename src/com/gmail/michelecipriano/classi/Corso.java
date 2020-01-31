package com.gmail.michelecipriano.classi;
import java.io.PrintStream;
import java.util.Scanner;

public class Corso {
	
	public Corso(String codiceFiscale, String codiceCorso, String nomeCorso, String corsoLaurea, String descrizione) {
		this.codiceFiscale = codiceFiscale;
		this.codiceCorso = codiceCorso;
		this.nomeCorso = nomeCorso;
		this.corsoLaurea = corsoLaurea;
		this.descrizione = descrizione;
		this.docen = null;
	}
	
	
	
	
	
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	public String getCodiceCorso() {
		return codiceCorso;
	}
	public String getNomeCorso() {
		return nomeCorso;
	}
	public String getCorsoLaurea() {
		return corsoLaurea;
	}
	public String getDescrizione() {
		return descrizione;
	}
	
	public Docente getDocente()
	{
		return this.docen;
		
	}
	
	public void setDocente(Docente d)
	{
		this.docen = d;
	}


	public static Corso read(Scanner sc)
	{
		
		if(!sc.hasNextLine()) return null;
		String codicefiscale = sc.nextLine();
		if(!sc.hasNextLine()) return null;
		String codice = sc.nextLine();
		if(!sc.hasNextLine()) return null;
		String nome = sc.nextLine();
		if(!sc.hasNextLine()) return null;
		String corsoL = sc.nextLine();
		if(!sc.hasNextLine()) return null;
		String descr = sc.nextLine();
		
		return new Corso(codicefiscale, codice, nome, corsoL, descr);
		
	}
	
public void print(PrintStream ps)
{
	ps.println(codiceFiscale);
	ps.println(codiceCorso);
	ps.println(nomeCorso);
	ps.println(corsoLaurea);
	ps.println(descrizione);
}

	private String codiceFiscale;
	private String codiceCorso;
	private String nomeCorso;
	private String corsoLaurea;
	private String descrizione;
	private Docente docen;
}
