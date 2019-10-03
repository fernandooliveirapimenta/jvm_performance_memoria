
#Bytecode

#Just In Time compilation (JIT)
  parte do codigo pode ser compilado para nativo

#Jvm passando program argumentos
java Main 10: java {Classe_compilada} {argumentos separados por espaco}

#Compiler Flags
-XX:+PrintCompilation

#Jvm passando VM arguments
java -XX:+PrintCompilation Main 10
java -XX:+UnlockDiagnosticVMOptions -XX:+LogCompilation Main 5000
java -XX:+PrintCodeCache Main 5000
InitialCodeCacheSize
ReservedCodeCacheSize
CodeCacheExpansionSize
java -XX:ReservedCodeCacheSize=28m -XX:+PrintCodeCache Main 5000

#Caminho java mac /Library/Java/JavaVirtualMachines/adoptopenjdk-8.jdk/Contents/Home
#Jconsole atach pid aba memory code cache select box
