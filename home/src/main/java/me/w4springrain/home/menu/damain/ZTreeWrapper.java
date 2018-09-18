package me.w4springrain.home.menu.damain;

import java.util.List;

import javax.validation.Valid;

import org.hibernate.validator.constraints.NotEmpty;

import me.w4springrain.home.common.domain.CommonVO;

public class ZTreeWrapper extends CommonVO {
	@NotEmpty
	@Valid
	List<ZTree> zTrees;

	public List<ZTree> getzTrees() {
		return zTrees;
	}

	public void setzTrees(List<ZTree> zTrees) {
		this.zTrees = zTrees;
	}
	
}
