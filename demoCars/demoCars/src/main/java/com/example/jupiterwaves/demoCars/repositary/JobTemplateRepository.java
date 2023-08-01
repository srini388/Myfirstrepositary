package com.example.jupiterwaves.demoCars.repositary;

import com.example.jupiterwaves.demoCars.model.JobTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface JobTemplateRepository  extends JpaRepository<JobTemplate,Long> {
}
