package com.badlogic.gdx.utils;

/* loaded from: classes.dex */
public class Json {
    private final com.badlogic.gdx.utils.ObjectMap<java.lang.Class, java.lang.Object[]> classToDefaultValues;
    private final com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Json.Serializer> classToSerializer;
    private final com.badlogic.gdx.utils.ObjectMap<java.lang.Class, java.lang.String> classToTag;
    private com.badlogic.gdx.utils.Json.Serializer defaultSerializer;
    private boolean enumNames;
    private final java.lang.Object[] equals1;
    private final java.lang.Object[] equals2;
    private boolean ignoreDeprecated;
    private boolean ignoreUnknownFields;
    private com.badlogic.gdx.utils.JsonWriter$OutputType outputType;
    private boolean readDeprecated;
    private boolean sortFields;
    private final com.badlogic.gdx.utils.ObjectMap<java.lang.String, java.lang.Class> tagToClass;
    private java.lang.String typeName;
    private final com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.OrderedMap<java.lang.String, com.badlogic.gdx.utils.Json.FieldMetadata>> typeToFields;
    private boolean usePrototypes;

    private static class FieldMetadata {
        boolean deprecated;
        java.lang.Class elementType;
        final com.badlogic.gdx.utils.reflect.Field field;

        public FieldMetadata(com.badlogic.gdx.utils.reflect.Field r3) {
                r2 = this;
                r2.<init>()
                r2.field = r3
                java.lang.Class<com.badlogic.gdx.utils.ObjectMap> r0 = com.badlogic.gdx.utils.ObjectMap.class
                java.lang.Class r1 = r3.getType()
                boolean r0 = com.badlogic.gdx.utils.reflect.ClassReflection.isAssignableFrom(r0, r1)
                if (r0 != 0) goto L20
                java.lang.Class<java.util.Map> r0 = java.util.Map.class
                java.lang.Class r1 = r3.getType()
                boolean r0 = com.badlogic.gdx.utils.reflect.ClassReflection.isAssignableFrom(r0, r1)
                if (r0 == 0) goto L1e
                goto L20
            L1e:
                r0 = 0
                goto L21
            L20:
                r0 = 1
            L21:
                java.lang.Class r0 = r3.getElementType(r0)
                r2.elementType = r0
                java.lang.Class<java.lang.Deprecated> r0 = java.lang.Deprecated.class
                boolean r3 = r3.isAnnotationPresent(r0)
                r2.deprecated = r3
                return
        }
    }

    public static abstract class ReadOnlySerializer<T> implements com.badlogic.gdx.utils.Json.Serializer<T> {
        public ReadOnlySerializer() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public interface Serializable {
        void read(com.badlogic.gdx.utils.Json r1, com.badlogic.gdx.utils.JsonValue r2);
    }

    public interface Serializer<T> {
        T read(com.badlogic.gdx.utils.Json r1, com.badlogic.gdx.utils.JsonValue r2, java.lang.Class r3);
    }

    public Json() {
            r4 = this;
            r4.<init>()
            java.lang.String r0 = "class"
            r4.typeName = r0
            r0 = 1
            r4.usePrototypes = r0
            r4.enumNames = r0
            com.badlogic.gdx.utils.ObjectMap r1 = new com.badlogic.gdx.utils.ObjectMap
            r1.<init>()
            r4.typeToFields = r1
            com.badlogic.gdx.utils.ObjectMap r1 = new com.badlogic.gdx.utils.ObjectMap
            r1.<init>()
            r4.tagToClass = r1
            com.badlogic.gdx.utils.ObjectMap r1 = new com.badlogic.gdx.utils.ObjectMap
            r1.<init>()
            r4.classToTag = r1
            com.badlogic.gdx.utils.ObjectMap r1 = new com.badlogic.gdx.utils.ObjectMap
            r1.<init>()
            r4.classToSerializer = r1
            com.badlogic.gdx.utils.ObjectMap r1 = new com.badlogic.gdx.utils.ObjectMap
            r1.<init>()
            r4.classToDefaultValues = r1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r3 = 0
            r1[r2] = r3
            r4.equals1 = r1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r3
            r4.equals2 = r0
            com.badlogic.gdx.utils.JsonWriter$OutputType r0 = com.badlogic.gdx.utils.JsonWriter$OutputType.minimal
            r4.outputType = r0
            return
    }

    private java.lang.String convertToString(java.lang.Enum r2) {
            r1 = this;
            boolean r0 = r1.enumNames
            if (r0 == 0) goto L9
            java.lang.String r2 = r2.name()
            goto Ld
        L9:
            java.lang.String r2 = r2.toString()
        Ld:
            return r2
    }

    private com.badlogic.gdx.utils.OrderedMap<java.lang.String, com.badlogic.gdx.utils.Json.FieldMetadata> getFields(java.lang.Class r9) {
            r8 = this;
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.OrderedMap<java.lang.String, com.badlogic.gdx.utils.Json$FieldMetadata>> r0 = r8.typeToFields
            java.lang.Object r0 = r0.get(r9)
            com.badlogic.gdx.utils.OrderedMap r0 = (com.badlogic.gdx.utils.OrderedMap) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            r1 = r9
        L11:
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            if (r1 == r2) goto L1d
            r0.add(r1)
            java.lang.Class r1 = r1.getSuperclass()
            goto L11
        L1d:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r0.size
            r3 = 1
            int r2 = r2 - r3
        L26:
            if (r2 < 0) goto L38
            java.lang.Object r4 = r0.get(r2)
            java.lang.Class r4 = (java.lang.Class) r4
            com.badlogic.gdx.utils.reflect.Field[] r4 = com.badlogic.gdx.utils.reflect.ClassReflection.getDeclaredFields(r4)
            java.util.Collections.addAll(r1, r4)
            int r2 = r2 + (-1)
            goto L26
        L38:
            com.badlogic.gdx.utils.OrderedMap r0 = new com.badlogic.gdx.utils.OrderedMap
            int r2 = r1.size()
            r0.<init>(r2)
            r2 = 0
            int r4 = r1.size()
        L46:
            if (r2 >= r4) goto L7b
            java.lang.Object r5 = r1.get(r2)
            com.badlogic.gdx.utils.reflect.Field r5 = (com.badlogic.gdx.utils.reflect.Field) r5
            boolean r6 = r5.isTransient()
            if (r6 == 0) goto L55
            goto L78
        L55:
            boolean r6 = r5.isStatic()
            if (r6 == 0) goto L5c
            goto L78
        L5c:
            boolean r6 = r5.isSynthetic()
            if (r6 == 0) goto L63
            goto L78
        L63:
            boolean r6 = r5.isAccessible()
            if (r6 != 0) goto L6c
            r5.setAccessible(r3)     // Catch: java.lang.RuntimeException -> L78
        L6c:
            java.lang.String r6 = r5.getName()
            com.badlogic.gdx.utils.Json$FieldMetadata r7 = new com.badlogic.gdx.utils.Json$FieldMetadata
            r7.<init>(r5)
            r0.put(r6, r7)
        L78:
            int r2 = r2 + 1
            goto L46
        L7b:
            com.badlogic.gdx.utils.Array<K> r1 = r0.keys
            r8.sortFields(r9, r1)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.OrderedMap<java.lang.String, com.badlogic.gdx.utils.Json$FieldMetadata>> r1 = r8.typeToFields
            r1.put(r9, r0)
            return r0
    }

    public void addClassTag(java.lang.String r2, java.lang.Class r3) {
            r1 = this;
            com.badlogic.gdx.utils.ObjectMap<java.lang.String, java.lang.Class> r0 = r1.tagToClass
            r0.put(r2, r3)
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, java.lang.String> r0 = r1.classToTag
            r0.put(r3, r2)
            return
    }

    public void copyFields(java.lang.Object r6, java.lang.Object r7) {
            r5 = this;
            java.lang.Class r0 = r7.getClass()
            com.badlogic.gdx.utils.OrderedMap r0 = r5.getFields(r0)
            java.lang.Class r1 = r6.getClass()
            com.badlogic.gdx.utils.OrderedMap r1 = r5.getFields(r1)
            com.badlogic.gdx.utils.ObjectMap$Entries r1 = r1.iterator()
        L14:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L71
            java.lang.Object r2 = r1.next()
            com.badlogic.gdx.utils.ObjectMap$Entry r2 = (com.badlogic.gdx.utils.ObjectMap.Entry) r2
            K r3 = r2.key
            java.lang.Object r3 = r0.get(r3)
            com.badlogic.gdx.utils.Json$FieldMetadata r3 = (com.badlogic.gdx.utils.Json.FieldMetadata) r3
            V r4 = r2.value
            com.badlogic.gdx.utils.Json$FieldMetadata r4 = (com.badlogic.gdx.utils.Json.FieldMetadata) r4
            com.badlogic.gdx.utils.reflect.Field r4 = r4.field
            if (r3 == 0) goto L56
            com.badlogic.gdx.utils.reflect.Field r2 = r3.field     // Catch: com.badlogic.gdx.utils.reflect.ReflectionException -> L3a
            java.lang.Object r3 = r4.get(r6)     // Catch: com.badlogic.gdx.utils.reflect.ReflectionException -> L3a
            r2.set(r7, r3)     // Catch: com.badlogic.gdx.utils.reflect.ReflectionException -> L3a
            goto L14
        L3a:
            r6 = move-exception
            com.badlogic.gdx.utils.SerializationException r7 = new com.badlogic.gdx.utils.SerializationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error copying field: "
            r0.append(r1)
            java.lang.String r1 = r4.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0, r6)
            throw r7
        L56:
            com.badlogic.gdx.utils.SerializationException r6 = new com.badlogic.gdx.utils.SerializationException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "To object is missing field: "
            r7.append(r0)
            K r0 = r2.key
            java.lang.String r0 = (java.lang.String) r0
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L71:
            return
    }

    public <T> T fromJson(java.lang.Class<T> r4, com.badlogic.gdx.files.FileHandle r5) {
            r3 = this;
            r0 = 0
            com.badlogic.gdx.utils.JsonReader r1 = new com.badlogic.gdx.utils.JsonReader     // Catch: java.lang.Exception -> Lf
            r1.<init>()     // Catch: java.lang.Exception -> Lf
            com.badlogic.gdx.utils.JsonValue r1 = r1.parse(r5)     // Catch: java.lang.Exception -> Lf
            java.lang.Object r4 = r3.readValue(r4, r0, r1)     // Catch: java.lang.Exception -> Lf
            return r4
        Lf:
            r4 = move-exception
            com.badlogic.gdx.utils.SerializationException r0 = new com.badlogic.gdx.utils.SerializationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Error reading file: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5, r4)
            throw r0
    }

    public java.lang.Class getClass(java.lang.String r2) {
            r1 = this;
            com.badlogic.gdx.utils.ObjectMap<java.lang.String, java.lang.Class> r0 = r1.tagToClass
            java.lang.Object r2 = r0.get(r2)
            java.lang.Class r2 = (java.lang.Class) r2
            return r2
    }

    protected boolean ignoreUnknownField(java.lang.Class r1, java.lang.String r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    protected java.lang.Object newInstance(java.lang.Class r5) {
            r4 = this;
            java.lang.Object r5 = com.badlogic.gdx.utils.reflect.ClassReflection.newInstance(r5)     // Catch: java.lang.Exception -> L5
            return r5
        L5:
            r0 = move-exception
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L18 com.badlogic.gdx.utils.reflect.ReflectionException -> L1b java.lang.SecurityException -> L98
            com.badlogic.gdx.utils.reflect.Constructor r2 = com.badlogic.gdx.utils.reflect.ClassReflection.getDeclaredConstructor(r5, r2)     // Catch: java.lang.Exception -> L18 com.badlogic.gdx.utils.reflect.ReflectionException -> L1b java.lang.SecurityException -> L98
            r3 = 1
            r2.setAccessible(r3)     // Catch: java.lang.Exception -> L18 com.badlogic.gdx.utils.reflect.ReflectionException -> L1b java.lang.SecurityException -> L98
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L18 com.badlogic.gdx.utils.reflect.ReflectionException -> L1b java.lang.SecurityException -> L98
            java.lang.Object r5 = r2.newInstance(r3)     // Catch: java.lang.Exception -> L18 com.badlogic.gdx.utils.reflect.ReflectionException -> L1b java.lang.SecurityException -> L98
            return r5
        L18:
            r0 = move-exception
            goto L98
        L1b:
            java.lang.Class<java.lang.Enum> r2 = java.lang.Enum.class
            boolean r2 = com.badlogic.gdx.utils.reflect.ClassReflection.isAssignableFrom(r2, r5)
            if (r2 == 0) goto L35
            java.lang.Object[] r0 = r5.getEnumConstants()
            if (r0 != 0) goto L2e
            java.lang.Class r5 = r5.getSuperclass()
        L2e:
            java.lang.Object[] r5 = r5.getEnumConstants()
            r5 = r5[r1]
            return r5
        L35:
            boolean r1 = r5.isArray()
            if (r1 != 0) goto L7d
            boolean r1 = com.badlogic.gdx.utils.reflect.ClassReflection.isMemberClass(r5)
            if (r1 == 0) goto L62
            boolean r1 = com.badlogic.gdx.utils.reflect.ClassReflection.isStaticClass(r5)
            if (r1 != 0) goto L62
            com.badlogic.gdx.utils.SerializationException r1 = new com.badlogic.gdx.utils.SerializationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Class cannot be created (non-static member class): "
            r2.append(r3)
            java.lang.String r5 = r5.getName()
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5, r0)
            throw r1
        L62:
            com.badlogic.gdx.utils.SerializationException r1 = new com.badlogic.gdx.utils.SerializationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Class cannot be created (missing no-arg constructor): "
            r2.append(r3)
            java.lang.String r5 = r5.getName()
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5, r0)
            throw r1
        L7d:
            com.badlogic.gdx.utils.SerializationException r1 = new com.badlogic.gdx.utils.SerializationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Encountered JSON object when expected array of type: "
            r2.append(r3)
            java.lang.String r5 = r5.getName()
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5, r0)
            throw r1
        L98:
            com.badlogic.gdx.utils.SerializationException r1 = new com.badlogic.gdx.utils.SerializationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error constructing instance of class: "
            r2.append(r3)
            java.lang.String r5 = r5.getName()
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5, r0)
            throw r1
    }

    public void readFields(java.lang.Object r8, com.badlogic.gdx.utils.JsonValue r9) {
            r7 = this;
            java.lang.Class r0 = r8.getClass()
            com.badlogic.gdx.utils.OrderedMap r1 = r7.getFields(r0)
            com.badlogic.gdx.utils.JsonValue r9 = r9.child
        La:
            if (r9 == 0) goto L101
            java.lang.String r2 = r9.name()
            java.lang.String r3 = " "
            java.lang.String r4 = "_"
            java.lang.String r2 = r2.replace(r3, r4)
            java.lang.Object r2 = r1.get(r2)
            com.badlogic.gdx.utils.Json$FieldMetadata r2 = (com.badlogic.gdx.utils.Json.FieldMetadata) r2
            java.lang.String r3 = ")"
            java.lang.String r4 = " ("
            if (r2 != 0) goto L69
            java.lang.String r2 = r9.name
            java.lang.String r5 = r7.typeName
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L2f
            goto L85
        L2f:
            boolean r2 = r7.ignoreUnknownFields
            if (r2 != 0) goto L85
            java.lang.String r2 = r9.name
            boolean r2 = r7.ignoreUnknownField(r0, r2)
            if (r2 == 0) goto L3c
            goto L85
        L3c:
            com.badlogic.gdx.utils.SerializationException r8 = new com.badlogic.gdx.utils.SerializationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Field not found: "
            r1.append(r2)
            java.lang.String r2 = r9.name
            r1.append(r2)
            r1.append(r4)
            java.lang.String r0 = r0.getName()
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            r8.<init>(r0)
            java.lang.String r9 = r9.trace()
            r8.addTrace(r9)
            throw r8
        L69:
            boolean r5 = r7.ignoreDeprecated
            if (r5 == 0) goto L76
            boolean r5 = r7.readDeprecated
            if (r5 != 0) goto L76
            boolean r5 = r2.deprecated
            if (r5 == 0) goto L76
            goto L85
        L76:
            com.badlogic.gdx.utils.reflect.Field r5 = r2.field
            java.lang.Class r6 = r5.getType()     // Catch: java.lang.RuntimeException -> L88 com.badlogic.gdx.utils.SerializationException -> Lb6 com.badlogic.gdx.utils.reflect.ReflectionException -> Ld8
            java.lang.Class r2 = r2.elementType     // Catch: java.lang.RuntimeException -> L88 com.badlogic.gdx.utils.SerializationException -> Lb6 com.badlogic.gdx.utils.reflect.ReflectionException -> Ld8
            java.lang.Object r2 = r7.readValue(r6, r2, r9)     // Catch: java.lang.RuntimeException -> L88 com.badlogic.gdx.utils.SerializationException -> Lb6 com.badlogic.gdx.utils.reflect.ReflectionException -> Ld8
            r5.set(r8, r2)     // Catch: java.lang.RuntimeException -> L88 com.badlogic.gdx.utils.SerializationException -> Lb6 com.badlogic.gdx.utils.reflect.ReflectionException -> Ld8
        L85:
            com.badlogic.gdx.utils.JsonValue r9 = r9.next
            goto La
        L88:
            r8 = move-exception
            com.badlogic.gdx.utils.SerializationException r1 = new com.badlogic.gdx.utils.SerializationException
            r1.<init>(r8)
            java.lang.String r8 = r9.trace()
            r1.addTrace(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r5.getName()
            r8.append(r9)
            r8.append(r4)
            java.lang.String r9 = r0.getName()
            r8.append(r9)
            r8.append(r3)
            java.lang.String r8 = r8.toString()
            r1.addTrace(r8)
            throw r1
        Lb6:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r1 = r5.getName()
            r9.append(r1)
            r9.append(r4)
            java.lang.String r0 = r0.getName()
            r9.append(r0)
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            r8.addTrace(r9)
            throw r8
        Ld8:
            r8 = move-exception
            com.badlogic.gdx.utils.SerializationException r9 = new com.badlogic.gdx.utils.SerializationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Error accessing field: "
            r1.append(r2)
            java.lang.String r2 = r5.getName()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r0 = r0.getName()
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            r9.<init>(r0, r8)
            throw r9
        L101:
            return
    }

    public <T> T readValue(java.lang.Class<T> r2, com.badlogic.gdx.utils.JsonValue r3) {
            r1 = this;
            r0 = 0
            java.lang.Object r2 = r1.readValue(r2, r0, r3)
            return r2
    }

    public <T> T readValue(java.lang.Class<T> r22, java.lang.Class r23, com.badlogic.gdx.utils.JsonValue r24) {
            r21 = this;
            r1 = r21
            r0 = r23
            r2 = r24
            java.lang.Class<java.lang.Enum> r3 = java.lang.Enum.class
            java.lang.Class<java.lang.Character> r4 = java.lang.Character.class
            java.lang.Class<java.lang.Byte> r5 = java.lang.Byte.class
            java.lang.Class<java.lang.Short> r6 = java.lang.Short.class
            java.lang.Class<java.lang.Double> r7 = java.lang.Double.class
            java.lang.Class<java.lang.Long> r8 = java.lang.Long.class
            java.lang.Class<java.lang.Boolean> r9 = java.lang.Boolean.class
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            java.lang.Class<java.lang.Integer> r11 = java.lang.Integer.class
            java.lang.Class<java.lang.Float> r12 = java.lang.Float.class
            r13 = 0
            if (r2 != 0) goto L1e
            return r13
        L1e:
            boolean r14 = r24.isObject()
            java.lang.String r15 = ")"
            java.lang.String r13 = " ("
            if (r14 == 0) goto L1d1
            java.lang.String r14 = r1.typeName
            if (r14 != 0) goto L2e
            r14 = 0
            goto L33
        L2e:
            r0 = 0
            java.lang.String r14 = r2.getString(r14, r0)
        L33:
            if (r14 == 0) goto L48
            java.lang.Class r0 = r1.getClass(r14)
            if (r0 != 0) goto L4a
            java.lang.Class r0 = com.badlogic.gdx.utils.reflect.ClassReflection.forName(r14)     // Catch: com.badlogic.gdx.utils.reflect.ReflectionException -> L40
            goto L4a
        L40:
            r0 = move-exception
            r2 = r0
            com.badlogic.gdx.utils.SerializationException r0 = new com.badlogic.gdx.utils.SerializationException
            r0.<init>(r2)
            throw r0
        L48:
            r0 = r22
        L4a:
            if (r0 != 0) goto L56
            com.badlogic.gdx.utils.Json$Serializer r3 = r1.defaultSerializer
            if (r3 == 0) goto L55
            java.lang.Object r0 = r3.read(r1, r2, r0)
            return r0
        L55:
            return r2
        L56:
            java.lang.String r14 = r1.typeName
            if (r14 == 0) goto L92
            java.lang.Class<java.util.Collection> r14 = java.util.Collection.class
            boolean r14 = com.badlogic.gdx.utils.reflect.ClassReflection.isAssignableFrom(r14, r0)
            if (r14 == 0) goto L92
            java.lang.String r14 = "items"
            com.badlogic.gdx.utils.JsonValue r2 = r2.get(r14)
            if (r2 == 0) goto L6e
            r14 = r23
            goto L1d4
        L6e:
            com.badlogic.gdx.utils.SerializationException r3 = new com.badlogic.gdx.utils.SerializationException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Unable to convert object to collection: "
            r4.append(r5)
            r4.append(r2)
            r4.append(r13)
            java.lang.String r0 = r0.getName()
            r4.append(r0)
            r4.append(r15)
            java.lang.String r0 = r4.toString()
            r3.<init>(r0)
            throw r3
        L92:
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Json$Serializer> r13 = r1.classToSerializer
            java.lang.Object r13 = r13.get(r0)
            com.badlogic.gdx.utils.Json$Serializer r13 = (com.badlogic.gdx.utils.Json.Serializer) r13
            if (r13 == 0) goto La1
            java.lang.Object r0 = r13.read(r1, r2, r0)
            return r0
        La1:
            if (r0 == r10) goto L1ca
            if (r0 == r11) goto L1ca
            if (r0 == r9) goto L1ca
            if (r0 == r12) goto L1ca
            if (r0 == r8) goto L1ca
            if (r0 == r7) goto L1ca
            if (r0 == r6) goto L1ca
            if (r0 == r5) goto L1ca
            if (r0 == r4) goto L1ca
            boolean r3 = com.badlogic.gdx.utils.reflect.ClassReflection.isAssignableFrom(r3, r0)
            if (r3 == 0) goto Lbb
            goto L1ca
        Lbb:
            java.lang.Object r0 = r1.newInstance(r0)
            boolean r3 = r0 instanceof com.badlogic.gdx.utils.Json.Serializable
            if (r3 == 0) goto Lca
            r3 = r0
            com.badlogic.gdx.utils.Json$Serializable r3 = (com.badlogic.gdx.utils.Json.Serializable) r3
            r3.read(r1, r2)
            return r0
        Lca:
            boolean r3 = r0 instanceof com.badlogic.gdx.utils.ObjectMap
            if (r3 == 0) goto Le4
            com.badlogic.gdx.utils.ObjectMap r0 = (com.badlogic.gdx.utils.ObjectMap) r0
            com.badlogic.gdx.utils.JsonValue r2 = r2.child
        Ld2:
            if (r2 == 0) goto Le3
            java.lang.String r3 = r2.name
            r14 = r23
            r4 = 0
            java.lang.Object r5 = r1.readValue(r14, r4, r2)
            r0.put(r3, r5)
            com.badlogic.gdx.utils.JsonValue r2 = r2.next
            goto Ld2
        Le3:
            return r0
        Le4:
            r14 = r23
            boolean r3 = r0 instanceof com.badlogic.gdx.utils.ObjectIntMap
            if (r3 == 0) goto L104
            com.badlogic.gdx.utils.ObjectIntMap r0 = (com.badlogic.gdx.utils.ObjectIntMap) r0
            com.badlogic.gdx.utils.JsonValue r2 = r2.child
        Lee:
            if (r2 == 0) goto L103
            java.lang.String r3 = r2.name
            r4 = 0
            java.lang.Object r5 = r1.readValue(r11, r4, r2)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r4 = r5.intValue()
            r0.put(r3, r4)
            com.badlogic.gdx.utils.JsonValue r2 = r2.next
            goto Lee
        L103:
            return r0
        L104:
            boolean r3 = r0 instanceof com.badlogic.gdx.utils.ObjectFloatMap
            if (r3 == 0) goto L122
            com.badlogic.gdx.utils.ObjectFloatMap r0 = (com.badlogic.gdx.utils.ObjectFloatMap) r0
            com.badlogic.gdx.utils.JsonValue r2 = r2.child
        L10c:
            if (r2 == 0) goto L121
            java.lang.String r3 = r2.name
            r4 = 0
            java.lang.Object r5 = r1.readValue(r12, r4, r2)
            java.lang.Float r5 = (java.lang.Float) r5
            float r4 = r5.floatValue()
            r0.put(r3, r4)
            com.badlogic.gdx.utils.JsonValue r2 = r2.next
            goto L10c
        L121:
            return r0
        L122:
            boolean r3 = r0 instanceof com.badlogic.gdx.utils.ObjectSet
            java.lang.String r4 = "values"
            if (r3 == 0) goto L13c
            com.badlogic.gdx.utils.ObjectSet r0 = (com.badlogic.gdx.utils.ObjectSet) r0
            com.badlogic.gdx.utils.JsonValue r2 = r2.getChild(r4)
        L12e:
            if (r2 == 0) goto L13b
            r3 = 0
            java.lang.Object r4 = r1.readValue(r14, r3, r2)
            r0.add(r4)
            com.badlogic.gdx.utils.JsonValue r2 = r2.next
            goto L12e
        L13b:
            return r0
        L13c:
            boolean r3 = r0 instanceof com.badlogic.gdx.utils.IntMap
            if (r3 == 0) goto L158
            com.badlogic.gdx.utils.IntMap r0 = (com.badlogic.gdx.utils.IntMap) r0
            com.badlogic.gdx.utils.JsonValue r2 = r2.child
        L144:
            if (r2 == 0) goto L157
            java.lang.String r3 = r2.name
            int r3 = java.lang.Integer.parseInt(r3)
            r4 = 0
            java.lang.Object r5 = r1.readValue(r14, r4, r2)
            r0.put(r3, r5)
            com.badlogic.gdx.utils.JsonValue r2 = r2.next
            goto L144
        L157:
            return r0
        L158:
            boolean r3 = r0 instanceof com.badlogic.gdx.utils.LongMap
            if (r3 == 0) goto L174
            com.badlogic.gdx.utils.LongMap r0 = (com.badlogic.gdx.utils.LongMap) r0
            com.badlogic.gdx.utils.JsonValue r2 = r2.child
        L160:
            if (r2 == 0) goto L173
            java.lang.String r3 = r2.name
            long r3 = java.lang.Long.parseLong(r3)
            r5 = 0
            java.lang.Object r6 = r1.readValue(r14, r5, r2)
            r0.put(r3, r6)
            com.badlogic.gdx.utils.JsonValue r2 = r2.next
            goto L160
        L173:
            return r0
        L174:
            boolean r3 = r0 instanceof com.badlogic.gdx.utils.IntSet
            if (r3 == 0) goto L18b
            com.badlogic.gdx.utils.IntSet r0 = (com.badlogic.gdx.utils.IntSet) r0
            com.badlogic.gdx.utils.JsonValue r2 = r2.getChild(r4)
        L17e:
            if (r2 == 0) goto L18a
            int r3 = r2.asInt()
            r0.add(r3)
            com.badlogic.gdx.utils.JsonValue r2 = r2.next
            goto L17e
        L18a:
            return r0
        L18b:
            boolean r3 = r0 instanceof com.badlogic.gdx.utils.ArrayMap
            if (r3 == 0) goto L1a3
            com.badlogic.gdx.utils.ArrayMap r0 = (com.badlogic.gdx.utils.ArrayMap) r0
            com.badlogic.gdx.utils.JsonValue r2 = r2.child
        L193:
            if (r2 == 0) goto L1a2
            java.lang.String r3 = r2.name
            r4 = 0
            java.lang.Object r5 = r1.readValue(r14, r4, r2)
            r0.put(r3, r5)
            com.badlogic.gdx.utils.JsonValue r2 = r2.next
            goto L193
        L1a2:
            return r0
        L1a3:
            boolean r3 = r0 instanceof java.util.Map
            if (r3 == 0) goto L1c6
            java.util.Map r0 = (java.util.Map) r0
            com.badlogic.gdx.utils.JsonValue r2 = r2.child
        L1ab:
            if (r2 == 0) goto L1c5
            java.lang.String r3 = r2.name
            java.lang.String r4 = r1.typeName
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L1b8
            goto L1c2
        L1b8:
            java.lang.String r3 = r2.name
            r4 = 0
            java.lang.Object r5 = r1.readValue(r14, r4, r2)
            r0.put(r3, r5)
        L1c2:
            com.badlogic.gdx.utils.JsonValue r2 = r2.next
            goto L1ab
        L1c5:
            return r0
        L1c6:
            r1.readFields(r0, r2)
            return r0
        L1ca:
            java.lang.String r3 = "value"
            java.lang.Object r0 = r1.readValue(r3, r0, r2)
            return r0
        L1d1:
            r14 = r0
            r0 = r22
        L1d4:
            r16 = r3
            if (r0 == 0) goto L1fa
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Json$Serializer> r3 = r1.classToSerializer
            java.lang.Object r3 = r3.get(r0)
            com.badlogic.gdx.utils.Json$Serializer r3 = (com.badlogic.gdx.utils.Json.Serializer) r3
            if (r3 == 0) goto L1e7
            java.lang.Object r0 = r3.read(r1, r2, r0)
            return r0
        L1e7:
            java.lang.Class<com.badlogic.gdx.utils.Json$Serializable> r3 = com.badlogic.gdx.utils.Json.Serializable.class
            boolean r3 = com.badlogic.gdx.utils.reflect.ClassReflection.isAssignableFrom(r3, r0)
            if (r3 == 0) goto L1fa
            java.lang.Object r0 = r1.newInstance(r0)
            r3 = r0
            com.badlogic.gdx.utils.Json$Serializable r3 = (com.badlogic.gdx.utils.Json.Serializable) r3
            r3.read(r1, r2)
            return r0
        L1fa:
            boolean r3 = r2.isArray()
            r17 = r4
            java.lang.String r4 = "Unable to convert value to required type: "
            r18 = r9
            r9 = 0
            if (r3 == 0) goto L2d1
            if (r0 == 0) goto L20d
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            if (r0 != r3) goto L20f
        L20d:
            java.lang.Class<com.badlogic.gdx.utils.Array> r0 = com.badlogic.gdx.utils.Array.class
        L20f:
            java.lang.Class<com.badlogic.gdx.utils.Array> r3 = com.badlogic.gdx.utils.Array.class
            boolean r3 = com.badlogic.gdx.utils.reflect.ClassReflection.isAssignableFrom(r3, r0)
            if (r3 == 0) goto L237
            java.lang.Class<com.badlogic.gdx.utils.Array> r3 = com.badlogic.gdx.utils.Array.class
            if (r0 != r3) goto L221
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            goto L227
        L221:
            java.lang.Object r0 = r1.newInstance(r0)
            com.badlogic.gdx.utils.Array r0 = (com.badlogic.gdx.utils.Array) r0
        L227:
            com.badlogic.gdx.utils.JsonValue r2 = r2.child
        L229:
            if (r2 == 0) goto L236
            r3 = 0
            java.lang.Object r4 = r1.readValue(r14, r3, r2)
            r0.add(r4)
            com.badlogic.gdx.utils.JsonValue r2 = r2.next
            goto L229
        L236:
            return r0
        L237:
            java.lang.Class<com.badlogic.gdx.utils.Queue> r3 = com.badlogic.gdx.utils.Queue.class
            boolean r3 = com.badlogic.gdx.utils.reflect.ClassReflection.isAssignableFrom(r3, r0)
            if (r3 == 0) goto L25f
            java.lang.Class<com.badlogic.gdx.utils.Queue> r3 = com.badlogic.gdx.utils.Queue.class
            if (r0 != r3) goto L249
            com.badlogic.gdx.utils.Queue r0 = new com.badlogic.gdx.utils.Queue
            r0.<init>()
            goto L24f
        L249:
            java.lang.Object r0 = r1.newInstance(r0)
            com.badlogic.gdx.utils.Queue r0 = (com.badlogic.gdx.utils.Queue) r0
        L24f:
            com.badlogic.gdx.utils.JsonValue r2 = r2.child
        L251:
            if (r2 == 0) goto L25e
            r3 = 0
            java.lang.Object r4 = r1.readValue(r14, r3, r2)
            r0.addLast(r4)
            com.badlogic.gdx.utils.JsonValue r2 = r2.next
            goto L251
        L25e:
            return r0
        L25f:
            java.lang.Class<java.util.Collection> r3 = java.util.Collection.class
            boolean r3 = com.badlogic.gdx.utils.reflect.ClassReflection.isAssignableFrom(r3, r0)
            if (r3 == 0) goto L289
            boolean r3 = r0.isInterface()
            if (r3 == 0) goto L273
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            goto L279
        L273:
            java.lang.Object r0 = r1.newInstance(r0)
            java.util.Collection r0 = (java.util.Collection) r0
        L279:
            com.badlogic.gdx.utils.JsonValue r2 = r2.child
        L27b:
            if (r2 == 0) goto L288
            r3 = 0
            java.lang.Object r4 = r1.readValue(r14, r3, r2)
            r0.add(r4)
            com.badlogic.gdx.utils.JsonValue r2 = r2.next
            goto L27b
        L288:
            return r0
        L289:
            boolean r3 = r0.isArray()
            if (r3 == 0) goto L2af
            java.lang.Class r0 = r0.getComponentType()
            if (r14 != 0) goto L296
            r14 = r0
        L296:
            int r3 = r2.size
            java.lang.Object r0 = com.badlogic.gdx.utils.reflect.ArrayReflection.newInstance(r0, r3)
            com.badlogic.gdx.utils.JsonValue r2 = r2.child
        L29e:
            if (r2 == 0) goto L2ae
            int r3 = r9 + 1
            r4 = 0
            java.lang.Object r5 = r1.readValue(r14, r4, r2)
            com.badlogic.gdx.utils.reflect.ArrayReflection.set(r0, r9, r5)
            com.badlogic.gdx.utils.JsonValue r2 = r2.next
            r9 = r3
            goto L29e
        L2ae:
            return r0
        L2af:
            com.badlogic.gdx.utils.SerializationException r3 = new com.badlogic.gdx.utils.SerializationException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            r5.append(r2)
            r5.append(r13)
            java.lang.String r0 = r0.getName()
            r5.append(r0)
            r5.append(r15)
            java.lang.String r0 = r5.toString()
            r3.<init>(r0)
            throw r3
        L2d1:
            boolean r3 = r2.isNumber()
            if (r3 == 0) goto L349
            if (r0 == 0) goto L336
            java.lang.Class r3 = java.lang.Float.TYPE     // Catch: java.lang.NumberFormatException -> L33f
            if (r0 == r3) goto L336
            if (r0 != r12) goto L2e0
            goto L336
        L2e0:
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch: java.lang.NumberFormatException -> L33f
            if (r0 == r3) goto L32d
            if (r0 != r11) goto L2e7
            goto L32d
        L2e7:
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch: java.lang.NumberFormatException -> L33f
            if (r0 == r3) goto L324
            if (r0 != r8) goto L2ee
            goto L324
        L2ee:
            java.lang.Class r3 = java.lang.Double.TYPE     // Catch: java.lang.NumberFormatException -> L33f
            if (r0 == r3) goto L31b
            if (r0 != r7) goto L2f5
            goto L31b
        L2f5:
            if (r0 != r10) goto L2fc
            java.lang.String r0 = r2.asString()     // Catch: java.lang.NumberFormatException -> L33f
            return r0
        L2fc:
            java.lang.Class r3 = java.lang.Short.TYPE     // Catch: java.lang.NumberFormatException -> L33f
            if (r0 == r3) goto L312
            if (r0 != r6) goto L303
            goto L312
        L303:
            java.lang.Class r3 = java.lang.Byte.TYPE     // Catch: java.lang.NumberFormatException -> L33f
            if (r0 == r3) goto L309
            if (r0 != r5) goto L33f
        L309:
            byte r3 = r2.asByte()     // Catch: java.lang.NumberFormatException -> L33f
            java.lang.Byte r0 = java.lang.Byte.valueOf(r3)     // Catch: java.lang.NumberFormatException -> L33f
            return r0
        L312:
            short r3 = r2.asShort()     // Catch: java.lang.NumberFormatException -> L33f
            java.lang.Short r0 = java.lang.Short.valueOf(r3)     // Catch: java.lang.NumberFormatException -> L33f
            return r0
        L31b:
            double r19 = r2.asDouble()     // Catch: java.lang.NumberFormatException -> L33f
            java.lang.Double r0 = java.lang.Double.valueOf(r19)     // Catch: java.lang.NumberFormatException -> L33f
            return r0
        L324:
            long r19 = r2.asLong()     // Catch: java.lang.NumberFormatException -> L33f
            java.lang.Long r0 = java.lang.Long.valueOf(r19)     // Catch: java.lang.NumberFormatException -> L33f
            return r0
        L32d:
            int r3 = r2.asInt()     // Catch: java.lang.NumberFormatException -> L33f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.NumberFormatException -> L33f
            return r0
        L336:
            float r3 = r2.asFloat()     // Catch: java.lang.NumberFormatException -> L33f
            java.lang.Float r0 = java.lang.Float.valueOf(r3)     // Catch: java.lang.NumberFormatException -> L33f
            return r0
        L33f:
            com.badlogic.gdx.utils.JsonValue r3 = new com.badlogic.gdx.utils.JsonValue
            java.lang.String r2 = r2.asString()
            r3.<init>(r2)
            r2 = r3
        L349:
            boolean r3 = r2.isBoolean()
            if (r3 == 0) goto L373
            if (r0 == 0) goto L35d
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.NumberFormatException -> L35a
            if (r0 == r3) goto L35d
            r3 = r18
            if (r0 != r3) goto L368
            goto L35f
        L35a:
            r3 = r18
            goto L368
        L35d:
            r3 = r18
        L35f:
            boolean r14 = r2.asBoolean()     // Catch: java.lang.NumberFormatException -> L368
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r14)     // Catch: java.lang.NumberFormatException -> L368
            return r0
        L368:
            com.badlogic.gdx.utils.JsonValue r14 = new com.badlogic.gdx.utils.JsonValue
            java.lang.String r2 = r2.asString()
            r14.<init>(r2)
            r2 = r14
            goto L375
        L373:
            r3 = r18
        L375:
            boolean r14 = r2.isString()
            if (r14 == 0) goto L434
            java.lang.String r14 = r2.asString()
            if (r0 == 0) goto L433
            if (r0 != r10) goto L385
            goto L433
        L385:
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch: java.lang.NumberFormatException -> L3cc
            if (r0 == r10) goto L3c7
            if (r0 != r11) goto L38c
            goto L3c7
        L38c:
            java.lang.Class r10 = java.lang.Float.TYPE     // Catch: java.lang.NumberFormatException -> L3cc
            if (r0 == r10) goto L3c2
            if (r0 != r12) goto L393
            goto L3c2
        L393:
            java.lang.Class r10 = java.lang.Long.TYPE     // Catch: java.lang.NumberFormatException -> L3cc
            if (r0 == r10) goto L3bd
            if (r0 != r8) goto L39a
            goto L3bd
        L39a:
            java.lang.Class r8 = java.lang.Double.TYPE     // Catch: java.lang.NumberFormatException -> L3cc
            if (r0 == r8) goto L3b8
            if (r0 != r7) goto L3a1
            goto L3b8
        L3a1:
            java.lang.Class r7 = java.lang.Short.TYPE     // Catch: java.lang.NumberFormatException -> L3cc
            if (r0 == r7) goto L3b3
            if (r0 != r6) goto L3a8
            goto L3b3
        L3a8:
            java.lang.Class r6 = java.lang.Byte.TYPE     // Catch: java.lang.NumberFormatException -> L3cc
            if (r0 == r6) goto L3ae
            if (r0 != r5) goto L3cd
        L3ae:
            java.lang.Byte r0 = java.lang.Byte.valueOf(r14)     // Catch: java.lang.NumberFormatException -> L3cc
            return r0
        L3b3:
            java.lang.Short r0 = java.lang.Short.valueOf(r14)     // Catch: java.lang.NumberFormatException -> L3cc
            return r0
        L3b8:
            java.lang.Double r0 = java.lang.Double.valueOf(r14)     // Catch: java.lang.NumberFormatException -> L3cc
            return r0
        L3bd:
            java.lang.Long r0 = java.lang.Long.valueOf(r14)     // Catch: java.lang.NumberFormatException -> L3cc
            return r0
        L3c2:
            java.lang.Float r0 = java.lang.Float.valueOf(r14)     // Catch: java.lang.NumberFormatException -> L3cc
            return r0
        L3c7:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)     // Catch: java.lang.NumberFormatException -> L3cc
            return r0
        L3cc:
        L3cd:
            java.lang.Class r5 = java.lang.Boolean.TYPE
            if (r0 == r5) goto L42e
            if (r0 != r3) goto L3d4
            goto L42e
        L3d4:
            java.lang.Class r3 = java.lang.Character.TYPE
            if (r0 == r3) goto L425
            r3 = r17
            if (r0 != r3) goto L3dd
            goto L425
        L3dd:
            r3 = r16
            boolean r3 = com.badlogic.gdx.utils.reflect.ClassReflection.isAssignableFrom(r3, r0)
            if (r3 == 0) goto L3fe
            java.lang.Object[] r3 = r0.getEnumConstants()
            java.lang.Enum[] r3 = (java.lang.Enum[]) r3
            int r5 = r3.length
        L3ec:
            if (r9 >= r5) goto L3fe
            r6 = r3[r9]
            java.lang.String r7 = r1.convertToString(r6)
            boolean r7 = r14.equals(r7)
            if (r7 == 0) goto L3fb
            return r6
        L3fb:
            int r9 = r9 + 1
            goto L3ec
        L3fe:
            java.lang.Class<java.lang.CharSequence> r3 = java.lang.CharSequence.class
            if (r0 != r3) goto L403
            return r14
        L403:
            com.badlogic.gdx.utils.SerializationException r3 = new com.badlogic.gdx.utils.SerializationException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            r5.append(r2)
            r5.append(r13)
            java.lang.String r0 = r0.getName()
            r5.append(r0)
            r5.append(r15)
            java.lang.String r0 = r5.toString()
            r3.<init>(r0)
            throw r3
        L425:
            char r0 = r14.charAt(r9)
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            return r0
        L42e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r14)
            return r0
        L433:
            return r14
        L434:
            r0 = 0
            return r0
    }

    public <T> T readValue(java.lang.String r1, java.lang.Class<T> r2, com.badlogic.gdx.utils.JsonValue r3) {
            r0 = this;
            com.badlogic.gdx.utils.JsonValue r1 = r3.get(r1)
            r3 = 0
            java.lang.Object r1 = r0.readValue(r2, r3, r1)
            return r1
    }

    public <T> T readValue(java.lang.String r1, java.lang.Class<T> r2, java.lang.Class r3, com.badlogic.gdx.utils.JsonValue r4) {
            r0 = this;
            com.badlogic.gdx.utils.JsonValue r1 = r4.get(r1)
            java.lang.Object r1 = r0.readValue(r2, r3, r1)
            return r1
    }

    public <T> T readValue(java.lang.String r1, java.lang.Class<T> r2, T r3, com.badlogic.gdx.utils.JsonValue r4) {
            r0 = this;
            com.badlogic.gdx.utils.JsonValue r1 = r4.get(r1)
            if (r1 != 0) goto L7
            return r3
        L7:
            r3 = 0
            java.lang.Object r1 = r0.readValue(r2, r3, r1)
            return r1
    }

    public <T> void setSerializer(java.lang.Class<T> r2, com.badlogic.gdx.utils.Json.Serializer<T> r3) {
            r1 = this;
            com.badlogic.gdx.utils.ObjectMap<java.lang.Class, com.badlogic.gdx.utils.Json$Serializer> r0 = r1.classToSerializer
            r0.put(r2, r3)
            return
    }

    public void setTypeName(java.lang.String r1) {
            r0 = this;
            r0.typeName = r1
            return
    }

    public void setUsePrototypes(boolean r1) {
            r0 = this;
            r0.usePrototypes = r1
            return
    }

    protected void sortFields(java.lang.Class r1, com.badlogic.gdx.utils.Array<java.lang.String> r2) {
            r0 = this;
            boolean r1 = r0.sortFields
            if (r1 == 0) goto L7
            r2.sort()
        L7:
            return
    }
}
