package org.camunda.bpm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.opentelemetry.api.GlobalOpenTelemetry;
import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.metrics.LongCounter;
import io.opentelemetry.api.metrics.Meter;
@SpringBootApplication
public class Application {

	static Meter meter;
	public static void main(String... args) {
//		ExportGrpcConfiguration.initOpenTelemetry();
//		createCounter();
		SpringApplication.run(Application.class, args);
	}

	private static void createCounter() {
		OpenTelemetry openTelemetry = GlobalOpenTelemetry.get();
		meter = openTelemetry.meterBuilder("MetricasCadastral" + Thread.currentThread().getId())
				.setInstrumentationVersion("1.0.0").build();
	}
	
	public static Meter getMeter() {
		return meter;
	}
}