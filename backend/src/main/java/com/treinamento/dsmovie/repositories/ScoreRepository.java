package com.treinamento.dsmovie.repositories;

import com.treinamento.dsmovie.entities.Score;
import com.treinamento.dsmovie.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
