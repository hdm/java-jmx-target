all: clean
	javac HelloMBean.java
	javac Hello.java
	javac SimpleAgent.java

clean:
	rm -f *.class
