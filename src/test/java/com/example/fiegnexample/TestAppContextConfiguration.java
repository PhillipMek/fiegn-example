package com.example.fiegnexample;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Import;


@TestConfiguration
@Import(EnableClient.class)
public class TestAppContextConfiguration {
}
