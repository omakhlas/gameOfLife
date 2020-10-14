FROM maven:3-alpine

RUN useradd -ms /bin/bash jenkins

RUN yum install -y openssh-clients