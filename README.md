# Challenge - Your own Swing app

Draw to a JPanel where the user clicks the mouse.

Open Draw.java for sample Java code you can convert to JRuby.  You can test Draw.java with:

    $ javac Draw.java
    $ java Draw


## What you'll need to do

* Require Java classes with java_import
* Create a Ruby subclass of JPanel:

** Allow other classes to set the X and Y drawing location

** Override this method: paintComponent(graphics)

* Create a class that implements these methods from the MouseMotionListener Java interface:
** mouseDragged(event)
** mouseMoved(event) (just stub it but you have to declare it)
** Provide a setter that takes an instance of your JPanel subclass
* Set up the window:
** Create a new instance of your JPanel subclass
** Add an instance of your MouseMotionListener to it
** Create a JFrame and add the JPanel to it, just like the prior example


## Need help?

* To bring up JavaDocs, do a web search for the name of the Java class/interface you need:
** JPanel
** MouseMotionListener
** java.awt.Graphics
