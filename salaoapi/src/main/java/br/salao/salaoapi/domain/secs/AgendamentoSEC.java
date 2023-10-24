package br.salao.salaoapi.domain.secs;

import java.io.Serializable;
import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.salao.salaoapi.domain.Agendamento;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AgendamentoSEC implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataAbertura = LocalDate.now();
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataFechamento;
	@NotNull(message = "O campo NOME é requerido")
	private String nomeCliente;
	@NotNull(message = "O campo DIA é requerido")
	private String diaSemana;
	@NotNull(message = "O campo TIPO DE SERVIÇO é requerido")
	private Integer servicoTipo;
	@NotNull(message = "O campo HORÁRIO é requerido")
	private Integer horarios;
	private String observacao;
	
	public AgendamentoSEC() {
		super();
	}

	public AgendamentoSEC(Agendamento obj ) {
		super();
		this.id = obj.getId();
		this.dataAbertura = obj.getDataAbertura();
		this.dataFechamento = obj.getDataFechamento();
		this.nomeCliente = obj.getNomeCliente();
		this.diaSemana = obj.getDiaSemana();
		this.servicoTipo = obj.getServicoTipo().getCodigo();
		this.horarios = obj.getHorarios().getCodigo();
		this.observacao = obj.getObservacao();
	}
}
