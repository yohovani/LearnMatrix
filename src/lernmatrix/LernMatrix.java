/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lernmatrix;

import java.util.ArrayList;

/**
 *
 * @author yohovani
 */
public class LernMatrix {
	static final int e=2;
	private int[][] mat;
	
	
	public void aprendizaje(ArrayList<Patron> instancias){
		int caracteristicas = instancias.get(0).getCaracteristicas().length;
		int clases = instancias.get(0).getClase().length;
		this.mat = new int[clases][caracteristicas];
		
		//
		for(int k=0;k<instancias.size();k++){
			for(int i=0;i<clases;i++){
				for(int j=0;j<caracteristicas;j++){
					if(instancias.get(k).getCaracteristicas()[j] == instancias.get(k).getClase()[i] && instancias.get(k).getClase()[i] == 1){
						this.mat[i][j]+=e;
					}else{
						if(instancias.get(k).getCaracteristicas()[j] == 0 && instancias.get(k).getClase()[i] == 1){
							this.mat[i][j]+=-e;
						}else{
							this.mat[i][j]+=0;
						}
					}
				}
			}
		}
		
	}
	
	public void recuperacion(Patron x){
		for(int i=0;i<x.getClase().length;i++){
			for(int j=0;j<x.getCaracteristicas().length;j++){
				x.getClaseResultado()[i]+=mat[i][j]*x.getCaracteristicas()[j];
			}
		}
	}
	
	
}
