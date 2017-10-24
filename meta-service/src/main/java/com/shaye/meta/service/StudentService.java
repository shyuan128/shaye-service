package com.shaye.meta.service;

import com.shaye.meta.model.Students;

import java.util.List;

/**
 * Created by shiyuan on 2017/10/24.
 */
public interface StudentService {
    /**
     * 查询学生列表
     * @return
     */
    List<Students> getStudentList();

    /**
     * 根据学生ID 查询相关信息
     * @param stuId
     * @return
     */
    Students getStudent(String stuId);
}
