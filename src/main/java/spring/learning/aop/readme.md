dynamic proxy: 
- creating the proxy object dynamically
- handling calls to the proxied methods dynamically.

JDKDynamic vs. CGLib
jdk need interface, proxy and target are all impl the interface
cglib use inheritable, enhance subclass target class.

all calls made on a dynamic proxy are redirected to a single
invocation handler.


---

- aop 考虑的是程序的横切逻辑
- 继承的重点为是纵向的职责分派

advice 
