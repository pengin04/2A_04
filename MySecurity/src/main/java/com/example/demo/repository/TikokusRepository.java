package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Ins;

public interface TikokusRepository extends JpaRepository<Ins, String> {

	List<Ins> findByName(String search);

	List<Ins> findBySchoolnumAndPassword(int schoolnum, String password);
}