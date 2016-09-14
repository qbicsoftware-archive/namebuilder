# namebuilder
Java library for building a secondary name in a more generic way.

## Creating an object instance

```java

SecondaryName myName = new SecondaryName();

```

## Building a secondary name

An easy example would be: 

```java

myName.setEntityID('Patient');
myName.setEntityCounter(1);
myName.toString();

```

which would result in a secondary name like ```Patient:1```.

A more complex secondary name could include aliquots and timepoints. The code would then look like this:
```java

SecondaryName myName = new SecondaryName();
myName.setEntityID("R");
myName.setEntityCounter(1);
myName.setTimepoints(new String[]{"t0","t1","t2"});
myName.setTissue("S");
myName.setSampleAliquot(1);
myName.setExtractType("D");
myName.setExtractAliquot(1);
System.out.println(myName.toString());

```

The resulting secondary name would then look like this ```R:1:t0:S:1:D:1```





