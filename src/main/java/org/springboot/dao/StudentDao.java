package org.springboot.dao;

import org.springboot.entity.Student;

import java.math.BigInteger;

/**
 * Created by 付勇 on 17/2/9.
 */
public interface StudentDao {
    Student queryByStudentId(BigInteger studentId);
}
