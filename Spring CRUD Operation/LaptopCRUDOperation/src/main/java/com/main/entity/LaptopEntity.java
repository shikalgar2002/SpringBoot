package com.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LaptopEntity {
	@Id

	private int Lno;
	private String name;
	private String color;
	private int ram;
	private int rom;
	public LaptopEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getLno() {
		return Lno;
	}
	public void setLno(int lno) {
		Lno = lno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getRom() {
		return rom;
	}
	public void setRom(int rom) {
		this.rom = rom;
	}
	public LaptopEntity(int lno, String name, String color, int ram, int rom) {
		super();
		Lno = lno;
		this.name = name;
		this.color = color;
		this.ram = ram;
		this.rom = rom;
	}
	@Override
	public String toString() {
		return "LaptopEntity [Lno=" + Lno + ", name=" + name + ", color=" + color + ", ram=" + ram + ", rom=" + rom
				+ "]";
	}

	
	
	

}
