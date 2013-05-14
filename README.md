What's this
====
This project is an sample of using [Swagger-maven-plugin](https://github.com/kongchen/swagger-maven-plugin).


How it works
=
In this project, there're 3 api resources for document:

 * com.foo.bar.api.car.CarResourceV1
 * com.foo.bar.api.car.CarResourceV2
 * com.foo.bar.api.garage.GarageResourceV1

CarResourceV1 and GarageResourceV1 are for version 1, and CarResourceV2 is for version 2.

To generate documents for both version, it is configured **2 apiSource**s

 - The one for v1 covered ```<apiClass>com.foo.bar.api.car.CarResourceV1</apiClass>``` and ```<apiPackage>com.foo.bar.api.garage</apiPackage>``` 
 - The one for v2 covered ```<apiClass>com.foo.bar.api.car.CarResourceV2</apiClass>```
 
Both of the **apiSource**s are using ***markdown.mustache*** as output template.

***Note the ```<outputPath>``` should be different, otherwise the latter will override the former***


You can check the detail configuration in [pom.xml](https://github.com/kongchen/swagger-maven-example/blob/master/pom.xml#L39-L62)

Clone the example in local and then launch:
```
mvn compile
```
You'll get the ouputs.

I've uploaded the output files as well, click to view them directly [docV1.md](https://github.com/kongchen/swagger-maven-example/blob/master/docV1.md) and [docV2.md](https://github.com/kongchen/swagger-maven-example/blob/master/docV2.md)

*Enjoy!*
