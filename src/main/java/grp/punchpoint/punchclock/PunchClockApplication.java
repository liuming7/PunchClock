package grp.punchpoint.punchclock;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;

import java.util.logging.Logger;


/**
 * author Miles
 */
@SpringBootApplication
@Log4j2
public class PunchClockApplication {

    public PunchClockApplication() {
        this.logger.info("\n           ___          ___          ___          ___          ___          ___\n" +
                "          /\\__\\        /\\__\\        /\\  \\        /\\  \\        /\\  \\        /\\__\\\n" +
                "=========/:/  /=======/::L_L_=======\\:\\  \\======/::\\  \\======/::\\  \\======/:/__/_=============\n" +
                " \\\\     /:/__/       /:/L:\\__\\      /::\\__\\    /::\\:\\__\\    /:/\\:\\__\\    /::\\/\\__\\           \\\\\n" +
                "  \\\\    \\:\\  \\       \\/_/:/  /     /:/\\/__/    \\:\\:\\/__/    \\:\\ \\/__/    \\/\\::/  /       ___  \\\\\n" +
                "   \\\\    \\:\\__\\        /:/  /      \\/__/        \\:\\/__/      \\:\\__\\        /:/  /       /\\__\\  \\\\\n" +
                "    \\\\    \\/__/        \\/__/                     \\/__/        \\/__/        \\/__/        \\/__/   \\\\\n" +
                "     \\\\                                                                     Made by Mengnan Wu   \\\\\n" +
                "      ==============================================================================================");
    }


    public Logger logger = Logger.getLogger("PunchClockApplication.class");

    /**
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(PunchClockApplication.class, args);
    }
}
