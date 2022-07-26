package com.example.jpamanytomany;

import com.example.jpamanytomany.model.Stream;
import com.example.jpamanytomany.model.Viewer;
import com.example.jpamanytomany.repository.StreamRepository;
import com.example.jpamanytomany.repository.ViewerRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class JpaManyToManyApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(JpaManyToManyApplication.class, args);

		StreamRepository streamRepository = configurableApplicationContext
				.getBean(StreamRepository.class);

		ViewerRepository viewerRepository = configurableApplicationContext
				.getBean(ViewerRepository.class);

		Viewer johnViewer = new Viewer("John12");
		Viewer willViewer = new Viewer("WillM2");
		Viewer samViewer = new Viewer("MightySam");
		List<Viewer> viewers = Arrays.asList(johnViewer, willViewer, samViewer);

		Stream cookingStream = new Stream("CookingIsAwesome");
		Stream gamingStream = new Stream("ChillGaming");
		List<Stream> streams = Arrays.asList(cookingStream, gamingStream);

		streamRepository.saveAll(streams);

		johnViewer.followStream(cookingStream);
		willViewer.followStream(gamingStream);
		samViewer.followStream(gamingStream);
		samViewer.followStream(cookingStream );

		viewerRepository.saveAll(viewers);
	}
}
