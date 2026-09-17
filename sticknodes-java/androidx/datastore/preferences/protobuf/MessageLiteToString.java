package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
final class MessageLiteToString {
    private static final java.lang.String camelCaseToSnakeCase(java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r4.length()
            if (r1 >= r2) goto L25
            char r2 = r4.charAt(r1)
            boolean r3 = java.lang.Character.isUpperCase(r2)
            if (r3 == 0) goto L1b
            java.lang.String r3 = "_"
            r0.append(r3)
        L1b:
            char r2 = java.lang.Character.toLowerCase(r2)
            r0.append(r2)
            int r1 = r1 + 1
            goto L6
        L25:
            java.lang.String r4 = r0.toString()
            return r4
    }

    private static boolean isDefaultValue(java.lang.Object r7) {
            boolean r0 = r7 instanceof java.lang.Boolean
            r1 = 1
            if (r0 == 0) goto Ld
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r7 = r7 ^ r1
            return r7
        Ld:
            boolean r0 = r7 instanceof java.lang.Integer
            r2 = 0
            if (r0 == 0) goto L1d
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r7 != 0) goto L1b
            goto L1c
        L1b:
            r1 = 0
        L1c:
            return r1
        L1d:
            boolean r0 = r7 instanceof java.lang.Float
            if (r0 == 0) goto L2f
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            r0 = 0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 != 0) goto L2d
            goto L2e
        L2d:
            r1 = 0
        L2e:
            return r1
        L2f:
            boolean r0 = r7 instanceof java.lang.Double
            if (r0 == 0) goto L42
            java.lang.Double r7 = (java.lang.Double) r7
            double r3 = r7.doubleValue()
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L40
            goto L41
        L40:
            r1 = 0
        L41:
            return r1
        L42:
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto L4d
            java.lang.String r0 = ""
            boolean r7 = r7.equals(r0)
            return r7
        L4d:
            boolean r0 = r7 instanceof androidx.datastore.preferences.protobuf.ByteString
            if (r0 == 0) goto L58
            androidx.datastore.preferences.protobuf.ByteString r0 = androidx.datastore.preferences.protobuf.ByteString.EMPTY
            boolean r7 = r7.equals(r0)
            return r7
        L58:
            boolean r0 = r7 instanceof androidx.datastore.preferences.protobuf.MessageLite
            if (r0 == 0) goto L68
            r0 = r7
            androidx.datastore.preferences.protobuf.MessageLite r0 = (androidx.datastore.preferences.protobuf.MessageLite) r0
            androidx.datastore.preferences.protobuf.MessageLite r0 = r0.getDefaultInstanceForType()
            if (r7 != r0) goto L66
            goto L67
        L66:
            r1 = 0
        L67:
            return r1
        L68:
            boolean r0 = r7 instanceof java.lang.Enum
            if (r0 == 0) goto L77
            java.lang.Enum r7 = (java.lang.Enum) r7
            int r7 = r7.ordinal()
            if (r7 != 0) goto L75
            goto L76
        L75:
            r1 = 0
        L76:
            return r1
        L77:
            return r2
    }

    static final void printField(java.lang.StringBuilder r6, int r7, java.lang.String r8, java.lang.Object r9) {
            boolean r0 = r9 instanceof java.util.List
            if (r0 == 0) goto L19
            java.util.List r9 = (java.util.List) r9
            java.util.Iterator r9 = r9.iterator()
        La:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r9.next()
            printField(r6, r7, r8, r0)
            goto La
        L18:
            return
        L19:
            boolean r0 = r9 instanceof java.util.Map
            if (r0 == 0) goto L38
            java.util.Map r9 = (java.util.Map) r9
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L27:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r0 = r9.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            printField(r6, r7, r8, r0)
            goto L27
        L37:
            return
        L38:
            r0 = 10
            r6.append(r0)
            r0 = 0
            r1 = 0
        L3f:
            r2 = 32
            if (r1 >= r7) goto L49
            r6.append(r2)
            int r1 = r1 + 1
            goto L3f
        L49:
            r6.append(r8)
            boolean r8 = r9 instanceof java.lang.String
            r1 = 34
            java.lang.String r3 = ": \""
            if (r8 == 0) goto L65
            r6.append(r3)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r7 = androidx.datastore.preferences.protobuf.TextFormatEscaper.escapeText(r9)
            r6.append(r7)
            r6.append(r1)
            goto Ld4
        L65:
            boolean r8 = r9 instanceof androidx.datastore.preferences.protobuf.ByteString
            if (r8 == 0) goto L79
            r6.append(r3)
            androidx.datastore.preferences.protobuf.ByteString r9 = (androidx.datastore.preferences.protobuf.ByteString) r9
            java.lang.String r7 = androidx.datastore.preferences.protobuf.TextFormatEscaper.escapeBytes(r9)
            r6.append(r7)
            r6.append(r1)
            goto Ld4
        L79:
            boolean r8 = r9 instanceof androidx.datastore.preferences.protobuf.GeneratedMessageLite
            java.lang.String r1 = "}"
            java.lang.String r3 = "\n"
            java.lang.String r4 = " {"
            if (r8 == 0) goto L9c
            r6.append(r4)
            androidx.datastore.preferences.protobuf.GeneratedMessageLite r9 = (androidx.datastore.preferences.protobuf.GeneratedMessageLite) r9
            int r8 = r7 + 2
            reflectivePrintWithIndent(r9, r6, r8)
            r6.append(r3)
        L90:
            if (r0 >= r7) goto L98
            r6.append(r2)
            int r0 = r0 + 1
            goto L90
        L98:
            r6.append(r1)
            goto Ld4
        L9c:
            boolean r8 = r9 instanceof java.util.Map.Entry
            if (r8 == 0) goto Lc8
            r6.append(r4)
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            int r8 = r7 + 2
            java.lang.Object r4 = r9.getKey()
            java.lang.String r5 = "key"
            printField(r6, r8, r5, r4)
            java.lang.Object r9 = r9.getValue()
            java.lang.String r4 = "value"
            printField(r6, r8, r4, r9)
            r6.append(r3)
        Lbc:
            if (r0 >= r7) goto Lc4
            r6.append(r2)
            int r0 = r0 + 1
            goto Lbc
        Lc4:
            r6.append(r1)
            goto Ld4
        Lc8:
            java.lang.String r7 = ": "
            r6.append(r7)
            java.lang.String r7 = r9.toString()
            r6.append(r7)
        Ld4:
            return
    }

    private static void reflectivePrintWithIndent(androidx.datastore.preferences.protobuf.MessageLite r12, java.lang.StringBuilder r13, int r14) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.TreeSet r2 = new java.util.TreeSet
            r2.<init>()
            java.lang.Class r3 = r12.getClass()
            java.lang.reflect.Method[] r3 = r3.getDeclaredMethods()
            int r4 = r3.length
            r5 = 0
            r6 = 0
        L1a:
            java.lang.String r7 = "get"
            if (r6 >= r4) goto L49
            r8 = r3[r6]
            java.lang.String r9 = r8.getName()
            r1.put(r9, r8)
            java.lang.Class[] r9 = r8.getParameterTypes()
            int r9 = r9.length
            if (r9 != 0) goto L46
            java.lang.String r9 = r8.getName()
            r0.put(r9, r8)
            java.lang.String r9 = r8.getName()
            boolean r7 = r9.startsWith(r7)
            if (r7 == 0) goto L46
            java.lang.String r7 = r8.getName()
            r2.add(r7)
        L46:
            int r6 = r6 + 1
            goto L1a
        L49:
            java.util.Iterator r2 = r2.iterator()
        L4d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1d2
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = ""
            java.lang.String r4 = r3.replaceFirst(r7, r4)
            java.lang.String r6 = "List"
            boolean r8 = r4.endsWith(r6)
            r9 = 1
            if (r8 == 0) goto Lb9
            java.lang.String r8 = "OrBuilderList"
            boolean r8 = r4.endsWith(r8)
            if (r8 != 0) goto Lb9
            boolean r6 = r4.equals(r6)
            if (r6 != 0) goto Lb9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = r4.substring(r5, r9)
            java.lang.String r8 = r8.toLowerCase()
            r6.append(r8)
            int r8 = r4.length()
            int r8 = r8 + (-4)
            java.lang.String r8 = r4.substring(r9, r8)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            java.lang.Object r8 = r0.get(r3)
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            if (r8 == 0) goto Lb9
            java.lang.Class r10 = r8.getReturnType()
            java.lang.Class<java.util.List> r11 = java.util.List.class
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto Lb9
            java.lang.String r3 = camelCaseToSnakeCase(r6)
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.invokeOrDie(r8, r12, r4)
            printField(r13, r14, r3, r4)
            goto L4d
        Lb9:
            java.lang.String r6 = "Map"
            boolean r8 = r4.endsWith(r6)
            if (r8 == 0) goto L11d
            boolean r6 = r4.equals(r6)
            if (r6 != 0) goto L11d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = r4.substring(r5, r9)
            java.lang.String r8 = r8.toLowerCase()
            r6.append(r8)
            int r8 = r4.length()
            int r8 = r8 + (-3)
            java.lang.String r8 = r4.substring(r9, r8)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            java.lang.Object r3 = r0.get(r3)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto L11d
            java.lang.Class r8 = r3.getReturnType()
            java.lang.Class<java.util.Map> r10 = java.util.Map.class
            boolean r8 = r8.equals(r10)
            if (r8 == 0) goto L11d
            java.lang.Class<java.lang.Deprecated> r8 = java.lang.Deprecated.class
            boolean r8 = r3.isAnnotationPresent(r8)
            if (r8 != 0) goto L11d
            int r8 = r3.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isPublic(r8)
            if (r8 == 0) goto L11d
            java.lang.String r4 = camelCaseToSnakeCase(r6)
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.invokeOrDie(r3, r12, r6)
            printField(r13, r14, r4, r3)
            goto L4d
        L11d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "set"
            r3.append(r6)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.Object r3 = r1.get(r3)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 != 0) goto L138
            goto L4d
        L138:
            java.lang.String r3 = "Bytes"
            boolean r3 = r4.endsWith(r3)
            if (r3 == 0) goto L161
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            int r6 = r4.length()
            int r6 = r6 + (-5)
            java.lang.String r6 = r4.substring(r5, r6)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            boolean r3 = r0.containsKey(r3)
            if (r3 == 0) goto L161
            goto L4d
        L161:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = r4.substring(r5, r9)
            java.lang.String r6 = r6.toLowerCase()
            r3.append(r6)
            java.lang.String r6 = r4.substring(r9)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r7)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r0.get(r6)
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "has"
            r8.append(r10)
            r8.append(r4)
            java.lang.String r4 = r8.toString()
            java.lang.Object r4 = r0.get(r4)
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            if (r6 == 0) goto L4d
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.invokeOrDie(r6, r12, r8)
            if (r4 != 0) goto L1bb
            boolean r4 = isDefaultValue(r6)
            if (r4 != 0) goto L1b9
            goto L1c7
        L1b9:
            r9 = 0
            goto L1c7
        L1bb:
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.invokeOrDie(r4, r12, r8)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r9 = r4.booleanValue()
        L1c7:
            if (r9 == 0) goto L4d
            java.lang.String r3 = camelCaseToSnakeCase(r3)
            printField(r13, r14, r3, r6)
            goto L4d
        L1d2:
            boolean r0 = r12 instanceof androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage
            if (r0 == 0) goto L213
            r0 = r12
            androidx.datastore.preferences.protobuf.GeneratedMessageLite$ExtendableMessage r0 = (androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage) r0
            androidx.datastore.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite$ExtensionDescriptor> r0 = r0.extensions
            java.util.Iterator r0 = r0.iterator()
        L1df:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L213
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "["
            r2.append(r3)
            java.lang.Object r3 = r1.getKey()
            androidx.datastore.preferences.protobuf.GeneratedMessageLite$ExtensionDescriptor r3 = (androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor) r3
            int r3 = r3.getNumber()
            r2.append(r3)
            java.lang.String r3 = "]"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.Object r1 = r1.getValue()
            printField(r13, r14, r2, r1)
            goto L1df
        L213:
            androidx.datastore.preferences.protobuf.GeneratedMessageLite r12 = (androidx.datastore.preferences.protobuf.GeneratedMessageLite) r12
            androidx.datastore.preferences.protobuf.UnknownFieldSetLite r12 = r12.unknownFields
            if (r12 == 0) goto L21c
            r12.printWithIndent(r13, r14)
        L21c:
            return
    }

    static java.lang.String toString(androidx.datastore.preferences.protobuf.MessageLite r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "# "
            r0.append(r1)
            r0.append(r3)
            r3 = 0
            reflectivePrintWithIndent(r2, r0, r3)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
