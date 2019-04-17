package com.moregorenine.home2.member.repository;

import org.springframework.data.repository.CrudRepository;

import com.moregorenine.home2.member.domain.Member;

public interface MemberRepository extends CrudRepository<Member, Long> {

}
