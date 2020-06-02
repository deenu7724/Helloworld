FROM tomcat:9.0.1-jre8-alpine
RUN apk update
RUN apk fetch openjdk8
RUN apk add openjdk8
ENV JAVA_HOME=/usr/lib/jvm/java-1.8-openjdk
ENV PATH="$JAVA_HOME/bin:${PATH}"
ADD ./CSE-gelect.war /usr/local/tomcat/webapps/CSE-gelect.war
ADD ./CSE-GV.war /usr/local/tomcat/webapps/CSE-GV.war
CMD ["catalina.sh", "run"]
