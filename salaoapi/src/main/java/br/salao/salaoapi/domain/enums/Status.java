package br.salao.salaoapi.domain.enums;

import lombok.Getter;

@Getter
public enum Status {

	PENDENTE(0, "PENDENTE"), CONFIRMADO(1, "CONFIRMADO"), ANDAMENTO(2, "ANDAMENTO"), REMARCADO(3, "REMARCADO"),
	CANCELADO(4, "CANCELADO");

	private Integer codigo;
	private String desricao;

	private Status(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.desricao = descricao;
	}

	public static Status toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}

		for (Status x : Status.values()) {
			if (cod.equals(x.getCodigo())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Perfil inválido");
	}

}