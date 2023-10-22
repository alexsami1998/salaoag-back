package br.salao.salaoapi.domain.enums;

import lombok.Getter;

@Getter
public enum ServicoTipo {
	DEPILACAO_INTIMA(0, "DEPILACAO_INTIMA"), DEPILACAO_COMPLETA(1, "DEPILACAO_COMPLETA"), UNHA_MAO(2, "UNHA_MAO"), UNHA_PE(3, "UNHA_PE"), SOBRANCELHA(4, "SOBRANCELHA");
	
	private Integer codigo;
	private String descricao;
	
	private ServicoTipo(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public static ServicoTipo toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		
		for(ServicoTipo x : ServicoTipo.values()) {
			if(cod.equals(x.getCodigo())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Tipo de serviço inválido");
	}

}
