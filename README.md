# java-practics

A set of beginner Java practice programs (loops, conditionals, patterns, small exercises) created while learning core Java basics. Intended for learners who want small runnable examples to study and modify.

## Stack
- Language(s): Java (Java SE)
- Framework / runtime: Java SE (JDK 8+)
- Notable libraries: none — uses core java.* classes (Scanner, System)

## Repository layout
Root-level Java examples and compiled class files:
- basics.java        — simple “Hello / name” example
- condition.java     — switch-case example (day of week)
- EvenOdd.java       — check even / odd using modulo
- ageProblem.java    — small input-based exercise
- continueFor.java, Floop.java, Wloop.java, NFloop.java, iFfor.java, etc. — loop/control-flow examples
- Several .class files are present next to their .java sources (these are compiled artifacts)

questions/
- largest.java       — find largest of three numbers
- oddEven.java       — another even/odd example
- sumofN.java        — sum of first N numbers
- trainglepattern.java, squrepattern.java — pattern-printing exercises
- ...more pattern/algorithm practice files

Notes:
- Many examples are single-file programs with console input using Scanner.
- There are compiled .class files committed to the repo; consider removing them and adding a .gitignore.

## How to run (shortest path)
Prerequisites: JDK (java and javac) installed and on your PATH.

From the repository root:

- Compile and run a single file at repo root:
  - javac basics.java
  - java basics

- Compile and run a specific example (e.g., EvenOdd):
  - javac EvenOdd.java
  - java EvenOdd

- Compile and run programs inside the questions/ folder:
  - cd questions
  - javac largest.java
  - java largest

- Or compile all Java files at once (from repo root):
  - find . -name "*.java" -print | xargs javac
  - Then run a class by name (cd into the directory containing its .class if needed), e.g.:
    - cd questions
    - java largest

Caveats:
- Some source files use lowercase class names (e.g., `class basics`) — Java is case-sensitive; run using the exact class name.
- Because this repository does not use packages or a build tool, running programs in subfolders is easiest by changing into the folder first.
- Remove the committed .class files or add them to .gitignore to keep the repo source-only.

## Recommendations / Next steps I can help with
- Remove committed .class files and add a .gitignore for compiled artifacts.
- Add a short CONTRIBUTING.md and a suggested JDK version (e.g., "JDK 17 recommended").
- Optionally add a simple build setup (Maven or Gradle) so examples are compiled consistently and runnable from the project root.
- Add a small CI check that compiles all source files.

## Examples of common commands
- Compile a single source:
  - javac path/to/FileName.java
- Run a compiled class:
  - java ClassName
- Compile everything (Unix):
  - find . -name "*.java" -print | xargs javac

## Contact / Author
- Created by: Gaurav Prakash Srivastava
