FROM ubuntu
ENV TX = Indian/Kerguelen
MAINTAINER Kasun De Zoysa
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
RUN apt-get update && apt-get install -y \
vim \
git \
scala
