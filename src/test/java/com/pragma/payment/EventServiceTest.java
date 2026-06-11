package com.pragma.payment.application;

import com.pragma.payment.domain.PaymentEvent;
import com.pragma.payment.infrastructure.WebClientConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

@SpringBootTest
class EventServiceTest {

    @Autowired
    private EventService eventService;

    @Test
    void testProcessEvents() {
        Flux<PaymentEvent> events = eventService.processEvents();
        StepVerifier.create(events)
               .expectNextCount(1)
               .verifyComplete();
    }
}