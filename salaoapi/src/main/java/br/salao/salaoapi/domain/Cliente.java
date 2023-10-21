package br.salao.salaoapi.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Cliente extends User{

	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	@OneToMany(mappedBy = "cliente")
	private List<Servico> servicos = new ArrayList<>();
	
	public Cliente() {
		super();
	}
	
	//implementar os atributos restantes da classe e linkar as classes de agendamento
}
