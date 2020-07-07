package cg.blog.blogapp.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;

}
