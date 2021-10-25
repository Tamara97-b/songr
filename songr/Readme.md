# Songs 
application show the album i inserted to the browser by certein path 
# description 
in this project, I Used the Spring Initializr to create a new application with artifact songr 
with Web and Thymeleaf and Devtools dependencies. First I downloaded the zip file and extract the
directory it contains. then added it to my repo, and start coding 
the methods i use :
in HelloController Class
First I used @Controller to implement Web Application, its annotation indicates that a particular class serves the role of a controller.
I used @GetMapping to put the routes
/hello
String helloWorld() it Returns hello.html in /hello route to show Hello World
In root route its return index.html by default and its return h1 and image tage with a little CSS.
/albums
String albums () it has one parameter Model to return an array that contains three albums, and then displayed those three on the page .


