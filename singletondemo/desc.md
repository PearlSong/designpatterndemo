#类创建型设计模式--单例模式
模式简介
    
     确保某一个类只能有一个实例,并且自行实例化并向整个系统提供这个实例;这个类称为单例类,提供全局的访问方法。

设计理念
    
    系统中某一个需要确保唯一性的实例,通过这个类自行实例化并向整个系统提供全局访问方法;
    三个要点：
        1、在整个系统的运行期间只有一个实例存在;
        2、单例类自行完成实例的创建;
        3、对整个系统提供全局的访问方法;
    
相关角色
    
    单例类：确保某一个类只能有一个实例,并且自行实例化并向整个系统提供这个实例
   
优劣分析

    优点
        1、提供了对唯一实例的可控访问。
        2、节约系统资源
    缺点
        1、单例类难于扩展;
        2、单例类实例指责过重;
    
适用场景
    
    系统只需要一个实例,这个实例只能通过单例类获取,不允许通过其他途径创建;
        
Demo介绍
    
    1、饿汉模式(不用考虑多线程并发就能确保实例的唯一性;但不管是否使用都会创建实例;不能延迟加载)
    
    2、懒汉模式(可以延迟加载;但对于多线程并发的情况需要复杂的逻辑判断才能确保实例的唯一性;)
    
    3、IoDH(通过内部类的私有静态成员变量的方式解决了饿汉模式的不可延迟加载的缺点,
            也解决了懒汉模式的确保唯一性需要复杂判断的缺点;
            但是只有支持内部类的面向对象语言才能使用)
    