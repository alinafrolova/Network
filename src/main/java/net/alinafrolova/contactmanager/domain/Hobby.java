package net.alinafrolova.contactmanager.domain;

import javax.persistence.*;

/**
 * Created by Frolova.A on 9/23/15.
 */
@Entity
@Table(name = "HOBBIES")

public class Hobby {
    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Integer id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "DESCRIPTION")
    private String description;


}
