package com.penguin.spring.test.jpa2.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.penguin.spring.test.jpa2.domain.Recruit;

@Repository
public interface RecruitRepository extends JpaRepository<Recruit, Integer> {

	//id가 하나만 조회
	public List<Recruit> findById(int id);
	
	
	//
	
	public List<Recruit> findTop1ByCompanyIdOrderByIdDesc(int companyId);
}
