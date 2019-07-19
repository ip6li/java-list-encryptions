all:
	javac Main.java
	jar cvmf ManifestMain.txt list-excryptions.jar Main.class

clean:
	rm -f list-excryptions.jar Main.class

