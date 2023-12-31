package com.penguin.spring.test.jpa.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

//jpa 간단하게 lombok 해주는 기능
// 기본 생성자도 생성
@NoArgsConstructor 
// 생성자를 만드는 기능
@AllArgsConstructor
// builder 로 객체 만들수 있게 도와주는 기능
@Builder(toBuilder=true)
// 쉽게 사용하기 위해서 사용
@Getter
//연결 2번째
@Table(name="company")
//엔티티 1번째 정의 기능
@Entity
public class Company {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	
	private String business;
	
	
	private String scale;
	
	
	private int headcount;
	
	
	// 자동으로 현재 시간 입력
	@UpdateTimestamp
	@Column(name="createdAt", updatable=false)
	private Date createdAt;
	
	
	@UpdateTimestamp
	@Column(name="updatedAt")
	private Date updatedAt;





}

