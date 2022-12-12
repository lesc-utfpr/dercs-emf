# Distributed Embedded Real-time Compact Specification (DERCS)
DERCS is a meta-model based on the concepts of Object-Oriented paradigm 
and Aspect-Oriented Software Development (AOSD). 
It provides a executable model suitable for multi-language code generation 
and simulation/testing of real-time embedded systems.

There is a UML-loader which can create a DERCS model from a UML2 model file (created in Eclipse Papyrus)

## Building
Run `./gradlew build` (or `gradlew.bat build` for the windows command prompt) in a terminal.  
The built jar can be found in the `build/libs/` directory.

## Development
The DERCS model is defined through a Eclipse Modeling Framework Ecore model.  
(For a tutorial on basic usage of Ecore see e.g.: https://eclipsesource.com/blogs/tutorials/emf-tutorial/)  

To make changes to the model:
1. Open the project using the Eclipse Modeling Tools
2. Edit the model in the `ECoreDercsModel/model/dercs.ecore` file
3. Regenerate the model code:
    1. Open the `ECoreDercsModel/model/dercs.genmodel` file
    2. Select the root element named "Dercs"
    3. right click and select "Generate Model Code"

**Caution**  
Never delete the generated model source code.  
The source files contain manual modifications that EMF will merge when regenerating.  
If the files are deleted before regenerating these additions will be lost.
