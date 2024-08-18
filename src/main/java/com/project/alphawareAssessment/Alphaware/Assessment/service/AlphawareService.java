package com.project.alphawareAssessment.Alphaware.Assessment.service;

import com.project.alphawareAssessment.Alphaware.Assessment.entities.AlphawareEntity;
import com.project.alphawareAssessment.Alphaware.Assessment.repo.AlphawareRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlphawareService {

    @Autowired
    private AlphawareRepo alphawareRepo;

    public List<AlphawareEntity> saveAlphawareEntity(List<AlphawareEntity> alphawareEntity){
        return alphawareRepo.saveAll(alphawareEntity);
    }
}
