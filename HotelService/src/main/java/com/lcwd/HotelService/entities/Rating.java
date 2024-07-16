package com.lcwd.HotelService.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
@Entity
@Table(name = "micro_rating")
public class Rating {
    @Id
    private  String ratingId;
    private String userId;
    private String hotelId;
    private Integer rating;
    private String remark;
}
