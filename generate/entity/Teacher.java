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
public class Teacher implements Serializable {

    private static final long serialVersionUID = 1L;

	private Integer teacherId;
	private String teacherName;
	private String teacherSex;
	private String teacherPassword;
	private Integer instituteId;
	private String lesson;
	private String title;
	private String tel;
	private String photo;


	@Override
	public String toString() {
		return "Teacher{" +
			"teacherId=" + teacherId +
			", teacherName=" + teacherName +
			", teacherSex=" + teacherSex +
			", teacherPassword=" + teacherPassword +
			", instituteId=" + instituteId +
			", lesson=" + lesson +
			", title=" + title +
			", tel=" + tel +
			", photo=" + photo +
			"}";
	}
}
