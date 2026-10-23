package org.example.crudSpringBoot.service;


import org.example.crudSpringBoot.entity.Student;
import org.example.crudSpringBoot.repository.StudentRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private StudentRepository studentRepository;
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

   public Student createStudent( Student studentReq) {
      Student studentResp = studentRepository.save(studentReq);
      return studentResp;

   }

   public Student getStudentById( Long id) {
        Optional<Student> studentResp = studentRepository.findById(id);
        if(studentResp.isPresent())
        return studentResp.get();
        return null;
   }

   public List<Student> getAllStudents() {
       List<Student> studentList = studentRepository.findAll();
       return studentList;
   }

   public Student updateStudent( Long id, Student studentReq) {
        Optional<Student> existingStd = studentRepository.findById(id);
        if(existingStd.isPresent()) {
            Student studentToSave = existingStd.get();
            studentToSave.setName(studentReq.getName());
            studentToSave.setAge(studentReq.getAge());
            studentToSave.setEmail(studentReq.getEmail());
            studentToSave.setRollNo(studentReq.getRollNo());
            studentToSave.setSubject(studentReq.getSubject());
            return studentRepository.save(studentToSave);

        }
        return null;
   }

   public boolean deleteStudent(Long id) {
        Optional<Student> existingStd = studentRepository.findById(id);
        if(!existingStd.isPresent()) return false;

        studentRepository.deleteById(id);
        return true;

   }
}
