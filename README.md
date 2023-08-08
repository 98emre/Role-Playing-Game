# Hero Application

Foobar is a Python library for dealing with word pluralization.

# Java Installation Guide

### Step 1: Download Java
First download latest version of Java [Java](https://www.oracle.com/java/) to install.

### Step 2: Verify Installation
Open a new command prompt (or terminal) and type:

```bash
java --version
```
This should display Java's version, indicating a successful installation.

# Maven Installation Guide

### Step 1: Download Maven
First download the latest version of Maven [Maven](https://maven.apache.org/download.cgi).

### Step 2: Installed Maven
Extract the downloaded file to a suitable location on your computer.

### Step 3: Add Maven To Path
To run Maven in your command line, you need to add Maven bin in your system `PATH` variable.

Windows: 
1. Right click on `This PC` and choose `Properties`.
2. Click on `Advanced system settings`
3. Click on `Environment Variables`.
4. Under System Variables, locate `PATH` and click `Edit`.
5. Click `New` and add the path to Maven's bin

Mac:
Add the following line to your .bashrc, .bash_profile, or .zshrc, depending on your shell:
```bash
export PATH=$PATH:/path/to/maven/bin
```
Replace /path/to/maven with the actual path where you extracted Maven.

### Step 4: Verify Installation
Open a new command prompt (or terminal) and type:

```bash
mvn --version
```

This should display Maven's version, indicating a successful installation.

# Usage

```python
import foobar

# returns 'words'
foobar.pluralize('word')

```

# Contributing

Pull requests are welcome. For major changes, please open an issue first
to discuss what you would like to change.

Please make sure to update tests as appropriate.

# License

[MIT](https://choosealicense.com/licenses/mit/)
