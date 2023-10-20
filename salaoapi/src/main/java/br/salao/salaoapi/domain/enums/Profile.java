package br.salao.salaoapi.domain.enums;

import lombok.Getter;

@Getter
public enum Profile {
	
	ADMIN(0, "ADMIN"), CLIENTE(1, "CLIENTE");
	
	private Integer codigo;
	private String descricao;
	
	private Profile(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public static Profile toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for(Profile x : Profile.values()) {
			if(cod.equals(x.getCodigo())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Perfil inválido");
	}

}
