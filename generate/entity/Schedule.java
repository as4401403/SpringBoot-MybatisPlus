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
public class Schedule implements Serializable {

    private static final long serialVersionUID = 1L;

	private String term;
	private Long studentId;
	private String studentName;
	private Integer teacherId;
	private String teacherName;
	private String lesson;
	private Integer mark;


	@Override
	public String toString() {
		return "Schedule{" +
			"term=" + term +
			", studentId=" + studentId +
			", studentName=" + studentName +
			", teacherId=" + teacherId +
			", teacherName=" + teacherName +
			", lesson=" + lesson +
			", mark=" + mark +
			"}";
	}
}
