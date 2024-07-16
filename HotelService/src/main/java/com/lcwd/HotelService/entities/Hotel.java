package com.lcwd.HotelService.entities;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
@Entity
@Table(name = "micro_hotels")
public class Hotel {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name", length = 255)
    private String name;

    @Column(name = "email")
    private String location;

    @Column(name = "about", length = 1000)
    private String about;
}
