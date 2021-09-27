package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import model.Country;
import model.Countrys;

public class Main {
	
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static List<Country> pais;
	public static List<Country> paises;
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException{
		pais = new ArrayList<Country>();
		paises = new ArrayList<Country>();
		menu();
	}
	
	public static void menu() throws IOException {
		System.out.println("////////////////////////////");
		System.out.println("Hola Bienvenido :D");
		System.out.println("Por favor ingresa la cantidad de paises:");
		int amount = sc.nextInt();
		sc.nextLine();
		System.out.println("Ingrese los datos NUMERICOS separados por un ;, ASI :)");	
		
		for(int i=0; i<amount;i++) {
			System.out.println("\"Nombre;OroM;PlataM;BronceM;OroF;PlataF;BronceF\\n");
			String pais = br.readLine();
			addPais(pais);
		}		
		printM();
		printF();
		Medallas();
		SelectionSort();
		InsertionSort();				
	}
	
	
		
	public static void addPais(String a) {
		String[] parts = a.split(";");
		pais.add(new Country( parts[0], Integer.parseInt(parts[1]), Integer.parseInt(parts[2]), Integer.parseInt(parts[3]), Integer.parseInt(parts[4]), Integer.parseInt(parts[5]), Integer.parseInt(parts[6])));
	}

	public static void sortByComparator(){
		Comparator<Country> p1 = new Countrys();		
		Collections.sort(pais, p1);
		
	}
	
	public static void Medallas() {
		for(int i=0; i < paises.size(); i++) {
			paises.add(new Country(pais.get(i).getName(), (pais.get(i).getmOro()+pais.get(i).getfOro()), (pais.get(i).getmPlata()+pais.get(i).getfPlata()), (pais.get(i).getmBronce()+pais.get(i).getfBronce())));
		}
	}
	
	public static void selectSort() {
		
		int pos =0;
		while(pos < paises.size()) {
			Country max= paises.get(pos);
			for(int i=pos; i<paises.size(); i++) {

				if(paises.get(i).getcOro()>max.getcOro()) {
					Country temp = paises.get(i);
					paises.set(i, max);
					max = temp;
				}
			}
			paises.set(pos, max);
			pos++;
		}
		
	}
	
	public static void insertionSort() {

		int j;
		Country aux;
		for (int i=1; i<paises.size(); i++) {
			aux = paises.get(i);
			j = i-1;
			while((j>=0) && (aux.getcOro()>paises.get(j).getcOro())) {
				paises.set(j+1, paises.get(j));
				j--;
			}
			paises.set(j+1, aux);
		}

	}
	
	public static void printM() {
		System.out.println("Masculino");
		sortByComparator();
		for(int i=0; i<paises.size(); i++) {
			System.out.println(pais.get(i).getName()+" "+pais.get(i).getmOro()+" "+pais.get(i).getmPlata()+" "+pais.get(i).getmBronce());
		}
		System.out.println("//////////////");
	}
	
	public static void printF() {
		Collections.sort(pais);
		System.out.println("Femenino");
		for(int i=0; i<pais.size(); i++) {
			System.out.println(pais.get(i).getName()+" "+pais.get(i).getfOro()+" "+pais.get(i).getfPlata()+" "+pais.get(i).getfBronce());
		}
		System.out.println("//////////////");
	}
	
	public static void SelectionSort() {
		System.out.println("Asi es por Selection");
		selectSort();
		for(int i=0; i<paises.size(); i++) {
			System.out.println(paises.get(i).getName()+" "+paises.get(i).getcOro()+" "+paises.get(i).getcPlata()+" "+paises.get(i).getcBronce());
		}
		System.out.println("//////////////");
	}
	
	public static void InsertionSort() {
		System.out.println("Asi es por Insertion");
		insertionSort();
		for(int i=0; i<paises.size(); i++) {
			System.out.println(paises.get(i).getName()+" "+paises.get(i).getcOro()+" "+paises.get(i).getcPlata()+" "+paises.get(i).getcBronce());
		}
	}
}