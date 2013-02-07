# jzmq-api

[![Build Status](https://travis-ci.org/trevorbernard/jzmq-api.png)](https://travis-ci.org/trevorbernard/jzmq-api)

A Java ZeroMQ API for abstracting the various implementations of JZMQ

## Warning

Currently not in a functional state and the API is ever evolving and will be
subject to much change.

## Installation

Before you can begin using this library, you need to have the zmq and jzmq
shared libraries in either: `/usr/lib`, `/usr/local/lib`.

### Ubuntu 12.04 Precise

This is currently how I go about setting up my environment.

```bash
# This installs v3.2.2 of libzmq 
sudo add-apt-repository ppa:chris-lea/zeromq
sudo apt-get update
sudo apt-get install libzmq-dev libpgm-dev

cd /tmp
wget https://raw.github.com/trevorbernard/jzmq-api/master/debs/jzmq_2.1.0-1_amd64.deb
sudo dpkg -i jzmq_2.1.0-1_amd64.deb
```
Add the following dependency to your `pom.xml` file:

```xml
<dependency>
    <groupId>trevorbernard</groupId>
    <artifactId>jzmq-api</artifactId>
    <version>0.1.0-SNAPSHOT</version>
</dependency>            
```
```xml
<repositories>
  <repository>
    <id>clojars.org</id>
    <url>https://clojars.org/repo</url>
  </repository>
</repositories>
```
## Eclipse

```bash
mvn eclipse:eclipse -DdownloadSources=true -DdownloadJavadocs=true
```
## Usage

## Contribution Process

This project uses the [C4 process](http://rfc.zeromq.org/spec:16) for all code changes.

## License

Copyright © 2013 Trevor Bernard

This is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License as published by the Free Software Foundation; either version 3 of the License, or (at your option) any later version.
