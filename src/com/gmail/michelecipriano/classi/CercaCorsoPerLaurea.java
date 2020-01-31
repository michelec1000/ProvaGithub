package com.gmail.michelecipriano.classi;

import java.util.function.Predicate;

public class CercaCorsoPerLaurea implements Predicate<Corso> {

	public CercaCorsoPerLaurea(String corsoLaurea) {
		
		this.corsoLaurea = corsoLaurea;
	}
	
	public boolean test(Corso c)
	{
		if(c.getCorsoLaurea().equals(corsoLaurea)) return true;
		
		return false;
	}

	private String corsoLaurea;
}
