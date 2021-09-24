FROM node:12.4.0-alpine

RUN apk add --no-cache make bash git sudo

RUN npm config set save true && \
	npm config set save-exact true &&\
	npm i -g yarn