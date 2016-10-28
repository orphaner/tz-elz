package org.beroot.technozaure.elk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

import static net.logstash.logback.argument.StructuredArguments.keyValue;

@RestController
@Slf4j
public class JsonLogService {

    @RequestMapping("log/json")
    public void jsonLog() {
        log.info("My text log is in json with KV : {}", keyValue("key", "value"));
    }
}
