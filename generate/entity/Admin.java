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
public class Admin implements Serializable {

    private static final long serialVersionUID = 1L;

	private Long adminId;
	private String name;
	private String sex;
	private String password;
	private Integer instituteId;
	private String title;
	private String tel;
	private String photo;


	@Override
	public String toString() {
		return "Admin{" +
			"adminId=" + adminId +
			", name=" + name +
			", sex=" + sex +
			", password=" + password +
			", instituteId=" + instituteId +
			", title=" + title +
			", tel=" + tel +
			", photo=" + photo +
			"}";
	}
}
