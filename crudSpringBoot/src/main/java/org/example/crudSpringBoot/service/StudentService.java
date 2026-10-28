package org.example.crudSpringBoot.service;


import org.example.crudSpringBoot.dto.StudentResponseDto;
import org.example.crudSpringBoot.entity.Student;
import org.example.crudSpringBoot.repository.StudentRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private StudentRepository studentRepository;
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

   public StudentResponseDto createStudent( Student studentReq) {
      Student studentResp = studentRepository.save(studentReq);
      StudentResponseDto studentResponseDto = mapToResponseDto(studentResp);
      return studentResponseDto;

   }

   public StudentResponseDto getStudentById( Long id) {
        Optional<Student> studentResp = studentRepository.findById(id);
        if(!studentResp.isPresent())
        return null;
        StudentResponseDto studentResponseDto = mapToResponseDto(studentResp.get());
        return studentResponseDto;
   }

   public List<StudentResponseDto> getAllStudents() {
       List<Student> studentList = studentRepository.findAll();
       List<StudentResponseDto> studentResponseDtoList = new ArrayList<>();
       for(Student student : studentList) studentResponseDtoList.add(mapToResponseDto(student));
       return studentResponseDtoList;
   }

   public StudentResponseDto updateStudent( Long id, Student studentReq) {
        Optional<Student> existingStd = studentRepository.findById(id);
        if(existingStd.isPresent()) {
            Student studentToSave = existingStd.get();
            studentToSave.setName(studentReq.getName());
            studentToSave.setAge(studentReq.getAge());
            studentToSave.setEmail(studentReq.getEmail());
            studentToSave.setRollNo(studentReq.getRollNo());
            studentToSave.setSubject(studentReq.getSubject());
            Student savedStd =  studentRepository.save(studentToSave);
            StudentResponseDto studentResponseDto = mapToResponseDto(savedStd);
            return studentResponseDto;

        }
        return null;
   }

   public boolean deleteStudent(Long id) {
        Optional<Student> existingStd = studentRepository.findById(id);
        if(!existingStd.isPresent()) return false;

        studentRepository.deleteById(id);
        return true;

   }

   public StudentResponseDto mapToResponseDto(Student student) {
        StudentResponseDto studentResp = new StudentResponseDto();
        studentResp.setName(student.getName());
        studentResp.setAge(student.getAge());
        studentResp.setEmail(student.getEmail());
        studentResp.setRollNo(student.getRollNo());
        studentResp.setSubject(student.getSubject());
        return studentResp;
   }
}
