
### Context Tests ###

In these tests we test with full Spring configuration.  
- Configuration class that un-registers 

static class TestConfig implements ApplicationListener<ContextRefreshedEvent>

ApplicationListener

Events are overlooed functionality in the Spring framework,

https://www.baeldung.com/spring-events

event publishing provided by ApplicationContext

- Event should exstend ApplicationEvent
- Publishedr should inject an ApplicationEventPublisher object
- Listener should implement the ApplicationListener interface

custom listener is parameterized with the generic type of custom event which makes the onApplicationEvent() method type-safe

Also avoids having to check if object is instance of a specifc event class and casting it

By default spring events are synchronous

doStuffAndPublishAnEvent() method blocks until all listeners finish processing the event


Spring itself publishes a variety of events out of the box. For example, the ApplicationContext will fire various framework events. E.g. ContextRefreshedEvent, ContextStartedEvent, RequestHandledEvent etc.

These events provide application developers an option to hook into the lifecycle of the application and the context and add in their own custom logic where needed.


With events, on the other hand, we just say that an event occurred and which modules are notified about it is not our concern. It’s good to use events when we want to pass on the processing to another thread (example: sending an email on some task completion). Also, events come in handy for test-driven development.




Events are meant for exchanging information between loosely coupled components. A