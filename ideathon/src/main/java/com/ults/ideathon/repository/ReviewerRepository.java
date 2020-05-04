package com.ults.ideathon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ults.ideathon.model.CandidateInformation;

public interface ReviewerRepository extends JpaRepository<CandidateInformation, Integer>{


}
