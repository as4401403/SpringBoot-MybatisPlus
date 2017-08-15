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
public class Class implements Serializable {

    private static final long serialVersionUID = 1L;

	private Integer classId;
	private String className;
	private String classManager;
	private Integer classMaj;


	@Override
	public String toString() {
		return "Class{" +
			"classId=" + classId +
			", className=" + className +
			", classManager=" + classManager +
			", classMaj=" + classMaj +
			"}";
	}
}
