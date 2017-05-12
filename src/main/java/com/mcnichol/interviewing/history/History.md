JDK Alpha and Beta
* What year was the first Alpha && Beta released for Java:
    * 1995
* What was the name of the supplied Java web browser with the Java Alpha/Beta release?
    * WebRunner

JDK 1.0
* What day was the first version of JDK 1.0 released?
    * January 23, 1996
* What was the name of the JDK 1.0 release?
    * Oak
* The first stable version of Java was called Java 1.  What was the actual semantic version number?
    * 1.0.2
    
JDK 1.1
Major additions in the release on February 19, 1997 included:[5]

an extensive retooling of the AWT event model
inner classes added to the language
JavaBeans
JDBC
RMI
reflection which supported Introspection only, no modification at runtime was possible.
JIT (Just In Time) compiler on Microsoft Windows platforms, produced for JavaSoft by Symantec
Internationalization and Unicode support originating from Taligent[6]
J2SE 1.2
Codename Playground. The release on December 8, 1998 and subsequent releases through J2SE 5.0 were rebranded retrospectively Java 2 and the version name "J2SE" (Java 2 Platform, Standard Edition) replaced JDK to distinguish the base platform from J2EE (Java 2 Platform, Enterprise Edition) and J2ME (Java 2 Platform, Micro Edition). This was a very significant release of Java as it tripled the size of the Java platform to 1520 classes in 59 packages. Major additions included:[7]

strictfp keyword
the Swing graphical API was integrated into the core classes
Sun's JVM was equipped with a JIT compiler for the first time
Java plug-in
Java IDL, an IDL implementation for CORBA interoperability
Collections framework
J2SE 1.3
Codename Kestrel. The most notable changes in the May 8th, 2000 release were:[8][9]

HotSpot JVM included (the HotSpot JVM was first released in April 1999 for the J2SE 1.2 JVM)
RMI was modified to support optional compatibility with CORBA
Java Naming and Directory Interface (JNDI) included in core libraries (previously available as an extension)
Java Platform Debugger Architecture (JPDA)
JavaSound
Synthetic proxy classes
J2SE 1.4
Codename Merlin. The February 6th, 2002 release was the first release of the Java platform developed under the Java Community Process as JSR 59. Major changes included:[10][11]

Language changes
assert keyword (specified in JSR 41)
Library improvements
Regular expressions modeled after Perl regular expressions
Exception chaining allows an exception to encapsulate original lower-level exception
Internet Protocol version 6 (IPv6) support
Non-blocking IO (named New Input/Output, NIO) (specified in JSR 51)
Logging API (specified in JSR 47)
Image I/O API for reading and writing images in formats like JPEG and PNG
Integrated XML parser and XSLT processor (JAXP) (specified in JSR 5 and JSR 63)
Integrated security and cryptography extensions (JCE, JSSE, JAAS)
Java Web Start included (Java Web Start was first released in March 2001 for J2SE 1.3) (specified in JSR 56)
Preferences API (java.util.prefs)
Public support and security updates for Java 1.4 ended in October 2008. Paid security updates for Oracle customers ended in February 2013.[12]

J2SE 5.0
Codename Tiger. The release on September 30, 2004 was originally numbered 1.5, which is still used as the internal version number. The number was changed to "better reflect the level of maturity, stability, scalability and security of the J2SE".[13] This version was developed under JSR 176.

J2SE 5.0 entered its end-of-public-updates period on April 8, 2008; updates are no longer available to the public as of November 3, 2009. Updates were available to paid Oracle customers until May 2015.[14]

Tiger added a number of significant new language features:[15][16]

Generics: provides compile-time (static) type safety for collections and eliminates the need for most typecasts (type conversion) (specified by JSR 14)
Metadata: also called annotations; allows language constructs such as classes and methods to be tagged with additional data, which can then be processed by metadata-aware utilities (specified by JSR 175)
Autoboxing/unboxing: automatic conversions between primitive types (such as int) and primitive wrapper classes (such as Integer) (specified by JSR 201)
Enumerations: the enum keyword creates a typesafe, ordered list of values (such as Day.MONDAY, Day.TUESDAY, etc.); previously this could only be achieved by non-typesafe constant integers or manually constructed classes (typesafe enum pattern) (specified by JSR 201)
Varargs: the last parameter of a method can now be declared using a type name followed by three dots (e.g. void drawtext(String... lines)); in the calling code any number of parameters of that type can be used and they are then placed in an array to be passed to the method, or alternatively the calling code can pass an array of that type
Enhanced for each loop: the for loop syntax is extended with special syntax for iterating over each member of either an array or any Iterable, such as the standard Collection classes (specified by JSR 201)
Improved semantics of execution for multi-threaded Java programs; the new Java memory model addresses issues of complexity, effectiveness, and performance of previous specifications[17]
Static imports
There were also the following improvements to the standard libraries:

Automatic stub generation for RMI objects
Swing: New skinnable look and feel, called synth
The concurrency utilities in package java.util.concurrent[18]
Scanner class for parsing data from various input streams and buffers
Java 5 is the last release of Java to officially support the Microsoft Windows 98 and Windows ME,[19] while Windows Vista is the newest version of Windows that J2SE 5 was supported on prior to Java 5 going end of life in October 2009.[12]

Java 5 Update 5 (1.5.0_05) is the last release of Java to work on Windows 95 (with Internet Explorer 5.5 installed) and Windows NT 4.0.[20]

Java 5 was first available on Apple Mac OS X 10.4 (Tiger)[21] and was the default version of Java installed on Apple Mac OS X 10.5 (Leopard).

Versioning change
This version introduced a new versioning system for the Java language, although the old versioning system continued to be used for developer libraries:

Both version numbers "1.5.0" and "5.0" are used to identify this release of the Java 2 Platform Standard Edition. Version "5.0" is the product version, while "1.5.0" is the developer version. The number "5.0" is used to better reflect the level of maturity, stability, scalability and security of the J2SE.

— Version 1.5.0 or 5.0?[22]
This correspondence continued through later releases (Java 6 = JDK 1.6, Java 7 = JDK 1.7, and so on).

Java 5 updates
Release	Release date	Highlights
Java SE 5	2004-10-4	Metadata, generic types, autoboxing and auto-unboxing of primitive types, enhanced for loop, enumerated types, static import, formatted I/O, varargs, and concurrency utilities. Improved startup time and memory footprint. Sharing of read-only data between multiple running JVMs. Remote monitoring and management. A new JVM profiling API. Programmatic generation of stack traces. Support for XML 1.1 with Namespaces, XML Schema, SAX 2.0.2, DOM Level 3, and XSLT with a fast XLSTC compiler. Unicode 4.0 support.
Java SE 5 Update 1	2004-12-25	50 bugs have been fixed.
Java SE 5 Update 2	2005-03-16	A few crashes were fixed. The program is now compiled with better optimization. Calendar bugfixes and other bugfixes were made.
Java SE 5 Update 3	2005-05-03	This release fixes several bugs, including crashes of the Linux Mozilla plugin.
Java SE 5 Update 4	2005-07-04	With the release, J2SE support for Windows 64-bit has progressed from release candidate to final release. This version runs on AMD64/EM64T 64-bit mode machines with Windows Server 2003 x64 Editions.
Java SE 5 Update 5	2005-09-18	Several bugs were fixed and performance enhancements were made. Last release for Windows 95 and Windows NT 4.0.
Java SE 5 Update 6	2005-12-07	Prior to this update, an applet or application could specify the version of the JRE on which it would run. This has changed. All applets are executed with the latest JRE version.
Java SE 5 Update 7	2006-05-29	Several bugs were fixed and performance enhancements were made.
Java SE 5 Update 8	2006-08-13	Several bugs were fixed and performance enhancements were made.
Java SE 5 Update 9	2006-11-12	This release fixes several minor regressions.
Java SE 5 Update 10	2006-12-22	An implementation of the epoll I/O event notification facility, supported by Linux 2.6, was added. Many bugs were fixed.
Java SE 5 Update 11	2007-03-08	Several bugs were fixed and performance enhancements were made.
Java SE 5 Update 12	2007-06-11	
Java SE 5 Update 13	2007-10-05	Multiple security vulnerabilities in Java Web Start relating to local file access were fixed. A security vulnerability in the JRE allowing network access restrictions to be circumvented was fixed. Several other security issues and minor bugs were fixed.
Java SE 5 Update 14		
Java SE 5 Update 15	2008-03-06	Several crashes due to heap buffer out-of-bounds were fixed, along with several other bugs. New root certificates from AOL, DigiCert, and TrustCenter are now included.
Java SE 5 Update 16	2008-07-23	This release fixes several security flaws, such as DoS vulnerabilities, buffer overflows, and other bugs which could lead to crashes or which would give applets access to certain system resources. These vulnerabilities were located in Java Web Start, in the Java Management Extensions (JMX) Management Agent, and in the functions for handling XML data.
Java SE 5 Update 17	2008-12-03	The UTF-8 charset implementation was updated to handle the non-shortest form of UTF-8 byte sequences, introducing an incompatibility from previous releases. New root certificates were added. Many bugs were fixed.
Java SE 5 Update 18	2009-03-25	Several security issues were resolved. The behavior of the JNDI feature to store and retrieve Java objects in an LDAP directory was slightly modified. Five new root certificates were added. Many bugs were fixed.
Java SE 5 Update 19	2009-05-29	Support was added for several system configurations. Service Tag support was added. Many bugs were fixed, including several crashes and memory leaks.
Java SE 5 Update 20	2009-08-06	Several security vulnerabilities were resolved, such as potential system access by untrusted applets, and integer overflows in image processing and in Unpack200. Several new root certificates were added. Many other minor bugs were fixed.
Java SE 5 Update 21	2009-09-09	Many minor bugs were fixed.
Java SE 5 Update 22	2009-11-04	This release marks the End of Service Life (EOSL) for Java 5, and is its final public version. Several security vulnerabilities, reported as Sun Alerts 269868, 270474, 270475, and 270476, were fixed. Several other bugs were fixed. Furthermore, two new root certificates were added.
Java SE 6
Codename Mustang. As of the version released on December 11, 2006, Sun replaced the name "J2SE" with Java SE and dropped the ".0" from the version number.[23] Internal numbering for developers remains 1.6.0.[24] This version was developed under JSR 270.

During the development phase, new builds including enhancements and bug fixes were released approximately weekly. Beta versions were released in February and June 2006, leading up to a final release that occurred on December 11, 2006.

Major changes included in this version:[25][26]

Support for older Win9x versions dropped; unofficially, Java 6 Update 7 was the last release of Java shown to work on these versions of Windows.[citation needed] This is believed[by whom?] to be due to the major changes in Update 10.
Scripting Language Support (JSR 223): Generic API for tight integration with scripting languages, and built-in Mozilla JavaScript Rhino integration.
Dramatic performance improvements for the core platform,[27][28] and Swing.
Improved Web Service support through JAX-WS (JSR 224).
JDBC 4.0 support (JSR 221).
Java Compiler API (JSR 199): an API allowing a Java program to select and invoke a Java Compiler programmatically.
Upgrade of JAXB to version 2.0: Including integration of a StAX parser.
Support for pluggable annotations (JSR 269).[29]
Many GUI improvements, such as integration of SwingWorker in the API, table sorting and filtering, and true Swing double-buffering (eliminating the gray-area effect).
JVM improvements include: synchronization and compiler performance optimizations, new algorithms and upgrades to existing garbage collection algorithms, and application start-up performance.
Java 6 can be installed to Mac OS X 10.5 (Leopard) running on 64-bit (Core 2 Duo and higher) processor machines.[30] Java 6 is also supported by both 32-bit and 64-bit machines running Mac OS X 10.6 (Snow Leopard).

Java 6 reached the end of its supported life in February 2013, at which time all public updates, including security updates, were scheduled to be stopped.[31][32] Oracle released two more update to Java 6 in March and April 2013, which patched some security vulnerabilities.[33][34]

Java 6 updates
After Java 6 release, Sun, and later Oracle, released several updates which, while not changing any public API, enhanced end-user usability or fixed bugs.[35] Since January 2016, Java 6 (and earlier) versions are no longer available for download from Oracle.[36]

Release	Release date	Highlights
Java SE 6	2006-12-23	This release adds many enhancements in the fields of Web services, scripting, databases, pluggable annotations, and security, as well as quality, compatibility, and stability. JConsole is now officially supported. Java DB support has been added.
Java SE 6 Update 1	2007-05-07	
Java SE 6 Update 2	2007-07-03	
Java SE 6 Update 3	2007-10-03	
Java SE 6 Update 4	2008-01-14	HotSpot VM 10
Java SE 6 Update 5	2008-03-05	Several security flaws were eliminated. New root certificates from AOL, DigiCert, and TrustCenter are now included.
Java SE 6 Update 6	2008-04-16	A workaround for the infamous Xlib/XCB locking assertion issue was introduced. A memory leak when using Kerberos authentication with LoginContext was fixed. Several other bugs were fixed.
Java SE 6 Update 7[37]		Unofficially, Java SE 6 Update 7 (1.6.0.7) is the last version of Java that was shown to be working on the Win9x family of operating systems[citation needed]
Java SE 6 Update 10[38]	2008-10-15	HotSpot VM 11. Major changes for this update include:
Java Deployment Toolkit, a set of JavaScript functions to ease the deployment of applets and Java Web Start applications.[39]
Java Kernel, a small installer including only the most commonly used JRE classes. Other packages are downloaded when needed.
Enhanced updater.
Enhanced versioning and pack200 support: server-side support is no longer required.[40]
Java Quick Starter, to improve cold start-up time.
Improved performance of Java2D graphics primitives on Windows, using Direct3D and hardware acceleration.
A new Swing look and feel called Nimbus and based on synth.[41]
Next-Generation Java Plug-In: applets now run in a separate process and support many features of Web Start applications.[42]
Java SE 6 Update 11[43]	2008-12-03	13 security fixes[44]
Java SE 6 Update 12[45]	2008-12-12	No security fixes; 64-bit Java plug-in (for 64-bit web browsers only); Windows Server 2008 support; performance improvements of graphics and JavaFX applications
Java SE 6 Update 13[46]	2009-03-24	7 security fixes, JNDI store and retrieve Java objects in LDAP slightly modified, JMX Change (createMBeanunregisterMBean), 4 new root certificates added
Java SE 6 Update 14[47]	2009-05-28	HotSpot VM 14. This release includes extensive performance updates to the JIT compiler, compressed pointers for 64-bit machines, as well as support for the G1 (Garbage First) low-pause garbage collector.[48][49]
The -XX:+DoEscapeAnalysis option directs the HotSpot JIT compiler to use escape analysis to determine if local objects can be allocated on the stack instead of the heap.[50]

Some developers have noticed an issue introduced in this release which causes debuggers to miss breakpoints seemingly randomly.[51] Sun has a corresponding bug, which is tracking the issue. The workaround applies to the Client and Server VMs.[52] Using the -XX:+UseParallelGC option will prevent the failure. Another workaround is to roll back to update 13, or to upgrade to update 16.

Java SE 6 Update 15	2009-08-04	Introduced patch-in-place functionality[53]
Java SE 6 Update 16	2009-08-11	Fixed the issue introduced in update 14 which caused debuggers to miss breakpoints[54]
Java SE 6 Update 17[55]	2009-11-04	Security fixes; two new root certificates
Java SE 6 Update 18[56]	2010-01-13	No security fixes; Hotspot VM 16; support for Ubuntu 8.04 LTS Desktop Edition, SLES 11, Windows 7, Red Hat Enterprise Linux 5.3, Firefox 3.6, VisualVM 1.2; updated Java DB; many performance improvements
Java SE 6 Update 19[57]	2010-03-30	Security fixes; root certificate changes: seven new, three removed, five replaced with stronger signature algorithms; interim fix for TLS renegotiation attack
Java SE 6 Update 20[58]	2010-04-15	2 security fixes
Java SE 6 Update 21[59]	2010-07-07	No security fixes; Hotspot VM 17; support for Red Hat Enterprise Linux 5.4 and 5.5, Oracle Enterprise Linux 4.8, 5.4, 5.5; Google Chrome 4 support; support for Customized Loading Progress Indicators; VisualVM 1.2.2
Java SE 6 Update 22[60]	2010-10-12	29 security fixes; RFC 5746 support
Java SE 6 Update 23[61]	2010-12-08	No security fixes; Hotspot VM 19; better support for right-to-left languages
Java SE 6 Update 24[62]	2011-02-15	21 security fixes; updated Java DB
Java SE 6 Update 25	2011-03-21	No security fixes; Hotspot VM 20; support for Internet Explorer 9, Firefox 4 and Chrome 10; improved BigDecimal; includes "tiered" compilation in the Server VM that enables it to start quickly as does the Client VM, while achieving better peak performance (this feature is enabled by specifying -server and -XX:+TieredCompilation command options)[63]
Java SE 6 Update 26[64]	2011-06-07	17 new security fixes;[65] last version compatible with Windows Vista SP1
Java SE 6 Update 27[66]	2011-08-16	No security fixes; certification for Firefox 5
Java SE 6 Update 29[67]	2011-10-18	20 security fixes, various bug fixes[68]
Java SE 6 Update 30[69]	2011-12-12	No security fixes; fix for SSL regression in Update 29; support for Red Hat Enterprise Linux 6
Java SE 6 Update 31[70]	2012-02-14	14 security fixes and one bug fix; last version work reliably for Windows 2000[71]
JAVA SE 6 Update 32[72]	2012-04-26	No security fixes, various bug fixes
Java SE 6 Update 33[73]	2012-06-12	14 security fixes, improved VM configuration file loading
Java SE 6 Update 34[74]	2012-08-14	No security fixes, various bug fixes
Java SE 6 Update 35[75]	2012-08-30	Contains a security-in-depth fix[76]
Java SE 6 Update 37[77]	2012-10-16	30 security fixes
Java SE 6 Update 38[78]	2012-12-11	Various bug fixes[79]
Java SE 6 Update 39[80]	2013-02-01	50 security fixes
Java SE 6 Update 41[81]	2013-02-19	5 security fixes
Java SE 6 Update 43[82]	2013-03-04	2 security fixes
Java SE 6 Update 45[83]	2013-04-16	42 security fixes;[84] other changes;[83] final public update.[85] Since January 2016, Java 6 (and earlier) versions are no longer available for download from Oracle.[36]
Java SE 6 Update 51[86]	2013-06-18	Not available publicly, only available through the Java SE Support program and in Apple Update for OS X Snow Leopard, Lion & Mountain Lion; up to 40 security fixes[87]
Java SE 6 Update 65[88]	2013-10-15	Not available publicly, only available through the Java SE Support program and in Apple Update for OS X Snow Leopard, Lion & Mountain Lion; at least 11 critical security fixes[89]
Java SE 6 Update 71[90]	2014-01-14	Not available for public download; 33 fixes[91]
Java SE 6 Update 75[92]	2014-04-15	Not available publicly, only available through the Java SE Support program and in Solaris 10's Recommended Patchset Cluster no. #54; 25 security fixes[93]
Java SE 6 Update 81[94]	2014-07-15	Not available publicly, only available through the Java SE Support program and in Solaris 10's Recommended Patchset Cluster; 11 security fixes[95]
Java SE 6 Update 85[96]	2014-10-16	Not available publicly, only available through the Java SE Support program and in Solaris 10's Recommended Patchset Cluster; 18 security fixes[97]
Java SE 6 Update 91[98]	2015-01-21	Linux x64 and Windows i586 versions are available as the Java SE 6 Reference Implementation.[99] Other versions are only available through the Java SE Support program and in Solaris 10's Recommended Patchset Cluster; 15 security fixes[100]
Java SE 6 Update 95	2015-04-14	Not available publicly, only available through the Java SE Support program and in Solaris 10's Recommended Patchset Cluster; 14 security fixes[101]
Java SE 6 Update 101	2015-07-15	Not available publicly, only available through the Java SE Support program and in Solaris 10's Recommended Patchset Cluster; 18 security fixes[102] Certification for IE 10 and 11 was introduced in 1.6.0_101
Java SE 6 Update 105	2015-10-20	Not available publicly, only available through the Java SE Support program and in Solaris 10's Recommended Patchset Cluster; 17 security fixes[103]
Java SE 6 Update 111	2016-01-20	Not available publicly, only available through the Java SE Support program and in Solaris 10's Recommended Patchset Cluster; 17 security fixes[104]
Java SE 6 Update 113	2016-02-05	Not available publicly, only available through the Java SE Support program and in Solaris 10's Recommended Patchset Cluster; 1 security fix[105]
Java SE 6 Update 115	2016-04-21	Not available publicly, only available through the Java SE Support program and in Solaris 10's Recommended Patchset Cluster; 8 security fixes[106]
Java SE 6 Update 121	2016-07-19	Not available publicly, only available through the Java SE Support program and in Solaris 10's Recommended Patchset Cluster; 15 security fixes[107]
Java SE 6 Update 131	2016-10-18	Not available publicly, only available through the Java SE Support program and in Solaris 10's Recommended Patchset Cluster; 12 security fixes[108]
Java SE 6 Update 141	2017-01-17	Not available publicly, only available through the Java SE Support program and in Solaris 10's Recommended Patchset Cluster; 11 security fixes[109]
Java SE 7 
Java 7 (codename Dolphin[110]) is a major update that was launched on July 7, 2011[111] and was made available for developers on July 28, 2011.[112] The development period was organized into thirteen milestones; on June 6, 2011, the last of the thirteen milestones was finished.[113][114] On average, 8 builds (which generally included enhancements and bug fixes) were released per milestone. The feature list at the OpenJDK 7 project lists many of the changes.

Additions in Java 7 include:[115]

JVM support for dynamic languages, with the new invokedynamic bytecode under JSR-292,[116] following the prototyping work currently done on the Multi Language Virtual Machine
Compressed 64-bit pointers[117] (available in Java 6 with -XX:+UseCompressedOops)[118]
These small language changes (grouped under a project named Coin):[119]
Strings in switch[120]
Automatic resource management in try-statement[121]
Improved type inference for generic instance creation, aka the diamond operator <>[122]
Simplified varargs method declaration[123]
Binary integer literals[124]
Allowing underscores in numeric literals[125]
Catching multiple exception types and rethrowing exceptions with improved type checking[126]
Concurrency utilities under JSR 166[127]
New file I/O library (defined by JSR 203) adding support for multiple file systems, file metadata and symbolic links. The new packages are java.nio.file, java.nio.file.attribute and java.nio.file.spi[128][129]
Timsort is used to sort collections and arrays of objects instead of merge sort
Library-level support for elliptic curve cryptography algorithms
An XRender pipeline for Java 2D, which improves handling of features specific to modern GPUs
New platform APIs for the graphics features originally implemented in version 6u10 as unsupported APIs[130]
Enhanced library-level support for new network protocols, including SCTP and Sockets Direct Protocol
Upstream updates to XML and Unicode
Java Deployment Rulesets[131]
Lambda (Java's implementation of lambda functions), Jigsaw (Java's implementation of modules), and part of Coin were dropped from Java 7, and released as part of Java 8 (except for Jigsaw, which will be in Java 9).[132][133]

Java 7 was the default version to download on java.com from April 2012 until Java 8 was released.[134]

Java 7 updates
Oracle issued public updates to the Java 7 family on a quarterly basis[135] until April 2015 when the product reached the end of its support lifecycle.[36][136]

Release	Release date	Highlights
Java SE 7[137]	2011-07-28	Initial release; HotSpot VM 21
Java SE 7 Update 1[138]	2011-10-18	20 security fixes, other bug fixes
Java SE 7 Update 2[139]	2011-12-12	No security fixes; HotSpot VM 22; reliability and performance improvements; support for Solaris 11 and Firefox 5 and later; JavaFX included with Java SE JDK, improvements for web-deployed applications
Java SE 7 Update 3[140]	2012-02-14	14 security fixes[141]
Java SE 7 Update 4[142]	2012-04-26	No security updates; HotSpot VM 23; JDK Support for Mac OS X
Java SE 7 Update 5[143]	2012-06-12	14 security fixes[144]
Java SE 7 Update 6[145]	2012-08-14	JavaFX and Java Access Bridge included in Java SE JDK and JRE installation, JavaFX support for touch-enabled monitors and touch pads, JavaFX support for Linux, JDK and JRE Support for Mac OS X, JDK for Linux on ARM[146]
Java SE 7 Update 7[147]	2012-08-30	4 security fixes[76]
Java SE 7 Update 9[148]	2012-10-16	30 security vulnerabilities fixes[149]
Java SE 7 Update 10[150]	2012-12-11	New security features, such as the ability to disable any Java application from running in the browser and new dialogs to warn you when the JRE is insecure, and bug fixes
Java SE 7 Update 11[151]	2013-01-13	Olson Data 2012i; bugfix for problems with registration of plugin on systems with Stand-alone version of JavaFX Installed, security fixes for CVE-2013-0422;[152] the default security level for Java applets and web start applications has been increased from "Medium" to "High"
Java SE 7 Update 13[153]	2013-02-01	50 security fixes
Java SE 7 Update 15[154]	2013-02-19	5 security fixes
Java SE 7 Update 17[155]	2013-03-04	2 security fixes
Java SE 7 Update 21[156]	2013-04-16	Multiple changes including 42 security fixes, a new Server JRE that doesn't include the plug-in, and the JDK for Linux on ARM
Java SE 7 Update 25[157]	2013-06-18	Multiple changes including 40 security fixes[87][158]
Java SE 7 Update 40[159]	2013-09-10	621 bug fixes,[160] New security features, hardfloat ARM, Java Mission Control 5.2 and Retina Display support[161]
Java SE 7 Update 45[162]	2013-10-15	51 security fixes;[163] protections against unauthorized redistribution of Java applications; restore security prompts; JAXP changes; TimeZone.setDefault change
Java SE 7 Update 51[164]	2014-01-14	36 security fixes; block JAVA applets without manifest (like Remote console – Java Applet – IBM IMM card, HP iLO card) even if warning dialog is with sentence "will be blocked in next version",[165][166] 17 bug fixes
Java SE 7 Update 55[167]	2014-04-15	37 security fixes,[168] 19 bug fixes[169]
Java SE 7 Update 60[170]	2014-05-28	Java Mission Control 5.3,[171] 130 bug fixes[172]
Java SE 7 Update 65[173]	2014-07-15	18 bug fixes[174]
Java SE 7 Update 67[175]	2014-08-04	1 bug fix[176]
Java SE 7 Update 71[177]	2014-10-14	16 bug fixes[178]
Java SE 7 Update 72[179]	2014-10-14	Same release date with Update 71 as a corresponding Patch Set Update (PSU) for Java SE 7,[180] 36 bug fixes[181]
Java SE 7 Update 75[182]	2015-01-20	12 bug fixes,[183] SSLv3 disabled by default
Java SE 7 Update 76[184]	2015-01-20	Same release date with Update 75 as a corresponding Patch Set Update (PSU) for Java SE 7,[180] 97 bug fixes[185]
Java SE 7 Update 79[186]	2015-04-14	21 security fixes, 6 bug fixes,[187]
Java SE 7 Update 80[188]	2015-04-14	Last public release of Java 7; same release date with Update 79 as a corresponding Patch Set Update (PSU) for Java SE 7, 104 bug fixes[189]
Java SE 7 Update 85	2015-07-15	Not available publicly, only available through the Java SE Support program and in Solaris 10's Recommended Patchset Cluster; 25 security fixes[102]
Java SE 7 Update 91	2015-10-20	Not available publicly, only available through the Java SE Support program and in Solaris 10's Recommended Patchset Cluster; 20 security fixes[103]
Java SE 7 Update 95	2016-01-19	Not available publicly, only available through the Java SE Support program and in Solaris 10's Recommended Patchset Cluster; 8 security fixes[190]
Java SE 7 Update 97	2016-02-05	Not available publicly, only available through the Java SE Support program and in Solaris 10's Recommended Patchset Cluster; 1 security fix[191]
Java SE 7 Update 99	2016-03-23	Not available publicly, only available through the Java SE Support program and in Solaris 10's Recommended Patchset Cluster; 1 security fix[192]
Java SE 7 Update 101	2016-04-18	Not available publicly, only available through the Java SE Support program and in Solaris 10's Recommended Patchset Cluster; 9 security fixes[193]
Java SE 7 Update 111	2016-07-19	Not available publicly, only available through the Java SE Support program and in Solaris 10's Recommended Patchset Cluster; 36 security fixes[193]
Java SE 7 Update 121	2016-10-18	Not available publicly, only available through the Java SE Support program and in Solaris 10's Recommended Patchset Cluster; 32 security fixes[193]
Java SE 7 Update 131	2017-01-17	Not available publicly, only available through the Java SE Support program and in Solaris 10's Recommended Patchset Cluster; 17 security fixes[194]
Java SE 8
Java 8 (codename: Spider) was released on 18 March 2014,[193][195] and included some features that were planned for Java 7 but later deferred.[196]

Work on features was organized in terms of JDK Enhancement Proposals (JEPs).[197]

JSR 335, JEP 126: Language-level support for lambda expressions (officially, lambda expressions; unofficially, closures) under Project Lambda[198] and default methods (virtual extension methods)[199][200][201] which allow the addition of methods to interfaces without breaking existing implementations. There was an ongoing debate in the Java community on whether to add support for lambda expressions.[202][203] Sun later declared that lambda expressions would be included in Java and asked for community input to refine the feature.[204] Supporting lambda expressions also allows the performance of functional-style operations on streams of elements, such as MapReduce-inspired transformations on collections. Default methods allow an author of an API to add new methods to an interface without breaking the old code using it. Although it was not their primary intent,[199] default methods also allow multiple inheritance of behavior (but not state).
JSR 223, JEP 174: Project Nashorn, a JavaScript runtime which allows developers to embed JavaScript code within applications
JSR 308, JEP 104: Annotation on Java Types[205]
Unsigned Integer Arithmetic[206]
JSR 337, JEP 120: Repeating annotations[207]
JSR 310, JEP 150: Date and Time API[208]
JEP 178: Statically-linked JNI libraries[209]
JEP 153: Launch JavaFX applications (direct launching of JavaFX application JARs)[210]
JEP 122: Remove the permanent generation[211]
Java 8 is not supported on Windows XP[212] but as of JDK 8 update 25, it can still be installed and run under Windows XP.[213] Previous updates of JDK 8 could be run under XP, but had to be installed after a forced installation by directly unzipping files from the installation executable.

From October 2014, Java 8 has been the default version to download from the official website.[214]

Java 8 updates
Release	Release date	Highlights
Java SE 8	2014-03-18	Initial release
Java SE 8 Update 5[215]	2014-04-15	Using "*" in Caller-Allowable-Codebase attribute; 11 bug fixes
Java SE 8 Update 11[216]	2014-07-15	Java Dependency Analysis Tool (jdeps); Java Control Panel option to disable sponsors; JAR file attribute – Entry-Point; JAXP processing limit property – maxElementDepth; 18 security bug fixes,[217] 15 bug fixes
Java SE 8 Update 20[218]	2014-08-19	669 bug fixes,[219] JMC 5.4, String deduplication (disabled by default)
Java SE 8 Update 25[220]	2014-10-14	10 bug fixes
Java SE 8 Update 31[221]	2015-01-19	26 bug fixes; SSLv3 (disabled by default)
Java SE 8 Update 40[222]	2015-03-03	645 bug fixes,[223] Added the notion of "memory pressure" to help indicate how much of system's memory is still available (low pressure = high memory, high pressure = low memory)
Java SE 8 Update 45[224]	2015-04-14	13 bug fixes
Java SE 8 Update 51[225]	2015-07-14	Added support for native sandbox on Windows platforms (disabled by default); also, 25 security fixes,14 bug fixes
Java SE 8 Update 60[226]	2015-08-18	480 bug fixes[227]
Java SE 8 Update 65[228]	2015-10-20	25 security fixes, 3 bug fixes
Java SE 8 Update 66[229]	2015-11-16	15 bug fixes
Java SE 8 Update 71[230]	2016-01-19	8 security fixes, 5 bug fixes[231]
Java SE 8 Update 72	2016-01-19	8 security fixes, 5 bug fixes, several enhancements
Java SE 8 Update 73[232]	2016-02-03	1 security fix
Java SE 8 Update 74[233]	2016-02-03	1 security fix
Java SE 8 Update 77[234]	2016-03-23	1 security fix
Java SE 8 Update 91[235]	2016-04-19	9 security fixes, 4 bug fixes and enhancements
Java SE 8 Update 92[236]	2016-04-19	Security and bug fixes from 8u91, plus 76 additional bug fixes; the ExitOnOutOfMemoryError and CrashOnOutOfMemoryError flags have been introduced
Java SE 8 Update 101[237]	2016-07-19	Security and bug fixes from 8u92, plus 9 additional bug fixes
Java SE 8 Update 102[238]	2016-07-19	Security and bug fixes from 8u101, plus 118 additional bug fixes
Java SE 8 Update 111[239]	2016-10-18	Security fixes and 9 bug fixes
Java SE 8 Update 112[240]	2016-10-18	Additional features and 139 bug fixes over 8u111
Java SE 8 Update 121[241]	2017-01-17	3 additional features, 5 changes, and 11 bug fixes over 8u112.
Java SE 8 Update 131[242]	2017-04-18	4 changes and 42 bug fixes (2 notable).
Java SE 9
At JavaOne 2011, Oracle discussed features they hoped to release for Java 9 in 2016.[243] Java 9 should include better support for multi-gigabyte heaps, better native code integration, and a self-tuning JVM.[244] In early 2016 the release of Java 9 was rescheduled for March 2017[245] and later again postponed four more months to July 2017.[246]

JSR 376: Modularization of the JDK under Project Jigsaw (Java Platform Module System)[133][247][248]
JEP 222: jshell: The Java Shell (a Java REPL)[249][250]
JEP 295: Ahead-of-Time Compilation[251]
JEP 268: XML Catalogs[252]
Work is under way to make the Java implementation of Reactive Streams part of Java 9: Doug Lea, leader of JSR 166, has proposed[253] a new Flow class[254] that will include the interfaces currently provided by Reactive Streams.[255][256] This work is tracked under:

JEP 266: More Concurrency Updates[257]
There are plans to add automatic parallelization using OpenCL.[1][258]

Java SE 10
There is speculation of introducing objects without identity (value types),[259][260] as well as moving towards 64-bit addressable arrays to support large data sets.[1]

JSR 354: Money and Currency API[261][262]
