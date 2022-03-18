# Spring
Spring ist ein beliebtes Java-Anwendungsframework und Spring Boot ist eine Weiterentwicklung von Spring, mit der sich eigenständige, produktionsreife Spring-basierte Anwendungen leicht erstellen lassen.

# MVC
MVC (Model-View-Controller) ist ein Software-Architekturmuster, das die Anwendung in drei Teile unterteilt: 
* Model
* View
* Controller. 

Das Model stellt ein Java-Objekt dar, das Daten enthält. Das View visualisiert die Daten, die das Modell enthält. Der Controller verwaltet den Datenfluss in das Modellobjekt und aktualisiert das View, wenn sich die Daten ändern. Er hält das View und Model getrennt.

# Spring MVC
Spring MVC ist das ursprüngliche Web-Framework, das auf der Servlet-API aufbaut. Es basiert auf dem MVC-Entwurfsmuster. Mit Spring Framework 5.0 wurde ein paralleles reaktives Stack-Webframework namens Spring WebFlux eingeführt.

# Model, ModelMap, ModelAndView
Model, ModelMap und ModelAndView werden verwendet, um ein Model in einer Spring MVC-Anwendung zu definieren. 
* Model definiert einen Halter für Modellattribute und ist in erster Linie für das Hinzufügen von Attributen zum Modell gedacht. 
* ModelMap ist eine Erweiterung von Model mit der Möglichkeit, Attribute in einer Map zu speichern und Methodenaufrufe zu verketten. 
* ModelAndView ist ein Halter für ein Modell und eine Ansicht. Er ermöglicht es, sowohl das Model als auch das View in einem Rückgabewert zurückzugeben.

# ModelMap
Einige Grundlagen zur Spring MVC ModelMap-Klasse:
* Die ModelMap-Klasse ist eine Unterklasse von LinkedHashMap. Sie fügt einige Methoden zur Vereinfachung hinzu.
* Sie bietet die addAttribute-Methode, um ein Schlüssel-Wert-Paar zu setzen. Diese Methode gibt ModelMap-Objekte zurück, die für die Verkettung verwendet werden können.
* ModelMap prüft auf Nullwerte.

# application.properties
Die *application.properties* ist die wichtigste Konfigurationsdatei in Spring Boot. Wir schalten das Spring-Banner und die Startprotokollierung des Spring-Frameworks aus.