package net.alinafrolova.contactmanager.domain;

import net.alinafrolova.contactmanager.web.Hobby;
import net.alinafrolova.contactmanager.web.Place;
import sun.util.resources.LocaleData;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Frolova.A on 9/23/15.
 */
@Entity //Класс представляет объект, который нужно долговременно хранить.
@Table(name = "CONTACTS") //Свойства класса будем хранить в таблице CONTACTS.

public class Contact {
    @Id //Это поле уникальное для объектов, то есть по нему будем искать объекты.
    @Column(name = "ID")
    @GeneratedValue //Значение этого поля будет назначаться не нами, а генерироваться автоматически.
    private Integer id;

    @Column(name = "FIRSTNAME") //Это свойство будет храниться в столбце firstname.
    private String firstName;

    @Column(name = "LASTNAME") //Это свойство будет храниться в столбце lastName.
    private String lastName;

    @Column(name = "BIRTHDATE") //Это свойство будет храниться в столбце birthDate.
    private LocaleData birthDate;

    @Column(name = "HOBBIES") //Это свойство будет храниться в столбце hobbies.
    private Set<Hobby> hobbies;

    @Column(name = "PLACES") //Это свойство будет храниться в столбце places.
    private Set<Place> places;
}
