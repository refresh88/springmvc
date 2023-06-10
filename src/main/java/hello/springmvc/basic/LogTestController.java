package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j  // 이거 달아주면 밑에 LoggerFactory 안적어도 됨.
@RestController // 이 컨트롤러를 쓰면 일반 Controller 처럼 뷰를 반환하는 것이 아니라 String 문자 그자체를 Http 메시지 바디에 넣어버림.
public class LogTestController {

//    private final Logger log = LoggerFactory.getLogger(getClass()); // 여기서 getClass()는 LogTestController.class와 같음.

    @GetMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        System.out.println("name = " + name);

        log.trace(" trace log={}", name);
        log.debug(" debug log={}", name);
        log.info(" info log={}", name);
        log.warn(" warn log={}", name);
        log.error(" error log={}", name);

        return "ok";
    }
}
