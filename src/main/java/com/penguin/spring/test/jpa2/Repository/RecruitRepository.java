package com.penguin.spring.test.jpa2.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.penguin.spring.test.jpa2.domain.Recruit;

@Repository
public interface RecruitRepository extends JpaRepository<Recruit, Integer> {

	
	//id가 하나만 조회
	//이미 만들어져 있는 기능 
	public List<Recruit> findById(int id);
	
	
	//Request Parameter로 전달 받은 company id로 해당하는 회사의 공고를 조회하세요.
	public List<Recruit> findByCompanyId(int companyId);
	
	
	//웹 back-end 개발자 이고 정규직인 공고를 조회하고 아래와 같이 출력하세요.
	public List<Recruit> findByPositionAndType(String position, String type);
	
	
	//정규직이거나 연봉이 9000 이상인 공고를 조회하고 아래와 같이 출력하세요.
	public List<Recruit> findByTypeOrSalaryGreaterThanEqual(String type, int salary);
	
	
	//계약직 목록을 연봉 기준으로 내림차순 정렬해서 3개만 조회하세요.
	public List<Recruit> findTop3ByTypeOrderBySalaryDesc(String type);
	
	
	//성남시 분당구가 지역인 연봉 7000 이상 8500 이하인 공고를 조회하고 아래와 같이 출력하세요.
	public List<Recruit> findByRegionAndSalaryBetween(String region, int salaryStart , int salaryEnd);
	
	
	//마감일이 2026-04-10 이후이고 연봉이 8100 이상인 정규직 공고를 연봉 내림차순으로 조회하세요.
	@Query(value="SELECT * FROM `recruit` "
			+ " WHERE `salary` >= :salary "
			+ " AND `type` = :type "
			+ " AND `deadline` >= :deadline "
			+ " ORDER BY `salary` DESC" ,nativeQuery=true)
	public List<Recruit> findBySalaryAndTypeAndDeadlineQuery(
			@Param("salary")int salary, 
			@Param("type")String type, 
			@Param("deadline")String deadline);

	
	
}
