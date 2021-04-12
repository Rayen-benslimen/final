package com.pfe.GestionBank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pfe.GestionBank.entity.Fiche;

public interface FicheRepository extends JpaRepository<Fiche, Integer>{

    public List<Fiche> findFicheByUser_id(int user_id);

}
