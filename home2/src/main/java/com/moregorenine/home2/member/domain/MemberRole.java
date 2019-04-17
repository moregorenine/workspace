package com.moregorenine.home2.member.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@EqualsAndHashCode(of = "rno")
@Getter
@Setter
@ToString
public class MemberRole {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long rno;
	private String roleName;
}
