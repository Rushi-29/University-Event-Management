package com.geekster.UniversityEventManagement.repositories;

import com.geekster.UniversityEventManagement.models.Event;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
@Repository
public interface EventRepo extends CrudRepository<Event,Integer> {
    @Query(value = "Select * from Event where date =?1 ",nativeQuery = true)
    List<Event> findAllByDate(LocalDate date);
}
