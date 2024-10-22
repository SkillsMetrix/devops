systemctl status docker

docker --version

docker info

sudo service docker start

docker info

docker images

docker ps (for running containers)

docker ps -a (to list out all the containers)

docker run hello-world

docker images

docker ps -a

sudo service docker stop

sudo yum remove docker

get.docker.com visit



-------------------

Basic
: docker version
: docker -v
: docker info
: docker --help
: docker login
������������
Images
: docker images
docker images -q
docke images --help
: docker pull
: docker rmi
docker images --help
: docker pull image
: docker images
: docker images -a (gives details)
: docker images -q (return only images id)
: docker rmi --help (for removing the images)

https://www.howtogeek.com/devops/what-are-dangling-docker-images/
: docker images -f �dangling=false�
: docker images -f �dangling=false� -q

: docker run image
: docker rmi image
: docker rmi -f image

: docker inspect imageName
: docker history imageName
������������
Containers
: docker ps
: docker run
: docker start
: docker stop
������������
System
: docker stats (make sure your container is already running)
: docker system df (for disk usage by the containers)
: docker system prune (check the running images and containers before this , after calling this prune, check the ps and images command,
stop the container  and check the ps and images command   
and in last (docker system prune -a)

) 
: docker system prune --help
 
systemctl status docker

----------

docker pull ubuntu
docker run ubuntu
docker run ubuntu:18.04  (for specific version )

docker run -it ubuntu
ls
open the new terminal
docker run  --name myubuntu -it ubuntu bash

open another terminal 
docker ps
docker start containerid
docker stop container id (it will stop running ubuntu in another terminal)
docker run -it ubuntu
docker stats in another termainal


COMMANDS
use all with myubuntu image
docker run  --name myubuntu -it ubuntu bash
open another terminal ....
: docker ps
: docker run ImageName
: docker start ContainerName/ID
: docker stop ContainerName/ID

: docker pause ContainerName/ID
: docker unpause  ContainerName/ID

: docker top ContainerName/ID
: docker stats ContainerName/ID

: docker attach ContainerName/ID (it will attach the terminal with ongoing ubuntu image)

: docker kill ContainerName/ID
: docker rm ContainerName/ID

: docker history ImageName/ID


apt update  && apt install y vim