package model;

import java.util.Comparator;

public class Countrys implements Comparator<Country>{

	@Override
	public int compare(Country a, Country b) {
		
		if(a.getmOro() > b.getmOro()) {
			
			return -1;
		}else if (a.getmOro() < b.getmOro()) {
			
			return 1;
		}else {
			if(a.getmPlata() > b.getmPlata()) {
				
				return -1;
			}else if(a.getmPlata() < b.getmPlata()) {
				
				return 1;
			}else {
				if(a.getmBronce() > b.getmBronce()) {
					
					return -1;
				}else if(a.getmBronce() < b.getmBronce()) {
					
					return 1;
				}else {
					
					return a.getName().compareTo(b.getName());
				}
			}
		}
	}
	
}