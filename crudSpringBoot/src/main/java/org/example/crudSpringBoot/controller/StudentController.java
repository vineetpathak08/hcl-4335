package org.example.crudSpringBoot.controller;


import org.example.crudSpringBoot.dto.StudentRequestDto;
import org.example.crudSpringBoot.dto.StudentResponseDto;
import org.example.crudSpringBoot.entity.Student;
import org.example.crudSpringBoot.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/students")
public class StudentController {


    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //create student
    @PostMapping("/create")
    public ResponseEntity<StudentResponseDto> createStudent( @RequestBody StudentRequestDto studentRequestDto) {
        Student student = mapRequestDtoToEntity(studentRequestDto);
        student.setCreatedAt(LocalDateTime.now());
        StudentResponseDto createdStudent = studentService.createStudent(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdStudent);
    }

    //read one student
    @GetMapping("/get/{id}")
    public ResponseEntity<StudentResponseDto> getStudent(@PathVariable Long id) {
        StudentResponseDto studentResp = studentService.getStudentById(id);
           if(studentResp != null)
           return ResponseEntity.status(HttpStatus.OK).body(studentResp);
           return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<StudentResponseDto>> getAllStudents() {
        List<StudentResponseDto> studentsResp = studentService.getAllStudents();
        if(studentsResp.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        return ResponseEntity.status(HttpStatus.OK).body(studentsResp);

    }

    //update student

    @GetMapping("/update/{id}")
    public ResponseEntity<StudentResponseDto> updateStudent(@PathVariable Long id, @RequestBody StudentRequestDto studentRequestDto) {
        Student student = mapRequestDtoToEntity(studentRequestDto);
        StudentResponseDto studentResp = studentService.updateStudent(id,student);
        if(studentResp == null)
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        return ResponseEntity.status(HttpStatus.OK).body(studentResp);

    }

    //delete student
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id) {
        Boolean isDeleted = studentService.deleteStudent(id);

        if(isDeleted)
        return ResponseEntity.status(HttpStatus.OK)
                .body("Student deleted successfully");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student not found");
    }

    public Student mapRequestDtoToEntity(StudentRequestDto studentRequestDto) {
        Student student = new Student();
        student.setName(studentRequestDto.getName());
        student.setAge(studentRequestDto.getAge());
        student.setSubject(studentRequestDto.getSubject());
        student.setEmail(studentRequestDto.getEmail());
        student.setRollNo(studentRequestDto.getRollNo());
        student.setUpdatedAt(LocalDateTime.now());

        return student;
    }

}
