package com.geekster.UniversityEventManagement.controllers;

import com.geekster.UniversityEventManagement.models.Department;
import com.geekster.UniversityEventManagement.models.Student;
import com.geekster.UniversityEventManagement.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/Student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping(value = "/addStudent")
    public String insertStudent(@RequestBody List<Student> studentList){
        return studentService.addStudent(studentList);
    }
    @GetMapping(value = "/getAll")
    public List<Student> getAllStudent(){
        return studentService.getAll();
    }
    @GetMapping(value = "/getStudentById/{StudentId}")
    public Optional<Student> getStudentById(@PathVariable Integer StudentId){
        return studentService.getStudentById(StudentId);
    }
    @PutMapping("/id/{studentId}/dept/{department}")
    public String updateDept(@PathVariable Integer studentId, @PathVariable Department department){
        return studentService.updateDepartment(studentId,department);
    }
    @DeleteMapping(value = "/deleteStudentById/{SudentId}")
    public void deleteStudentById(@PathVariable Integer SudentId){
        studentService.deleteStudentById(SudentId);
    }

}
