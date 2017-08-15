package service.impl;

import entity.StudentDetail;
import mapper.StudentDetailMapper;
import service.StudentDetailService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fuyong
 * @since 2017-08-14
 */
@Service
public class StudentDetailServiceImpl extends ServiceImpl<StudentDetailMapper, StudentDetail> implements StudentDetailService {
	
}
