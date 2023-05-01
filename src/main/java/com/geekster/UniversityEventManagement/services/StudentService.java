package com.geekster.UniversityEventManagement.services;

import com.geekster.UniversityEventManagement.models.Department;
import com.geekster.UniversityEventManagement.models.Student;
import com.geekster.UniversityEventManagement.repositories.StudentRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    public String addStudent(List<Student> studentList) {
        Iterable<Student> list = studentRepo.saveAll(studentList);
        if(list!=null)
        {
            return "Added list of Student....!!";
        }
        else
        {
            return "Could not added..!!!";
        }
    }

    public List<Student> getAll() {
        return (List<Student>) studentRepo.findAll();
    }

    public Optional<Student> getStudentById(Integer StudentId){ return studentRepo.findById(StudentId);
}

    public void deleteStudentById(Integer sudentId) { studentRepo.deleteById(sudentId);
    }
    @Transactional
    public String updateDepartment(Integer studentId, Department department) {
        String departmentString = department.name();
        studentRepo.updateDepartment(studentId,departmentString);
        return "Updated successfully";

    }
}