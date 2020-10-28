# ASCII-javag
Simple Java library for ascii interface.

## Build
###### Linux
`./gradlew build`

###### Windows
`gradlew.bat build`

## How to use
ASCIIComponent is base of all ascii components. You can add childs to any ascii component.

First: you need to create AjvagFrame. After that you can add childes to frame. Also you can add childes to any component. After all your works with frame you need to combine childes and draw entire inteface. Example:

```java
AjavagFrame frame = new AjavagFrame(100, 80);
AjavagRectangle rect = new AjavagRectangle(0, 0, 20, 15);
rect.appendChild(new AjavagLabel(1, 1, "Hello world!");
frame.appendChild(rect);
frame.combineChilded();
frame.draw();
````

## Future features
* JavaDoc API improvement

* Scroll component

* More examples
