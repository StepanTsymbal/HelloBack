# HelloBack

RESTful App was created on Spring Boot.

Returns Contacts which match the pattern.

PostgreSQL is used.

Parametres for launching:

    Server port: 8181
    DB name: 'ContactsDB' (it must be created)
    URL for DB: 'jdbc:postgresql://localhost:5432/ContactsDB'
    DB login: 'postgres'
    DB password: 'postgres'

You may use these parametres. In order to use own ones you have to change 'application.properties' file

Application processes table 'Contacts'. It will be created in case of its absence.

# Travis-CI result:
https://travis-ci.org/StepanTsymbal/HelloBack.svg?branch=master
