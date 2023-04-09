<img alt="logo" src="spring.svg" height="70px" /> <img alt="logo" src="eo-kafka.svg" height="100px" />

[![Managed By Self XDSD](https://self-xdsd.com/b/mbself.svg)](https://self-xdsd.com/p/eo-cqrs/eo-kafka?provider=github)

[![EO principles respected here](https://www.elegantobjects.org/badge.svg)](https://www.elegantobjects.org)
[![DevOps By Rultor.com](https://www.rultor.com/b/eo-cars/eo-kafka)](https://www.rultor.com/p/eo-cqrs/eo-kafka)
[![We recommend IntelliJ IDEA](https://www.elegantobjects.org/intellij-idea.svg)](https://www.jetbrains.com/idea/)
<br>

[![maven](https://github.com/eo-cqrs/spring-eo-kafka/actions/workflows/mvn.yaml/badge.svg)](https://github.com/eo-cqrs/spring-eo-kafka/actions/workflows/mvn.yaml)
[![xcop](https://github.com/eo-cqrs/spring-eo-kafka/actions/workflows/xcop.yaml/badge.svg)](https://github.com/eo-cqrs/spring-eo-kafka/actions/workflows/xcop.yaml)
[![codecov](https://codecov.io/gh/eo-cqrs/spring-eo-kafka/branch/master/graph/badge.svg?token=AMV1K8GXC6)](https://codecov.io/gh/eo-cqrs/spring-eo-kafka)

[![Hits-of-Code](https://hitsofcode.com/github/eo-cqrs/spring-eo-kafka)](https://hitsofcode.com/view/github/eo-cqrs/spring-eo-kafka)
[![Lines-of-Code](https://tokei.rs/b1/github/eo-cqrs/spring-eo-kafka)](https://github.com/eo-cqrs/spring-eo-kafka)
[![PDD status](http://www.0pdd.com/svg?name=eo-cqrs/spring-eo-kafka)](http://www.0pdd.com/p?name=eo-cqrs/spring-eo-kafka)
[![License](https://img.shields.io/badge/license-MIT-green.svg)](https://github.com/eo-cqrs/spring-eo-kafka/blob/master/LICENSE.txt)

Project architect: [@h1alexbel](https://github.com/h1alexbel)

[EO Kafka](https://github.com/eo-cqrs/eo-kafka) in fashion of Spring Framework.

**How to use**. All you need is this (get the latest version [here](https://search.maven.org/artifact/io.github.eo-cqrs/spring-eo-kafka)):

Maven:
```xml
<dependency>
  <groupId>io.github.eo-cqrs</groupId>
  <artifactId>spring-eo-kafka</artifactId>
</dependency>
```

Gradle:
```groovy
dependencies {
    compile 'io.github.eo-cqrs:spring-eo-kafka:<version>'
}
```

## API
TBD

## How to Contribute

Fork repository, make changes, send us a [pull request](https://www.yegor256.com/2014/04/15/github-guidelines.html).
We will review your changes and apply them to the `master` branch shortly,
provided they don't violate our quality standards. To avoid frustration,
before sending us your pull request please run full Maven build:

```bash
$ mvn clean install
```

You will need Maven 3.8.7+ and Java 17+.

Our [rultor image](https://github.com/eo-cqrs/eo-kafka-rultor-image) for CI/CD.
