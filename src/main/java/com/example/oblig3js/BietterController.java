package com.example.oblig3js;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class BietterController {
    @Autowired
    BilettRepostiry rep;

    @PostMapping ("/lagre")
    public void  lagre(PersonObjekt newBilett){
       rep.save(newBilett);
    }

    @GetMapping("/visAlle")
    public List<PersonObjekt> visAlle(){
        return rep.findAll();
    }

    @GetMapping("/slettAlle")
    public void slettAlle(){ rep.deleteAll();}

}
