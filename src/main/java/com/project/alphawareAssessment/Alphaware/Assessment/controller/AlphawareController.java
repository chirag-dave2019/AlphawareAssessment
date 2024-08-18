package com.project.alphawareAssessment.Alphaware.Assessment.controller;

import com.project.alphawareAssessment.Alphaware.Assessment.entities.AlphawareEntity;
import com.project.alphawareAssessment.Alphaware.Assessment.service.AlphawareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AlphawareController {
    @Autowired
    private AlphawareService alphawareService;

    @PostMapping("/entities")
    public ResponseEntity<List<AlphawareEntity>> createEntity(@RequestBody List<AlphawareEntity> alphawareEntity){
        List<AlphawareEntity> savedEntities = alphawareService.saveAlphawareEntity(alphawareEntity);
        return ResponseEntity.ok(alphawareEntity);
    }

}
