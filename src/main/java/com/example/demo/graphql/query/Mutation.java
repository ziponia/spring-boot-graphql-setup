package com.example.demo.graphql.query;

import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {

    public String _empty() {
        return "_empty";
    }
}
