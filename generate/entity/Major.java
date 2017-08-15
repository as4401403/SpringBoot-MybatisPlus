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
public class Major implements Serializable {

    private static final long serialVersionUID = 1L;

	private Integer majorId;
	private String majorName;
	private Integer majorIns;


	@Override
	public String toString() {
		return "Major{" +
			"majorId=" + majorId +
			", majorName=" + majorName +
			", majorIns=" + majorIns +
			"}";
	}
}
