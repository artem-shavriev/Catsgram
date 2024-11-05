package ru.yandex.practicum.catsgram.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;

@ToString
@EqualsAndHashCode(of = {"id"})
@Getter
@Setter
public class Post {
    private Long id;
    private long authorId;
    private String description;
    private Instant postDate;
}
