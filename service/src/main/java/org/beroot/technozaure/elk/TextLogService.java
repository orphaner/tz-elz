package org.beroot.technozaure.elk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class TextLogService {

    @RequestMapping("log/text")
    public void textLog() {
        log.info("My text log is '{}'", "Value");
    }
}
