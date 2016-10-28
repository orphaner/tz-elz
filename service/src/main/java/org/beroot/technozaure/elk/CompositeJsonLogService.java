package org.beroot.technozaure.elk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

import static net.logstash.logback.argument.StructuredArguments.kv;

@RestController
@Slf4j
public class CompositeJsonLogService {

    @RequestMapping("log/composite")
    public void compositeJsonLog() {
        log.info("My text log is in json with KV : ", kv("key", "value"), kv("clientID", "12398384"));
    }
}
