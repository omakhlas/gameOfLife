FROM maven:maven:3.6.0-jdk-13

RUN useradd -m -u 1000 -s /bin/bash cloud_user

RUN yum install -y openssh-clients