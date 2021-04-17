package controller;

import model.logic.Modelo;
import view.View;

public class Controller {
	/**
	 *  Instancia del Modelo
	 */
	private Modelo modelo;
	
	/**
	 *  Instancia de la Vista
	 */
	private View view;
	
	/**
	 * Crear la vista y el modelo del proyecto
	 */
	public Controller ()
	{
		modelo = new Modelo();
		view = new View();
		
	}

	public void run() 
	{
	}
	
}
