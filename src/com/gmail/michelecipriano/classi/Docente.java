package com.gmail.michelecipriano.classi;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Docente {
	
	public Docente(String codiceFiscale, String nome, String cognome, String data, String fascia,
			String raggruppamento) {
		
		this.codiceFiscale = codiceFiscale;
		this.nome = nome;
		this.cognome = cognome;
		this.data = data;
		this.fascia = fascia;
		this.raggruppamento = raggruppamento;
		this.corsi = new ArrayList<>();
	}
	
	
	public String getRaggruppamento() {
		return raggruppamento;
	}
	public void setRaggruppamento(String raggruppamento) {
		this.raggruppamento = raggruppamento;
	}
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	public String getNome() {
		return nome;
	}
	public String getCognome() {
		return cognome;
	}
	public String getData() {
		return data;
	}
	public String getFascia() {
		return fascia;
	}
	
	public ArrayList<Corso> getArrayCorsi()
	{
		return this.corsi;
	}

	public void addCorso(Corso c)
	{
		if(c!=null)
		{
			this.corsi.add(c);
		}
	}
	
	public static Docente read(Scanner sc)
	{
		
		if(!sc.hasNextLine()) return null;
		String codicefiscale = sc.nextLine();
		if(!sc.hasNextLine()) return null;
		String nome = sc.nextLine();
		if(!sc.hasNextLine()) return null;
		String cognome = sc.nextLine();
		if(!sc.hasNextLine()) return null;
		String data = sc.nextLine();
		if(!sc.hasNextLine()) return null;
		String fascia = sc.nextLine();
		if(!sc.hasNextLine()) return null;
		String ragr = sc.nextLine();
		
		return new Docente(codicefiscale, nome, cognome, data, fascia, ragr);
		
	}
	
	public void print(PrintStream ps)
	{
		ps.println(codiceFiscale);
		ps.println(nome);
		ps.println(cognome);
		ps.println(data);
		ps.println(fascia);
		ps.println(raggruppamento);
		
	}

	private String codiceFiscale;
	private String nome;
	private String cognome;
	private String data;
	private String fascia;
	private String raggruppamento;
	private ArrayList<Corso> corsi = new ArrayList<>();
}
