FROM maven:3-alpine

RUN useradd -m -u 1000 -s /bin/bash cloud_user

RUN yum install -y openssh-clients