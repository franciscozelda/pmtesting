package de.costefrias.logbuch;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;

import de.costefrias.logbuch.pages.logbuch.entity.LogbuchEntity;
import de.costefrias.logbuch.pages.logbuch.entity.LogbuchRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class WicketApplication {
	private static final Logger log = LoggerFactory.getLogger(WicketApplication.class);
	
	public static void main(String[] args) throws Exception {
		new SpringApplicationBuilder()
		.sources(WicketApplication.class)
		.run(args);
	}
	
	@Bean
	public CommandLineRunner demo(LogbuchRepository repository) {
		return (args) -> {
			// save a couple of customers
			repository.save(new LogbuchEntity("QS-Extranet", "extranet"));
			repository.save(new LogbuchEntity("Management", "manger"));
			repository.save(new LogbuchEntity("QS-Extranet v0.0.2", "ext2"));
			repository.save(new LogbuchEntity("QS-Extranet v0.0.3", "ext3"));
			repository.save(new LogbuchEntity("QS-Extranet Development", "mang"));

			// fetch all customers
			log.info("Logbuch found with findAll():");
			log.info("-------------------------------");
			for (LogbuchEntity logbuch : repository.findAll()) {
				log.info(logbuch.toString());
			}
            log.info("");

			// fetch an individual logbuch by ID
            LogbuchEntity logbuch = repository.findOne(4L);
			log.info("LogbuchEntity found with findOne(4L):");
			log.info("--------------------------------");
			log.info(logbuch.toString());
            log.info("");

			// fetch customers by name
			log.info("LogbuchEntity found with findByName('QS-Extranet Development'):");
			log.info("--------------------------------------------");
			for (LogbuchEntity name : repository.findByName("QS-Extranet Development")) {
				log.info(name.toString());
			}
            log.info("");
		};
	}
}
