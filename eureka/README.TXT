Docker plugin is disabled by default during normal nomrmal maven install

To build the docker image : 

mvn docker:build -Ddocker.skip=false

If the image is successfully build you should see the created image with the command:

docker image list


To run the docker image from the Maven itself :

mvn docker:run -Ddocker.skip=false