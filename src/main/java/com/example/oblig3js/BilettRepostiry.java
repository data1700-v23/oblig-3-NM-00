package com.example.oblig3js;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BilettRepostiry extends JpaRepository < PersonObjekt, Long>{

    List<PersonObjekt> findByOrderByEtternavn();

}
