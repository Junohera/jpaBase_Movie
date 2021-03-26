package com.juno.mreview.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.juno.mreview.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
