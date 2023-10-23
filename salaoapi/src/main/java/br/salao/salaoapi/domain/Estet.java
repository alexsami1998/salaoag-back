package br.salao.salaoapi.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.salao.salaoapi.domain.enums.Profile;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Estet extends User {

	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	@OneToMany(mappedBy = "estet")
	private List<Agendamento> servicos = new ArrayList<>();
	
	public Estet() {
		super();
		//addProfile(Profile.CLIENTE);
	}
	
	public Estet(Integer id, String nome, String cpf, String email, String senha) {
		super(id, nome, cpf, email, senha);
		//addProfile(Profile.CLIENTE);  //ajuste para automatizar direcionamento automatico de nomenclatura no front.
	}
	
	public List<Agendamento> getServicos() {
		return servicos;
	}
	
	public void setServicos(List<Agendamento> servicos) {
		this.servicos = servicos;
	}

}
