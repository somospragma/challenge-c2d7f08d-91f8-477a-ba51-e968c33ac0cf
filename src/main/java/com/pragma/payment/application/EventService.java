package com.pragma.payment.application;

import com.pragma.payment.domain.PaymentEvent;
import com.pragma.payment.infrastructure.WebClientConfig;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class EventService {
    private final WebClient webClient;

    public EventService(WebClientConfig webClientConfig) {
        this.webClient = webClientConfig.webClient();
    }

    public Flux<PaymentEvent> processEvents() {
        return webClient.get()
               .retrieve()
               .bodyToFlux(PaymentEvent.class)
               .onErrorResume(e -> Flux.error(new RuntimeException("Error processing events", e)));
    }
}