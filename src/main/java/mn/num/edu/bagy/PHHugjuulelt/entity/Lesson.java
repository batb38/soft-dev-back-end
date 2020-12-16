package mn.num.edu.bagy.PHHugjuulelt.entity;

import lombok.*;

import javax.persistence.*;
/**
 * @author Bagy
 *
 * */
@Data
@NoArgsConstructor
@Entity
@Table(name = "LESSON_TBL")
public class Lesson {

    @Getter
    @Setter

    @Id
    @GeneratedValue
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private String category;

    @Column
    private String author;

    @Column
    private String shortInfo;

    @Column(length = 999999999)
    private String photo;

    @Column
    private int rating;

    @Column
    private int price;

    @Column
    private String content;


    public Lesson(String name, String category, String author, String shortInfo, String photo, int price, String content) {
        this.name = name;
        this.category = category;
        this.author = author;
        this.shortInfo = shortInfo;
        this.photo = photo;
        this.price = price;
        this.content = content;
    }
}
