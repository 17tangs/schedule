FROM tomcat:8.0.52-jre8-alpine
RUN ["rm", "-rf", "/usr/local/tomcat/webapps/ROOT"]
COPY ./target/com.schedule-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war
