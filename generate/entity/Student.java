package entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.enums.FieldFill;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author fuyong
 * @since 2017-08-14
 */
@Data
@Accessors(chain = true)
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

	private Long studentId;
	private String studentName;
	private String studentSex;
	private String studentPassword;
	private Integer instituteId;
	private Integer majorId;
	private Integer classId;
	private Integer status;


	@Override
	public String toString() {
		return "Student{" +
			"studentId=" + studentId +
			", studentName=" + studentName +
			", studentSex=" + studentSex +
			", studentPassword=" + studentPassword +
			", instituteId=" + instituteId +
			", majorId=" + majorId +
			", classId=" + classId +
			", status=" + status +
			"}";
	}
}
