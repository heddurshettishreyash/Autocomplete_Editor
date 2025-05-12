package com.lit.controller;


import com.lit.model.Dataset;
import com.lit.service.DatasetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class DatasetController {
    @Autowired
    public DatasetService datasetService;
       
    @GetMapping
    public List<Dataset> getAllDatasets() {
        return datasetService.getAllData();
    }
}
