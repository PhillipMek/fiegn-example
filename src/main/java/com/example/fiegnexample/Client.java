package com.example.fiegnexample;

import com.example.fiegnexample.model.Message;
import com.example.fiegnexample.model.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;


@FeignClient(name = "example-client", url = "${example.client.url}", configuration = FeignConfiguration.class)
public interface Client {

    @PostMapping("/api/v2/topics/{topicName}")
    Response sendMessage(
            @PathVariable("topicName") String topicName,
            @RequestBody Message message,
            @RequestHeader(value = HttpHeaders.CONTENT_TYPE) String acceptHeader);
}
