package com.gmail.michelecipriano.classi;
import java.util.function.Predicate;

public class CercaDocentePerCF implements Predicate<Docente>{

	
	
	public CercaDocentePerCF(String codicefiscale) {
	
		this.codicefiscale = codicefiscale;
	}
	
	public boolean test(Docente d)
	{
		if(d.getCodiceFiscale().equals(codicefiscale)) return true;
		
		return false;
	}
	
	

	private String codicefiscale;
}
