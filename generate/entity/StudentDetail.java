package entity;

import java.util.Date;
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
public class StudentDetail implements Serializable {

    private static final long serialVersionUID = 1L;

	private Long studentId;
	private String studentName;
	private String studentSex;
	private String nation;
	private String politics;
    /**
     * 									
     */
	private String address;
	private String instituteId;
	private String majorId;
	private String classId;
	private Date birthDay;
	private Date inSchoolDay;
	private String idCard;
	private String tel;
	private String schoolStatus;
	private String reward;
	private String photo;


	@Override
	public String toString() {
		return "StudentDetail{" +
			"studentId=" + studentId +
			", studentName=" + studentName +
			", studentSex=" + studentSex +
			", nation=" + nation +
			", politics=" + politics +
			", address=" + address +
			", instituteId=" + instituteId +
			", majorId=" + majorId +
			", classId=" + classId +
			", birthDay=" + birthDay +
			", inSchoolDay=" + inSchoolDay +
			", idCard=" + idCard +
			", tel=" + tel +
			", schoolStatus=" + schoolStatus +
			", reward=" + reward +
			", photo=" + photo +
			"}";
	}
}
