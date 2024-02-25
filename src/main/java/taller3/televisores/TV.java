package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	private static int numTV = 0;
	
	public TV(Marca marca,boolean estado){
		this.marca = marca;
		this.estado = estado;
		canal = 1;
		volumen = 1;
		precio = 500;
		
		numTV ++; 
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public void setCanal(int canal) {
		if(estado && canal >= 1 && canal <= 120) {
			this.canal = canal;
		}
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public void setVolumen(int volumen) {
		if(estado && volumen >= 0 && volumen <= 7) {
			this.volumen = volumen;
		}
	}
	public void setControl(Control control){
		this.control = control;
	}
	public void turnOn() {
		this.estado = true;
	}
	public void turnOff() {
		this.estado = false;
	}
	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}
	
	public Marca getMarca() {
		return this.marca;
	}
	public int getCanal() {
		return this.canal;
	}
	public int getPrecio() {
		return this.precio;
	}
	public int getvolumen() {
		return this.volumen;
	}
	public Control getControl() {
		return this.control;
	}
	public boolean getEstado() {
		return this.estado;
	}
	public static int getNumTV() {
		return TV.numTV;
	}
	
	public void canalUp() {
		if(estado && canal < 120) {
			canal++;
		}
	}
	public void canalDown() {
		if(estado && canal > 1) {
			canal--;
		}
	}
	public void volumenUp() {
		if(estado && volumen < 7) {
			volumen++;
		}
	}
	public void volumenDown() {
		if(estado && volumen > 0) {
			volumen--;
		}
	}
}
