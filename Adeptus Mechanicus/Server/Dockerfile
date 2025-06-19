FROM node:24-alpine

WORKDIR /Server

COPY . .

RUN npm install

RUN npm i mysql2

EXPOSE 8080

CMD [ "node", "server.js" ]