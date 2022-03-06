package com.example.philips.devweek.Repository;

import com.example.philips.devweek.Entity.IncidenciaExame;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OcorrenciaRepo extends JpaRepository<IncidenciaExame, Long> {
}

