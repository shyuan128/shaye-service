package com.shaye.meta.controller;

import com.shaye.meta.model.Students;
import com.shaye.meta.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by shiyuan on 2017/10/24.
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    /**
     * 查询学生列表
     * @return
     */
    @RequestMapping(value = "/list", method = {RequestMethod.POST})
    public List<Students> students() {
        return studentService.getStudentList();
    }

    /**
     * 根据学生Id查询相关学生信息
     * @return
     */
    @RequestMapping(value = "/id",method = {RequestMethod.POST})
    public Students student(@RequestBody Students students) {
        return studentService.getStudent(students.getId());
    }
}
