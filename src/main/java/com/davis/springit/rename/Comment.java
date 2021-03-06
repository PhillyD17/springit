package com.davis.springit.rename;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Comment {

    @Id
    @GeneratedValue
    private Long id;
    private String body;

}
