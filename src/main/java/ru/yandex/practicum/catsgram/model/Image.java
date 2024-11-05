package ru.yandex.practicum.catsgram.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode(of = {"id"})
@Getter
@Setter
public class Image {
    private Long id;
    private long postId;
    private String originalFileName;
    private String filePath;
}