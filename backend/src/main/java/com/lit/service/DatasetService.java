package com.lit.service;

import com.lit.model.Dataset;
import com.lit.repository.DatasetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DatasetService {
    @Autowired
    public DatasetRepository datasetRepository;

    public List<Dataset> getAllData(){
        return  datasetRepository.findAll();
    }
}