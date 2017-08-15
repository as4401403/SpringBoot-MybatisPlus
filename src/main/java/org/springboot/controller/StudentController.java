package org.springboot.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import groovy.util.logging.Slf4j;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springboot.common.OutputArrayBean;
import org.springboot.entity.Student;
import org.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 付勇 on 17/2/9.
 */
@Api(tags = "admin", description = "管理员")
@RestController
@Slf4j
@RequestMapping("/batman/admin")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @ApiOperation("根据id查询学生信息")
    @RequestMapping(value = "/queryStudentById",method = RequestMethod.GET)
    @ResponseBody
    public OutputArrayBean<Student> queryStudentById(@ApiParam(value = "学生id",required = false)String stuId){
        Student cond=new Student();
        cond.setStatus(0);
        EntityWrapper<Student> wrapper=new EntityWrapper<>(cond);
        List<Student>students=studentService.selectList(wrapper);
        OutputArrayBean<Student>studentOutputArrayBean=new OutputArrayBean<>(students);
        return studentOutputArrayBean;
    }
}
