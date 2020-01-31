package com.gmail.michelecipriano.classi;

import java.util.function.Predicate;

public class CercaCorsoperCodice implements Predicate<Corso>{
	
	
public CercaCorsoperCodice(String codice) {
		super();
		this.codice = codice;
	}

public boolean test(Corso c)
{
	if(c.getCodiceCorso().equals(codice)) return true;
	
	return false;
}

	private String codice;
}
