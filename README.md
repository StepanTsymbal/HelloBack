# HelloBack

RESTful App was created on Spring Boot. PostgreSQL is used. Parametres for launching:

    Server port: 8181
    DB name: 'ContactsDB' (it must be created)
    URL for DB: 'jdbc:postgresql://localhost:5432/ContactsDB'
    DB login: 'postgres'
    DB password: 'postgres'

You may use these parametres. In order to use own ones you have change 'application.properties' file

Application processes table 'Contacts'. It will be created in case of its absence.

# Travis-CI log:
Using worker: worker-linux-docker-a4ee465c.prod.travis-ci.org:travis-linux-15

system_info

Build system information

Build language: java

Build group: stable

Build dist: precise

Build image provisioning date and time

Thu Feb  5 15:09:33 UTC 2015

Operating System Details

Distributor ID:	Ubuntu

Description:	Ubuntu 12.04.5 LTS

Release:	12.04

Codename:	precise

Linux Version

3.13.0-29-generic

Cookbooks Version

a68419e https://github.com/travis-ci/travis-cookbooks/tree/a68419e

GCC version

gcc (Ubuntu/Linaro 4.6.3-1ubuntu5) 4.6.3

Copyright (C) 2011 Free Software Foundation, Inc.

This is free software; see the source for copying conditions.  There is NO

warranty; not even for MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.

LLVM version

clang version 3.4 (tags/RELEASE_34/final)

Target: x86_64-unknown-linux-gnu

Thread model: posix

Pre-installed Ruby versions

ruby-1.9.3-p551

Pre-installed Node.js versions

v0.10.36

Pre-installed Go versions

1.4.1

Redis version

redis-server 2.8.19

riak version

2.0.2

MongoDB version

MongoDB 2.4.12

CouchDB version

couchdb 1.6.1

Neo4j version

1.9.4

RabbitMQ Version

3.4.3

ElasticSearch version

1.4.0

Installed Sphinx versions

2.0.10

2.1.9

2.2.6

Default Sphinx version

2.2.6

Installed Firefox version

firefox 31.0esr

PhantomJS version

1.9.8

ant -version

Apache Ant(TM) version 1.8.2 compiled on December 3 2011

mvn -version

Apache Maven 3.2.5 (12a6b3acb947671f09b81f49094c53f426d8cea1; 2014-12-14T17:29:23+00:00)

Maven home: /usr/local/maven

Java version: 1.7.0_76, vendor: Oracle Corporation

Java home: /usr/lib/jvm/java-7-oracle/jre

Default locale: en_US, platform encoding: ANSI_X3.4-1968

OS name: "linux", version: "3.13.0-29-generic", arch: "amd64", family: "unix"

fix.CVE-2015-7547

$ export DEBIAN_FRONTEND=noninteractive

W: Size of file /var/lib/apt/lists/us.archive.ubuntu.com_ubuntu_dists_precise-backports_multiverse_source_Sources.gz is not what the server reported 5886 5888

W: Size of file /var/lib/apt/lists/ppa.launchpad.net_ubuntugis_ppa_ubuntu_dists_precise_main_binary-amd64_Packages.gz is not what the server reported 36669 36677

W: Size of file /var/lib/apt/lists/ppa.launchpad.net_ubuntugis_ppa_ubuntu_dists_precise_main_binary-i386_Packages.gz is not what the server reported 36729 36733

Reading package lists...

Building dependency tree...

Reading state information...

The following extra packages will be installed:

  libc-bin libc-dev-bin libc6-dev

Suggested packages:

  glibc-doc

The following packages will be upgraded:

  libc-bin libc-dev-bin libc6 libc6-dev

4 upgraded, 0 newly installed, 0 to remove and 248 not upgraded.

Need to get 8,840 kB of archives.

After this operation, 14.3 kB disk space will be freed.

Get:1 http://us.archive.ubuntu.com/ubuntu/ precise-updates/main libc6-dev amd64 2.15-0ubuntu10.15 [2,943 kB]

Get:2 http://us.archive.ubuntu.com/ubuntu/ precise-updates/main libc-dev-bin amd64 2.15-0ubuntu10.15 [84.7 kB]

Get:3 http://us.archive.ubuntu.com/ubuntu/ precise-updates/main libc-bin amd64 2.15-0ubuntu10.15 [1,177 kB]

Get:4 http://us.archive.ubuntu.com/ubuntu/ precise-updates/main libc6 amd64 2.15-0ubuntu10.15 [4,636 kB]

Fetched 8,840 kB in 0s (35.0 MB/s)

Preconfiguring packages ...

(Reading database ... 72019 files and directories currently installed.)

Preparing to replace libc6-dev 2.15-0ubuntu10.10 (using .../libc6-dev_2.15-0ubuntu10.15_amd64.deb) ...

Unpacking replacement libc6-dev ...

Preparing to replace libc-dev-bin 2.15-0ubuntu10.10 (using .../libc-dev-bin_2.15-0ubuntu10.15_amd64.deb) ...

Unpacking replacement libc-dev-bin ...

Preparing to replace libc-bin 2.15-0ubuntu10.10 (using .../libc-bin_2.15-0ubuntu10.15_amd64.deb) ...

Unpacking replacement libc-bin ...

Processing triggers for man-db ...

Setting up libc-bin (2.15-0ubuntu10.15) ...

(Reading database ... 72018 files and directories currently installed.)

Preparing to replace libc6 2.15-0ubuntu10.10 (using .../libc6_2.15-0ubuntu10.15_amd64.deb) ...

Unpacking replacement libc6 ...

Setting up libc6 (2.15-0ubuntu10.15) ...

Setting up libc-dev-bin (2.15-0ubuntu10.15) ...

Setting up libc6-dev (2.15-0ubuntu10.15) ...

Processing triggers for libc-bin ...

ldconfig deferred processing now taking place
git.checkout

0.34s$ git clone --depth=50 --branch=master https://github.com/StepanTsymbal/HelloBack.git StepanTsymbal/HelloBack

Cloning into 'StepanTsymbal/HelloBack'...

remote: Counting objects: 61, done.

remote: Compressing objects: 100% (45/45), done.

remote: Total 61 (delta 5), reused 59 (delta 3), pack-reused 0

Unpacking objects: 100% (61/61), done.

Checking connectivity... done.

$ cd StepanTsymbal/HelloBack

$ git checkout -qf ffbd3afabf614c205bb6aa11ac575cf17a9cb2a9

This job is running on container-based infrastructure, which does not allow use of 'sudo', setuid and setguid executables.

If you require sudo, add 'sudo: required' to your .travis.yml

See https://docs.travis-ci.com/user/workers/container-based-infrastructure/ for details.

$ jdk_switcher use oraclejdk8

Switching to Oracle JDK8 (java-8-oracle), JAVA_HOME will be set to /usr/lib/jvm/java-8-oracle

$ java -Xmx32m -version

java version "1.8.0_31"

Java(TM) SE Runtime Environment (build 1.8.0_31-b13)

Java HotSpot(TM) 64-Bit Server VM (build 25.31-b07, mixed mode)

$ javac -J-Xmx32m -version

javac 1.8.0_31
install

31.88s$ mvn install -DskipTests=true -Dmaven.javadoc.skip=true -B -V

Java HotSpot(TM) 64-Bit Server VM warning: ignoring option MaxPermSize=192m; support was removed in 8.0

Apache Maven 3.2.5 (12a6b3acb947671f09b81f49094c53f426d8cea1; 2014-12-14T17:29:23+00:00)

Maven home: /usr/local/maven

Java version: 1.8.0_31, vendor: Oracle Corporation

Java home: /usr/lib/jvm/java-8-oracle/jre

Default locale: en_US, platform encoding: UTF-8

OS name: "linux", version: "3.13.0-40-generic", arch: "amd64", family: "unix"

[INFO] Scanning for projects...

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-parent/1.3.5.RELEASE/spring-boot-starter-parent-1.3.5.RELEASE.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-parent/1.3.5.RELEASE/spring-boot-starter-parent-1.3.5.RELEASE.pom (7 KB at 32.6 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-dependencies/1.3.5.RELEASE/spring-boot-dependencies-1.3.5.RELEASE.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-dependencies/1.3.5.RELEASE/spring-boot-dependencies-1.3.5.RELEASE.pom (73 KB at 1296.6 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/spring-framework-bom/4.2.6.RELEASE/spring-framework-bom-4.2.6.RELEASE.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/spring-framework-bom/4.2.6.RELEASE/spring-framework-bom-4.2.6.RELEASE.pom (5 KB at 185.1 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/data/spring-data-releasetrain/Gosling-SR4/spring-data-releasetrain-Gosling-SR4.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/data/spring-data-releasetrain/Gosling-SR4/spring-data-releasetrain-Gosling-SR4.pom (5 KB at 203.8 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/data/build/spring-data-build/1.7.4.RELEASE/spring-data-build-1.7.4.RELEASE.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/data/build/spring-data-build/1.7.4.RELEASE/spring-data-build-1.7.4.RELEASE.pom (3 KB at 117.8 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/integration/spring-integration-bom/4.2.5.RELEASE/spring-integration-bom-4.2.5.RELEASE.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/integration/spring-integration-bom/4.2.5.RELEASE/spring-integration-bom-4.2.5.RELEASE.pom (9 KB at 306.2 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/security/spring-security-bom/4.0.4.RELEASE/spring-security-bom-4.0.4.RELEASE.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/security/spring-security-bom/4.0.4.RELEASE/spring-security-bom-4.0.4.RELEASE.pom (5 KB at 202.0 KB/sec)

[INFO]                                                                         

[INFO] ------------------------------------------------------------------------

[INFO] Building DBConnector 0.0.1-SNAPSHOT

[INFO] ------------------------------------------------------------------------

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-maven-plugin/1.3.5.RELEASE/spring-boot-maven-plugin-1.3.5.RELEASE.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-maven-plugin/1.3.5.RELEASE/spring-boot-maven-plugin-1.3.5.RELEASE.pom (6 KB at 9.8 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-tools/1.3.5.RELEASE/spring-boot-tools-1.3.5.RELEASE.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-tools/1.3.5.RELEASE/spring-boot-tools-1.3.5.RELEASE.pom (2 KB at 43.9 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-parent/1.3.5.RELEASE/spring-boot-parent-1.3.5.RELEASE.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-parent/1.3.5.RELEASE/spring-boot-parent-1.3.5.RELEASE.pom (25 KB at 345.3 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-maven-plugin/1.3.5.RELEASE/spring-boot-maven-plugin-1.3.5.RELEASE.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-maven-plugin/1.3.5.RELEASE/spring-boot-maven-plugin-1.3.5.RELEASE.jar (57 KB at 1051.2 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-resources-plugin/2.6/maven-resources-plugin-2.6.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-resources-plugin/2.6/maven-resources-plugin-2.6.pom (8 KB at 293.5 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/23/maven-plugins-23.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/23/maven-plugins-23.pom (9 KB at 374.3 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/22/maven-parent-22.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/22/maven-parent-22.pom (30 KB at 660.1 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/apache/11/apache-11.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/apache/11/apache-11.pom (15 KB at 602.7 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-resources-plugin/2.6/maven-resources-plugin-2.6.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-resources-plugin/2.6/maven-resources-plugin-2.6.jar (29 KB at 670.4 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-compiler-plugin/3.1/maven-compiler-plugin-3.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-compiler-plugin/3.1/maven-compiler-plugin-3.1.pom (10 KB at 433.5 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/24/maven-plugins-24.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/24/maven-plugins-24.pom (11 KB at 405.9 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/23/maven-parent-23.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/23/maven-parent-23.pom (32 KB at 994.4 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/apache/13/apache-13.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/apache/13/apache-13.pom (14 KB at 545.9 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-compiler-plugin/3.1/maven-compiler-plugin-3.1.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-compiler-plugin/3.1/maven-compiler-plugin-3.1.jar (42 KB at 1271.0 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-surefire-plugin/2.18.1/maven-surefire-plugin-2.18.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-surefire-plugin/2.18.1/maven-surefire-plugin-2.18.1.pom (6 KB at 240.3 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire/2.18.1/surefire-2.18.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire/2.18.1/surefire-2.18.1.pom (17 KB at 655.5 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/26/maven-parent-26.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/26/maven-parent-26.pom (39 KB at 1214.1 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/apache/16/apache-16.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/apache/16/apache-16.pom (16 KB at 455.6 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-surefire-plugin/2.18.1/maven-surefire-plugin-2.18.1.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-surefire-plugin/2.18.1/maven-surefire-plugin-2.18.1.jar (37 KB at 1004.1 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-jar-plugin/2.5/maven-jar-plugin-2.5.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-jar-plugin/2.5/maven-jar-plugin-2.5.pom (8 KB at 287.9 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/25/maven-plugins-25.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/25/maven-plugins-25.pom (10 KB at 388.6 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/24/maven-parent-24.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/24/maven-parent-24.pom (37 KB at 1126.0 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/apache/14/apache-14.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/apache/14/apache-14.pom (15 KB at 623.5 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-jar-plugin/2.5/maven-jar-plugin-2.5.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-jar-plugin/2.5/maven-jar-plugin-2.5.jar (25 KB at 934.3 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-install-plugin/2.5.2/maven-install-plugin-2.5.2.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-install-plugin/2.5.2/maven-install-plugin-2.5.2.pom (7 KB at 284.9 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-install-plugin/2.5.2/maven-install-plugin-2.5.2.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-install-plugin/2.5.2/maven-install-plugin-2.5.2.jar (33 KB at 1115.1 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-data-jpa/1.3.5.RELEASE/spring-boot-starter-data-jpa-1.3.5.RELEASE.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-data-jpa/1.3.5.RELEASE/spring-boot-starter-data-jpa-1.3.5.RELEASE.pom (3 KB at 100.2 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starters/1.3.5.RELEASE/spring-boot-starters-1.3.5.RELEASE.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starters/1.3.5.RELEASE/spring-boot-starters-1.3.5.RELEASE.pom (4 KB at 199.2 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter/1.3.5.RELEASE/spring-boot-starter-1.3.5.RELEASE.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter/1.3.5.RELEASE/spring-boot-starter-1.3.5.RELEASE.pom (2 KB at 82.8 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot/1.3.5.RELEASE/spring-boot-1.3.5.RELEASE.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot/1.3.5.RELEASE/spring-boot-1.3.5.RELEASE.pom (8 KB at 136.2 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/spring-core/4.2.6.RELEASE/spring-core-4.2.6.RELEASE.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/spring-core/4.2.6.RELEASE/spring-core-4.2.6.RELEASE.pom (3 KB at 60.8 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/spring-context/4.2.6.RELEASE/spring-context-4.2.6.RELEASE.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/spring-context/4.2.6.RELEASE/spring-context-4.2.6.RELEASE.pom (5 KB at 204.7 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/spring-aop/4.2.6.RELEASE/spring-aop-4.2.6.RELEASE.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/spring-aop/4.2.6.RELEASE/spring-aop-4.2.6.RELEASE.pom (3 KB at 147.4 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/aopalliance/aopalliance/1.0/aopalliance-1.0.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/aopalliance/aopalliance/1.0/aopalliance-1.0.pom (363 B at 16.9 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/spring-beans/4.2.6.RELEASE/spring-beans-4.2.6.RELEASE.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/spring-beans/4.2.6.RELEASE/spring-beans-4.2.6.RELEASE.pom (3 KB at 97.7 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/spring-expression/4.2.6.RELEASE/spring-expression-4.2.6.RELEASE.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/spring-expression/4.2.6.RELEASE/spring-expression-4.2.6.RELEASE.pom (2 KB at 67.3 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-autoconfigure/1.3.5.RELEASE/spring-boot-autoconfigure-1.3.5.RELEASE.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-autoconfigure/1.3.5.RELEASE/spring-boot-autoconfigure-1.3.5.RELEASE.pom (18 KB at 416.7 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-logging/1.3.5.RELEASE/spring-boot-starter-logging-1.3.5.RELEASE.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-logging/1.3.5.RELEASE/spring-boot-starter-logging-1.3.5.RELEASE.pom (2 KB at 44.9 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/ch/qos/logback/logback-classic/1.1.7/logback-classic-1.1.7.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/ch/qos/logback/logback-classic/1.1.7/logback-classic-1.1.7.pom (13 KB at 235.7 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/ch/qos/logback/logback-parent/1.1.7/logback-parent-1.1.7.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/ch/qos/logback/logback-parent/1.1.7/logback-parent-1.1.7.pom (18 KB at 813.6 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/ch/qos/logback/logback-core/1.1.7/logback-core-1.1.7.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/ch/qos/logback/logback-core/1.1.7/logback-core-1.1.7.pom (5 KB at 215.2 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.7.21/slf4j-api-1.7.21.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.7.21/slf4j-api-1.7.21.pom (3 KB at 135.5 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/slf4j/slf4j-parent/1.7.21/slf4j-parent-1.7.21.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/slf4j/slf4j-parent/1.7.21/slf4j-parent-1.7.21.pom (14 KB at 599.4 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/slf4j/jcl-over-slf4j/1.7.21/jcl-over-slf4j-1.7.21.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/slf4j/jcl-over-slf4j/1.7.21/jcl-over-slf4j-1.7.21.pom (963 B at 44.8 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/slf4j/jul-to-slf4j/1.7.21/jul-to-slf4j-1.7.21.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/slf4j/jul-to-slf4j/1.7.21/jul-to-slf4j-1.7.21.pom (986 B at 45.9 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/slf4j/log4j-over-slf4j/1.7.21/log4j-over-slf4j-1.7.21.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/slf4j/log4j-over-slf4j/1.7.21/log4j-over-slf4j-1.7.21.pom (2 KB at 57.9 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/yaml/snakeyaml/1.16/snakeyaml-1.16.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/yaml/snakeyaml/1.16/snakeyaml-1.16.pom (26 KB at 1289.7 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-aop/1.3.5.RELEASE/spring-boot-starter-aop-1.3.5.RELEASE.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-aop/1.3.5.RELEASE/spring-boot-starter-aop-1.3.5.RELEASE.pom (2 KB at 61.3 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/aspectj/aspectjweaver/1.8.9/aspectjweaver-1.8.9.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/aspectj/aspectjweaver/1.8.9/aspectjweaver-1.8.9.pom (2 KB at 51.0 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-jdbc/1.3.5.RELEASE/spring-boot-starter-jdbc-1.3.5.RELEASE.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-jdbc/1.3.5.RELEASE/spring-boot-starter-jdbc-1.3.5.RELEASE.pom (2 KB at 48.8 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/apache/tomcat/tomcat-jdbc/8.0.33/tomcat-jdbc-8.0.33.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/apache/tomcat/tomcat-jdbc/8.0.33/tomcat-jdbc-8.0.33.pom (2 KB at 79.6 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/apache/tomcat/tomcat-juli/8.0.33/tomcat-juli-8.0.33.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/apache/tomcat/tomcat-juli/8.0.33/tomcat-juli-8.0.33.pom (2 KB at 51.8 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/spring-jdbc/4.2.6.RELEASE/spring-jdbc-4.2.6.RELEASE.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/spring-jdbc/4.2.6.RELEASE/spring-jdbc-4.2.6.RELEASE.pom (4 KB at 181.6 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/spring-tx/4.2.6.RELEASE/spring-tx-4.2.6.RELEASE.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/spring-tx/4.2.6.RELEASE/spring-tx-4.2.6.RELEASE.pom (4 KB at 173.1 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/hibernate/hibernate-entitymanager/4.3.11.Final/hibernate-entitymanager-4.3.11.Final.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/hibernate/hibernate-entitymanager/4.3.11.Final/hibernate-entitymanager-4.3.11.Final.pom (4 KB at 164.2 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/jboss/logging/jboss-logging/3.3.0.Final/jboss-logging-3.3.0.Final.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/jboss/logging/jboss-logging/3.3.0.Final/jboss-logging-3.3.0.Final.pom (6 KB at 286.6 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/jboss/jboss-parent/15/jboss-parent-15.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/jboss/jboss-parent/15/jboss-parent-15.pom (31 KB at 1399.2 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/jboss/logging/jboss-logging-annotations/1.2.0.Beta1/jboss-logging-annotations-1.2.0.Beta1.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/jboss/logging/jboss-logging-annotations/1.2.0.Beta1/jboss-logging-annotations-1.2.0.Beta1.pom (2 KB at 98.5 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/jboss/logging/jboss-logging-tools-parent/1.2.0.Beta1/jboss-logging-tools-parent-1.2.0.Beta1.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/jboss/logging/jboss-logging-tools-parent/1.2.0.Beta1/jboss-logging-tools-parent-1.2.0.Beta1.pom (4 KB at 212.9 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/jboss/jboss-parent/10/jboss-parent-10.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/jboss/jboss-parent/10/jboss-parent-10.pom (30 KB at 1468.6 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/hibernate/hibernate-core/4.3.11.Final/hibernate-core-4.3.11.Final.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/hibernate/hibernate-core/4.3.11.Final/hibernate-core-4.3.11.Final.pom (4 KB at 181.5 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/dom4j/dom4j/1.6.1/dom4j-1.6.1.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/dom4j/dom4j/1.6.1/dom4j-1.6.1.pom (7 KB at 367.0 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/xml-apis/xml-apis/1.0.b2/xml-apis-1.0.b2.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/xml-apis/xml-apis/1.0.b2/xml-apis-1.0.b2.pom (3 KB at 99.8 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/hibernate/common/hibernate-commons-annotations/4.0.5.Final/hibernate-commons-annotations-4.0.5.Final.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/hibernate/common/hibernate-commons-annotations/4.0.5.Final/hibernate-commons-annotations-4.0.5.Final.pom (3 KB at 114.2 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/hibernate/javax/persistence/hibernate-jpa-2.1-api/1.0.0.Final/hibernate-jpa-2.1-api-1.0.0.Final.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/hibernate/javax/persistence/hibernate-jpa-2.1-api/1.0.0.Final/hibernate-jpa-2.1-api-1.0.0.Final.pom (3 KB at 119.8 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/javassist/javassist/3.18.1-GA/javassist-3.18.1-GA.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/javassist/javassist/3.18.1-GA/javassist-3.18.1-GA.pom (10 KB at 489.4 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/antlr/antlr/2.7.7/antlr-2.7.7.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/antlr/antlr/2.7.7/antlr-2.7.7.pom (632 B at 34.3 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/jboss/jandex/1.1.0.Final/jandex-1.1.0.Final.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/jboss/jandex/1.1.0.Final/jandex-1.1.0.Final.pom (3 KB at 119.1 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/jboss/jboss-parent/5/jboss-parent-5.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/jboss/jboss-parent/5/jboss-parent-5.pom (19 KB at 965.9 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/javax/transaction/javax.transaction-api/1.2/javax.transaction-api-1.2.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/javax/transaction/javax.transaction-api/1.2/javax.transaction-api-1.2.pom (14 KB at 748.5 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/net/java/jvnet-parent/3/jvnet-parent-3.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/net/java/jvnet-parent/3/jvnet-parent-3.pom (5 KB at 203.3 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/data/spring-data-jpa/1.9.4.RELEASE/spring-data-jpa-1.9.4.RELEASE.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/data/spring-data-jpa/1.9.4.RELEASE/spring-data-jpa-1.9.4.RELEASE.pom (14 KB at 763.4 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/data/build/spring-data-parent/1.7.4.RELEASE/spring-data-parent-1.7.4.RELEASE.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/data/build/spring-data-parent/1.7.4.RELEASE/spring-data-parent-1.7.4.RELEASE.pom (22 KB at 1131.2 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/spring-framework-bom/4.1.9.RELEASE/spring-framework-bom-4.1.9.RELEASE.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/spring-framework-bom/4.1.9.RELEASE/spring-framework-bom-4.1.9.RELEASE.pom (5 KB at 277.7 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/data/spring-data-commons/1.11.4.RELEASE/spring-data-commons-1.11.4.RELEASE.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/data/spring-data-commons/1.11.4.RELEASE/spring-data-commons-1.11.4.RELEASE.pom (7 KB at 350.7 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/spring-orm/4.2.6.RELEASE/spring-orm-4.2.6.RELEASE.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/spring-orm/4.2.6.RELEASE/spring-orm-4.2.6.RELEASE.pom (8 KB at 409.2 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/spring-aspects/4.2.6.RELEASE/spring-aspects-4.2.6.RELEASE.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/spring-aspects/4.2.6.RELEASE/spring-aspects-4.2.6.RELEASE.pom (4 KB at 197.3 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-jersey/1.3.5.RELEASE/spring-boot-starter-jersey-1.3.5.RELEASE.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-jersey/1.3.5.RELEASE/spring-boot-starter-jersey-1.3.5.RELEASE.pom (3 KB at 137.3 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-tomcat/1.3.5.RELEASE/spring-boot-starter-tomcat-1.3.5.RELEASE.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-tomcat/1.3.5.RELEASE/spring-boot-starter-tomcat-1.3.5.RELEASE.pom (2 KB at 66.4 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/apache/tomcat/embed/tomcat-embed-core/8.0.33/tomcat-embed-core-8.0.33.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/apache/tomcat/embed/tomcat-embed-core/8.0.33/tomcat-embed-core-8.0.33.pom (2 KB at 53.3 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/apache/tomcat/embed/tomcat-embed-el/8.0.33/tomcat-embed-el-8.0.33.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/apache/tomcat/embed/tomcat-embed-el/8.0.33/tomcat-embed-el-8.0.33.pom (2 KB at 56.7 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/apache/tomcat/embed/tomcat-embed-logging-juli/8.0.33/tomcat-embed-logging-juli-8.0.33.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/apache/tomcat/embed/tomcat-embed-logging-juli/8.0.33/tomcat-embed-logging-juli-8.0.33.pom (2 KB at 74.1 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/apache/tomcat/embed/tomcat-embed-websocket/8.0.33/tomcat-embed-websocket-8.0.33.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/apache/tomcat/embed/tomcat-embed-websocket/8.0.33/tomcat-embed-websocket-8.0.33.pom (2 KB at 85.7 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-validation/1.3.5.RELEASE/spring-boot-starter-validation-1.3.5.RELEASE.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-validation/1.3.5.RELEASE/spring-boot-starter-validation-1.3.5.RELEASE.pom (2 KB at 66.7 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/hibernate/hibernate-validator/5.2.4.Final/hibernate-validator-5.2.4.Final.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/hibernate/hibernate-validator/5.2.4.Final/hibernate-validator-5.2.4.Final.pom (13 KB at 365.1 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/hibernate/hibernate-validator-parent/5.2.4.Final/hibernate-validator-parent-5.2.4.Final.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/hibernate/hibernate-validator-parent/5.2.4.Final/hibernate-validator-parent-5.2.4.Final.pom (35 KB at 1814.4 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/jboss/arquillian/arquillian-bom/1.1.9.Final/arquillian-bom-1.1.9.Final.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/jboss/arquillian/arquillian-bom/1.1.9.Final/arquillian-bom-1.1.9.Final.pom (11 KB at 577.0 KB/sec)

[INFO] Downloading: https://oss.sonatype.org/content/repositories/releases/org/jboss/shrinkwrap/shrinkwrap-bom/1.2.2/shrinkwrap-bom-1.2.2.pom

[INFO] Downloading: https://repository.apache.org/releases/org/jboss/shrinkwrap/shrinkwrap-bom/1.2.2/shrinkwrap-bom-1.2.2.pom

[INFO] Downloading: http://repo.spring.io/ext-release-local/org/jboss/shrinkwrap/shrinkwrap-bom/1.2.2/shrinkwrap-bom-1.2.2.pom

[INFO] Downloading: http://repo.spring.io/milestone/org/jboss/shrinkwrap/shrinkwrap-bom/1.2.2/shrinkwrap-bom-1.2.2.pom

[INFO] Downloading: http://repo.spring.io/snapshot/org/jboss/shrinkwrap/shrinkwrap-bom/1.2.2/shrinkwrap-bom-1.2.2.pom

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/jboss/shrinkwrap/shrinkwrap-bom/1.2.2/shrinkwrap-bom-1.2.2.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/jboss/shrinkwrap/shrinkwrap-bom/1.2.2/shrinkwrap-bom-1.2.2.pom (4 KB at 176.0 KB/sec)

[INFO] Downloading: https://oss.sonatype.org/content/repositories/releases/org/jboss/shrinkwrap/resolver/shrinkwrap-resolver-bom/2.1.1/shrinkwrap-resolver-bom-2.1.1.pom

[INFO] Downloading: https://repository.apache.org/releases/org/jboss/shrinkwrap/resolver/shrinkwrap-resolver-bom/2.1.1/shrinkwrap-resolver-bom-2.1.1.pom

[INFO] Downloading: http://repo.spring.io/ext-release-local/org/jboss/shrinkwrap/resolver/shrinkwrap-resolver-bom/2.1.1/shrinkwrap-resolver-bom-2.1.1.pom

[INFO] Downloading: http://repo.spring.io/milestone/org/jboss/shrinkwrap/resolver/shrinkwrap-resolver-bom/2.1.1/shrinkwrap-resolver-bom-2.1.1.pom

[INFO] Downloading: http://repo.spring.io/snapshot/org/jboss/shrinkwrap/resolver/shrinkwrap-resolver-bom/2.1.1/shrinkwrap-resolver-bom-2.1.1.pom

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/jboss/shrinkwrap/resolver/shrinkwrap-resolver-bom/2.1.1/shrinkwrap-resolver-bom-2.1.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/jboss/shrinkwrap/resolver/shrinkwrap-resolver-bom/2.1.1/shrinkwrap-resolver-bom-2.1.1.pom (5 KB at 140.9 KB/sec)

[INFO] Downloading: https://oss.sonatype.org/content/repositories/releases/org/jboss/shrinkwrap/descriptors/shrinkwrap-descriptors-bom/2.0.0-alpha-7/shrinkwrap-descriptors-bom-2.0.0-alpha-7.pom

[INFO] Downloading: https://repository.apache.org/releases/org/jboss/shrinkwrap/descriptors/shrinkwrap-descriptors-bom/2.0.0-alpha-7/shrinkwrap-descriptors-bom-2.0.0-alpha-7.pom

[INFO] Downloading: http://repo.spring.io/ext-release-local/org/jboss/shrinkwrap/descriptors/shrinkwrap-descriptors-bom/2.0.0-alpha-7/shrinkwrap-descriptors-bom-2.0.0-alpha-7.pom

[INFO] Downloading: http://repo.spring.io/milestone/org/jboss/shrinkwrap/descriptors/shrinkwrap-descriptors-bom/2.0.0-alpha-7/shrinkwrap-descriptors-bom-2.0.0-alpha-7.pom

[INFO] Downloading: http://repo.spring.io/snapshot/org/jboss/shrinkwrap/descriptors/shrinkwrap-descriptors-bom/2.0.0-alpha-7/shrinkwrap-descriptors-bom-2.0.0-alpha-7.pom

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/jboss/shrinkwrap/descriptors/shrinkwrap-descriptors-bom/2.0.0-alpha-7/shrinkwrap-descriptors-bom-2.0.0-alpha-7.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/jboss/shrinkwrap/descriptors/shrinkwrap-descriptors-bom/2.0.0-alpha-7/shrinkwrap-descriptors-bom-2.0.0-alpha-7.pom (6 KB at 243.8 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/javax/validation/validation-api/1.1.0.Final/validation-api-1.1.0.Final.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/javax/validation/validation-api/1.1.0.Final/validation-api-1.1.0.Final.pom (8 KB at 426.4 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/com/fasterxml/classmate/1.1.0/classmate-1.1.0.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/com/fasterxml/classmate/1.1.0/classmate-1.1.0.pom (7 KB at 246.5 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/sonatype/oss/oss-parent/7/oss-parent-7.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/sonatype/oss/oss-parent/7/oss-parent-7.pom (5 KB at 247.9 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.6.6/jackson-databind-2.6.6.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.6.6/jackson-databind-2.6.6.pom (6 KB at 219.3 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-parent/2.6.2/jackson-parent-2.6.2.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-parent/2.6.2/jackson-parent-2.6.2.pom (8 KB at 400.4 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/com/fasterxml/oss-parent/24/oss-parent-24.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/com/fasterxml/oss-parent/24/oss-parent-24.pom (19 KB at 1054.4 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.6.6/jackson-annotations-2.6.6.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.6.6/jackson-annotations-2.6.6.pom (2 KB at 68.2 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-parent/2.6.1/jackson-parent-2.6.1.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-parent/2.6.1/jackson-parent-2.6.1.pom (8 KB at 400.6 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/com/fasterxml/oss-parent/23/oss-parent-23.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/com/fasterxml/oss-parent/23/oss-parent-23.pom (19 KB at 991.6 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-core/2.6.6/jackson-core-2.6.6.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-core/2.6.6/jackson-core-2.6.6.pom (5 KB at 237.6 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/spring-web/4.2.6.RELEASE/spring-web-4.2.6.RELEASE.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/spring-web/4.2.6.RELEASE/spring-web-4.2.6.RELEASE.pom (8 KB at 431.8 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/jersey/core/jersey-server/2.22.2/jersey-server-2.22.2.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/jersey/core/jersey-server/2.22.2/jersey-server-2.22.2.pom (13 KB at 669.1 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/jersey/project/2.22.2/project-2.22.2.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/jersey/project/2.22.2/project-2.22.2.pom (83 KB at 3292.5 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/net/java/jvnet-parent/4/jvnet-parent-4.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/net/java/jvnet-parent/4/jvnet-parent-4.pom (8 KB at 398.6 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-bom/2.4.0-b34/hk2-bom-2.4.0-b34.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-bom/2.4.0-b34/hk2-bom-2.4.0-b34.pom (21 KB at 1074.0 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/net/java/jvnet-parent/5/jvnet-parent-5.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/net/java/jvnet-parent/5/jvnet-parent-5.pom (9 KB at 455.5 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/jersey/core/jersey-common/2.22.2/jersey-common-2.22.2.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/jersey/core/jersey-common/2.22.2/jersey-common-2.22.2.pom (11 KB at 564.3 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/javax/ws/rs/javax.ws.rs-api/2.0.1/javax.ws.rs-api-2.0.1.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/javax/ws/rs/javax.ws.rs-api/2.0.1/javax.ws.rs-api-2.0.1.pom (21 KB at 995.8 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/javax/annotation/javax.annotation-api/1.2/javax.annotation-api-1.2.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/javax/annotation/javax.annotation-api/1.2/javax.annotation-api-1.2.pom (14 KB at 728.7 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/jersey/bundles/repackaged/jersey-guava/2.22.2/jersey-guava-2.22.2.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/jersey/bundles/repackaged/jersey-guava/2.22.2/jersey-guava-2.22.2.pom (14 KB at 684.3 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/jersey/bundles/repackaged/project/2.22.2/project-2.22.2.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/jersey/bundles/repackaged/project/2.22.2/project-2.22.2.pom (3 KB at 143.5 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/jersey/bundles/project/2.22.2/project-2.22.2.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/jersey/bundles/project/2.22.2/project-2.22.2.pom (4 KB at 152.1 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-api/2.4.0-b34/hk2-api-2.4.0-b34.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-api/2.4.0-b34/hk2-api-2.4.0-b34.pom (5 KB at 234.3 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-parent/2.4.0-b34/hk2-parent-2.4.0-b34.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-parent/2.4.0-b34/hk2-parent-2.4.0-b34.pom (47 KB at 2030.5 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-utils/2.4.0-b34/hk2-utils-2.4.0-b34.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-utils/2.4.0-b34/hk2-utils-2.4.0-b34.pom (6 KB at 186.2 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/hk2/external/aopalliance-repackaged/2.4.0-b34/aopalliance-repackaged-2.4.0-b34.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/hk2/external/aopalliance-repackaged/2.4.0-b34/aopalliance-repackaged-2.4.0-b34.pom (7 KB at 388.9 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/hk2/external/2.4.0-b34/external-2.4.0-b34.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/hk2/external/2.4.0-b34/external-2.4.0-b34.pom (3 KB at 167.9 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/hk2/external/javax.inject/2.4.0-b34/javax.inject-2.4.0-b34.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/hk2/external/javax.inject/2.4.0-b34/javax.inject-2.4.0-b34.pom (7 KB at 352.3 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-locator/2.4.0-b34/hk2-locator-2.4.0-b34.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-locator/2.4.0-b34/hk2-locator-2.4.0-b34.pom (6 KB at 286.1 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/javax/inject/javax.inject/1/javax.inject-1.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/javax/inject/javax.inject/1/javax.inject-1.pom (612 B at 31.5 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/hk2/osgi-resource-locator/1.0.1/osgi-resource-locator-1.0.1.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/hk2/osgi-resource-locator/1.0.1/osgi-resource-locator-1.0.1.pom (7 KB at 318.1 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/pom/8/pom-8.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/pom/8/pom-8.pom (11 KB at 490.6 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/jersey/core/jersey-client/2.22.2/jersey-client-2.22.2.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/jersey/core/jersey-client/2.22.2/jersey-client-2.22.2.pom (8 KB at 320.9 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/jersey/media/jersey-media-jaxb/2.22.2/jersey-media-jaxb-2.22.2.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/jersey/media/jersey-media-jaxb/2.22.2/jersey-media-jaxb-2.22.2.pom (7 KB at 387.4 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/jersey/media/project/2.22.2/project-2.22.2.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/jersey/media/project/2.22.2/project-2.22.2.pom (3 KB at 162.7 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/jersey/containers/jersey-container-servlet-core/2.22.2/jersey-container-servlet-core-2.22.2.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/jersey/containers/jersey-container-servlet-core/2.22.2/jersey-container-servlet-core-2.22.2.pom (5 KB at 253.1 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/jersey/containers/project/2.22.2/project-2.22.2.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/jersey/containers/project/2.22.2/project-2.22.2.pom (4 KB at 206.3 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/jersey/containers/jersey-container-servlet/2.22.2/jersey-container-servlet-2.22.2.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/jersey/containers/jersey-container-servlet/2.22.2/jersey-container-servlet-2.22.2.pom (5 KB at 252.2 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/jersey/ext/jersey-bean-validation/2.22.2/jersey-bean-validation-2.22.2.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/jersey/ext/jersey-bean-validation/2.22.2/jersey-bean-validation-2.22.2.pom (6 KB at 300.1 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/jersey/ext/project/2.22.2/project-2.22.2.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/jersey/ext/project/2.22.2/project-2.22.2.pom (4 KB at 186.5 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/jersey/ext/jersey-spring3/2.22.2/jersey-spring3-2.22.2.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/jersey/ext/jersey-spring3/2.22.2/jersey-spring3-2.22.2.pom (7 KB at 308.9 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2/2.4.0-b34/hk2-2.4.0-b34.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2/2.4.0-b34/hk2-2.4.0-b34.pom (6 KB at 228.1 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/hk2/config-types/2.4.0-b34/config-types-2.4.0-b34.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/hk2/config-types/2.4.0-b34/config-types-2.4.0-b34.pom (5 KB at 179.6 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-xml-dom/2.4.0-b34/hk2-xml-dom-2.4.0-b34.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-xml-dom/2.4.0-b34/hk2-xml-dom-2.4.0-b34.pom (3 KB at 150.9 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-configuration-persistence/2.4.0-b34/hk2-configuration-persistence-2.4.0-b34.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-configuration-persistence/2.4.0-b34/hk2-configuration-persistence-2.4.0-b34.pom (3 KB at 149.4 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-configuration/2.4.0-b34/hk2-configuration-2.4.0-b34.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-configuration/2.4.0-b34/hk2-configuration-2.4.0-b34.pom (3 KB at 147.9 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-config/2.4.0-b34/hk2-config-2.4.0-b34.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-config/2.4.0-b34/hk2-config-2.4.0-b34.pom (7 KB at 289.6 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-core/2.4.0-b34/hk2-core-2.4.0-b34.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-core/2.4.0-b34/hk2-core-2.4.0-b34.pom (5 KB at 203.7 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/jvnet/tiger-types/1.4/tiger-types-1.4.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/jvnet/tiger-types/1.4/tiger-types-1.4.pom (3 KB at 125.9 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/net/java/jvnet-parent/1/jvnet-parent-1.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/net/java/jvnet-parent/1/jvnet-parent-1.pom (5 KB at 255.6 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-runlevel/2.4.0-b34/hk2-runlevel-2.4.0-b34.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-runlevel/2.4.0-b34/hk2-runlevel-2.4.0-b34.pom (5 KB at 220.4 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/hk2/class-model/2.4.0-b34/class-model-2.4.0-b34.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/hk2/class-model/2.4.0-b34/class-model-2.4.0-b34.pom (5 KB at 232.5 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/hk2/external/asm-all-repackaged/2.4.0-b34/asm-all-repackaged-2.4.0-b34.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/hk2/external/asm-all-repackaged/2.4.0-b34/asm-all-repackaged-2.4.0-b34.pom (5 KB at 283.1 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/hk2/spring-bridge/2.4.0-b34/spring-bridge-2.4.0-b34.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/hk2/spring-bridge/2.4.0-b34/spring-bridge-2.4.0-b34.pom (4 KB at 169.4 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/jersey/media/jersey-media-json-jackson/2.22.2/jersey-media-json-jackson-2.22.2.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/jersey/media/jersey-media-json-jackson/2.22.2/jersey-media-json-jackson-2.22.2.pom (5 KB at 259.3 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/jersey/ext/jersey-entity-filtering/2.22.2/jersey-entity-filtering-2.22.2.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/jersey/ext/jersey-entity-filtering/2.22.2/jersey-entity-filtering-2.22.2.pom (5 KB at 212.3 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/com/fasterxml/jackson/jaxrs/jackson-jaxrs-base/2.6.6/jackson-jaxrs-base-2.6.6.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/com/fasterxml/jackson/jaxrs/jackson-jaxrs-base/2.6.6/jackson-jaxrs-base-2.6.6.pom (2 KB at 104.4 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/com/fasterxml/jackson/jaxrs/jackson-jaxrs-providers/2.6.6/jackson-jaxrs-providers-2.6.6.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/com/fasterxml/jackson/jaxrs/jackson-jaxrs-providers/2.6.6/jackson-jaxrs-providers-2.6.6.pom (4 KB at 217.3 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/com/fasterxml/jackson/jaxrs/jackson-jaxrs-json-provider/2.6.6/jackson-jaxrs-json-provider-2.6.6.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/com/fasterxml/jackson/jaxrs/jackson-jaxrs-json-provider/2.6.6/jackson-jaxrs-json-provider-2.6.6.pom (5 KB at 214.6 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/com/fasterxml/jackson/module/jackson-module-jaxb-annotations/2.6.6/jackson-module-jaxb-annotations-2.6.6.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/com/fasterxml/jackson/module/jackson-module-jaxb-annotations/2.6.6/jackson-module-jaxb-annotations-2.6.6.pom (5 KB at 234.4 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-web/1.3.5.RELEASE/spring-boot-starter-web-1.3.5.RELEASE.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-web/1.3.5.RELEASE/spring-boot-starter-web-1.3.5.RELEASE.pom (2 KB at 57.7 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/spring-webmvc/4.2.6.RELEASE/spring-webmvc-4.2.6.RELEASE.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/spring-webmvc/4.2.6.RELEASE/spring-webmvc-4.2.6.RELEASE.pom (12 KB at 652.7 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/postgresql/postgresql/9.4.1208.jre7/postgresql-9.4.1208.jre7.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/postgresql/postgresql/9.4.1208.jre7/postgresql-9.4.1208.jre7.pom (5 KB at 276.5 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/postgresql/pgjdbc-core-prevjre/1.0.5/pgjdbc-core-prevjre-1.0.5.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/postgresql/pgjdbc-core-prevjre/1.0.5/pgjdbc-core-prevjre-1.0.5.pom (7 KB at 403.9 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/postgresql/pgjdbc-core-parent/1.0.5/pgjdbc-core-parent-1.0.5.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/postgresql/pgjdbc-core-parent/1.0.5/pgjdbc-core-parent-1.0.5.pom (15 KB at 811.0 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/postgresql/pgjdbc-versions/1.0.5/pgjdbc-versions-1.0.5.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/postgresql/pgjdbc-versions/1.0.5/pgjdbc-versions-1.0.5.pom (21 KB at 1099.0 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-test/1.3.5.RELEASE/spring-boot-starter-test-1.3.5.RELEASE.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-test/1.3.5.RELEASE/spring-boot-starter-test-1.3.5.RELEASE.pom (2 KB at 51.9 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/junit/junit/4.12/junit-4.12.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/junit/junit/4.12/junit-4.12.pom (24 KB at 1284.6 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.pom (766 B at 39.4 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/hamcrest/hamcrest-parent/1.3/hamcrest-parent-1.3.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/hamcrest/hamcrest-parent/1.3/hamcrest-parent-1.3.pom (2 KB at 107.0 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/mockito/mockito-core/1.10.19/mockito-core-1.10.19.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/mockito/mockito-core/1.10.19/mockito-core-1.10.19.pom (2 KB at 71.3 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/objenesis/objenesis/2.1/objenesis-2.1.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/objenesis/objenesis/2.1/objenesis-2.1.pom (3 KB at 137.6 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/objenesis/objenesis-parent/2.1/objenesis-parent-2.1.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/objenesis/objenesis-parent/2.1/objenesis-parent-2.1.pom (17 KB at 858.7 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/hamcrest/hamcrest-library/1.3/hamcrest-library-1.3.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/hamcrest/hamcrest-library/1.3/hamcrest-library-1.3.pom (820 B at 34.8 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/spring-test/4.2.6.RELEASE/spring-test-4.2.6.RELEASE.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/spring-test/4.2.6.RELEASE/spring-test-4.2.6.RELEASE.pom (8 KB at 395.9 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/com/h2database/h2/1.4.191/h2-1.4.191.pom

[INFO] Downloaded: http://repo.maven.apache.org/maven2/com/h2database/h2/1.4.191/h2-1.4.191.pom (962 B at 52.2 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-data-jpa/1.3.5.RELEASE/spring-boot-starter-data-jpa-1.3.5.RELEASE.jar

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter/1.3.5.RELEASE/spring-boot-starter-1.3.5.RELEASE.jar

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot/1.3.5.RELEASE/spring-boot-1.3.5.RELEASE.jar

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-autoconfigure/1.3.5.RELEASE/spring-boot-autoconfigure-1.3.5.RELEASE.jar

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-logging/1.3.5.RELEASE/spring-boot-starter-logging-1.3.5.RELEASE.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-data-jpa/1.3.5.RELEASE/spring-boot-starter-data-jpa-1.3.5.RELEASE.jar (3 KB at 34.5 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/ch/qos/logback/logback-classic/1.1.7/logback-classic-1.1.7.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter/1.3.5.RELEASE/spring-boot-starter-1.3.5.RELEASE.jar (3 KB at 29.3 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/ch/qos/logback/logback-core/1.1.7/logback-core-1.1.7.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-logging/1.3.5.RELEASE/spring-boot-starter-logging-1.3.5.RELEASE.jar (3 KB at 35.5 KB/sec)

[INFO] Downloaded: http://repo.maven.apache.org/maven2/ch/qos/logback/logback-classic/1.1.7/logback-classic-1.1.7.jar (297 KB at 4868.0 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/slf4j/jul-to-slf4j/1.7.21/jul-to-slf4j-1.7.21.jar

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/slf4j/log4j-over-slf4j/1.7.21/log4j-over-slf4j-1.7.21.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot/1.3.5.RELEASE/spring-boot-1.3.5.RELEASE.jar (536 KB at 4656.9 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/yaml/snakeyaml/1.16/snakeyaml-1.16.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/slf4j/jul-to-slf4j/1.7.21/jul-to-slf4j-1.7.21.jar (5 KB at 45.3 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-aop/1.3.5.RELEASE/spring-boot-starter-aop-1.3.5.RELEASE.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/ch/qos/logback/logback-core/1.1.7/logback-core-1.1.7.jar (460 KB at 4597.5 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/spring-aop/4.2.6.RELEASE/spring-aop-4.2.6.RELEASE.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-autoconfigure/1.3.5.RELEASE/spring-boot-autoconfigure-1.3.5.RELEASE.jar (741 KB at 6790.9 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/aopalliance/aopalliance/1.0/aopalliance-1.0.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/yaml/snakeyaml/1.16/snakeyaml-1.16.jar (264 KB at 1935.7 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/aspectj/aspectjweaver/1.8.9/aspectjweaver-1.8.9.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-aop/1.3.5.RELEASE/spring-boot-starter-aop-1.3.5.RELEASE.jar (3 KB at 12.8 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-jdbc/1.3.5.RELEASE/spring-boot-starter-jdbc-1.3.5.RELEASE.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/spring-aop/4.2.6.RELEASE/spring-aop-4.2.6.RELEASE.jar (363 KB at 1948.9 KB/sec)

[INFO] Downloaded: http://repo.maven.apache.org/maven2/aopalliance/aopalliance/1.0/aopalliance-1.0.jar (5 KB at 22.6 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/apache/tomcat/tomcat-juli/8.0.33/tomcat-juli-8.0.33.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/slf4j/log4j-over-slf4j/1.7.21/log4j-over-slf4j-1.7.21.jar (24 KB at 119.0 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/spring-jdbc/4.2.6.RELEASE/spring-jdbc-4.2.6.RELEASE.jar

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/apache/tomcat/tomcat-jdbc/8.0.33/tomcat-jdbc-8.0.33.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-jdbc/1.3.5.RELEASE/spring-boot-starter-jdbc-1.3.5.RELEASE.jar (3 KB at 10.2 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/hibernate/hibernate-entitymanager/4.3.11.Final/hibernate-entitymanager-4.3.11.Final.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/apache/tomcat/tomcat-juli/8.0.33/tomcat-juli-8.0.33.jar (40 KB at 189.0 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/jboss/logging/jboss-logging/3.3.0.Final/jboss-logging-3.3.0.Final.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/spring-jdbc/4.2.6.RELEASE/spring-jdbc-4.2.6.RELEASE.jar (414 KB at 1880.9 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/jboss/logging/jboss-logging-annotations/1.2.0.Beta1/jboss-logging-annotations-1.2.0.Beta1.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/apache/tomcat/tomcat-jdbc/8.0.33/tomcat-jdbc-8.0.33.jar (133 KB at 600.7 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/hibernate/hibernate-core/4.3.11.Final/hibernate-core-4.3.11.Final.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/jboss/logging/jboss-logging/3.3.0.Final/jboss-logging-3.3.0.Final.jar (66 KB at 277.6 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/antlr/antlr/2.7.7/antlr-2.7.7.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/aspectj/aspectjweaver/1.8.9/aspectjweaver-1.8.9.jar (1822 KB at 7684.4 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/jboss/jandex/1.1.0.Final/jandex-1.1.0.Final.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/jboss/logging/jboss-logging-annotations/1.2.0.Beta1/jboss-logging-annotations-1.2.0.Beta1.jar (12 KB at 47.4 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/dom4j/dom4j/1.6.1/dom4j-1.6.1.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/hibernate/hibernate-entitymanager/4.3.11.Final/hibernate-entitymanager-4.3.11.Final.jar (633 KB at 2462.6 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/xml-apis/xml-apis/1.0.b2/xml-apis-1.0.b2.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/antlr/antlr/2.7.7/antlr-2.7.7.jar (435 KB at 1685.5 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/hibernate/common/hibernate-commons-annotations/4.0.5.Final/hibernate-commons-annotations-4.0.5.Final.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/jboss/jandex/1.1.0.Final/jandex-1.1.0.Final.jar (75 KB at 269.9 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/hibernate/javax/persistence/hibernate-jpa-2.1-api/1.0.0.Final/hibernate-jpa-2.1-api-1.0.0.Final.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/dom4j/dom4j/1.6.1/dom4j-1.6.1.jar (307 KB at 1098.7 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/javassist/javassist/3.18.1-GA/javassist-3.18.1-GA.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/xml-apis/xml-apis/1.0.b2/xml-apis-1.0.b2.jar (107 KB at 382.6 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/javax/transaction/javax.transaction-api/1.2/javax.transaction-api-1.2.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/hibernate/common/hibernate-commons-annotations/4.0.5.Final/hibernate-commons-annotations-4.0.5.Final.jar (74 KB at 257.2 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/data/spring-data-jpa/1.9.4.RELEASE/spring-data-jpa-1.9.4.RELEASE.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/javax/transaction/javax.transaction-api/1.2/javax.transaction-api-1.2.jar (31 KB at 100.7 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/data/spring-data-commons/1.11.4.RELEASE/spring-data-commons-1.11.4.RELEASE.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/hibernate/javax/persistence/hibernate-jpa-2.1-api/1.0.0.Final/hibernate-jpa-2.1-api-1.0.0.Final.jar (111 KB at 371.5 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/spring-orm/4.2.6.RELEASE/spring-orm-4.2.6.RELEASE.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/javassist/javassist/3.18.1-GA/javassist-3.18.1-GA.jar (698 KB at 2279.3 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/spring-context/4.2.6.RELEASE/spring-context-4.2.6.RELEASE.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/data/spring-data-jpa/1.9.4.RELEASE/spring-data-jpa-1.9.4.RELEASE.jar (251 KB at 789.7 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/spring-tx/4.2.6.RELEASE/spring-tx-4.2.6.RELEASE.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/spring-orm/4.2.6.RELEASE/spring-orm-4.2.6.RELEASE.jar (456 KB at 1389.3 KB/sec)

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/data/spring-data-commons/1.11.4.RELEASE/spring-data-commons-1.11.4.RELEASE.jar (624 KB at 1885.0 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/spring-beans/4.2.6.RELEASE/spring-beans-4.2.6.RELEASE.jar

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.7.21/slf4j-api-1.7.21.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/spring-tx/4.2.6.RELEASE/spring-tx-4.2.6.RELEASE.jar (259 KB at 761.7 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/slf4j/jcl-over-slf4j/1.7.21/jcl-over-slf4j-1.7.21.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.7.21/slf4j-api-1.7.21.jar (41 KB at 114.9 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/spring-aspects/4.2.6.RELEASE/spring-aspects-4.2.6.RELEASE.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/spring-beans/4.2.6.RELEASE/spring-beans-4.2.6.RELEASE.jar (715 KB at 1968.1 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-jersey/1.3.5.RELEASE/spring-boot-starter-jersey-1.3.5.RELEASE.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/spring-context/4.2.6.RELEASE/spring-context-4.2.6.RELEASE.jar (1072 KB at 2910.4 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-tomcat/1.3.5.RELEASE/spring-boot-starter-tomcat-1.3.5.RELEASE.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/spring-aspects/4.2.6.RELEASE/spring-aspects-4.2.6.RELEASE.jar (57 KB at 154.0 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/apache/tomcat/embed/tomcat-embed-core/8.0.33/tomcat-embed-core-8.0.33.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/slf4j/jcl-over-slf4j/1.7.21/jcl-over-slf4j-1.7.21.jar (17 KB at 43.3 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/apache/tomcat/embed/tomcat-embed-el/8.0.33/tomcat-embed-el-8.0.33.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/hibernate/hibernate-core/4.3.11.Final/hibernate-core-4.3.11.Final.jar (5160 KB at 13833.3 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/apache/tomcat/embed/tomcat-embed-logging-juli/8.0.33/tomcat-embed-logging-juli-8.0.33.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-jersey/1.3.5.RELEASE/spring-boot-starter-jersey-1.3.5.RELEASE.jar (3 KB at 6.1 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/apache/tomcat/embed/tomcat-embed-websocket/8.0.33/tomcat-embed-websocket-8.0.33.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-tomcat/1.3.5.RELEASE/spring-boot-starter-tomcat-1.3.5.RELEASE.jar (3 KB at 5.6 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-validation/1.3.5.RELEASE/spring-boot-starter-validation-1.3.5.RELEASE.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-validation/1.3.5.RELEASE/spring-boot-starter-validation-1.3.5.RELEASE.jar (3 KB at 5.4 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/hibernate/hibernate-validator/5.2.4.Final/hibernate-validator-5.2.4.Final.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/apache/tomcat/embed/tomcat-embed-websocket/8.0.33/tomcat-embed-websocket-8.0.33.jar (242 KB at 584.1 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/com/fasterxml/classmate/1.1.0/classmate-1.1.0.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/apache/tomcat/embed/tomcat-embed-el/8.0.33/tomcat-embed-el-8.0.33.jar (233 KB at 560.7 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.6.6/jackson-databind-2.6.6.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/hibernate/hibernate-validator/5.2.4.Final/hibernate-validator-5.2.4.Final.jar (688 KB at 1592.5 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.6.6/jackson-annotations-2.6.6.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/com/fasterxml/classmate/1.1.0/classmate-1.1.0.jar (62 KB at 138.0 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-core/2.6.6/jackson-core-2.6.6.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/apache/tomcat/embed/tomcat-embed-logging-juli/8.0.33/tomcat-embed-logging-juli-8.0.33.jar (40 KB at 89.0 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/spring-web/4.2.6.RELEASE/spring-web-4.2.6.RELEASE.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.6.6/jackson-annotations-2.6.6.jar (46 KB at 100.4 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/jersey/core/jersey-server/2.22.2/jersey-server-2.22.2.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.6.6/jackson-databind-2.6.6.jar (1144 KB at 2479.8 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/jersey/core/jersey-common/2.22.2/jersey-common-2.22.2.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/apache/tomcat/embed/tomcat-embed-core/8.0.33/tomcat-embed-core-8.0.33.jar (2777 KB at 6010.4 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/jersey/bundles/repackaged/jersey-guava/2.22.2/jersey-guava-2.22.2.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-core/2.6.6/jackson-core-2.6.6.jar (253 KB at 540.3 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/hk2/osgi-resource-locator/1.0.1/osgi-resource-locator-1.0.1.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/jersey/core/jersey-server/2.22.2/jersey-server-2.22.2.jar (930 KB at 1900.6 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/jersey/core/jersey-client/2.22.2/jersey-client-2.22.2.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/spring-web/4.2.6.RELEASE/spring-web-4.2.6.RELEASE.jar (750 KB at 1513.5 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/javax/ws/rs/javax.ws.rs-api/2.0.1/javax.ws.rs-api-2.0.1.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/hk2/osgi-resource-locator/1.0.1/osgi-resource-locator-1.0.1.jar (20 KB at 39.8 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/jersey/media/jersey-media-jaxb/2.22.2/jersey-media-jaxb-2.22.2.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/jersey/media/jersey-media-jaxb/2.22.2/jersey-media-jaxb-2.22.2.jar (72 KB at 138.2 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/javax/annotation/javax.annotation-api/1.2/javax.annotation-api-1.2.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/jersey/core/jersey-common/2.22.2/jersey-common-2.22.2.jar (683 KB at 1324.3 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-api/2.4.0-b34/hk2-api-2.4.0-b34.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/jersey/core/jersey-client/2.22.2/jersey-client-2.22.2.jar (164 KB at 313.2 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-utils/2.4.0-b34/hk2-utils-2.4.0-b34.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/javax/ws/rs/javax.ws.rs-api/2.0.1/javax.ws.rs-api-2.0.1.jar (113 KB at 214.5 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/hk2/external/aopalliance-repackaged/2.4.0-b34/aopalliance-repackaged-2.4.0-b34.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/jersey/bundles/repackaged/jersey-guava/2.22.2/jersey-guava-2.22.2.jar (949 KB at 1789.7 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/hk2/external/javax.inject/2.4.0-b34/javax.inject-2.4.0-b34.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/javax/annotation/javax.annotation-api/1.2/javax.annotation-api-1.2.jar (26 KB at 47.8 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-locator/2.4.0-b34/hk2-locator-2.4.0-b34.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-utils/2.4.0-b34/hk2-utils-2.4.0-b34.jar (117 KB at 214.8 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/javax/validation/validation-api/1.1.0.Final/validation-api-1.1.0.Final.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/hk2/external/aopalliance-repackaged/2.4.0-b34/aopalliance-repackaged-2.4.0-b34.jar (15 KB at 26.6 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/jersey/containers/jersey-container-servlet-core/2.22.2/jersey-container-servlet-core-2.22.2.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-api/2.4.0-b34/hk2-api-2.4.0-b34.jar (175 KB at 321.8 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/jersey/containers/jersey-container-servlet/2.22.2/jersey-container-servlet-2.22.2.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/hk2/external/javax.inject/2.4.0-b34/javax.inject-2.4.0-b34.jar (6 KB at 10.5 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/jersey/ext/jersey-bean-validation/2.22.2/jersey-bean-validation-2.22.2.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-locator/2.4.0-b34/hk2-locator-2.4.0-b34.jar (178 KB at 317.2 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/jersey/ext/jersey-spring3/2.22.2/jersey-spring3-2.22.2.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/javax/validation/validation-api/1.1.0.Final/validation-api-1.1.0.Final.jar (63 KB at 111.2 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2/2.4.0-b34/hk2-2.4.0-b34.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/jersey/containers/jersey-container-servlet-core/2.22.2/jersey-container-servlet-core-2.22.2.jar (65 KB at 115.4 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/hk2/config-types/2.4.0-b34/config-types-2.4.0-b34.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/jersey/containers/jersey-container-servlet/2.22.2/jersey-container-servlet-2.22.2.jar (18 KB at 31.3 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-core/2.4.0-b34/hk2-core-2.4.0-b34.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/jersey/ext/jersey-bean-validation/2.22.2/jersey-bean-validation-2.22.2.jar (40 KB at 68.8 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-config/2.4.0-b34/hk2-config-2.4.0-b34.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/jersey/ext/jersey-spring3/2.22.2/jersey-spring3-2.22.2.jar (22 KB at 36.8 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/jvnet/tiger-types/1.4/tiger-types-1.4.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2/2.4.0-b34/hk2-2.4.0-b34.jar (4 KB at 5.5 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-runlevel/2.4.0-b34/hk2-runlevel-2.4.0-b34.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/hk2/config-types/2.4.0-b34/config-types-2.4.0-b34.jar (9 KB at 14.3 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/hk2/class-model/2.4.0-b34/class-model-2.4.0-b34.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-core/2.4.0-b34/hk2-core-2.4.0-b34.jar (115 KB at 196.8 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/hk2/external/asm-all-repackaged/2.4.0-b34/asm-all-repackaged-2.4.0-b34.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/jvnet/tiger-types/1.4/tiger-types-1.4.jar (18 KB at 28.6 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/hk2/spring-bridge/2.4.0-b34/spring-bridge-2.4.0-b34.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/hk2/external/asm-all-repackaged/2.4.0-b34/asm-all-repackaged-2.4.0-b34.jar (390 KB at 632.2 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/jersey/media/jersey-media-json-jackson/2.22.2/jersey-media-json-jackson-2.22.2.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/hk2/spring-bridge/2.4.0-b34/spring-bridge-2.4.0-b34.jar (13 KB at 20.8 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/glassfish/jersey/ext/jersey-entity-filtering/2.22.2/jersey-entity-filtering-2.22.2.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-runlevel/2.4.0-b34/hk2-runlevel-2.4.0-b34.jar (54 KB at 83.8 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/com/fasterxml/jackson/jaxrs/jackson-jaxrs-base/2.6.6/jackson-jaxrs-base-2.6.6.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/jersey/media/jersey-media-json-jackson/2.22.2/jersey-media-json-jackson-2.22.2.jar (22 KB at 33.4 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/com/fasterxml/jackson/jaxrs/jackson-jaxrs-json-provider/2.6.6/jackson-jaxrs-json-provider-2.6.6.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/jersey/ext/jersey-entity-filtering/2.22.2/jersey-entity-filtering-2.22.2.jar (69 KB at 106.2 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/com/fasterxml/jackson/module/jackson-module-jaxb-annotations/2.6.6/jackson-module-jaxb-annotations-2.6.6.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/hk2/hk2-config/2.4.0-b34/hk2-config-2.4.0-b34.jar (201 KB at 311.8 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-web/1.3.5.RELEASE/spring-boot-starter-web-1.3.5.RELEASE.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/glassfish/hk2/class-model/2.4.0-b34/class-model-2.4.0-b34.jar (86 KB at 133.5 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/spring-webmvc/4.2.6.RELEASE/spring-webmvc-4.2.6.RELEASE.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/com/fasterxml/jackson/jaxrs/jackson-jaxrs-json-provider/2.6.6/jackson-jaxrs-json-provider-2.6.6.jar (17 KB at 25.1 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/spring-expression/4.2.6.RELEASE/spring-expression-4.2.6.RELEASE.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/com/fasterxml/jackson/jaxrs/jackson-jaxrs-base/2.6.6/jackson-jaxrs-base-2.6.6.jar (30 KB at 44.5 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/postgresql/postgresql/9.4.1208.jre7/postgresql-9.4.1208.jre7.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/com/fasterxml/jackson/module/jackson-module-jaxb-annotations/2.6.6/jackson-module-jaxb-annotations-2.6.6.jar (32 KB at 48.2 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-test/1.3.5.RELEASE/spring-boot-starter-test-1.3.5.RELEASE.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-web/1.3.5.RELEASE/spring-boot-starter-web-1.3.5.RELEASE.jar (3 KB at 3.2 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/junit/junit/4.12/junit-4.12.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/spring-webmvc/4.2.6.RELEASE/spring-webmvc-4.2.6.RELEASE.jar (858 KB at 1273.5 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/mockito/mockito-core/1.10.19/mockito-core-1.10.19.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/spring-expression/4.2.6.RELEASE/spring-expression-4.2.6.RELEASE.jar (257 KB at 381.1 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/objenesis/objenesis/2.1/objenesis-2.1.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-test/1.3.5.RELEASE/spring-boot-starter-test-1.3.5.RELEASE.jar (3 KB at 3.3 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/postgresql/postgresql/9.4.1208.jre7/postgresql-9.4.1208.jre7.jar (631 KB at 921.3 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/hamcrest/hamcrest-library/1.3/hamcrest-library-1.3.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/junit/junit/4.12/junit-4.12.jar (308 KB at 445.1 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/spring-core/4.2.6.RELEASE/spring-core-4.2.6.RELEASE.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/objenesis/objenesis/2.1/objenesis-2.1.jar (41 KB at 58.3 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/org/springframework/spring-test/4.2.6.RELEASE/spring-test-4.2.6.RELEASE.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar (44 KB at 62.3 KB/sec)

[INFO] Downloading: http://repo.maven.apache.org/maven2/com/h2database/h2/1.4.191/h2-1.4.191.jar

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/hamcrest/hamcrest-library/1.3/hamcrest-library-1.3.jar (52 KB at 73.0 KB/sec)

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/mockito/mockito-core/1.10.19/mockito-core-1.10.19.jar (1146 KB at 1595.4 KB/sec)

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/spring-core/4.2.6.RELEASE/spring-core-4.2.6.RELEASE.jar (1071 KB at 1474.8 KB/sec)

[INFO] Downloaded: http://repo.maven.apache.org/maven2/org/springframework/spring-test/4.2.6.RELEASE/spring-test-4.2.6.RELEASE.jar (550 KB at 755.6 KB/sec)

[INFO] Downloaded: http://repo.maven.apache.org/maven2/com/h2database/h2/1.4.191/h2-1.4.191.jar (1722 KB at 2285.9 KB/sec)

[INFO] 

[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ DBConnector ---

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/2.0.6/maven-plugin-api-2.0.6.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/2.0.6/maven-plugin-api-2.0.6.pom (2 KB at 50.7 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven/2.0.6/maven-2.0.6.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven/2.0.6/maven-2.0.6.pom (9 KB at 420.7 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/5/maven-parent-5.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/5/maven-parent-5.pom (15 KB at 676.4 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/apache/3/apache-3.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/apache/3/apache-3.pom (4 KB at 176.3 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-project/2.0.6/maven-project-2.0.6.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-project/2.0.6/maven-project-2.0.6.pom (3 KB at 128.8 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/2.0.6/maven-settings-2.0.6.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/2.0.6/maven-settings-2.0.6.pom (2 KB at 102.8 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/2.0.6/maven-model-2.0.6.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/2.0.6/maven-model-2.0.6.pom (3 KB at 124.0 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.4.1/plexus-utils-1.4.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.4.1/plexus-utils-1.4.1.pom (2 KB at 98.1 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/1.0.11/plexus-1.0.11.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/1.0.11/plexus-1.0.11.pom (9 KB at 437.9 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-container-default/1.0-alpha-9-stable-1/plexus-container-default-1.0-alpha-9-stable-1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-container-default/1.0-alpha-9-stable-1/plexus-container-default-1.0-alpha-9-stable-1.pom (4 KB at 203.0 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/1.0.3/plexus-containers-1.0.3.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/1.0.3/plexus-containers-1.0.3.pom (492 B at 25.3 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/1.0.4/plexus-1.0.4.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/1.0.4/plexus-1.0.4.pom (6 KB at 280.1 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/junit/junit/3.8.1/junit-3.8.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/junit/junit/3.8.1/junit-3.8.1.pom (998 B at 54.1 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.0.4/plexus-utils-1.0.4.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.0.4/plexus-utils-1.0.4.pom (7 KB at 318.8 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/classworlds/classworlds/1.1-alpha-2/classworlds-1.1-alpha-2.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/classworlds/classworlds/1.1-alpha-2/classworlds-1.1-alpha-2.pom (4 KB at 145.5 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-profile/2.0.6/maven-profile-2.0.6.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-profile/2.0.6/maven-profile-2.0.6.pom (2 KB at 101.8 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact-manager/2.0.6/maven-artifact-manager-2.0.6.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact-manager/2.0.6/maven-artifact-manager-2.0.6.pom (3 KB at 142.3 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/2.0.6/maven-repository-metadata-2.0.6.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/2.0.6/maven-repository-metadata-2.0.6.pom (2 KB at 100.4 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/2.0.6/maven-artifact-2.0.6.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/2.0.6/maven-artifact-2.0.6.pom (2 KB at 77.0 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-registry/2.0.6/maven-plugin-registry-2.0.6.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-registry/2.0.6/maven-plugin-registry-2.0.6.pom (2 KB at 105.6 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/2.0.6/maven-core-2.0.6.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/2.0.6/maven-core-2.0.6.pom (7 KB at 297.9 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-parameter-documenter/2.0.6/maven-plugin-parameter-documenter-2.0.6.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-parameter-documenter/2.0.6/maven-plugin-parameter-documenter-2.0.6.pom (2 KB at 81.1 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-api/2.0.6/maven-reporting-api-2.0.6.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-api/2.0.6/maven-reporting-api-2.0.6.pom (2 KB at 90.0 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting/2.0.6/maven-reporting-2.0.6.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting/2.0.6/maven-reporting-2.0.6.pom (2 KB at 78.1 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sink-api/1.0-alpha-7/doxia-sink-api-1.0-alpha-7.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sink-api/1.0-alpha-7/doxia-sink-api-1.0-alpha-7.pom (424 B at 23.0 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia/1.0-alpha-7/doxia-1.0-alpha-7.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia/1.0-alpha-7/doxia-1.0-alpha-7.pom (4 KB at 159.2 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-error-diagnostics/2.0.6/maven-error-diagnostics-2.0.6.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-error-diagnostics/2.0.6/maven-error-diagnostics-2.0.6.pom (2 KB at 92.4 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/commons-cli/commons-cli/1.0/commons-cli-1.0.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/commons-cli/commons-cli/1.0/commons-cli-1.0.pom (3 KB at 108.2 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-descriptor/2.0.6/maven-plugin-descriptor-2.0.6.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-descriptor/2.0.6/maven-plugin-descriptor-2.0.6.pom (2 KB at 103.7 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interactivity-api/1.0-alpha-4/plexus-interactivity-api-1.0-alpha-4.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interactivity-api/1.0-alpha-4/plexus-interactivity-api-1.0-alpha-4.pom (7 KB at 346.2 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-monitor/2.0.6/maven-monitor-2.0.6.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-monitor/2.0.6/maven-monitor-2.0.6.pom (2 KB at 64.5 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/classworlds/classworlds/1.1/classworlds-1.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/classworlds/classworlds/1.1/classworlds-1.1.pom (4 KB at 154.6 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/2.0.5/plexus-utils-2.0.5.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/2.0.5/plexus-utils-2.0.5.pom (4 KB at 162.8 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.6/plexus-2.0.6.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.6/plexus-2.0.6.pom (17 KB at 711.7 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-filtering/1.1/maven-filtering-1.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-filtering/1.1/maven-filtering-1.1.pom (6 KB at 245.8 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/17/maven-shared-components-17.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/17/maven-shared-components-17.pom (9 KB at 404.7 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/21/maven-parent-21.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/21/maven-parent-21.pom (26 KB at 887.6 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/apache/10/apache-10.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/apache/10/apache-10.pom (15 KB at 401.4 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.5.15/plexus-utils-1.5.15.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.5.15/plexus-utils-1.5.15.pom (7 KB at 334.4 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.2/plexus-2.0.2.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.2/plexus-2.0.2.pom (12 KB at 539.9 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.12/plexus-interpolation-1.12.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.12/plexus-interpolation-1.12.pom (889 B at 48.2 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.1.14/plexus-components-1.1.14.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.1.14/plexus-components-1.1.14.pom (6 KB at 285.3 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-build-api/0.0.4/plexus-build-api-0.0.4.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-build-api/0.0.4/plexus-build-api-0.0.4.pom (3 KB at 68.2 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/sonatype/spice/spice-parent/10/spice-parent-10.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/sonatype/spice/spice-parent/10/spice-parent-10.pom (3 KB at 147.2 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/3/forge-parent-3.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/3/forge-parent-3.pom (5 KB at 245.8 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.5.8/plexus-utils-1.5.8.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.5.8/plexus-utils-1.5.8.pom (8 KB at 375.0 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.13/plexus-interpolation-1.13.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.13/plexus-interpolation-1.13.pom (890 B at 22.9 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.1.15/plexus-components-1.1.15.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.1.15/plexus-components-1.1.15.pom (3 KB at 146.4 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.3/plexus-2.0.3.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.3/plexus-2.0.3.pom (16 KB at 656.5 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-api/2.0.6/maven-reporting-api-2.0.6.jar

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sink-api/1.0-alpha-7/doxia-sink-api-1.0-alpha-7.jar

[INFO] Downloading: https://repo.maven.apache.org/maven2/commons-cli/commons-cli/1.0/commons-cli-1.0.jar

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interactivity-api/1.0-alpha-4/plexus-interactivity-api-1.0-alpha-4.jar

[INFO] Downloading: https://repo.maven.apache.org/maven2/junit/junit/3.8.1/junit-3.8.1.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-api/2.0.6/maven-reporting-api-2.0.6.jar (10 KB at 121.4 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/2.0.5/plexus-utils-2.0.5.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sink-api/1.0-alpha-7/doxia-sink-api-1.0-alpha-7.jar (6 KB at 90.6 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-filtering/1.1/maven-filtering-1.1.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/commons-cli/commons-cli/1.0/commons-cli-1.0.jar (30 KB at 338.1 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-build-api/0.0.4/plexus-build-api-0.0.4.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-filtering/1.1/maven-filtering-1.1.jar (43 KB at 425.2 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.13/plexus-interpolation-1.13.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-build-api/0.0.4/plexus-build-api-0.0.4.jar (7 KB at 59.9 KB/sec)

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interactivity-api/1.0-alpha-4/plexus-interactivity-api-1.0-alpha-4.jar (14 KB at 54.6 KB/sec)

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.13/plexus-interpolation-1.13.jar (60 KB at 246.4 KB/sec)

[INFO] Downloaded: https://repo.maven.apache.org/maven2/junit/junit/3.8.1/junit-3.8.1.jar (119 KB at 461.8 KB/sec)

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/2.0.5/plexus-utils-2.0.5.jar (218 KB at 885.9 KB/sec)

[INFO] Using 'UTF-8' encoding to copy filtered resources.

[INFO] Copying 1 resource

[INFO] Copying 2 resources

[INFO] 

[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ DBConnector ---

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/2.0.9/maven-plugin-api-2.0.9.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/2.0.9/maven-plugin-api-2.0.9.pom (2 KB at 54.0 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven/2.0.9/maven-2.0.9.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven/2.0.9/maven-2.0.9.pom (19 KB at 769.3 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/8/maven-parent-8.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/8/maven-parent-8.pom (24 KB at 906.4 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/apache/4/apache-4.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/apache/4/apache-4.pom (5 KB at 231.0 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/2.0.9/maven-artifact-2.0.9.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/2.0.9/maven-artifact-2.0.9.pom (2 KB at 83.2 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.5.1/plexus-utils-1.5.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.5.1/plexus-utils-1.5.1.pom (3 KB at 112.1 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/2.0.9/maven-core-2.0.9.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/2.0.9/maven-core-2.0.9.pom (8 KB at 380.1 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/2.0.9/maven-settings-2.0.9.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/2.0.9/maven-settings-2.0.9.pom (3 KB at 105.8 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/2.0.9/maven-model-2.0.9.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/2.0.9/maven-model-2.0.9.pom (4 KB at 161.4 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-parameter-documenter/2.0.9/maven-plugin-parameter-documenter-2.0.9.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-parameter-documenter/2.0.9/maven-plugin-parameter-documenter-2.0.9.pom (2 KB at 106.6 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-profile/2.0.9/maven-profile-2.0.9.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-profile/2.0.9/maven-profile-2.0.9.pom (3 KB at 95.3 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/2.0.9/maven-repository-metadata-2.0.9.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/2.0.9/maven-repository-metadata-2.0.9.pom (2 KB at 103.1 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-error-diagnostics/2.0.9/maven-error-diagnostics-2.0.9.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-error-diagnostics/2.0.9/maven-error-diagnostics-2.0.9.pom (2 KB at 68.1 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-project/2.0.9/maven-project-2.0.9.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-project/2.0.9/maven-project-2.0.9.pom (3 KB at 139.3 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact-manager/2.0.9/maven-artifact-manager-2.0.9.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact-manager/2.0.9/maven-artifact-manager-2.0.9.pom (3 KB at 146.5 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-registry/2.0.9/maven-plugin-registry-2.0.9.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-registry/2.0.9/maven-plugin-registry-2.0.9.pom (2 KB at 96.2 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-descriptor/2.0.9/maven-plugin-descriptor-2.0.9.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-descriptor/2.0.9/maven-plugin-descriptor-2.0.9.pom (3 KB at 106.7 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-monitor/2.0.9/maven-monitor-2.0.9.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-monitor/2.0.9/maven-monitor-2.0.9.pom (2 KB at 66.0 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-toolchain/1.0/maven-toolchain-1.0.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-toolchain/1.0/maven-toolchain-1.0.pom (4 KB at 166.7 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/0.1/maven-shared-utils-0.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/0.1/maven-shared-utils-0.1.pom (4 KB at 197.6 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/18/maven-shared-components-18.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/18/maven-shared-components-18.pom (5 KB at 240.9 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/com/google/code/findbugs/jsr305/2.0.1/jsr305-2.0.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/com/google/code/findbugs/jsr305/2.0.1/jsr305-2.0.1.pom (965 B at 52.4 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-incremental/1.1/maven-shared-incremental-1.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-incremental/1.1/maven-shared-incremental-1.1.pom (5 KB at 231.5 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/19/maven-shared-components-19.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/19/maven-shared-components-19.pom (7 KB at 326.8 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/2.2.1/maven-plugin-api-2.2.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/2.2.1/maven-plugin-api-2.2.1.pom (2 KB at 79.2 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven/2.2.1/maven-2.2.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven/2.2.1/maven-2.2.1.pom (22 KB at 911.8 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/11/maven-parent-11.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/11/maven-parent-11.pom (32 KB at 1130.3 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/apache/5/apache-5.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/apache/5/apache-5.pom (5 KB at 210.6 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/2.2.1/maven-core-2.2.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/2.2.1/maven-core-2.2.1.pom (12 KB at 541.0 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/2.2.1/maven-settings-2.2.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/2.2.1/maven-settings-2.2.1.pom (3 KB at 73.4 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/2.2.1/maven-model-2.2.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/2.2.1/maven-model-2.2.1.pom (4 KB at 158.2 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.11/plexus-interpolation-1.11.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.11/plexus-interpolation-1.11.pom (889 B at 45.7 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-parameter-documenter/2.2.1/maven-plugin-parameter-documenter-2.2.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-parameter-documenter/2.2.1/maven-plugin-parameter-documenter-2.2.1.pom (2 KB at 106.2 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-jdk14/1.5.6/slf4j-jdk14-1.5.6.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-jdk14/1.5.6/slf4j-jdk14-1.5.6.pom (2 KB at 103.0 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-parent/1.5.6/slf4j-parent-1.5.6.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-parent/1.5.6/slf4j-parent-1.5.6.pom (8 KB at 386.7 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.5.6/slf4j-api-1.5.6.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.5.6/slf4j-api-1.5.6.pom (3 KB at 153.4 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/slf4j/jcl-over-slf4j/1.5.6/jcl-over-slf4j-1.5.6.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/slf4j/jcl-over-slf4j/1.5.6/jcl-over-slf4j-1.5.6.pom (3 KB at 105.9 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-profile/2.2.1/maven-profile-2.2.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-profile/2.2.1/maven-profile-2.2.1.pom (3 KB at 106.0 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/2.2.1/maven-artifact-2.2.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/2.2.1/maven-artifact-2.2.1.pom (2 KB at 85.8 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/2.2.1/maven-repository-metadata-2.2.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/2.2.1/maven-repository-metadata-2.2.1.pom (2 KB at 101.5 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-error-diagnostics/2.2.1/maven-error-diagnostics-2.2.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-error-diagnostics/2.2.1/maven-error-diagnostics-2.2.1.pom (2 KB at 87.8 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-project/2.2.1/maven-project-2.2.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-project/2.2.1/maven-project-2.2.1.pom (3 KB at 142.5 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact-manager/2.2.1/maven-artifact-manager-2.2.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact-manager/2.2.1/maven-artifact-manager-2.2.1.pom (4 KB at 151.5 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/backport-util-concurrent/backport-util-concurrent/3.1/backport-util-concurrent-3.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/backport-util-concurrent/backport-util-concurrent/3.1/backport-util-concurrent-3.1.pom (880 B at 45.2 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-registry/2.2.1/maven-plugin-registry-2.2.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-registry/2.2.1/maven-plugin-registry-2.2.1.pom (2 KB at 104.7 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-descriptor/2.2.1/maven-plugin-descriptor-2.2.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-descriptor/2.2.1/maven-plugin-descriptor-2.2.1.pom (3 KB at 112.0 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-monitor/2.2.1/maven-monitor-2.2.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-monitor/2.2.1/maven-monitor-2.2.1.pom (2 KB at 64.6 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-sec-dispatcher/1.3/plexus-sec-dispatcher-1.3.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-sec-dispatcher/1.3/plexus-sec-dispatcher-1.3.pom (3 KB at 152.2 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/sonatype/spice/spice-parent/12/spice-parent-12.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/sonatype/spice/spice-parent/12/spice-parent-12.pom (7 KB at 331.9 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/4/forge-parent-4.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/4/forge-parent-4.pom (9 KB at 390.5 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.5.5/plexus-utils-1.5.5.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.5.5/plexus-utils-1.5.5.pom (6 KB at 251.3 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-cipher/1.4/plexus-cipher-1.4.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-cipher/1.4/plexus-cipher-1.4.pom (3 KB at 106.1 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/1.5.5/plexus-component-annotations-1.5.5.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/1.5.5/plexus-component-annotations-1.5.5.pom (815 B at 44.2 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/1.5.5/plexus-containers-1.5.5.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/1.5.5/plexus-containers-1.5.5.pom (5 KB at 217.9 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.7/plexus-2.0.7.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.7/plexus-2.0.7.pom (17 KB at 703.7 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-api/2.2/plexus-compiler-api-2.2.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-api/2.2/plexus-compiler-api-2.2.pom (865 B at 46.9 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler/2.2/plexus-compiler-2.2.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler/2.2/plexus-compiler-2.2.pom (4 KB at 185.8 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.3.1/plexus-components-1.3.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.3.1/plexus-components-1.3.1.pom (3 KB at 103.2 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/3.3.1/plexus-3.3.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/3.3.1/plexus-3.3.1.pom (20 KB at 868.1 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/sonatype/spice/spice-parent/17/spice-parent-17.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/sonatype/spice/spice-parent/17/spice-parent-17.pom (7 KB at 330.0 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/10/forge-parent-10.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/10/forge-parent-10.pom (14 KB at 551.8 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0.8/plexus-utils-3.0.8.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0.8/plexus-utils-3.0.8.pom (4 KB at 161.5 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/3.2/plexus-3.2.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/3.2/plexus-3.2.pom (19 KB at 795.9 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-manager/2.2/plexus-compiler-manager-2.2.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-manager/2.2/plexus-compiler-manager-2.2.pom (690 B at 39.6 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-javac/2.2/plexus-compiler-javac-2.2.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-javac/2.2/plexus-compiler-javac-2.2.pom (769 B at 41.7 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compilers/2.2/plexus-compilers-2.2.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compilers/2.2/plexus-compilers-2.2.pom (2 KB at 67.3 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-container-default/1.5.5/plexus-container-default-1.5.5.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-container-default/1.5.5/plexus-container-default-1.5.5.pom (3 KB at 79.1 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.4.5/plexus-utils-1.4.5.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.4.5/plexus-utils-1.4.5.pom (3 KB at 110.6 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.2.2/plexus-classworlds-2.2.2.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.2.2/plexus-classworlds-2.2.2.pom (4 KB at 218.8 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/xbean/xbean-reflect/3.4/xbean-reflect-3.4.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/xbean/xbean-reflect/3.4/xbean-reflect-3.4.pom (3 KB at 130.6 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/xbean/xbean/3.4/xbean-3.4.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/xbean/xbean/3.4/xbean-3.4.pom (19 KB at 754.1 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/log4j/log4j/1.2.12/log4j-1.2.12.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/log4j/log4j/1.2.12/log4j-1.2.12.pom (145 B at 8.3 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/commons-logging/commons-logging-api/1.1/commons-logging-api-1.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/commons-logging/commons-logging-api/1.1/commons-logging-api-1.1.pom (6 KB at 193.4 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/com/google/collections/google-collections/1.0/google-collections-1.0.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/com/google/collections/google-collections/1.0/google-collections-1.0.pom (3 KB at 89.6 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/com/google/google/1/google-1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/com/google/google/1/google-1.pom (2 KB at 84.3 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/junit/junit/3.8.2/junit-3.8.2.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/junit/junit/3.8.2/junit-3.8.2.pom (747 B at 40.5 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.5.1/plexus-utils-1.5.1.jar

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/0.1/maven-shared-utils-0.1.jar

[INFO] Downloading: https://repo.maven.apache.org/maven2/com/google/code/findbugs/jsr305/2.0.1/jsr305-2.0.1.jar

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-incremental/1.1/maven-shared-incremental-1.1.jar

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/1.5.5/plexus-component-annotations-1.5.5.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-incremental/1.1/maven-shared-incremental-1.1.jar (14 KB at 155.5 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-api/2.2/plexus-compiler-api-2.2.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/com/google/code/findbugs/jsr305/2.0.1/jsr305-2.0.1.jar (32 KB at 266.0 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-manager/2.2/plexus-compiler-manager-2.2.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-manager/2.2/plexus-compiler-manager-2.2.jar (5 KB at 48.9 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-javac/2.2/plexus-compiler-javac-2.2.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/1.5.5/plexus-component-annotations-1.5.5.jar (5 KB at 36.7 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/xbean/xbean-reflect/3.4/xbean-reflect-3.4.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-api/2.2/plexus-compiler-api-2.2.jar (25 KB at 251.6 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/log4j/log4j/1.2.12/log4j-1.2.12.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-javac/2.2/plexus-compiler-javac-2.2.jar (19 KB at 162.5 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/commons-logging/commons-logging-api/1.1/commons-logging-api-1.1.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/commons-logging/commons-logging-api/1.1/commons-logging-api-1.1.jar (44 KB at 281.0 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/com/google/collections/google-collections/1.0/google-collections-1.0.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/0.1/maven-shared-utils-0.1.jar (151 KB at 554.8 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/junit/junit/3.8.2/junit-3.8.2.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.5.1/plexus-utils-1.5.1.jar (206 KB at 724.4 KB/sec)

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/xbean/xbean-reflect/3.4/xbean-reflect-3.4.jar (131 KB at 563.3 KB/sec)

[INFO] Downloaded: https://repo.maven.apache.org/maven2/junit/junit/3.8.2/junit-3.8.2.jar (118 KB at 359.2 KB/sec)

[INFO] Downloaded: https://repo.maven.apache.org/maven2/log4j/log4j/1.2.12/log4j-1.2.12.jar (350 KB at 996.3 KB/sec)

[INFO] Downloaded: https://repo.maven.apache.org/maven2/com/google/collections/google-collections/1.0/google-collections-1.0.jar (625 KB at 1239.3 KB/sec)

[INFO] Changes detected - recompiling the module!

[INFO] Compiling 5 source files to /home/travis/build/StepanTsymbal/HelloBack/target/classes

[INFO] 

[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ DBConnector ---

[INFO] Using 'UTF-8' encoding to copy filtered resources.

[INFO] skip non existing resourceDirectory /home/travis/build/StepanTsymbal/HelloBack/src/test/resources

[INFO] 

[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ DBConnector ---

[INFO] Changes detected - recompiling the module!

[INFO] Compiling 1 source file to /home/travis/build/StepanTsymbal/HelloBack/target/test-classes

[INFO] 

[INFO] --- maven-surefire-plugin:2.18.1:test (default-test) @ DBConnector ---

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/maven-surefire-common/2.18.1/maven-surefire-common-2.18.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/maven-surefire-common/2.18.1/maven-surefire-common-2.18.1.pom (7 KB at 191.4 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/plugin-tools/maven-plugin-annotations/3.3/maven-plugin-annotations-3.3.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/plugin-tools/maven-plugin-annotations/3.3/maven-plugin-annotations-3.3.pom (2 KB at 83.7 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/plugin-tools/maven-plugin-tools/3.3/maven-plugin-tools-3.3.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/plugin-tools/maven-plugin-tools/3.3/maven-plugin-tools-3.3.pom (13 KB at 561.4 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-api/2.18.1/surefire-api-2.18.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-api/2.18.1/surefire-api-2.18.1.pom (3 KB at 117.3 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-booter/2.18.1/surefire-booter-2.18.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-booter/2.18.1/surefire-booter-2.18.1.pom (3 KB at 142.3 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-api/3.0/maven-reporting-api-3.0.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-api/3.0/maven-reporting-api-3.0.pom (3 KB at 115.9 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/15/maven-shared-components-15.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/15/maven-shared-components-15.pom (10 KB at 455.9 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/16/maven-parent-16.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/16/maven-parent-16.pom (23 KB at 909.1 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/apache/7/apache-7.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/apache/7/apache-7.pom (15 KB at 587.2 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-toolchain/2.2.1/maven-toolchain-2.2.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-toolchain/2.2.1/maven-toolchain-2.2.1.pom (4 KB at 163.3 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.1/commons-lang3-3.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.1/commons-lang3-3.1.pom (17 KB at 680.0 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/22/commons-parent-22.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/22/commons-parent-22.pom (41 KB at 1106.4 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/apache/9/apache-9.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/apache/9/apache-9.pom (15 KB at 672.9 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/maven-surefire-common/2.18.1/maven-surefire-common-2.18.1.jar

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-booter/2.18.1/surefire-booter-2.18.1.jar

[INFO] Downloading: https://repo.maven.apache.org/maven2/backport-util-concurrent/backport-util-concurrent/3.1/backport-util-concurrent-3.1.jar

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.11/plexus-interpolation-1.11.jar

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.5.15/plexus-utils-1.5.15.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-booter/2.18.1/surefire-booter-2.18.1.jar (39 KB at 533.5 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-jdk14/1.5.6/slf4j-jdk14-1.5.6.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.11/plexus-interpolation-1.11.jar (50 KB at 975.3 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.5.6/slf4j-api-1.5.6.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-jdk14/1.5.6/slf4j-jdk14-1.5.6.jar (9 KB at 239.1 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/slf4j/jcl-over-slf4j/1.5.6/jcl-over-slf4j-1.5.6.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.5.6/slf4j-api-1.5.6.jar (22 KB at 369.7 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-api/3.0/maven-reporting-api-3.0.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/slf4j/jcl-over-slf4j/1.5.6/jcl-over-slf4j-1.5.6.jar (17 KB at 259.2 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-sec-dispatcher/1.3/plexus-sec-dispatcher-1.3.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-api/3.0/maven-reporting-api-3.0.jar (11 KB at 133.5 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-cipher/1.4/plexus-cipher-1.4.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/maven-surefire-common/2.18.1/maven-surefire-common-2.18.1.jar (269 KB at 1654.3 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.1/commons-lang3-3.1.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-sec-dispatcher/1.3/plexus-sec-dispatcher-1.3.jar (28 KB at 173.2 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-api/2.18.1/surefire-api-2.18.1.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-cipher/1.4/plexus-cipher-1.4.jar (14 KB at 79.9 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/plugin-tools/maven-plugin-annotations/3.3/maven-plugin-annotations-3.3.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/plugin-tools/maven-plugin-annotations/3.3/maven-plugin-annotations-3.3.jar (14 KB at 71.8 KB/sec)

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.5.15/plexus-utils-1.5.15.jar (223 KB at 776.2 KB/sec)

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-api/2.18.1/surefire-api-2.18.1.jar (145 KB at 483.3 KB/sec)

[INFO] Downloaded: https://repo.maven.apache.org/maven2/backport-util-concurrent/backport-util-concurrent/3.1/backport-util-concurrent-3.1.jar (324 KB at 939.0 KB/sec)

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.1/commons-lang3-3.1.jar (309 KB at 901.8 KB/sec)

[INFO] Tests are skipped.

[INFO] 

[INFO] --- maven-jar-plugin:2.5:jar (default-jar) @ DBConnector ---

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-archiver/2.5/maven-archiver-2.5.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-archiver/2.5/maven-archiver-2.5.pom (5 KB at 100.7 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/2.1/plexus-archiver-2.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/2.1/plexus-archiver-2.1.pom (3 KB at 137.2 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0/plexus-utils-3.0.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0/plexus-utils-3.0.pom (4 KB at 198.6 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/sonatype/spice/spice-parent/16/spice-parent-16.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/sonatype/spice/spice-parent/16/spice-parent-16.pom (9 KB at 388.7 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/5/forge-parent-5.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/5/forge-parent-5.pom (9 KB at 388.9 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-io/2.0.2/plexus-io-2.0.2.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-io/2.0.2/plexus-io-2.0.2.pom (2 KB at 76.9 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.1.19/plexus-components-1.1.19.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.1.19/plexus-components-1.1.19.pom (3 KB at 146.4 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/3.0.1/plexus-3.0.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/3.0.1/plexus-3.0.1.pom (19 KB at 757.4 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.15/plexus-interpolation-1.15.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.15/plexus-interpolation-1.15.pom (1018 B at 55.2 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0.15/plexus-utils-3.0.15.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0.15/plexus-utils-3.0.15.pom (4 KB at 153.6 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/2.4.4/plexus-archiver-2.4.4.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/2.4.4/plexus-archiver-2.4.4.pom (4 KB at 172.4 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.3/plexus-components-1.3.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.3/plexus-components-1.3.pom (3 KB at 149.3 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/3.3/plexus-3.3.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/3.3/plexus-3.3.pom (20 KB at 809.7 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-io/2.0.10/plexus-io-2.0.10.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-io/2.0.10/plexus-io-2.0.10.pom (3 KB at 113.8 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.2/plexus-components-1.2.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.2/plexus-components-1.2.pom (3 KB at 157.2 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/commons/commons-compress/1.5/commons-compress-1.5.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/commons/commons-compress/1.5/commons-compress-1.5.pom (11 KB at 450.5 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/28/commons-parent-28.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/28/commons-parent-28.pom (49 KB at 1440.4 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/tukaani/xz/1.2/xz-1.2.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/tukaani/xz/1.2/xz-1.2.pom (2 KB at 77.5 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.15/plexus-interpolation-1.15.jar

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0.15/plexus-utils-3.0.15.jar

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/2.4.4/plexus-archiver-2.4.4.jar

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-archiver/2.5/maven-archiver-2.5.jar

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-io/2.0.10/plexus-io-2.0.10.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-archiver/2.5/maven-archiver-2.5.jar (22 KB at 273.1 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/commons/commons-compress/1.5/commons-compress-1.5.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.15/plexus-interpolation-1.15.jar (60 KB at 546.8 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/tukaani/xz/1.2/xz-1.2.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-io/2.0.10/plexus-io-2.0.10.jar (58 KB at 320.7 KB/sec)

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/tukaani/xz/1.2/xz-1.2.jar (93 KB at 426.7 KB/sec)

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/2.4.4/plexus-archiver-2.4.4.jar (161 KB at 635.4 KB/sec)

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0.15/plexus-utils-3.0.15.jar (234 KB at 848.6 KB/sec)

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/commons/commons-compress/1.5/commons-compress-1.5.jar (251 KB at 881.1 KB/sec)

[INFO] Building jar: /home/travis/build/StepanTsymbal/HelloBack/target/DBConnector-0.0.1-SNAPSHOT.jar

[INFO] 

[INFO] --- spring-boot-maven-plugin:1.3.5.RELEASE:repackage (default) @ DBConnector ---

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-loader-tools/1.3.5.RELEASE/spring-boot-loader-tools-1.3.5.RELEASE.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-loader-tools/1.3.5.RELEASE/spring-boot-loader-tools-1.3.5.RELEASE.pom (5 KB at 221.7 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/commons-logging/commons-logging/1.2/commons-logging-1.2.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/commons-logging/commons-logging/1.2/commons-logging-1.2.pom (19 KB at 669.9 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/34/commons-parent-34.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/34/commons-parent-34.pom (55 KB at 1606.8 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-archiver/2.6/maven-archiver-2.6.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-archiver/2.6/maven-archiver-2.6.pom (5 KB at 211.0 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/20/maven-shared-components-20.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/20/maven-shared-components-20.pom (5 KB at 249.3 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/3.1.1/maven-artifact-3.1.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/3.1.1/maven-artifact-3.1.1.pom (2 KB at 101.3 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven/3.1.1/maven-3.1.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven/3.1.1/maven-3.1.1.pom (22 KB at 829.9 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0.20/plexus-utils-3.0.20.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0.20/plexus-utils-3.0.20.pom (4 KB at 186.0 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/3.1.1/maven-model-3.1.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/3.1.1/maven-model-3.1.1.pom (5 KB at 202.2 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/3.1.1/maven-core-3.1.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/3.1.1/maven-core-3.1.1.pom (8 KB at 322.7 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/3.1.1/maven-settings-3.1.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/3.1.1/maven-settings-3.1.1.pom (3 KB at 117.8 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings-builder/3.1.1/maven-settings-builder-3.1.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings-builder/3.1.1/maven-settings-builder-3.1.1.pom (3 KB at 105.6 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.19/plexus-interpolation-1.19.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.19/plexus-interpolation-1.19.pom (2 KB at 55.8 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/3.1.1/maven-repository-metadata-3.1.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/3.1.1/maven-repository-metadata-3.1.1.pom (3 KB at 114.6 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/3.1.1/maven-plugin-api-3.1.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/3.1.1/maven-plugin-api-3.1.1.pom (4 KB at 143.6 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/eclipse/sisu/org.eclipse.sisu.plexus/0.0.0.M5/org.eclipse.sisu.plexus-0.0.0.M5.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/sisu/org.eclipse.sisu.plexus/0.0.0.M5/org.eclipse.sisu.plexus-0.0.0.M5.pom (5 KB at 248.3 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/eclipse/sisu/sisu-plexus/0.0.0.M5/sisu-plexus-0.0.0.M5.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/sisu/sisu-plexus/0.0.0.M5/sisu-plexus-0.0.0.M5.pom (13 KB at 537.2 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/javax/enterprise/cdi-api/1.0/cdi-api-1.0.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/javax/enterprise/cdi-api/1.0/cdi-api-1.0.pom (2 KB at 73.7 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/jboss/weld/weld-api-parent/1.0/weld-api-parent-1.0.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/jboss/weld/weld-api-parent/1.0/weld-api-parent-1.0.pom (3 KB at 115.0 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/jboss/weld/weld-api-bom/1.0/weld-api-bom-1.0.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/jboss/weld/weld-api-bom/1.0/weld-api-bom-1.0.pom (8 KB at 367.7 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/jboss/weld/weld-parent/6/weld-parent-6.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/jboss/weld/weld-parent/6/weld-parent-6.pom (21 KB at 777.2 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/javax/annotation/jsr250-api/1.0/jsr250-api-1.0.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/javax/annotation/jsr250-api/1.0/jsr250-api-1.0.pom (1023 B at 50.0 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/com/google/guava/guava/18.0/guava-18.0.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/com/google/guava/guava/18.0/guava-18.0.pom (6 KB at 291.2 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/com/google/guava/guava-parent/18.0/guava-parent-18.0.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/com/google/guava/guava-parent/18.0/guava-parent-18.0.pom (8 KB at 375.3 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-guice/3.1.0/sisu-guice-3.1.0.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-guice/3.1.0/sisu-guice-3.1.0.pom (10 KB at 472.0 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/sonatype/sisu/inject/guice-parent/3.1.0/guice-parent-3.1.0.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/sonatype/sisu/inject/guice-parent/3.1.0/guice-parent-3.1.0.pom (11 KB at 485.0 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/eclipse/sisu/org.eclipse.sisu.inject/0.0.0.M5/org.eclipse.sisu.inject-0.0.0.M5.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/sisu/org.eclipse.sisu.inject/0.0.0.M5/org.eclipse.sisu.inject-0.0.0.M5.pom (3 KB at 129.5 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/eclipse/sisu/sisu-inject/0.0.0.M5/sisu-inject-0.0.0.M5.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/sisu/sisu-inject/0.0.0.M5/sisu-inject-0.0.0.M5.pom (14 KB at 427.1 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.4/plexus-classworlds-2.4.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.4/plexus-classworlds-2.4.pom (4 KB at 199.6 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model-builder/3.1.1/maven-model-builder-3.1.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model-builder/3.1.1/maven-model-builder-3.1.1.pom (3 KB at 144.4 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-aether-provider/3.2.1/maven-aether-provider-3.2.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-aether-provider/3.2.1/maven-aether-provider-3.2.1.pom (4 KB at 222.1 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven/3.2.1/maven-3.2.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven/3.2.1/maven-3.2.1.pom (23 KB at 919.1 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model-builder/3.2.1/maven-model-builder-3.2.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model-builder/3.2.1/maven-model-builder-3.2.1.pom (3 KB at 137.2 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/3.2.1/maven-repository-metadata-3.2.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/3.2.1/maven-repository-metadata-3.2.1.pom (3 KB at 120.9 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-api/1.0.2.v20150114/aether-api-1.0.2.v20150114.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-api/1.0.2.v20150114/aether-api-1.0.2.v20150114.pom (2 KB at 99.4 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether/1.0.2.v20150114/aether-1.0.2.v20150114.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether/1.0.2.v20150114/aether-1.0.2.v20150114.pom (29 KB at 1061.6 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-spi/1.0.2.v20150114/aether-spi-1.0.2.v20150114.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-spi/1.0.2.v20150114/aether-spi-1.0.2.v20150114.pom (2 KB at 107.7 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-util/1.0.2.v20150114/aether-util-1.0.2.v20150114.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-util/1.0.2.v20150114/aether-util-1.0.2.v20150114.pom (3 KB at 109.1 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-impl/1.0.2.v20150114/aether-impl-1.0.2.v20150114.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-impl/1.0.2.v20150114/aether-impl-1.0.2.v20150114.pom (4 KB at 172.8 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.5.1/plexus-classworlds-2.5.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.5.1/plexus-classworlds-2.5.1.pom (5 KB at 257.5 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/0.7/maven-shared-utils-0.7.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/0.7/maven-shared-utils-0.7.pom (5 KB at 257.7 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/2.8.1/plexus-archiver-2.8.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/2.8.1/plexus-archiver-2.8.1.pom (5 KB at 211.7 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-io/2.3.2/plexus-io-2.3.2.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-io/2.3.2/plexus-io-2.3.2.pom (3 KB at 136.3 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/commons/commons-compress/1.9/commons-compress-1.9.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/commons/commons-compress/1.9/commons-compress-1.9.pom (12 KB at 531.7 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.21/plexus-interpolation-1.21.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.21/plexus-interpolation-1.21.pom (2 KB at 83.6 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-common-artifact-filters/1.4/maven-common-artifact-filters-1.4.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-common-artifact-filters/1.4/maven-common-artifact-filters-1.4.pom (4 KB at 204.0 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-project/2.0.8/maven-project-2.0.8.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-project/2.0.8/maven-project-2.0.8.pom (3 KB at 132.3 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven/2.0.8/maven-2.0.8.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven/2.0.8/maven-2.0.8.pom (12 KB at 590.6 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/6/maven-parent-6.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/6/maven-parent-6.pom (20 KB at 783.0 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-profile/2.0.8/maven-profile-2.0.8.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-profile/2.0.8/maven-profile-2.0.8.pom (2 KB at 94.7 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact-manager/2.0.8/maven-artifact-manager-2.0.8.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact-manager/2.0.8/maven-artifact-manager-2.0.8.pom (3 KB at 146.5 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/2.0.8/maven-repository-metadata-2.0.8.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/2.0.8/maven-repository-metadata-2.0.8.pom (2 KB at 103.1 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-registry/2.0.8/maven-plugin-registry-2.0.8.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-registry/2.0.8/maven-plugin-registry-2.0.8.pom (2 KB at 108.5 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/log4j/log4j/1.2.17/log4j-1.2.17.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/log4j/log4j/1.2.17/log4j-1.2.17.pom (22 KB at 884.8 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-shade-plugin/2.2/maven-shade-plugin-2.2.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-shade-plugin/2.2/maven-shade-plugin-2.2.pom (8 KB at 333.1 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-compat/3.0/maven-compat-3.0.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-compat/3.0/maven-compat-3.0.pom (4 KB at 170.7 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven/3.0/maven-3.0.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven/3.0/maven-3.0.pom (22 KB at 890.5 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/15/maven-parent-15.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/15/maven-parent-15.pom (24 KB at 937.6 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/apache/6/apache-6.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/apache/6/apache-6.pom (13 KB at 41.5 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model-builder/3.0/maven-model-builder-3.0.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model-builder/3.0/maven-model-builder-3.0.pom (3 KB at 115.4 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.14/plexus-interpolation-1.14.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.14/plexus-interpolation-1.14.pom (910 B at 49.4 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.1.18/plexus-components-1.1.18.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.1.18/plexus-components-1.1.18.pom (6 KB at 275.2 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-plexus/1.4.2/sisu-inject-plexus-1.4.2.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-plexus/1.4.2/sisu-inject-plexus-1.4.2.pom (6 KB at 262.2 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/sonatype/sisu/inject/guice-plexus/1.4.2/guice-plexus-1.4.2.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/sonatype/sisu/inject/guice-plexus/1.4.2/guice-plexus-1.4.2.pom (4 KB at 152.7 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/sonatype/sisu/inject/guice-bean/1.4.2/guice-bean-1.4.2.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/sonatype/sisu/inject/guice-bean/1.4.2/guice-bean-1.4.2.pom (3 KB at 133.9 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject/1.4.2/sisu-inject-1.4.2.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject/1.4.2/sisu-inject-1.4.2.pom (2 KB at 67.8 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-parent/1.4.2/sisu-parent-1.4.2.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-parent/1.4.2/sisu-parent-1.4.2.pom (8 KB at 379.7 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/6/forge-parent-6.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/6/forge-parent-6.pom (11 KB at 500.1 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/1.5.4/plexus-component-annotations-1.5.4.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/1.5.4/plexus-component-annotations-1.5.4.pom (815 B at 44.2 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/1.5.4/plexus-containers-1.5.4.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/1.5.4/plexus-containers-1.5.4.pom (5 KB at 207.0 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.5/plexus-2.0.5.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.5/plexus-2.0.5.pom (17 KB at 736.6 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.2.3/plexus-classworlds-2.2.3.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.2.3/plexus-classworlds-2.2.3.pom (4 KB at 216.9 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-bean/1.4.2/sisu-inject-bean-1.4.2.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-bean/1.4.2/sisu-inject-bean-1.4.2.pom (6 KB at 115.9 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-guice/2.1.7/sisu-guice-2.1.7.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-guice/2.1.7/sisu-guice-2.1.7.pom (11 KB at 491.0 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/wagon/wagon-provider-api/1.0-beta-6/wagon-provider-api-1.0-beta-6.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/wagon/wagon-provider-api/1.0-beta-6/wagon-provider-api-1.0-beta-6.pom (2 KB at 95.5 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/wagon/wagon/1.0-beta-6/wagon-1.0-beta-6.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/wagon/wagon/1.0-beta-6/wagon-1.0-beta-6.pom (13 KB at 549.8 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/asm/asm/3.3.1/asm-3.3.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/asm/asm/3.3.1/asm-3.3.1.pom (266 B at 14.4 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/asm/asm-parent/3.3.1/asm-parent-3.3.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/asm/asm-parent/3.3.1/asm-parent-3.3.1.pom (5 KB at 222.7 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/asm/asm-commons/3.3.1/asm-commons-3.3.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/asm/asm-commons/3.3.1/asm-commons-3.3.1.pom (417 B at 21.4 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/asm/asm-tree/3.3.1/asm-tree-3.3.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/asm/asm-tree/3.3.1/asm-tree-3.3.1.pom (406 B at 19.8 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/jdom/jdom/1.1/jdom-1.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/jdom/jdom/1.1/jdom-1.1.pom (3 KB at 118.7 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-dependency-tree/2.1/maven-dependency-tree-2.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-dependency-tree/2.1/maven-dependency-tree-2.1.pom (7 KB at 349.0 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-project/2.2.0/maven-project-2.2.0.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-project/2.2.0/maven-project-2.2.0.pom (3 KB at 142.5 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven/2.2.0/maven-2.2.0.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven/2.2.0/maven-2.2.0.pom (22 KB at 877.2 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-profile/2.2.0/maven-profile-2.2.0.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-profile/2.2.0/maven-profile-2.2.0.pom (3 KB at 106.0 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact-manager/2.2.0/maven-artifact-manager-2.2.0.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact-manager/2.2.0/maven-artifact-manager-2.2.0.pom (4 KB at 168.3 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/2.2.0/maven-repository-metadata-2.2.0.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/2.2.0/maven-repository-metadata-2.2.0.pom (2 KB at 101.5 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-registry/2.2.0/maven-plugin-registry-2.2.0.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-registry/2.2.0/maven-plugin-registry-2.2.0.pom (2 KB at 99.1 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/vafer/jdependency/0.7/jdependency-0.7.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/vafer/jdependency/0.7/jdependency-0.7.pom (8 KB at 367.9 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/commons-io/commons-io/1.3.2/commons-io-1.3.2.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/commons-io/commons-io/1.3.2/commons-io-1.3.2.pom (10 KB at 452.3 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/3/commons-parent-3.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/3/commons-parent-3.pom (12 KB at 524.3 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/asm/asm/3.2/asm-3.2.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/asm/asm/3.2/asm-3.2.pom (264 B at 15.2 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/asm/asm-parent/3.2/asm-parent-3.2.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/asm/asm-parent/3.2/asm-parent-3.2.pom (5 KB at 202.3 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/asm/asm-analysis/3.2/asm-analysis-3.2.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/asm/asm-analysis/3.2/asm-analysis-3.2.pom (417 B at 21.4 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/asm/asm-tree/3.2/asm-tree-3.2.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/asm/asm-tree/3.2/asm-tree-3.2.pom (404 B at 23.2 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/asm/asm-commons/3.2/asm-commons-3.2.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/asm/asm-commons/3.2/asm-commons-3.2.pom (415 B at 22.5 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/asm/asm-util/3.2/asm-util-3.2.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/asm/asm-util/3.2/asm-util-3.2.pom (409 B at 23.5 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-loader-tools/1.3.5.RELEASE/spring-boot-loader-tools-1.3.5.RELEASE.jar

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-archiver/2.6/maven-archiver-2.6.jar

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/0.7/maven-shared-utils-0.7.jar

[INFO] Downloading: https://repo.maven.apache.org/maven2/commons-logging/commons-logging/1.2/commons-logging-1.2.jar

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.21/plexus-interpolation-1.21.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-archiver/2.6/maven-archiver-2.6.jar (23 KB at 265.5 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-util/1.0.2.v20150114/aether-util-1.0.2.v20150114.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-loader-tools/1.3.5.RELEASE/spring-boot-loader-tools-1.3.5.RELEASE.jar (133 KB at 1051.3 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/javax/enterprise/cdi-api/1.0/cdi-api-1.0.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/commons-logging/commons-logging/1.2/commons-logging-1.2.jar (61 KB at 539.1 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/javax/annotation/jsr250-api/1.0/jsr250-api-1.0.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.21/plexus-interpolation-1.21.jar (61 KB at 824.2 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/javax/inject/javax.inject/1/javax.inject-1.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/javax/annotation/jsr250-api/1.0/jsr250-api-1.0.jar (6 KB at 64.9 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-guice/3.1.0/sisu-guice-3.1.0-no_aop.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/javax/inject/javax.inject/1/javax.inject-1.jar (3 KB at 26.5 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/eclipse/sisu/org.eclipse.sisu.inject/0.0.0.M5/org.eclipse.sisu.inject-0.0.0.M5.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/javax/enterprise/cdi-api/1.0/cdi-api-1.0.jar (44 KB at 466.5 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-common-artifact-filters/1.4/maven-common-artifact-filters-1.4.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-common-artifact-filters/1.4/maven-common-artifact-filters-1.4.jar (31 KB at 207.1 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/log4j/log4j/1.2.17/log4j-1.2.17.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/0.7/maven-shared-utils-0.7.jar (167 KB at 856.2 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/2.8.1/plexus-archiver-2.8.1.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-util/1.0.2.v20150114/aether-util-1.0.2.v20150114.jar (144 KB at 838.8 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-io/2.3.2/plexus-io-2.3.2.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-io/2.3.2/plexus-io-2.3.2.jar (73 KB at 293.7 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/commons/commons-compress/1.9/commons-compress-1.9.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/2.8.1/plexus-archiver-2.8.1.jar (140 KB at 468.2 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0.20/plexus-utils-3.0.20.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/eclipse/sisu/org.eclipse.sisu.inject/0.0.0.M5/org.eclipse.sisu.inject-0.0.0.M5.jar (285 KB at 810.7 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-shade-plugin/2.2/maven-shade-plugin-2.2.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-guice/3.1.0/sisu-guice-3.1.0-no_aop.jar (350 KB at 874.8 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-bean/1.4.2/sisu-inject-bean-1.4.2.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-shade-plugin/2.2/maven-shade-plugin-2.2.jar (98 KB at 219.0 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-guice/2.1.7/sisu-guice-2.1.7-noaop.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0.20/plexus-utils-3.0.20.jar (238 KB at 468.3 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/asm/asm/3.3.1/asm-3.3.1.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-bean/1.4.2/sisu-inject-bean-1.4.2.jar (150 KB at 273.1 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/asm/asm-commons/3.3.1/asm-commons-3.3.1.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/commons/commons-compress/1.9/commons-compress-1.9.jar (370 KB at 665.5 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/asm/asm-tree/3.3.1/asm-tree-3.3.1.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/asm/asm/3.3.1/asm-3.3.1.jar (43 KB at 75.5 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/jdom/jdom/1.1/jdom-1.1.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/log4j/log4j/1.2.17/log4j-1.2.17.jar (479 KB at 826.3 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-dependency-tree/2.1/maven-dependency-tree-2.1.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/asm/asm-commons/3.3.1/asm-commons-3.3.1.jar (38 KB at 64.5 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/vafer/jdependency/0.7/jdependency-0.7.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/asm/asm-tree/3.3.1/asm-tree-3.3.1.jar (22 KB at 36.0 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/commons-io/commons-io/1.3.2/commons-io-1.3.2.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/vafer/jdependency/0.7/jdependency-0.7.jar (12 KB at 19.0 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/asm/asm-analysis/3.2/asm-analysis-3.2.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-dependency-tree/2.1/maven-dependency-tree-2.1.jar (59 KB at 93.7 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/asm/asm-util/3.2/asm-util-3.2.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/asm/asm-analysis/3.2/asm-analysis-3.2.jar (18 KB at 27.7 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/com/google/guava/guava/18.0/guava-18.0.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/asm/asm-util/3.2/asm-util-3.2.jar (36 KB at 53.5 KB/sec)

[INFO] Downloaded: https://repo.maven.apache.org/maven2/commons-io/commons-io/1.3.2/commons-io-1.3.2.jar (86 KB at 128.5 KB/sec)

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/jdom/jdom/1.1/jdom-1.1.jar (150 KB at 213.6 KB/sec)

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-guice/2.1.7/sisu-guice-2.1.7-noaop.jar (461 KB at 568.0 KB/sec)

[INFO] Downloaded: https://repo.maven.apache.org/maven2/com/google/guava/guava/18.0/guava-18.0.jar (2204 KB at 1627.3 KB/sec)

[INFO] 

[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ DBConnector ---

[INFO] Downloading: https://repo.maven.apache.org/maven2/commons-codec/commons-codec/1.6/commons-codec-1.6.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/commons-codec/commons-codec/1.6/commons-codec-1.6.pom (11 KB at 495.3 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/0.4/maven-shared-utils-0.4.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/0.4/maven-shared-utils-0.4.pom (4 KB at 208.0 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/commons-codec/commons-codec/1.6/commons-codec-1.6.jar

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/0.4/maven-shared-utils-0.4.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/0.4/maven-shared-utils-0.4.jar (152 KB at 677.7 KB/sec)

[INFO] Downloaded: https://repo.maven.apache.org/maven2/commons-codec/commons-codec/1.6/commons-codec-1.6.jar (228 KB at 740.4 KB/sec)

[INFO] Installing /home/travis/build/StepanTsymbal/HelloBack/target/DBConnector-0.0.1-SNAPSHOT.jar to /home/travis/.m2/repository/com/styopik/DBConnector/0.0.1-SNAPSHOT/DBConnector-0.0.1-SNAPSHOT.jar

[INFO] Installing /home/travis/build/StepanTsymbal/HelloBack/pom.xml to /home/travis/.m2/repository/com/styopik/DBConnector/0.0.1-SNAPSHOT/DBConnector-0.0.1-SNAPSHOT.pom

[INFO] ------------------------------------------------------------------------

[INFO] BUILD SUCCESS

[INFO] ------------------------------------------------------------------------

[INFO] Total time: 24.424 s

[INFO] Finished at: 2016-07-02T06:35:02+00:00

[INFO] Final Memory: 34M/296M

[INFO] ------------------------------------------------------------------------

32.26s$ mvn test -B

Java HotSpot(TM) 64-Bit Server VM warning: ignoring option MaxPermSize=192m; support was removed in 8.0

[INFO] Scanning for projects...

[INFO]                                                                         

[INFO] ------------------------------------------------------------------------

[INFO] Building DBConnector 0.0.1-SNAPSHOT

[INFO] ------------------------------------------------------------------------

[INFO] 

[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ DBConnector ---

[INFO] Using 'UTF-8' encoding to copy filtered resources.

[INFO] Copying 1 resource

[INFO] Copying 2 resources

[INFO] 

[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ DBConnector ---

[INFO] Nothing to compile - all classes are up to date

[INFO] 

[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ DBConnector ---

[INFO] Using 'UTF-8' encoding to copy filtered resources.

[INFO] skip non existing resourceDirectory /home/travis/build/StepanTsymbal/HelloBack/src/test/resources

[INFO] 

[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ DBConnector ---

[INFO] Nothing to compile - all classes are up to date

[INFO] 

[INFO] --- maven-surefire-plugin:2.18.1:test (default-test) @ DBConnector ---

[INFO] Surefire report directory: /home/travis/build/StepanTsymbal/HelloBack/target/surefire-reports

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-junit4/2.18.1/surefire-junit4-2.18.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-junit4/2.18.1/surefire-junit4-2.18.1.pom (3 KB at 1.5 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-providers/2.18.1/surefire-providers-2.18.1.pom

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-providers/2.18.1/surefire-providers-2.18.1.pom (3 KB at 118.3 KB/sec)

[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-junit4/2.18.1/surefire-junit4-2.18.1.jar

[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-junit4/2.18.1/surefire-junit4-2.18.1.jar (67 KB at 632.3 KB/sec)

-------------------------------------------------------

 T E S T S

-------------------------------------------------------

06:35:16.013 [main] DEBUG org.springframework.test.context.junit4.SpringJUnit4ClassRunner - SpringJUnit4ClassRunner constructor called with [class com.styopik.DbConnectorApplicationTests]

06:35:16.062 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating CacheAwareContextLoaderDelegate from class [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]

06:35:16.066 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating BootstrapContext using constructor [public org.springframework.test.context.support.DefaultBootstrapContext(java.lang.Class,org.springframework.test.context.CacheAwareContextLoaderDelegate)]

06:35:16.085 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating TestContextBootstrapper for test class [com.styopik.DbConnectorApplicationTests] from class [org.springframework.test.context.web.WebTestContextBootstrapper]

06:35:16.128 [main] DEBUG org.springframework.test.context.web.WebTestContextBootstrapper - Found explicit ContextLoader class [org.springframework.boot.test.SpringApplicationContextLoader] for context configuration attributes [ContextConfigurationAttributes@6e1567f1 declaringClass = 'com.styopik.DbConnectorApplicationTests', classes = '{class com.styopik.DbConnectorApplication}', locations = '{}', inheritLocations = true, initializers = '{}', inheritInitializers = true, name = [null], contextLoaderClass = 'org.springframework.boot.test.SpringApplicationContextLoader']

06:35:16.169 [main] DEBUG org.springframework.test.context.support.AbstractContextLoader - Did not detect default resource location for test class [com.styopik.DbConnectorApplicationTests]: class path resource [com/styopik/DbConnectorApplicationTests-context.xml] does not exist

06:35:16.170 [main] DEBUG org.springframework.test.context.support.AbstractContextLoader - Did not detect default resource location for test class [com.styopik.DbConnectorApplicationTests]: class path resource [com/styopik/DbConnectorApplicationTestsContext.groovy] does not exist

06:35:16.170 [main] INFO org.springframework.test.context.support.AbstractContextLoader - Could not detect default resource locations for test class [com.styopik.DbConnectorApplicationTests]: no resource found for suffixes {-context.xml, Context.groovy}.

06:35:16.201 [main] DEBUG org.springframework.test.context.web.WebTestContextBootstrapper - @TestExecutionListeners is not present for class [com.styopik.DbConnectorApplicationTests]: using defaults.

06:35:16.207 [main] INFO org.springframework.test.context.web.WebTestContextBootstrapper - Loaded default TestExecutionListener class names from location [META-INF/spring.factories]: [org.springframework.test.context.web.ServletTestExecutionListener, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener, org.springframework.test.context.support.DependencyInjectionTestExecutionListener, org.springframework.test.context.support.DirtiesContextTestExecutionListener, org.springframework.test.context.transaction.TransactionalTestExecutionListener, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener]

06:35:16.248 [main] INFO org.springframework.test.context.web.WebTestContextBootstrapper - Using TestExecutionListeners: [org.springframework.test.context.web.ServletTestExecutionListener@3712b94, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener@2833cc44, org.springframework.test.context.support.DependencyInjectionTestExecutionListener@33f88ab, org.springframework.test.context.support.DirtiesContextTestExecutionListener@27a8c74e, org.springframework.test.context.transaction.TransactionalTestExecutionListener@2d8f65a4, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener@1b68ddbd]

06:35:16.251 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved @ProfileValueSourceConfiguration [null] for test class [com.styopik.DbConnectorApplicationTests]

06:35:16.252 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved ProfileValueSource type [class org.springframework.test.annotation.SystemProfileValueSource] for class [com.styopik.DbConnectorApplicationTests]

Running com.styopik.DbConnectorApplicationTests

06:35:16.256 [main] DEBUG org.springframework.test.context.junit4.SpringJUnit4ClassRunner - SpringJUnit4ClassRunner constructor called with [class com.styopik.DbConnectorApplicationTests]

06:35:16.256 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating CacheAwareContextLoaderDelegate from class [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]

06:35:16.256 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating BootstrapContext using constructor [public org.springframework.test.context.support.DefaultBootstrapContext(java.lang.Class,org.springframework.test.context.CacheAwareContextLoaderDelegate)]

06:35:16.258 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating TestContextBootstrapper for test class [com.styopik.DbConnectorApplicationTests] from class [org.springframework.test.context.web.WebTestContextBootstrapper]

06:35:16.261 [main] DEBUG org.springframework.test.context.web.WebTestContextBootstrapper - Found explicit ContextLoader class [org.springframework.boot.test.SpringApplicationContextLoader] for context configuration attributes [ContextConfigurationAttributes@1563da5 declaringClass = 'com.styopik.DbConnectorApplicationTests', classes = '{class com.styopik.DbConnectorApplication}', locations = '{}', inheritLocations = true, initializers = '{}', inheritInitializers = true, name = [null], contextLoaderClass = 'org.springframework.boot.test.SpringApplicationContextLoader']

06:35:16.262 [main] DEBUG org.springframework.test.context.support.AbstractContextLoader - Did not detect default resource location for test class [com.styopik.DbConnectorApplicationTests]: class path resource [com/styopik/DbConnectorApplicationTests-context.xml] does not exist

06:35:16.263 [main] DEBUG org.springframework.test.context.support.AbstractContextLoader - Did not detect default resource location for test class [com.styopik.DbConnectorApplicationTests]: class path resource [com/styopik/DbConnectorApplicationTestsContext.groovy] does not exist

06:35:16.263 [main] INFO org.springframework.test.context.support.AbstractContextLoader - Could not detect default resource locations for test class [com.styopik.DbConnectorApplicationTests]: no resource found for suffixes {-context.xml, Context.groovy}.

06:35:16.265 [main] DEBUG org.springframework.test.context.web.WebTestContextBootstrapper - @TestExecutionListeners is not present for class [com.styopik.DbConnectorApplicationTests]: using defaults.

06:35:16.277 [main] INFO org.springframework.test.context.web.WebTestContextBootstrapper - Loaded default TestExecutionListener class names from location [META-INF/spring.factories]: [org.springframework.test.context.web.ServletTestExecutionListener, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener, org.springframework.test.context.support.DependencyInjectionTestExecutionListener, org.springframework.test.context.support.DirtiesContextTestExecutionListener, org.springframework.test.context.transaction.TransactionalTestExecutionListener, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener]

06:35:16.282 [main] INFO org.springframework.test.context.web.WebTestContextBootstrapper - Using TestExecutionListeners: [org.springframework.test.context.web.ServletTestExecutionListener@80503, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener@4b553d26, org.springframework.test.context.support.DependencyInjectionTestExecutionListener@69a3d1d, org.springframework.test.context.support.DirtiesContextTestExecutionListener@86be70a, org.springframework.test.context.transaction.TransactionalTestExecutionListener@480bdb19, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener@2a556333]

06:35:16.290 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved @ProfileValueSourceConfiguration [null] for test class [com.styopik.DbConnectorApplicationTests]

06:35:16.290 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved ProfileValueSource type [class org.springframework.test.annotation.SystemProfileValueSource] for class [com.styopik.DbConnectorApplicationTests]

06:35:16.291 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved @ProfileValueSourceConfiguration [null] for test class [com.styopik.DbConnectorApplicationTests]

06:35:16.291 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved ProfileValueSource type [class org.springframework.test.annotation.SystemProfileValueSource] for class [com.styopik.DbConnectorApplicationTests]

06:35:16.293 [main] DEBUG org.springframework.test.context.support.AbstractDirtiesContextTestExecutionListener - Before test class: context [DefaultTestContext@307f6b8c testClass = DbConnectorApplicationTests, testInstance = [null], testMethod = [null], testException = [null], mergedContextConfiguration = [WebMergedContextConfiguration@7a187f14 testClass = DbConnectorApplicationTests, locations = '{}', classes = '{class com.styopik.DbConnectorApplication}', contextInitializerClasses = '[]', activeProfiles = '{h2}', propertySourceLocations = '{}', propertySourceProperties = '{}', resourceBasePath = 'src/main/webapp', contextLoader = 'org.springframework.boot.test.SpringApplicationContextLoader', parent = [null]]], class annotated with @DirtiesContext [false] with mode [null].

06:35:16.293 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved @ProfileValueSourceConfiguration [null] for test class [com.styopik.DbConnectorApplicationTests]

06:35:16.293 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved ProfileValueSource type [class org.springframework.test.annotation.SystemProfileValueSource] for class [com.styopik.DbConnectorApplicationTests]

06:35:16.444 [main] DEBUG org.springframework.core.env.StandardEnvironment - Adding [systemProperties] PropertySource with lowest search precedence

06:35:16.447 [main] DEBUG org.springframework.core.env.StandardEnvironment - Adding [systemEnvironment] PropertySource with lowest search precedence

06:35:16.448 [main] DEBUG org.springframework.core.env.StandardEnvironment - Initialized StandardEnvironment with PropertySources [systemProperties,systemEnvironment]

06:35:16.448 [main] DEBUG org.springframework.core.env.StandardEnvironment - Adding [test] PropertySource with highest search precedence

06:35:16.452 [main] DEBUG org.springframework.core.env.StandardEnvironment - Adding [integrationTest] PropertySource with search precedence immediately lower than [systemEnvironment]

  .   ____          _            __ _ _

 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \

( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \

 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )

  '  |____| .__|_| |_|_| |_\__, | / / / /

 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::        (v1.3.5.RELEASE)

2016-07-02 06:35:16.991  INFO 2604 --- [           main] com.styopik.DbConnectorApplicationTests  : Starting DbConnectorApplicationTests on testing-worker-linux-docker-a4ee465c-3374-linux-15 with PID 2604 (/home/travis/build/StepanTsymbal/HelloBack/target/test-classes started by travis in /home/travis/build/StepanTsymbal/HelloBack)

2016-07-02 06:35:16.992  INFO 2604 --- [           main] com.styopik.DbConnectorApplicationTests  : The following profiles are active: h2

2016-07-02 06:35:17.186  INFO 2604 --- [           main] o.s.w.c.s.GenericWebApplicationContext   : Refreshing org.springframework.web.context.support.GenericWebApplicationContext@6302bbb1: startup date [Sat Jul 02 06:35:17 UTC 2016]; root of context hierarchy

2016-07-02 06:35:21.423  INFO 2604 --- [           main] f.a.AutowiredAnnotationBeanPostProcessor : JSR-330 'javax.inject.Inject' annotation found and supported for autowiring

2016-07-02 06:35:21.592  INFO 2604 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration' of type [class org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration$$EnhancerBySpringCGLIB$$79e540c3] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)

2016-07-02 06:35:21.827  INFO 2604 --- [           main] o.s.j.d.e.EmbeddedDatabaseFactory        : Starting embedded database: url='jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=false', username='sa'

2016-07-02 06:35:22.017  INFO 2604 --- [           main] o.s.jdbc.datasource.init.ScriptUtils     : Executing SQL script from class path resource [db/sql/create-db.sql]

2016-07-02 06:35:22.022  INFO 2604 --- [           main] o.s.jdbc.datasource.init.ScriptUtils     : Executed SQL script from class path resource [db/sql/create-db.sql] in 5 ms.

2016-07-02 06:35:22.022  INFO 2604 --- [           main] o.s.jdbc.datasource.init.ScriptUtils     : Executing SQL script from class path resource [db/sql/insert-data.sql]

2016-07-02 06:35:22.033  INFO 2604 --- [           main] o.s.jdbc.datasource.init.ScriptUtils     : Executed SQL script from class path resource [db/sql/insert-data.sql] in 10 ms.

2016-07-02 06:35:22.469  INFO 2604 --- [           main] j.LocalContainerEntityManagerFactoryBean : Building JPA container EntityManagerFactory for persistence unit 'default'

2016-07-02 06:35:22.487  INFO 2604 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [

	name: default

	...]

2016-07-02 06:35:22.565  INFO 2604 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate Core {4.3.11.Final}

2016-07-02 06:35:22.568  INFO 2604 --- [           main] org.hibernate.cfg.Environment            : HHH000206: hibernate.properties not found

2016-07-02 06:35:22.570  INFO 2604 --- [           main] org.hibernate.cfg.Environment            : HHH000021: Bytecode provider name : javassist

2016-07-02 06:35:22.722  INFO 2604 --- [           main] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {4.0.5.Final}

2016-07-02 06:35:22.846  INFO 2604 --- [           main] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.H2Dialect

2016-07-02 06:35:22.949  INFO 2604 --- [           main] o.h.h.i.ast.ASTQueryTranslatorFactory    : HHH000397: Using ASTQueryTranslatorFactory

2016-07-02 06:35:23.189  INFO 2604 --- [           main] org.hibernate.tool.hbm2ddl.SchemaUpdate  : HHH000228: Running hbm2ddl schema update

2016-07-02 06:35:23.189  INFO 2604 --- [           main] org.hibernate.tool.hbm2ddl.SchemaUpdate  : HHH000102: Fetching database metadata

2016-07-02 06:35:23.220  INFO 2604 --- [           main] org.hibernate.tool.hbm2ddl.SchemaUpdate  : HHH000396: Updating schema

2016-07-02 06:35:23.240  INFO 2604 --- [           main] o.hibernate.tool.hbm2ddl.TableMetadata   : HHH000261: Table found: TESTDB.PUBLIC.CONTACTS

2016-07-02 06:35:23.241  INFO 2604 --- [           main] o.hibernate.tool.hbm2ddl.TableMetadata   : HHH000037: Columns: [name, id]

2016-07-02 06:35:23.241  INFO 2604 --- [           main] o.hibernate.tool.hbm2ddl.TableMetadata   : HHH000108: Foreign keys: []

2016-07-02 06:35:23.241  INFO 2604 --- [           main] o.hibernate.tool.hbm2ddl.TableMetadata   : HHH000126: Indexes: []

2016-07-02 06:35:23.242  INFO 2604 --- [           main] org.hibernate.tool.hbm2ddl.SchemaUpdate  : HHH000232: Schema update complete

2016-07-02 06:35:25.101  INFO 2604 --- [           main] s.w.s.m.m.a.RequestMappingHandlerAdapter : Looking for @ControllerAdvice: org.springframework.web.context.support.GenericWebApplicationContext@6302bbb1: startup date [Sat Jul 02 06:35:17 UTC 2016]; root of context hierarchy

2016-07-02 06:35:25.388  INFO 2604 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/hello/contacts],methods=[GET],produces=[application/json]}" onto public org.springframework.web.context.request.async.WebAsyncTask<org.springframework.http.ResponseEntity<java.util.List<com.styopik.models.Contacts>>> com.styopik.controllers.ContactsController.handleTestRequest(java.lang.String)

2016-07-02 06:35:25.402  INFO 2604 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error],produces=[text/html]}" onto public org.springframework.web.servlet.ModelAndView org.springframework.boot.autoconfigure.web.BasicErrorController.errorHtml(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

2016-07-02 06:35:25.403  INFO 2604 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error]}" onto public org.springframework.http.ResponseEntity<java.util.Map<java.lang.String, java.lang.Object>> org.springframework.boot.autoconfigure.web.BasicErrorController.error(javax.servlet.http.HttpServletRequest)

2016-07-02 06:35:25.574  INFO 2604 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/webjars/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]

2016-07-02 06:35:25.588  INFO 2604 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]

2016-07-02 06:35:25.933  INFO 2604 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**/favicon.ico] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]

2016-07-02 06:35:27.532  INFO 2604 --- [           main] com.styopik.DbConnectorApplicationTests  : Started DbConnectorApplicationTests in 11.068 seconds (JVM running for 12.324)

2016-07-02 06:35:27.673  INFO 2604 --- [           main] ilder$StaticRequestMappingHandlerMapping : Mapped "{[/hello/contacts],methods=[GET],produces=[application/json]}" onto public org.springframework.web.context.request.async.WebAsyncTask<org.springframework.http.ResponseEntity<java.util.List<com.styopik.models.Contacts>>> com.styopik.controllers.ContactsController.handleTestRequest(java.lang.String)

2016-07-02 06:35:27.715  INFO 2604 --- [           main] s.w.s.m.m.a.RequestMappingHandlerAdapter : Looking for @ControllerAdvice: org.springframework.test.web.servlet.setup.StubWebApplicationContext@75bd28d

2016-07-02 06:35:27.764  INFO 2604 --- [           main] o.s.mock.web.MockServletContext          : Initializing Spring FrameworkServlet ''

2016-07-02 06:35:27.766  INFO 2604 --- [           main] o.s.t.web.servlet.TestDispatcherServlet  : FrameworkServlet '': initialization started

2016-07-02 06:35:27.767  INFO 2604 --- [           main] o.s.t.web.servlet.TestDispatcherServlet  : FrameworkServlet '': initialization completed in 1 ms

2016-07-02 06:35:27.776  INFO 2604 --- [           main] o.s.j.d.e.EmbeddedDatabaseFactory        : Starting embedded database: url='jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=false', username='sa'

2016-07-02 06:35:27.784  INFO 2604 --- [           main] o.s.jdbc.datasource.init.ScriptUtils     : Executing SQL script from class path resource [db/sql/create-db.sql]

2016-07-02 06:35:27.792  INFO 2604 --- [           main] o.s.jdbc.datasource.init.ScriptUtils     : Executed SQL script from class path resource [db/sql/create-db.sql] in 0 ms.

2016-07-02 06:35:27.793  INFO 2604 --- [           main] o.s.jdbc.datasource.init.ScriptUtils     : Executing SQL script from class path resource [db/sql/insert-data.sql]

2016-07-02 06:35:27.796  INFO 2604 --- [           main] o.s.jdbc.datasource.init.ScriptUtils     : Executed SQL script from class path resource [db/sql/insert-data.sql] in 3 ms.

2016-07-02 06:35:27.991  INFO 2604 --- [           main] o.s.j.d.e.EmbeddedDatabaseFactory        : Shutting down embedded database: url='jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=false'

2016-07-02 06:35:28.018  INFO 2604 --- [           main] ilder$StaticRequestMappingHandlerMapping : Mapped "{[/hello/contacts],methods=[GET],produces=[application/json]}" onto public org.springframework.web.context.request.async.WebAsyncTask<org.springframework.http.ResponseEntity<java.util.List<com.styopik.models.Contacts>>> com.styopik.controllers.ContactsController.handleTestRequest(java.lang.String)

2016-07-02 06:35:28.100  INFO 2604 --- [           main] s.w.s.m.m.a.RequestMappingHandlerAdapter : Looking for @ControllerAdvice: org.springframework.test.web.servlet.setup.StubWebApplicationContext@7a36c83a

2016-07-02 06:35:28.109  INFO 2604 --- [           main] o.s.mock.web.MockServletContext          : Initializing Spring FrameworkServlet ''

2016-07-02 06:35:28.124  INFO 2604 --- [           main] o.s.t.web.servlet.TestDispatcherServlet  : FrameworkServlet '': initialization started

2016-07-02 06:35:28.125  INFO 2604 --- [           main] o.s.t.web.servlet.TestDispatcherServlet  : FrameworkServlet '': initialization completed in 0 ms

2016-07-02 06:35:28.126  INFO 2604 --- [           main] o.s.j.d.e.EmbeddedDatabaseFactory        : Starting embedded database: url='jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=false', username='sa'

2016-07-02 06:35:28.140  INFO 2604 --- [           main] o.s.jdbc.datasource.init.ScriptUtils     : Executing SQL script from class path resource [db/sql/create-db.sql]

2016-07-02 06:35:28.142  INFO 2604 --- [           main] o.s.jdbc.datasource.init.ScriptUtils     : Executed SQL script from class path resource [db/sql/create-db.sql] in 1 ms.

2016-07-02 06:35:28.145  INFO 2604 --- [           main] o.s.jdbc.datasource.init.ScriptUtils     : Executing SQL script from class path resource [db/sql/insert-data.sql]

2016-07-02 06:35:28.148  INFO 2604 --- [           main] o.s.jdbc.datasource.init.ScriptUtils     : Executed SQL script from class path resource [db/sql/insert-data.sql] in 3 ms.

2016-07-02 06:35:28.155  INFO 2604 --- [           main] o.s.j.d.e.EmbeddedDatabaseFactory        : Shutting down embedded database: url='jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=false'

Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 11.922 sec - in com.styopik.DbConnectorApplicationTests

2016-07-02 06:35:28.272  INFO 2604 --- [       Thread-1] o.s.w.c.s.GenericWebApplicationContext   : Closing org.springframework.web.context.support.GenericWebApplicationContext@6302bbb1: startup date [Sat Jul 02 06:35:17 UTC 2016]; root of context hierarchy

2016-07-02 06:35:28.335  INFO 2604 --- [       Thread-1] j.LocalContainerEntityManagerFactoryBean : Closing JPA EntityManagerFactory for persistence unit 'default'

2016-07-02 06:35:28.336  INFO 2604 --- [       Thread-1] o.s.j.d.e.EmbeddedDatabaseFactory        : Shutting down embedded database: url='jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=false'

Results :

Tests run: 2, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------

[INFO] BUILD SUCCESS

[INFO] ------------------------------------------------------------------------

[INFO] Total time: 29.394 s

[INFO] Finished at: 2016-07-02T06:35:38+00:00

[INFO] Final Memory: 20M/357M

[INFO] ------------------------------------------------------------------------

The command "mvn test -B" exited with 0.

Done. Your build exited with 0.
