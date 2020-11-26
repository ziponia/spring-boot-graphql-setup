package com.example.demo.graphql.schema;

import lombok.Data;

@Data
public class Post {

    private String id;
    private String title;
    private String category;
    private String authorId;
}
