# Rest Services and Swagger Documentation

## Links
* https://www.youtube.com/watch?v=gduKpLW_vdY (part 1)
* https://www.youtube.com/watch?v=8s9I1G4tXhA (part 2)

## Key Notes
* Create a Docket (Spring Bean) object to configure the documentation in Swagger.
* Develop/Interact/Document API's
* Auto Gen documentation based on meta-data in the code.
* Concurrent Hashmap used in memory to store the data for the demo.
* Using Springfox Dependency to the project for Swagger.
    ````
    <dependency>
        <groupId>io.springfox</groupId>
        <artifactId>springfox-swagger2</artifactId>
        <version>2.9.2</version>
    </dependency>
    ````
* Annotation to enable Swagger in the main class.
* ```` @EnableSwagger2 ````
* API in application is then available for JSON.
    ````
    localhost:8080/v2/api-docs
    ````
* For HTML use Springfox Swagger UI
  ````
      <dependency>
          <groupId>io.springfox</groupId>
          <artifactId>springfox-swagger-ui</artifactId>
          <version>2.9.2</version>
      </dependency>
  ````
* Had to create a Configuration class to enable the Swagger UI

* http://localhost:8080/docApi/swagger-ui.html
* (see explanation here https://github.com/springfox/springfox/issues/1638)
* NB Need to migrate away from springfox at some point https://springdoc.org/#migrating-from-springfox
* 