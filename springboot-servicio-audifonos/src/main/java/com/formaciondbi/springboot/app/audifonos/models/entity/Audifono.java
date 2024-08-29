package com.formaciondbi.springboot.app.audifonos.models.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "Audifonos")
public class Audifono implements Serializable{

	private static final long serialVersionUID = 1159404504017828780L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id_audifono;
	
	public String marca;
	public String modelo;
	public boolean bluetooth;
	public double precio;
	
	@Column
	@Temporal(TemporalType.DATE)
	public Date created_at;
		
	public long getId_audifono() {
		return id_audifono;
	}
	public void setId_audifono(long id_audifono) {
		this.id_audifono = id_audifono;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public boolean isBluetooth() {
		return bluetooth;
	}
	public void setBluetooth(boolean bluetooth) {
		this.bluetooth = bluetooth;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date create_at) {
		this.created_at = create_at;
	}
	
}
