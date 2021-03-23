package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Data;

@Repository
public interface PalindromeDataRepository extends JpaRepository<Data, Integer> {

}
