# Promptly
A gamified journaling app that sparks daily creativity and idea generation through engaging prompts and social features

## Running the app
Running the app consists of two separate components: building (and then starting) the backend and running the frontend in the desired mode.

### Building and running backend
1. ```cd backend```
2. ```./gradlew clean build``` (or for Windows ```gradlew.bat clean build```)
3. ```java -jar build/libs/backend-0.0.1-SNAPSHOT.jar```

### Running frontend
1. ```cd frontend```
2. ```npm i expo```
3. ```npm run <web|android|ios>```

Alternatively, you can run `npm start` to open the Metro Bundler
