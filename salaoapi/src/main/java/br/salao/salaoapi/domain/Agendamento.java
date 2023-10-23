package br.salao.salaoapi.domain;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.salao.salaoapi.domain.enums.Horarios;
import br.salao.salaoapi.domain.enums.ServicoTipo;
import lombok.Getter;

@Getter
@Entity
public class Agendamento implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataAbertura = LocalDate.now();
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataFechamento;
	
	private String nomeCliente;
	private String diaSemana;
	private ServicoTipo servicoTipo;
	private Horarios horarios;
	private String observacao;
	
	/*@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;*/  //ajuste para automatizar direcionamento automatico de nomenclatura no front.
	
	public Agendamento() {
		super();
	}

	public Agendamento(Integer id, String nomeCliente, String diaSemana, ServicoTipo servicoTipo, Horarios horarios,
			String observacao) {
		super();
		this.id = id;
		this.nomeCliente = nomeCliente;
		this.diaSemana = diaSemana;
		this.servicoTipo = servicoTipo;
		this.horarios = horarios;
		this.observacao = observacao;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agendamento other = (Agendamento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
