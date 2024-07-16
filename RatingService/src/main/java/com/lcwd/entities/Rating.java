package com.lcwd.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.lang.annotation.Documented;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
@Entity
@Table(name = "micro_rating")
//@Documented() when you are using mongoDB database
public class Rating {
    @Id
    private  String ratingId;
    private String userId;
    private String hotelId;
    private Integer rating;
    private String remark;
}
