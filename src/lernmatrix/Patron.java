/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lernmatrix;

/**
 *
 * @author yohovani
 */
public class Patron {
	private int[] caracteristicas;
	private int[] clase;
	private int[] claseResultado;

	public Patron(int[] caracteristicas, int[] clase, int[] claseResultado) {
		this.caracteristicas = caracteristicas;
		this.clase = clase;
		this.claseResultado = claseResultado;
	}

	public int[] getCaracteristicas() {
		return caracteristicas;
	}

	public int[] getClase() {
		return clase;
	}
	
	public int[] getClaseResultado() {
		return claseResultado;
	}

	public void setCaracteristicas(int[] caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public void setClase(int[] clase) {
		this.clase = clase;
	}

	public void setClaseResultado(int[] claseResultado) {
		this.claseResultado = claseResultado;
	}
	
}
