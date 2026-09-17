package com.coremedia.iso;

/* loaded from: classes.dex */
public class PropertyBoxParserImpl extends com.coremedia.iso.AbstractBoxParser {
    static java.lang.String[] EMPTY_STRING_ARRAY;
    java.lang.StringBuilder buildLookupStrings;
    java.lang.ThreadLocal<java.lang.String> clazzName;
    java.util.regex.Pattern constuctorPattern;
    java.util.Properties mapping;
    java.lang.ThreadLocal<java.lang.String[]> param;

    static {
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            com.coremedia.iso.PropertyBoxParserImpl.EMPTY_STRING_ARRAY = r0
            return
    }

    public PropertyBoxParserImpl(java.util.Properties r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "(.*)\\((.*?)\\)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r1.constuctorPattern = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1.buildLookupStrings = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r1.clazzName = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r1.param = r0
            r1.mapping = r2
            return
    }

    public PropertyBoxParserImpl(java.lang.String... r7) {
            r6 = this;
            r6.<init>()
            java.lang.String r0 = "(.*)\\((.*?)\\)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r6.constuctorPattern = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r6.buildLookupStrings = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r6.clazzName = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r6.param = r0
            java.lang.Class r0 = r6.getClass()
            java.lang.String r1 = "/isoparser-default.properties"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            java.util.Properties r1 = new java.util.Properties     // Catch: java.lang.Throwable -> L8c
            r1.<init>()     // Catch: java.lang.Throwable -> L8c
            r6.mapping = r1     // Catch: java.lang.Throwable -> L8c
            r1.load(r0)     // Catch: java.io.IOException -> L85 java.lang.Throwable -> L8c
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.io.IOException -> L85 java.lang.Throwable -> L8c
            java.lang.ClassLoader r1 = r1.getContextClassLoader()     // Catch: java.io.IOException -> L85 java.lang.Throwable -> L8c
            if (r1 != 0) goto L42
            java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: java.io.IOException -> L85 java.lang.Throwable -> L8c
        L42:
            java.lang.String r2 = "isoparser-custom.properties"
            java.util.Enumeration r1 = r1.getResources(r2)     // Catch: java.io.IOException -> L85 java.lang.Throwable -> L8c
        L48:
            boolean r2 = r1.hasMoreElements()     // Catch: java.io.IOException -> L85 java.lang.Throwable -> L8c
            if (r2 != 0) goto L6d
            int r1 = r7.length     // Catch: java.io.IOException -> L85 java.lang.Throwable -> L8c
            r2 = 0
        L50:
            if (r2 < r1) goto L5b
            r0.close()     // Catch: java.io.IOException -> L56
            goto L5a
        L56:
            r7 = move-exception
            r7.printStackTrace()
        L5a:
            return
        L5b:
            r3 = r7[r2]     // Catch: java.io.IOException -> L85 java.lang.Throwable -> L8c
            java.util.Properties r4 = r6.mapping     // Catch: java.io.IOException -> L85 java.lang.Throwable -> L8c
            java.lang.Class r5 = r6.getClass()     // Catch: java.io.IOException -> L85 java.lang.Throwable -> L8c
            java.io.InputStream r3 = r5.getResourceAsStream(r3)     // Catch: java.io.IOException -> L85 java.lang.Throwable -> L8c
            r4.load(r3)     // Catch: java.io.IOException -> L85 java.lang.Throwable -> L8c
            int r2 = r2 + 1
            goto L50
        L6d:
            java.lang.Object r2 = r1.nextElement()     // Catch: java.io.IOException -> L85 java.lang.Throwable -> L8c
            java.net.URL r2 = (java.net.URL) r2     // Catch: java.io.IOException -> L85 java.lang.Throwable -> L8c
            java.io.InputStream r2 = r2.openStream()     // Catch: java.io.IOException -> L85 java.lang.Throwable -> L8c
            java.util.Properties r3 = r6.mapping     // Catch: java.lang.Throwable -> L80
            r3.load(r2)     // Catch: java.lang.Throwable -> L80
            r2.close()     // Catch: java.io.IOException -> L85 java.lang.Throwable -> L8c
            goto L48
        L80:
            r7 = move-exception
            r2.close()     // Catch: java.io.IOException -> L85 java.lang.Throwable -> L8c
            throw r7     // Catch: java.io.IOException -> L85 java.lang.Throwable -> L8c
        L85:
            r7 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L8c
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L8c
            throw r1     // Catch: java.lang.Throwable -> L8c
        L8c:
            r7 = move-exception
            r0.close()     // Catch: java.io.IOException -> L91
            goto L95
        L91:
            r0 = move-exception
            r0.printStackTrace()
        L95:
            throw r7
    }

    @Override // com.coremedia.iso.AbstractBoxParser
    public com.coremedia.iso.boxes.Box createBox(java.lang.String r9, byte[] r10, java.lang.String r11) {
            r8 = this;
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r8.invoke(r9, r10, r11)
            java.lang.ThreadLocal<java.lang.String[]> r1 = r8.param
            java.lang.Object r1 = r1.get()
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.lang.ThreadLocal<java.lang.String> r2 = r8.clazzName     // Catch: java.lang.NoSuchMethodException -> L7f java.lang.reflect.InvocationTargetException -> L86 java.lang.IllegalAccessException -> L8d java.lang.InstantiationException -> L94 java.lang.ClassNotFoundException -> L9b
            java.lang.Object r2 = r2.get()     // Catch: java.lang.NoSuchMethodException -> L7f java.lang.reflect.InvocationTargetException -> L86 java.lang.IllegalAccessException -> L8d java.lang.InstantiationException -> L94 java.lang.ClassNotFoundException -> L9b
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.NoSuchMethodException -> L7f java.lang.reflect.InvocationTargetException -> L86 java.lang.IllegalAccessException -> L8d java.lang.InstantiationException -> L94 java.lang.ClassNotFoundException -> L9b
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.NoSuchMethodException -> L7f java.lang.reflect.InvocationTargetException -> L86 java.lang.IllegalAccessException -> L8d java.lang.InstantiationException -> L94 java.lang.ClassNotFoundException -> L9b
            int r3 = r1.length     // Catch: java.lang.NoSuchMethodException -> L7f java.lang.reflect.InvocationTargetException -> L86 java.lang.IllegalAccessException -> L8d java.lang.InstantiationException -> L94 java.lang.ClassNotFoundException -> L9b
            if (r3 <= 0) goto L78
            int r3 = r1.length     // Catch: java.lang.NoSuchMethodException -> L7f java.lang.reflect.InvocationTargetException -> L86 java.lang.IllegalAccessException -> L8d java.lang.InstantiationException -> L94 java.lang.ClassNotFoundException -> L9b
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L7f java.lang.reflect.InvocationTargetException -> L86 java.lang.IllegalAccessException -> L8d java.lang.InstantiationException -> L94 java.lang.ClassNotFoundException -> L9b
            int r4 = r1.length     // Catch: java.lang.NoSuchMethodException -> L7f java.lang.reflect.InvocationTargetException -> L86 java.lang.IllegalAccessException -> L8d java.lang.InstantiationException -> L94 java.lang.ClassNotFoundException -> L9b
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.NoSuchMethodException -> L7f java.lang.reflect.InvocationTargetException -> L86 java.lang.IllegalAccessException -> L8d java.lang.InstantiationException -> L94 java.lang.ClassNotFoundException -> L9b
            r5 = 0
        L23:
            int r6 = r1.length     // Catch: java.lang.NoSuchMethodException -> L7f java.lang.reflect.InvocationTargetException -> L86 java.lang.IllegalAccessException -> L8d java.lang.InstantiationException -> L94 java.lang.ClassNotFoundException -> L9b
            if (r5 < r6) goto L31
            java.lang.reflect.Constructor r9 = r2.getConstructor(r3)     // Catch: java.lang.NoSuchMethodException -> L7f java.lang.reflect.InvocationTargetException -> L86 java.lang.IllegalAccessException -> L8d java.lang.InstantiationException -> L94 java.lang.ClassNotFoundException -> L9b
            java.lang.Object r9 = r9.newInstance(r4)     // Catch: java.lang.NoSuchMethodException -> L7f java.lang.reflect.InvocationTargetException -> L86 java.lang.IllegalAccessException -> L8d java.lang.InstantiationException -> L94 java.lang.ClassNotFoundException -> L9b
            com.coremedia.iso.boxes.Box r9 = (com.coremedia.iso.boxes.Box) r9     // Catch: java.lang.NoSuchMethodException -> L7f java.lang.reflect.InvocationTargetException -> L86 java.lang.IllegalAccessException -> L8d java.lang.InstantiationException -> L94 java.lang.ClassNotFoundException -> L9b
            return r9
        L31:
            java.lang.String r6 = "userType"
            r7 = r1[r5]     // Catch: java.lang.NoSuchMethodException -> L7f java.lang.reflect.InvocationTargetException -> L86 java.lang.IllegalAccessException -> L8d java.lang.InstantiationException -> L94 java.lang.ClassNotFoundException -> L9b
            boolean r6 = r6.equals(r7)     // Catch: java.lang.NoSuchMethodException -> L7f java.lang.reflect.InvocationTargetException -> L86 java.lang.IllegalAccessException -> L8d java.lang.InstantiationException -> L94 java.lang.ClassNotFoundException -> L9b
            if (r6 == 0) goto L42
            r4[r5] = r10     // Catch: java.lang.NoSuchMethodException -> L7f java.lang.reflect.InvocationTargetException -> L86 java.lang.IllegalAccessException -> L8d java.lang.InstantiationException -> L94 java.lang.ClassNotFoundException -> L9b
            java.lang.Class<byte[]> r6 = byte[].class
            r3[r5] = r6     // Catch: java.lang.NoSuchMethodException -> L7f java.lang.reflect.InvocationTargetException -> L86 java.lang.IllegalAccessException -> L8d java.lang.InstantiationException -> L94 java.lang.ClassNotFoundException -> L9b
            goto L5f
        L42:
            java.lang.String r6 = "type"
            r7 = r1[r5]     // Catch: java.lang.NoSuchMethodException -> L7f java.lang.reflect.InvocationTargetException -> L86 java.lang.IllegalAccessException -> L8d java.lang.InstantiationException -> L94 java.lang.ClassNotFoundException -> L9b
            boolean r6 = r6.equals(r7)     // Catch: java.lang.NoSuchMethodException -> L7f java.lang.reflect.InvocationTargetException -> L86 java.lang.IllegalAccessException -> L8d java.lang.InstantiationException -> L94 java.lang.ClassNotFoundException -> L9b
            if (r6 == 0) goto L51
            r4[r5] = r9     // Catch: java.lang.NoSuchMethodException -> L7f java.lang.reflect.InvocationTargetException -> L86 java.lang.IllegalAccessException -> L8d java.lang.InstantiationException -> L94 java.lang.ClassNotFoundException -> L9b
            r3[r5] = r0     // Catch: java.lang.NoSuchMethodException -> L7f java.lang.reflect.InvocationTargetException -> L86 java.lang.IllegalAccessException -> L8d java.lang.InstantiationException -> L94 java.lang.ClassNotFoundException -> L9b
            goto L5f
        L51:
            java.lang.String r6 = "parent"
            r7 = r1[r5]     // Catch: java.lang.NoSuchMethodException -> L7f java.lang.reflect.InvocationTargetException -> L86 java.lang.IllegalAccessException -> L8d java.lang.InstantiationException -> L94 java.lang.ClassNotFoundException -> L9b
            boolean r6 = r6.equals(r7)     // Catch: java.lang.NoSuchMethodException -> L7f java.lang.reflect.InvocationTargetException -> L86 java.lang.IllegalAccessException -> L8d java.lang.InstantiationException -> L94 java.lang.ClassNotFoundException -> L9b
            if (r6 == 0) goto L62
            r4[r5] = r11     // Catch: java.lang.NoSuchMethodException -> L7f java.lang.reflect.InvocationTargetException -> L86 java.lang.IllegalAccessException -> L8d java.lang.InstantiationException -> L94 java.lang.ClassNotFoundException -> L9b
            r3[r5] = r0     // Catch: java.lang.NoSuchMethodException -> L7f java.lang.reflect.InvocationTargetException -> L86 java.lang.IllegalAccessException -> L8d java.lang.InstantiationException -> L94 java.lang.ClassNotFoundException -> L9b
        L5f:
            int r5 = r5 + 1
            goto L23
        L62:
            java.lang.InternalError r9 = new java.lang.InternalError     // Catch: java.lang.NoSuchMethodException -> L7f java.lang.reflect.InvocationTargetException -> L86 java.lang.IllegalAccessException -> L8d java.lang.InstantiationException -> L94 java.lang.ClassNotFoundException -> L9b
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.NoSuchMethodException -> L7f java.lang.reflect.InvocationTargetException -> L86 java.lang.IllegalAccessException -> L8d java.lang.InstantiationException -> L94 java.lang.ClassNotFoundException -> L9b
            java.lang.String r11 = "No such param: "
            r10.<init>(r11)     // Catch: java.lang.NoSuchMethodException -> L7f java.lang.reflect.InvocationTargetException -> L86 java.lang.IllegalAccessException -> L8d java.lang.InstantiationException -> L94 java.lang.ClassNotFoundException -> L9b
            r11 = r1[r5]     // Catch: java.lang.NoSuchMethodException -> L7f java.lang.reflect.InvocationTargetException -> L86 java.lang.IllegalAccessException -> L8d java.lang.InstantiationException -> L94 java.lang.ClassNotFoundException -> L9b
            r10.append(r11)     // Catch: java.lang.NoSuchMethodException -> L7f java.lang.reflect.InvocationTargetException -> L86 java.lang.IllegalAccessException -> L8d java.lang.InstantiationException -> L94 java.lang.ClassNotFoundException -> L9b
            java.lang.String r10 = r10.toString()     // Catch: java.lang.NoSuchMethodException -> L7f java.lang.reflect.InvocationTargetException -> L86 java.lang.IllegalAccessException -> L8d java.lang.InstantiationException -> L94 java.lang.ClassNotFoundException -> L9b
            r9.<init>(r10)     // Catch: java.lang.NoSuchMethodException -> L7f java.lang.reflect.InvocationTargetException -> L86 java.lang.IllegalAccessException -> L8d java.lang.InstantiationException -> L94 java.lang.ClassNotFoundException -> L9b
            throw r9     // Catch: java.lang.NoSuchMethodException -> L7f java.lang.reflect.InvocationTargetException -> L86 java.lang.IllegalAccessException -> L8d java.lang.InstantiationException -> L94 java.lang.ClassNotFoundException -> L9b
        L78:
            java.lang.Object r9 = r2.newInstance()     // Catch: java.lang.NoSuchMethodException -> L7f java.lang.reflect.InvocationTargetException -> L86 java.lang.IllegalAccessException -> L8d java.lang.InstantiationException -> L94 java.lang.ClassNotFoundException -> L9b
            com.coremedia.iso.boxes.Box r9 = (com.coremedia.iso.boxes.Box) r9     // Catch: java.lang.NoSuchMethodException -> L7f java.lang.reflect.InvocationTargetException -> L86 java.lang.IllegalAccessException -> L8d java.lang.InstantiationException -> L94 java.lang.ClassNotFoundException -> L9b
            return r9
        L7f:
            r9 = move-exception
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            r10.<init>(r9)
            throw r10
        L86:
            r9 = move-exception
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            r10.<init>(r9)
            throw r10
        L8d:
            r9 = move-exception
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            r10.<init>(r9)
            throw r10
        L94:
            r9 = move-exception
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            r10.<init>(r9)
            throw r10
        L9b:
            r9 = move-exception
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            r10.<init>(r9)
            throw r10
    }

    public void invoke(java.lang.String r6, byte[] r7, java.lang.String r8) {
            r5 = this;
            r0 = 0
            if (r7 == 0) goto L65
            java.lang.String r1 = "uuid"
            boolean r2 = r1.equals(r6)
            if (r2 == 0) goto L5d
            java.util.Properties r2 = r5.mapping
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "uuid["
            r3.<init>(r4)
            java.lang.String r4 = com.coremedia.iso.Hex.encodeHex(r7)
            java.lang.String r4 = r4.toUpperCase()
            r3.append(r4)
            java.lang.String r4 = "]"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r2 = r2.getProperty(r3)
            if (r2 != 0) goto L54
            java.util.Properties r2 = r5.mapping
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r3.<init>(r8)
            java.lang.String r8 = "-uuid["
            r3.append(r8)
            java.lang.String r7 = com.coremedia.iso.Hex.encodeHex(r7)
            java.lang.String r7 = r7.toUpperCase()
            r3.append(r7)
            r3.append(r4)
            java.lang.String r7 = r3.toString()
            java.lang.String r2 = r2.getProperty(r7)
        L54:
            if (r2 != 0) goto L89
            java.util.Properties r7 = r5.mapping
            java.lang.String r2 = r7.getProperty(r1)
            goto L89
        L5d:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r7 = "we have a userType but no uuid box type. Something's wrong"
            r6.<init>(r7)
            throw r6
        L65:
            java.util.Properties r7 = r5.mapping
            java.lang.String r2 = r7.getProperty(r6)
            if (r2 != 0) goto L89
            java.lang.StringBuilder r7 = r5.buildLookupStrings
            r7.append(r8)
            r8 = 45
            r7.append(r8)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            java.lang.StringBuilder r8 = r5.buildLookupStrings
            r8.setLength(r0)
            java.util.Properties r8 = r5.mapping
            java.lang.String r2 = r8.getProperty(r7)
        L89:
            if (r2 != 0) goto L93
            java.util.Properties r7 = r5.mapping
            java.lang.String r8 = "default"
            java.lang.String r2 = r7.getProperty(r8)
        L93:
            if (r2 == 0) goto L104
            java.lang.String r6 = ")"
            boolean r6 = r2.endsWith(r6)
            if (r6 != 0) goto Laa
            java.lang.ThreadLocal<java.lang.String[]> r6 = r5.param
            java.lang.String[] r7 = com.coremedia.iso.PropertyBoxParserImpl.EMPTY_STRING_ARRAY
            r6.set(r7)
            java.lang.ThreadLocal<java.lang.String> r6 = r5.clazzName
            r6.set(r2)
            goto Lef
        Laa:
            java.util.regex.Pattern r6 = r5.constuctorPattern
            java.util.regex.Matcher r6 = r6.matcher(r2)
            boolean r7 = r6.matches()
            if (r7 == 0) goto Lf0
            java.lang.ThreadLocal<java.lang.String> r7 = r5.clazzName
            r8 = 1
            java.lang.String r8 = r6.group(r8)
            r7.set(r8)
            r7 = 2
            java.lang.String r8 = r6.group(r7)
            int r8 = r8.length()
            if (r8 != 0) goto Ld3
            java.lang.ThreadLocal<java.lang.String[]> r6 = r5.param
            java.lang.String[] r7 = com.coremedia.iso.PropertyBoxParserImpl.EMPTY_STRING_ARRAY
            r6.set(r7)
            goto Lef
        Ld3:
            java.lang.ThreadLocal<java.lang.String[]> r8 = r5.param
            java.lang.String r1 = r6.group(r7)
            int r1 = r1.length()
            if (r1 <= 0) goto Lea
            java.lang.String r6 = r6.group(r7)
            java.lang.String r7 = ","
            java.lang.String[] r6 = r6.split(r7)
            goto Lec
        Lea:
            java.lang.String[] r6 = new java.lang.String[r0]
        Lec:
            r8.set(r6)
        Lef:
            return
        Lf0:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Cannot work with that constructor: "
            r7.<init>(r8)
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L104:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "No box object found for "
            r8.<init>(r0)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r7.<init>(r6)
            throw r7
    }
}
