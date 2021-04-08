实现一个EventBus

提交同步任务，或者异步任务

对比COLA框架提供的异步框架

DomainEventPublisher.java

    提供了EventBus、AsyncEventBus两个类，提交同步任务和异步任务的作用
    
各种Handler implements EventHandlerI<Response, SmsCreatedByStateEvent> 实现 ObserverAction.java 功能

    ObserverAction。根据event参数，执行execute方法。
    
    
    
    
        