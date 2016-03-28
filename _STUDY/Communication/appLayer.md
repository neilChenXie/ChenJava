# Application Layer

Metaprotocols are distinct from envelope protocols like SMTP, HTTP, REST, AMQ or even TCP.

**envelope protocols**: transit opaque data, they are not meta-protocols themselves because they impose no real structure on their data.

**communication patterns**: othogonal to the metaprotocol.

## Category

* envelope protocols

* meta-protocol
    * SOAP
    * CORBA
    * RMI
    * JSON
    * POX
    * Hession
* communication patterns
    * REST
    * RPC
    * Messaging
    * Streaming

## Suitability

### meta-protocol

* typed meta-protocol for object-oriented
    * Hession
    * RMI
    * CORBA
    * JSON
* syntactic meta-protocol for document-based
    * SOAP
    * POX

### communication patterns

* typed
    * RPC

* Both
    * REST
    * Messaging

## Meta-protocols

### Overview

* Dynamic-Typed Metaprotocols

Examples: Hessian, JSON, Burlap, XML-RPC
Languages include scripting and object-oriented: Flash, JavaScript, Java, C#, Ruby, PHP, etc.
Specification IDL defines end-to-end object model communication.
Versioning is flexible.
Streaming, RPC, REST and Messaging communication patterns.

* Static-Typed Metaprotocols

Examples: CORBA, RMI
Object-oriented languages: Java, C#, C.
Specification IDL defines end-to-end object model communication.
Versioning is brittle.
Streaming and RPC communication patterns.

* Syntactic Metaprotocols

Examples: SOAP, POX
Scripting and object-oriented languages: Flash, Java, C#, C, PHP.
Specification IDL (WSDL) defines wire protocol only. Object model/API definition is application-specific.
Many SOAP implemtentations require runtime availability of WSDL.
Versioning is flexible.
REST and Messaging communication patterns.

### Dynamic vs Static Typing

The typed metaprotocols divide further into dynamic and static typed. Dynamically typed systems contain all type information within the protocol itself, while statically typed systems share data outside the protocol, e.g. with shared IDL (CORBA) or matching classes (RMI).

### Dynamic-Typed meta-protocol

they are more flexible in managing differences between language semantics and supporting changes in the protocol version.

### Static-Typed Metaprotocols

The static-typed metaprotocols require an out-of-band definition of the type system.

### Envelope Protocols

Envelope protocols like HTTP, AMQ(JMS) and SMTP encapsulate raw data and attach routing, quality, and metadata headers to the data. Because they do not impose any structure on the data, they are not true metaprotocols. They are mentioned here to distinguish them from the syntactic metaprotocols and to avoid some confusion.

## Communication Patterns

The communications pattern closely matches the application requirements. If the application needs queuing and remote batching of request, like processing purchase orders, then a messaging pattern is the proper choice. If the application primarily reads the state of a web service, e.g. a stock quote or RSS feed, then a REST pattern fits best. For continuous updates from the server, the streaming pattern is the right choice. For more flexibility and a well-defined API, RPC works well. Since the pattern matches the application, none of the patterns are better than another, merely more or less appropriate.

## Reference

* [Metaprotocol Taxonomy](http://www.evernote.com/l/APqyGzYB3OhDmJXhNG17wQsOi0kU-mMtlOI/)
