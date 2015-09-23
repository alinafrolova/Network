package net.alinafrolova.contactmanager.domain;

import javax.persistence.*;

/**
 * Created by Frolova.A on 9/23/15.
 */

@Entity
@Table(name = "MESSAGES")

public class Message {
    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Integer id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "LONDITUDE")
    private double longitude;

    @Column(name = "DESCRIPTION")
    private double description;
}
