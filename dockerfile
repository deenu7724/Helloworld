FROM tomcat:9.0.1-jre8-alpine

ADD ./CSE-gelect.war /usr/local/tomcat/webapps/CSE-gelect.war

ADD ./CSE-GV.war /usr/local/tomcat/webapps/CSE-GV.war

CMD ["catalina.sh", "run"]
