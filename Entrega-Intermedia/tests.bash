JAVADIR=/usr/share/java
PROJDIR=/home/oops/Desktop/share/Projecto/12_11/project
CLASSPATH=$JAVADIR/po-uilib.jar:$JAVADIR/edt-support.jar:$PROJDIR/edt-textui/edt-textui.jar:$PROJDIR/edt-core/edt-core.jar
echo $CLASSPATH

java -Din=tests/A-001-001-M-ok.in  -Dout=testes_out/A-001-001-M-ok.tout -cp $CLASSPATH edt.textui.TextEditor
java -Din=tests/A-002-002-M-ok.in  -Dout=testes_out/A-002-002-M-ok.tout -cp $CLASSPATH edt.textui.TextEditor
java -Dimport=tests/A-003-001-M-ok.import -Din=tests/A-003-001-M-ok.in  -Dout=testes_out/A-003-001-M-ok.tout -cp $CLASSPATH edt.textui.TextEditor
java -Din=tests/A-003-002-M-ok.in  -Dout=testes_out/A-003-002-M-ok.tout -cp $CLASSPATH edt.textui.TextEditor
java -Dimport=tests/A-003-003-M-ok.import -Din=tests/A-003-003-M-ok.in  -Dout=testes_out/A-003-003-M-ok.tout -cp $CLASSPATH edt.textui.TextEditor
java -Din=tests/A-003-004-M-ok.in  -Dout=testes_out/A-003-004-M-ok.tout -cp $CLASSPATH edt.textui.TextEditor
java -Din=tests/A-003-005-M-ok.in  -Dout=testes_out/A-003-005-M-ok.tout -cp $CLASSPATH edt.textui.TextEditor
java -Dimport=tests/A-004-001-M-ok.import -Din=tests/A-004-001-M-ok.in  -Dout=testes_out/A-004-001-M-ok.tout -cp $CLASSPATH edt.textui.TextEditor
java -Din=tests/A-005-001-M-ok.in  -Dout=testes_out/A-005-001-M-ok.tout -cp $CLASSPATH edt.textui.TextEditor
java -Dimport=tests/A-005-002-M-ok.import -Din=tests/A-005-002-M-ok.in  -Dout=testes_out/A-005-002-M-ok.tout -cp $CLASSPATH edt.textui.TextEditor
java -Dimport=tests/A-005-003-M-ok.import -Din=tests/A-005-003-M-ok.in  -Dout=testes_out/A-005-003-M-ok.tout -cp $CLASSPATH edt.textui.TextEditor
java -Dimport=tests/A-006-001-M-ok.import -Din=tests/A-006-001-M-ok.in  -Dout=testes_out/A-006-001-M-ok.tout -cp $CLASSPATH edt.textui.TextEditor
java -Dimport=tests/A-006-002-M-ok.import -Din=tests/A-006-002-M-ok.in  -Dout=testes_out/A-006-002-M-ok.tout -cp $CLASSPATH edt.textui.TextEditor


diff testes_out/A-001-001-M-ok.tout tests/expected/A-001-001-M-ok.out
diff testes_out/A-002-002-M-ok.tout tests/expected/A-002-002-M-ok.out
diff testes_out/A-003-001-M-ok.tout tests/expected/A-003-001-M-ok.out
diff testes_out/A-003-002-M-ok.tout tests/expected/A-003-002-M-ok.out
diff testes_out/A-003-003-M-ok.tout tests/expected/A-003-003-M-ok.out
diff testes_out/A-003-004-M-ok.tout tests/expected/A-003-004-M-ok.out
diff testes_out/A-003-005-M-ok.tout tests/expected/A-003-005-M-ok.out
diff testes_out/A-004-001-M-ok.tout tests/expected/A-004-001-M-ok.out
diff testes_out/A-005-001-M-ok.tout tests/expected/A-005-001-M-ok.out
diff testes_out/A-005-002-M-ok.tout tests/expected/A-005-002-M-ok.out
diff testes_out/A-005-003-M-ok.tout tests/expected/A-005-003-M-ok.out
diff testes_out/A-006-001-M-ok.tout tests/expected/A-006-001-M-ok.out
diff testes_out/A-006-002-M-ok.tout tests/expected/A-006-002-M-ok.out

rm doc1
