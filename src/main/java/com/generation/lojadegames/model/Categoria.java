package com.generation.lojadegames.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "tb_categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "O atributo Genêro é obrigatório")
	private String genero;

	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categorias")
	private List<Produto> produtos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public List<Produto> getProduto() {
		return produtos;
	}

	public void setProduto(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
}
