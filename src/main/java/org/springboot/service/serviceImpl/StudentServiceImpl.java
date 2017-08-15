package org.springboot.service.serviceImpl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springboot.entity.Student;
import org.springboot.mapper.StudentMapper;
import org.springboot.service.StudentService;
import org.springframework.stereotype.Service;

/**
 * Created by 付勇 on 17/2/14.
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper,Student> implements StudentService {

//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//    @Autowired
//    private StudentDao studentDao;
//
//    @Override
//    public Student queryByStudentId(BigInteger userId) {
//        return studentDao.queryByStudentId(userId);
//    }
}
