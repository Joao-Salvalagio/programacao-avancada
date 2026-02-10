package com.joaosalvalagio.__02.repositories;

import com.joaosalvalagio.__02.models.CaminhaoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaminhaoRepository extends JpaRepository <CaminhaoModel, Long> {
}