# Spring-Cloud-Netflix
POC - Spring Cloud


Eureka - Resume
- Provides a look up server for your server so that you can find other services
- Passive service discovery having services register themselves and find others automatically
- copies of registered servers
- Client services register with Eureka providing: host, port, health, indicator url,etc
- Client services send heartbeats to Eureka (Eureka removes services without heartbeats).
- Eureka Servers comunicate to each other to share state
- Each Eureka Servers should know URL to the others
	- It can be provided by Config Server
- Eureka Servers are actually a Eureka Client as well because they comunicate to other Eureka Servers

