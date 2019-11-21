/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certificacion.concesionaria;

/**
 *
 * @author santiagovidal
 */

public class Car {
	private String plate;
	private String model;
	private int year;
	private float prize;
	public Car(String patente, String modelo, int año) {
		super();
		this.plate = patente;
		this.model = modelo;
		this.year = año;
	}
	public void setPrize(float precio) {
		this.prize = precio;
	}
	public float getPrize() {
		return prize;
	}
	public String getPlate() {
		return plate;
	}
	
}
