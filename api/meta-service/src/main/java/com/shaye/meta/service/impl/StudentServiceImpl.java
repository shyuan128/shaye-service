package com.shaye.meta.service.impl;

import com.shaye.meta.dao.StudentsMapper;
import com.shaye.meta.model.Students;
import com.shaye.meta.model.StudentsExample;
import com.shaye.meta.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by shiyuan on 2017/10/24.
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentsMapper studentsMapper;

    /**
     * 根据学生ID 查询相关信息
     * @param stuId
     * @return
     */
    @Override
    public Students getStudent(String stuId) {
        Students students = studentsMapper.selectByPrimaryKey(stuId);
        return students;
    }

    /**
     * 查询学生列表
     * @return
     */
    @Override
    public List<Students> getStudentList() {
        StudentsExample example = new StudentsExample();
        List<Students> list = studentsMapper.selectByExample(example);
        return list;
    }
}
