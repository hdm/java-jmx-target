#!/bin/sh

java -Dcom.sun.management.jmxremote \
     -Dcom.sun.management.jmxremote.port=8888 \
     -Dcom.sun.management.jmxremote.authenticate=false \
     -Dcom.sun.management.jmxremote.ssl=false \
     -Djava.security.manager -Djava.security.policy=./security.policy \
     SimpleAgent
