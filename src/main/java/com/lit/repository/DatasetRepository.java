package com.lit.repository;

import com.lit.model.Dataset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DatasetRepository extends JpaRepository<Dataset,Integer> {

    List<Dataset> findAll();
}
