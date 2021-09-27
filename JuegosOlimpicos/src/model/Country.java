package model;

public class Country implements Comparable<Country>{
	
	private String name;
	private int mOro, mPlata, mBronce, fOro, fPlata, fBronce, cOro, cPlata, cBronce;
	
	public Country(String name, int mOro, int mPlata, int mBronce, int fOro, int fPlata, int fBronce) {
		this.name = name;
		this.mOro = mOro;
		this.mPlata = mPlata;
		this.mBronce = mBronce;
		this.fOro = fOro;
		this.fPlata = fPlata;
		this.fBronce = fBronce;
	}
	
	public Country(String name, int cOro, int cPlata, int cBronce) {
		this.name = name;
		this.cOro = cOro;
		this.cPlata = cPlata;
		this.cBronce = cBronce;
		
	}
	
	@Override
	public int compareTo(Country o) {
		
				if(fOro > o.getfOro()) {
					
					return 1;
				}else if (fOro < o.getfOro()) {
					
					return -1;
				}else {
					
					if(fPlata > o.getfPlata()) {
						
						return 1;
					}else if(fPlata < o.getfPlata()) {
						
						return -1;
					}else {
						
						if(fBronce > o.getfBronce()) {
							
							return 1;
						}else if(fBronce < o.getfBronce()) {
							
							return -1;
						}else {
							
							return name.compareTo(o.getName());
						}
					}
				}
	}
		
	
	
	
	
	
	public String getName() {
		return name;
	}

	public int getmOro() {
		return mOro;
	}

	public int getmPlata() {
		return mPlata;
	}

	public int getmBronce() {
		return mBronce;
	}

	public int getfOro() {
		return fOro;
	}

	public int getfPlata() {
		return fPlata;
	}

	public int getfBronce() {
		return fBronce;
	}

	public int getcOro() {
		return cOro;
	}

	public int getcPlata() {
		return cPlata;
	}

	public int getcBronce() {
		return cBronce;
	}
	
	
}