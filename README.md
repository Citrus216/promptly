# Promptly
A gamified journaling app that sparks daily creativity and idea generation through engaging prompts and social features

## Running the app
Running the app normally consists of two separate components: building (and then starting) the backend and running the frontend in the desired mode.

It is also possible to run the app using Docker, which will start both the backend and frontend in separate containers, as well as a Mongo
container alongside them. This is the recommended way to run the app, as it is the easiest and most consistent. However, it does require
Docker to be installed on the host machine.

### Running with Docker
1. ```docker compose up --build``` in the root directory

### Building and running backend
1. ```cd backend```
2. ```./gradlew clean build``` (or for Windows ```gradlew.bat clean build```)
3. ```java -jar build/libs/backend-0.0.1-SNAPSHOT.jar```

### Running frontend
1. ```cd frontend```
2. ```npm i expo```
3. ```npm run <web|android|ios>```
