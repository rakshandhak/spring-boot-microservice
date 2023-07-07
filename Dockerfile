FROM openjdk:17.0.1
COPY ./target/product-1.jar /usr/app/
WORKDIR /usr/app
RUN sh -c 'touch product-1.jar'
ENTRYPOINT ["java","-jar","product-1.jar"]