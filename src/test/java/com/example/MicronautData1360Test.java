package com.example;

import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@MicronautTest
class MicronautData1360Test {

    @Inject
    EmbeddedApplication<?> application;

    @Test
    void testItWorks(PojoRepository pojos) {
        Assertions.assertTrue(pojos.somethingWithCast(new String[0]).isEmpty());
    }

}
