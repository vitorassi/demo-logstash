#README
 
 This project is a demo for using logstash with Spring boot, slasticsearch and Kibana

### PRE-REQUISITES

1. Java 11
2. Maven 3
3. Docker
4. Docker compose

### HOW TO TRY IT

- To execute project open folder docker-elastic-kibana with terminal 
- run docker command “docker-compose up -d”
- Wait init application slasticsearch and Kibana
- Start the spring boot application 
- Go to the home page Kibana (http://localhost:5601)
- Go to discover page
- Add the new index with pattern name "demo-logstash-*"

### CREATED BY 
    ANDERSON VITORASSI