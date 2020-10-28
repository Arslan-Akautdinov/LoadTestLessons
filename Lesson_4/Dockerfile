FROM python:3-alpine
RUN mkdir app
RUN apk update && apk upgrade && apk add git bash postgresql-dev gcc python3-dev musl-dev
RUN git clone https://github.com/Arslan-Akautdinov/testing.load.service.git app