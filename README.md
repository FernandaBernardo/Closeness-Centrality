##Closeness Centrality
An implementation of [Closeness Centrality](http://en.wikipedia.org/wiki/Centrality#Closeness_centrality)

##Usage
This project is using [Vraptor 4](http://www.vraptor.org/)
You can use Tomcat to run this project.
You have to put the project in
	`~/`
to read file edges.txt

To view the result of vertex with the best centrality, access:
	`http://localhost:8080/closeness/`
To add new edge, you only have to do POST with variable:
	`edge=1 2`
this is equal to add a vertex 1 connect with a vertex 2

