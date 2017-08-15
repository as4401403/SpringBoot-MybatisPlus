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
public class LoginAcountInfo implements Serializable {

    private static final long serialVersionUID = 1L;

	private Long userId;
	private String password;
	private Integer loginStatus;
	private Integer loginLevel;


	@Override
	public String toString() {
		return "LoginAcountInfo{" +
			"userId=" + userId +
			", password=" + password +
			", loginStatus=" + loginStatus +
			", loginLevel=" + loginLevel +
			"}";
	}
}
