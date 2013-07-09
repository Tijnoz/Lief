getstatic java/lang/System/in Ljava/io/InputStream;
$if(rest(var))$
$var:{dup
invokevirtual java/io/InputStream/read()I
istore $it$
}$pop
$else$
invokevirtual java/io/InputStream/read()I
dub
$first(var)$
$endif$
