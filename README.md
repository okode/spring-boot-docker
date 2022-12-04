# Spring Boot Docker

## Building with Docker

```
docker build -t app
```

## Docker running with JMX / VisualVM support

```
docker run -ti -p 9090:9090 -p 8080:8080 -e JAVA_OPTS="-Dcom.sun.management.jmxremote -Djava.rmi.server.hostname=0.0.0.0 -Dcom.sun.management.jmxremote.port=9090 -Dcom.sun.management.jmxremote.rmi.port=9090 -Dcom.sun.management.jmxremote.local.only=false -Dcom.sun.management.jmxremote.ssl=false -Dcom.sun.management.jmxremote.authenticate=false" app
```