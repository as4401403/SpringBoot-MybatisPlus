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
public class Institute implements Serializable {

    private static final long serialVersionUID = 1L;

	private Integer instituteId;
	private String instituteName;
	private String instituteLeader;
	private String remark;


	@Override
	public String toString() {
		return "Institute{" +
			"instituteId=" + instituteId +
			", instituteName=" + instituteName +
			", instituteLeader=" + instituteLeader +
			", remark=" + remark +
			"}";
	}
}
