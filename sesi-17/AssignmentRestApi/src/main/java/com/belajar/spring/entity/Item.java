package com.belajar.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_barang")
public class Item {
	
	private int id;
	private String nama;
	private int hargaBeli;
	private int hargaJual;
	
	public Item() {
		
	}
	
	public Item(int id, String nama, int hargaBeli, int hargaJual) {
		this.setId(id);
		this.setNama(nama);
		this.setHargaBeli(hargaBeli);
		this.setHargaJual(hargaJual);
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public int getHargaBeli() {
		return hargaBeli;
	}

	public void setHargaBeli(int hargaBeli) {
		this.hargaBeli = hargaBeli;
	}

	public int getHargaJual() {
		return hargaJual;
	}

	public void setHargaJual(int hargaJual) {
		this.hargaJual = hargaJual;
	}
}
