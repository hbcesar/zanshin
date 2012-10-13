The Zanshin Framework
=====================

This is a framework I'm developing in the context of my research, which started when I was a PhD Student in the [University of Trento, Italy](http://ict.unitn.it/) (for more information, see some of my [publications](http://disi.unitn.it/~vitorsouza/academia/)). The purpose of this framework is to facilitate the implementation of adaptive systems that follow our approach (which is also called _Zanshin_) in their design. This project also contains some simulations that use the framework.

The project's name -- _Zanshin_ -- refers to a "term used in the Japanese martial arts. It refers to a state of awareness" [Wikipedia](http://en.wikipedia.org/wiki/Zanshin). In episode 17 of the 6th season of the American television series [Friends](http://en.wikipedia.org/wiki/Friends), Ross uses "Unagi" instead of "Zanshin" to refer to this concept (and that's why the CASE Tool I'm also developing for the _Zanshin_ approach is called _Unagi_ ([see its repository here on github](https://github.com/sefms-disi-unitn/Unagi))).



Pre-requisites for running Zanshin
----------------------------------

This is an Eclipse project containing several OSGi (Equinox) bundles. Each folder in the root of the repository is a different Eclipse project. If you want to contribute or just run it, I suggest you install Eclipse Juno for RCP developers and use its Git support (EGit) to clone the repository. Note this project is being developed with Java 7.

Other than the base Eclipse RCP intall, you will also need the following plug-ins:

- EMF - Eclipse Modeling Framework SDK
- AspectJ Development Tools and Equinox Weaving SDK (see Update Site URL here: http://eclipse.org/ajdt/downloads/)
- (Possibly) the `it.unitn.disi.zanshin.core bundle` itself (see below).


To install the `it.unitn.disi.zanshin.core` bundle into Eclipse itself, right-click it and select "Export...". Then, select "Deployable plug-ins and fragments" in the "Plug-in Development" category and click "Next". Finally, in the "Destination" tab, select the "Instal into host" option and click "Finish". This is only needed if you need to import the EMF models defined in this bundle in the definition of new EMF models and is probably unnecessary if you only need to run the simulations.

Zanshin has been tested to work with Equinox, the OSGi implementation that comes with Eclipse. I don't really know what is necessary to make it run in other OSGi implementations



Running the Simulations
-----------------------

To run, create a new OSGi Framework run configuration in Eclipse and configure the items below:

1. In the "Bundles" tab, mark all `it.unitn.disi` bundles using the following start levels: simulation = 6, adaptation = 4, core = 3, logging = 2, monitoring = 5;

2. Follow the instructions of the [Equinox Weaving Quickstart](http://wiki.eclipse.org/Equinox_Weaving_QuickStart) and add the following bundles as well: `org.aspectj.weaver`, `org.eclipse.equinox.weaving.aspectj`, `org.eclipse.equinox.weaving.caching`, and `org.eclipse.equinox.weaving.hook`. Ensure `org.eclipse.equinox.weaving.aspectj` is auto-started at, say, level 2;

3. Too add all required dependencies, click the "Add Required Bundles" button many times, until no more bundles are selected by Eclipse;

4. In the "Arguments" tab, add two extra switches to the end of "VM arguments":  `-Dosgi.framework.extensions=org.eclipse.equinox.weaving.hook -XX:-UseSplitVerifier`

5. In the "Settings" tab, make sure you select a Java 7 runtime environment. Marking "Clear the configuration area before launching" is also interesting if you experience strange problems during the execution.


After the bundles are loaded, the simulation will not execute itself automatically. Instead, you should use the command `sim` (or `sim <N>` where `<N>` is the number of the simulation that you want to execute) to execute them. Simulations are configured in the Simulation bundle, `META-INF/simulation.properties` file, so edit it accordingly if needed.


Contact
-------

Questions, comments, contributions, please [contact me](http://disi.unitn.it/~vitorsouza/).

