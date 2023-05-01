package com.geekster.UniversityEventManagement.repositories;

import com.geekster.UniversityEventManagement.models.Student;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public interface StudentRepo extends CrudRepository<Student,Integer> {

    @Modifying
    @Query(value = "Update Student set Department = :departmentString where Student_Id =:studentId",nativeQuery = true)
    void updateDepartment(int studentId, String departmentString);
}

