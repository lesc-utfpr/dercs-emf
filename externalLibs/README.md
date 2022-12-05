The libraries in this directory are used to deserialize custom UML profile elements from UML2 files.  
While the MARTE profile is taken from Eclipse Papyrus library files,
the AMoDE-RT profile jar was generated from a manually created UML Profile.  
The Papryus project for this cutom profile can be found at:  
https://github.com/lesc-utfpr/amode-rt-case-studies/tree/master/uml-models-papyrus/AMoDE-RT

## How to make changes to the AMoDE-RT profile
1. Open the AMoDE-RT project (linked above) in Eclipse Papyrus
2. Make the desired changes to the model (refer to Papyrus documentation on how to create a custom UML profile)
3. Save the changes to the model
4. Delete the old Ecore model and Genmodel frm the project
5. Create a new Genmodel, select the type "from UML" and use the AMoDE-RT profile UML as the source
6. Run the Genmodel (Open Genmodel, right click on model root, choose "Generate Model Code") to generate the java sources
7. Choose File->export and export the project as a jar and include everything
8. Replace the AMoDE-RT profile jar in this directory with the new version