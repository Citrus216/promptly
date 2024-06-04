FROM node:18-alpine as build

WORKDIR /app

# Fix this, this is garbage
COPY . .

RUN npm i

CMD ["npm", "start"]
