package Covid19Tracker.Covid19Tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableScheduling
@ComponentScan("Covid19Tracker.Controllers,model.locationstats,Covid19Tracker.DataService,CovidController.java,locationstats.java,CoronavirusdataService.java))")
@SpringBootApplication
public class Covid19TrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Covid19TrackerApplication.class, args);
	}

}
