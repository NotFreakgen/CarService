FROM node:24-alpine

WORKDIR /Client

COPY package.json .

RUN npm install

RUN npm i -D https

COPY . .

EXPOSE 5173

CMD [ "npm", "run", "dev"]