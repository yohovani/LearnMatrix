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
public class test {
	public static void main(String[] arg){
		ArrayList<Patron> entrenamiento = new ArrayList<>();

		entrenamiento.add(new Patron(new int[]{1,0,1,0,1},new int[]{1,0,0},new int[]{0,0,0}));
		entrenamiento.add(new Patron(new int[]{1,1,0,0,1},new int[]{0,1,0},new int[]{0,0,0}));
		entrenamiento.add(new Patron(new int[]{1,0,1,1,0},new int[]{0,0,1},new int[]{0,0,0}));
		entrenamiento.add(new Patron(new int[]{0,1,0,1,1},new int[]{1,0,0},new int[]{0,0,0}));
		LernMatrix lm = new LernMatrix();
		
		lm.aprendizaje(entrenamiento);
		lm.recuperacion(new Patron(new int[]{1,0,1,0,1},new int[]{1,0,0},new int[]{0,0,0}));
		lm.recuperacion(new Patron(new int[]{1,0,1,1,0},new int[]{0,0,1},new int[]{0,0,0}));
		lm.recuperacion(new Patron(new int[]{1,0,1,0,1},new int[]{1,0,0},new int[]{0,0,0}));
		lm.recuperacion(new Patron(new int[]{0,1,0,1,1},new int[]{1,0,0},new int[]{0,0,0}));

		System.out.println();
	}
}
