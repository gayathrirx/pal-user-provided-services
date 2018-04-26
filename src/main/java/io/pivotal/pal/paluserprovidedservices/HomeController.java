package io.pivotal.pal.paluserprovidedservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {

    @Autowired
    CohortRepository cohortRepository;

//    @Autowired
//    DataSource dataSource;

//    @Autowired
//    JdbcTemplate jdbcTemplate;

    @GetMapping("/")
    public String home() {
        return "Hello PALs from Wells Fargo in Des Moines";
    }

    @GetMapping("/names")
    public List<Cohort> getNames() {
        return cohortRepository.findAll();
    }

    @GetMapping("/update")
    public List<Cohort> update() {
        Cohort c1 = cohortRepository.findById(2L);
        c1.setNickName("GaMa");
        cohortRepository.save(c1);

        Cohort c2 = cohortRepository.findById(3L);
        c2.setNickName("GiGo");
        cohortRepository.save(c2);



        List<Cohort> list = new ArrayList<Cohort>();
        list.add(c1);
        list.add(c2);

        return list;

    }

    @GetMapping("/save")
    public void save() {
        cohortRepository.save(new Cohort("Georg", "Geo"));
        cohortRepository.save(new Cohort("Hunter", "Hunt"));
    }





}
