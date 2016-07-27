default: build

build: 
	javac -d . -classpath . SuperBass.java

run: 
	java SuperBass

clean:
	rm -f *.class 
