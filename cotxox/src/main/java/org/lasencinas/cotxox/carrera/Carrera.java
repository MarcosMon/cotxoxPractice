package org.lasencinas.cotxox.carrera;

import org.lasencinas.cotxox.conductor.PoolConductores;
import org.lasencinas.cotxox.tarifa.Tarifa;

public class Carrera {
	private String tarjetaCredito = "";
	private String destino = null;
	private double distancia;
	private String origen;
	private int tiempoEsperadoMinutos;
	private double costeTotal;
	private String conductor;
	private double tiempoCarrera;
	private double propinas;

	public Carrera() {

	}

	public Carrera(String tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;

	}

	public String getTarjetaCredito() {
		return this.tarjetaCredito;
	}

	public String getDestino() {
		return this.destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;

	}

	public double getDistancia() {

		return this.distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;

	}

	public void setOrigen(String origen) {
		this.origen = origen;

	}

	public String getOrigen() {

		return this.origen;
	}

	public void setTiempoEsperado(int tiempoEsperadoMinutos) {
		this.tiempoEsperadoMinutos = tiempoEsperadoMinutos;

	}

	public int getTiempoEsperadoMinutos() {
		return this.tiempoEsperadoMinutos;
	}

	public double getCosteEsperado() {

		Tarifa.calcularCosteTiempo(this);
		Tarifa.calcularCosteDistancia(this);
		Tarifa.calcularCosteTotalEsperado();

		return Tarifa.getCosteTotalEsperado();
	}

	public void asignarConductor(PoolConductores conductores) {

	}

	public void realizarPago(double pago) {
		this.setCosteTotal(pago);
	}

	public void recibirPropina(double propina) {
		this.setPropinas(propina);
	}

	public void liberarConductor() {

	}

	public double getCosteTotal() {
		return costeTotal;
	}

	public void setCosteTotal(double costeTotal) {
		this.costeTotal = costeTotal;
	}

	public double getPropinas() {
		return propinas;
	}

	public void setPropinas(double propinas) {
		this.propinas = propinas;
	}

	public double getTiempoCarrera() {
		return tiempoCarrera;
	}

	public void setTiempoCarrera(double tiempoCarrera) {
		this.tiempoCarrera = tiempoCarrera;
	}

	public String getConductor() {
		return conductor;
	}

	public void setConductor(String conductor) {
		this.conductor = conductor;
	}

}
