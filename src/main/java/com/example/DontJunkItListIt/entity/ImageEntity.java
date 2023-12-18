package com.example.DontJunkItListIt.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "images")
public class ImageEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private byte[] data;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public ImageEntity(Long id, byte[] data) {
		super();
		this.id = id;
		this.data = data;
	}

	public ImageEntity() {
		super();
	}

    // getters and setters
}

