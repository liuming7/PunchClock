package grp.punchpoint.punchclock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;

@SpringBootApplication
public class PunchClockApplication {

    public static void main(String[] args) {
        SpringApplication.run(PunchClockApplication.class, args);
    }
}
