package mn.num.edu.bagy.PHHugjuulelt.payload.request;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class LoginRequest {
	@Getter
	@Setter
	@NotNull
	private String username;

	@NotNull
	private String password;
}
