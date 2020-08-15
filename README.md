# mapstruct-examples-quarkus

https://mapstruct.org/news/2019-12-06-mapstruct-and-quarkus/

## Build native image

mvn clean package -Pnative   
docker build -f src/main/docker/Dockerfile.native -t mapstruct-examples-quarkus .   
docker run -i --rm -p 8080:8080 mapstruct-examples-quarkus   
