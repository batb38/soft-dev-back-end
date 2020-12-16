package mn.num.edu.bagy.PHHugjuulelt.model;

import lombok.*;
import mn.num.edu.bagy.PHHugjuulelt.entity.Lesson;

import javax.persistence.*;
import java.util.Collection;
/**
 * @author Bagy
 *
 * */
@Data
@NoArgsConstructor
@Entity
@Table( name = "user",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "username"),
                @UniqueConstraint(columnNames = "email")
        })
public class User {
    @Getter
    @Setter

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NonNull
    private String username;

    @NonNull
    private String firstName;

    @NonNull
    private String lastName;

    @NonNull
    private String email;

    @NonNull
    private int phoneNumber;

    @NonNull
    private String password;

    @Column
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "user_id"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id"
            )
    )
    private Collection<Role> roles;

    @Column
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "users_lessons",
            joinColumns = @JoinColumn(
                    name = "user_id"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "lesson_id"
            )
    )
    private Collection<Lesson> boughtLessons;

    public User(String firstName, String lastName, String username, String email, int phoneNumber, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

}
