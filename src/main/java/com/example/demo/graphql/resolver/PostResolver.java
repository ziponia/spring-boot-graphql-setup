package com.example.demo.graphql.resolver;

import com.example.demo.graphql.schema.Post;
import graphql.kickstart.tools.GraphQLResolver;
import org.springframework.stereotype.Component;

@Component
public class PostResolver implements GraphQLResolver<Post> {

    public Post getPost() {
        return new Post();
    }

    public String _version() {
        return "1.0";
    }
}
