package mn.num.edu.bagy.PHHugjuulelt.payload.request;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Data
public class SignupRequest {
    @Getter
    @Setter

    @NotNull
    private String username;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    private String email;

    private Set<String> role;

    @NotNull
    private String password;

    @NotNull
    private int phoneNumber;
}
