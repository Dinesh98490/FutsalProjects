package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class Book {
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="books_seq_gen")
    @SequenceGenerator(name="books_seq_gen",sequenceName="books_seq",allocationSize=1)
    @Id
    private Integer id;

    @Column(name ="book_name",nullable = false,length = 100)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ground_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_books_ground_id"))
    private Ground ground;

    @ManyToOne(fetch = FetchType.LAZY,cascade=CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_books_user_id"))
    private User user;

}