package org.apache.commons.lang3;

/* loaded from: classes2.dex */
public class ClassUtils {
    public static final java.lang.String INNER_CLASS_SEPARATOR = null;
    public static final char INNER_CLASS_SEPARATOR_CHAR = '$';
    public static final java.lang.String PACKAGE_SEPARATOR = null;
    public static final char PACKAGE_SEPARATOR_CHAR = '.';
    private static final java.util.Map<java.lang.String, java.lang.String> abbreviationMap = null;
    private static final java.util.Map<java.lang.String, java.lang.Class<?>> namePrimitiveMap = null;
    private static final java.util.Map<java.lang.Class<?>, java.lang.Class<?>> primitiveWrapperMap = null;
    private static final java.util.Map<java.lang.String, java.lang.String> reverseAbbreviationMap = null;
    private static final java.util.Map<java.lang.Class<?>, java.lang.Class<?>> wrapperPrimitiveMap = null;



    public enum Interfaces extends java.lang.Enum<org.apache.commons.lang3.ClassUtils.Interfaces> {
        private static final /* synthetic */ org.apache.commons.lang3.ClassUtils.Interfaces[] $VALUES = null;
        public static final org.apache.commons.lang3.ClassUtils.Interfaces EXCLUDE = null;
        public static final org.apache.commons.lang3.ClassUtils.Interfaces INCLUDE = null;

        static {
                org.apache.commons.lang3.ClassUtils$Interfaces r0 = new org.apache.commons.lang3.ClassUtils$Interfaces
                java.lang.String r1 = "INCLUDE"
                r2 = 0
                r0.<init>(r1, r2)
                org.apache.commons.lang3.ClassUtils.Interfaces.INCLUDE = r0
                org.apache.commons.lang3.ClassUtils$Interfaces r1 = new org.apache.commons.lang3.ClassUtils$Interfaces
                java.lang.String r3 = "EXCLUDE"
                r4 = 1
                r1.<init>(r3, r4)
                org.apache.commons.lang3.ClassUtils.Interfaces.EXCLUDE = r1
                r3 = 2
                org.apache.commons.lang3.ClassUtils$Interfaces[] r3 = new org.apache.commons.lang3.ClassUtils.Interfaces[r3]
                r3[r2] = r0
                r3[r4] = r1
                org.apache.commons.lang3.ClassUtils.Interfaces.$VALUES = r3
                return
        }

        Interfaces(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.apache.commons.lang3.ClassUtils.Interfaces valueOf(java.lang.String r1) {
                java.lang.Class<org.apache.commons.lang3.ClassUtils$Interfaces> r0 = org.apache.commons.lang3.ClassUtils.Interfaces.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.apache.commons.lang3.ClassUtils$Interfaces r1 = (org.apache.commons.lang3.ClassUtils.Interfaces) r1
                return r1
        }

        public static org.apache.commons.lang3.ClassUtils.Interfaces[] values() {
                org.apache.commons.lang3.ClassUtils$Interfaces[] r0 = org.apache.commons.lang3.ClassUtils.Interfaces.$VALUES
                java.lang.Object r0 = r0.clone()
                org.apache.commons.lang3.ClassUtils$Interfaces[] r0 = (org.apache.commons.lang3.ClassUtils.Interfaces[]) r0
                return r0
        }
    }

    static {
            r0 = 46
            java.lang.String r0 = java.lang.String.valueOf(r0)
            org.apache.commons.lang3.ClassUtils.PACKAGE_SEPARATOR = r0
            r0 = 36
            java.lang.String r0 = java.lang.String.valueOf(r0)
            org.apache.commons.lang3.ClassUtils.INNER_CLASS_SEPARATOR = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            org.apache.commons.lang3.ClassUtils.namePrimitiveMap = r0
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.String r2 = "boolean"
            r0.put(r2, r1)
            java.lang.Class r3 = java.lang.Byte.TYPE
            java.lang.String r4 = "byte"
            r0.put(r4, r3)
            java.lang.Class r3 = java.lang.Character.TYPE
            java.lang.String r5 = "char"
            r0.put(r5, r3)
            java.lang.Class r3 = java.lang.Short.TYPE
            java.lang.String r6 = "short"
            r0.put(r6, r3)
            java.lang.Class r3 = java.lang.Integer.TYPE
            java.lang.String r7 = "int"
            r0.put(r7, r3)
            java.lang.Class r8 = java.lang.Long.TYPE
            java.lang.String r9 = "long"
            r0.put(r9, r8)
            java.lang.Class r10 = java.lang.Double.TYPE
            java.lang.String r11 = "double"
            r0.put(r11, r10)
            java.lang.Class r10 = java.lang.Float.TYPE
            java.lang.String r12 = "float"
            r0.put(r12, r10)
            java.lang.Class r13 = java.lang.Void.TYPE
            java.lang.String r14 = "void"
            r0.put(r14, r13)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            org.apache.commons.lang3.ClassUtils.primitiveWrapperMap = r0
            java.lang.Class<java.lang.Boolean> r13 = java.lang.Boolean.class
            r0.put(r1, r13)
            java.lang.Class r1 = java.lang.Byte.TYPE
            java.lang.Class<java.lang.Byte> r13 = java.lang.Byte.class
            r0.put(r1, r13)
            java.lang.Class r1 = java.lang.Character.TYPE
            java.lang.Class<java.lang.Character> r13 = java.lang.Character.class
            r0.put(r1, r13)
            java.lang.Class r1 = java.lang.Short.TYPE
            java.lang.Class<java.lang.Short> r13 = java.lang.Short.class
            r0.put(r1, r13)
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            r0.put(r3, r1)
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            r0.put(r8, r1)
            java.lang.Class r1 = java.lang.Double.TYPE
            java.lang.Class<java.lang.Double> r3 = java.lang.Double.class
            r0.put(r1, r3)
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            r0.put(r10, r1)
            java.lang.Class r1 = java.lang.Void.TYPE
            r0.put(r1, r1)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            org.apache.commons.lang3.ClassUtils.wrapperPrimitiveMap = r1
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        La1:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lc5
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r1.getKey()
            java.lang.Class r3 = (java.lang.Class) r3
            java.lang.Object r1 = r1.getValue()
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r8 = r3.equals(r1)
            if (r8 != 0) goto La1
            java.util.Map<java.lang.Class<?>, java.lang.Class<?>> r8 = org.apache.commons.lang3.ClassUtils.wrapperPrimitiveMap
            r8.put(r1, r3)
            goto La1
        Lc5:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "I"
            r0.put(r7, r1)
            java.lang.String r1 = "Z"
            r0.put(r2, r1)
            java.lang.String r1 = "F"
            r0.put(r12, r1)
            java.lang.String r1 = "J"
            r0.put(r9, r1)
            java.lang.String r1 = "S"
            r0.put(r6, r1)
            java.lang.String r1 = "B"
            r0.put(r4, r1)
            java.lang.String r1 = "D"
            r0.put(r11, r1)
            java.lang.String r1 = "C"
            r0.put(r5, r1)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Set r2 = r0.entrySet()
            java.util.Iterator r2 = r2.iterator()
        Lff:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L11b
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getValue()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getKey()
            java.lang.String r3 = (java.lang.String) r3
            r1.put(r4, r3)
            goto Lff
        L11b:
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            org.apache.commons.lang3.ClassUtils.abbreviationMap = r0
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r1)
            org.apache.commons.lang3.ClassUtils.reverseAbbreviationMap = r0
            return
    }

    public ClassUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.List<java.lang.Class<?>> convertClassNamesToClasses(java.util.List<java.lang.String> r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r3.size()
            r1.<init>(r2)
            java.util.Iterator r3 = r3.iterator()
        L11:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r3.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Exception -> L25
            r1.add(r2)     // Catch: java.lang.Exception -> L25
            goto L11
        L25:
            r1.add(r0)
            goto L11
        L29:
            return r1
    }

    public static java.util.List<java.lang.String> convertClassesToClassNames(java.util.List<java.lang.Class<?>> r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r3.size()
            r1.<init>(r2)
            java.util.Iterator r3 = r3.iterator()
        L11:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r3.next()
            java.lang.Class r2 = (java.lang.Class) r2
            if (r2 != 0) goto L23
            r1.add(r0)
            goto L11
        L23:
            java.lang.String r2 = r2.getName()
            r1.add(r2)
            goto L11
        L2b:
            return r1
    }

    public static java.lang.String getAbbreviatedName(java.lang.Class<?> r0, int r1) {
            if (r0 != 0) goto L5
            java.lang.String r0 = ""
            return r0
        L5:
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = getAbbreviatedName(r0, r1)
            return r0
    }

    public static java.lang.String getAbbreviatedName(java.lang.String r8, int r9) {
            if (r9 <= 0) goto L49
            if (r8 != 0) goto L7
            java.lang.String r8 = ""
            return r8
        L7:
            r0 = 46
            int r1 = org.apache.commons.lang3.StringUtils.countMatches(r8, r0)
            int r2 = r1 + 1
            java.lang.String[] r2 = new java.lang.String[r2]
            int r3 = r8.length()
            r4 = 1
            int r3 = r3 - r4
            r5 = r1
        L18:
            if (r5 < 0) goto L44
            int r6 = r8.lastIndexOf(r0, r3)
            int r7 = r6 + 1
            int r3 = r3 + r4
            java.lang.String r3 = r8.substring(r7, r3)
            int r7 = r3.length()
            int r9 = r9 - r7
            if (r5 <= 0) goto L2e
            int r9 = r9 + (-1)
        L2e:
            if (r5 != r1) goto L33
            r2[r5] = r3
            goto L3f
        L33:
            if (r9 <= 0) goto L38
            r2[r5] = r3
            goto L3f
        L38:
            r7 = 0
            java.lang.String r3 = r3.substring(r7, r4)
            r2[r5] = r3
        L3f:
            int r3 = r6 + (-1)
            int r5 = r5 + (-1)
            goto L18
        L44:
            java.lang.String r8 = org.apache.commons.lang3.StringUtils.join(r2, r0)
            return r8
        L49:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "len must be > 0"
            r8.<init>(r9)
            throw r8
    }

    public static java.util.List<java.lang.Class<?>> getAllInterfaces(java.lang.Class<?> r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            getAllInterfaces(r1, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            return r1
    }

    private static void getAllInterfaces(java.lang.Class<?> r5, java.util.HashSet<java.lang.Class<?>> r6) {
        L0:
            if (r5 == 0) goto L1d
            java.lang.Class[] r0 = r5.getInterfaces()
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L18
            r3 = r0[r2]
            boolean r4 = r6.add(r3)
            if (r4 == 0) goto L15
            getAllInterfaces(r3, r6)
        L15:
            int r2 = r2 + 1
            goto L8
        L18:
            java.lang.Class r5 = r5.getSuperclass()
            goto L0
        L1d:
            return
    }

    public static java.util.List<java.lang.Class<?>> getAllSuperclasses(java.lang.Class<?> r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Class r1 = r1.getSuperclass()
        Ld:
            if (r1 == 0) goto L17
            r0.add(r1)
            java.lang.Class r1 = r1.getSuperclass()
            goto Ld
        L17:
            return r0
    }

    public static java.lang.String getCanonicalName(java.lang.Class<?> r1) {
            java.lang.String r0 = ""
            java.lang.String r1 = getCanonicalName(r1, r0)
            return r1
    }

    public static java.lang.String getCanonicalName(java.lang.Class<?> r0, java.lang.String r1) {
            if (r0 != 0) goto L3
            return r1
        L3:
            java.lang.String r0 = r0.getCanonicalName()
            if (r0 != 0) goto La
            goto Lb
        La:
            r1 = r0
        Lb:
            return r1
    }

    public static java.lang.String getCanonicalName(java.lang.Object r1) {
            java.lang.String r0 = ""
            java.lang.String r1 = getCanonicalName(r1, r0)
            return r1
    }

    public static java.lang.String getCanonicalName(java.lang.Object r0, java.lang.String r1) {
            if (r0 != 0) goto L3
            return r1
        L3:
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getCanonicalName()
            if (r0 != 0) goto Le
            goto Lf
        Le:
            r1 = r0
        Lf:
            return r1
    }

    private static java.lang.String getCanonicalName(java.lang.String r4) {
            java.lang.String r4 = org.apache.commons.lang3.StringUtils.deleteWhitespace(r4)
            if (r4 != 0) goto L8
            r4 = 0
            return r4
        L8:
            r0 = 0
            r1 = 0
        La:
            java.lang.String r2 = "["
            boolean r2 = r4.startsWith(r2)
            r3 = 1
            if (r2 == 0) goto L1a
            int r1 = r1 + 1
            java.lang.String r4 = r4.substring(r3)
            goto La
        L1a:
            if (r1 >= r3) goto L1d
            return r4
        L1d:
            java.lang.String r2 = "L"
            boolean r2 = r4.startsWith(r2)
            if (r2 == 0) goto L3c
            java.lang.String r2 = ";"
            boolean r2 = r4.endsWith(r2)
            if (r2 == 0) goto L33
            int r2 = r4.length()
            int r2 = r2 - r3
            goto L37
        L33:
            int r2 = r4.length()
        L37:
            java.lang.String r4 = r4.substring(r3, r2)
            goto L4e
        L3c:
            boolean r2 = r4.isEmpty()
            if (r2 != 0) goto L4e
            java.util.Map<java.lang.String, java.lang.String> r2 = org.apache.commons.lang3.ClassUtils.reverseAbbreviationMap
            java.lang.String r4 = r4.substring(r0, r3)
            java.lang.Object r4 = r2.get(r4)
            java.lang.String r4 = (java.lang.String) r4
        L4e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r4)
        L53:
            if (r0 >= r1) goto L5d
            java.lang.String r4 = "[]"
            r2.append(r4)
            int r0 = r0 + 1
            goto L53
        L5d:
            java.lang.String r4 = r2.toString()
            return r4
    }

    public static java.lang.Class<?> getClass(java.lang.ClassLoader r1, java.lang.String r2) throws java.lang.ClassNotFoundException {
            r0 = 1
            java.lang.Class r1 = getClass(r1, r2, r0)
            return r1
    }

    public static java.lang.Class<?> getClass(java.lang.ClassLoader r4, java.lang.String r5, boolean r6) throws java.lang.ClassNotFoundException {
            java.util.Map<java.lang.String, java.lang.Class<?>> r0 = org.apache.commons.lang3.ClassUtils.namePrimitiveMap     // Catch: java.lang.ClassNotFoundException -> L18
            boolean r1 = r0.containsKey(r5)     // Catch: java.lang.ClassNotFoundException -> L18
            if (r1 == 0) goto Lf
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.ClassNotFoundException -> L18
            java.lang.Class r0 = (java.lang.Class) r0     // Catch: java.lang.ClassNotFoundException -> L18
            goto L17
        Lf:
            java.lang.String r0 = toCanonicalName(r5)     // Catch: java.lang.ClassNotFoundException -> L18
            java.lang.Class r0 = java.lang.Class.forName(r0, r6, r4)     // Catch: java.lang.ClassNotFoundException -> L18
        L17:
            return r0
        L18:
            r0 = move-exception
            r1 = 46
            int r1 = r5.lastIndexOf(r1)
            r2 = -1
            if (r1 == r2) goto L46
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.ClassNotFoundException -> L46
            r2.<init>()     // Catch: java.lang.ClassNotFoundException -> L46
            r3 = 0
            java.lang.String r3 = r5.substring(r3, r1)     // Catch: java.lang.ClassNotFoundException -> L46
            r2.append(r3)     // Catch: java.lang.ClassNotFoundException -> L46
            r3 = 36
            r2.append(r3)     // Catch: java.lang.ClassNotFoundException -> L46
            int r1 = r1 + 1
            java.lang.String r5 = r5.substring(r1)     // Catch: java.lang.ClassNotFoundException -> L46
            r2.append(r5)     // Catch: java.lang.ClassNotFoundException -> L46
            java.lang.String r5 = r2.toString()     // Catch: java.lang.ClassNotFoundException -> L46
            java.lang.Class r4 = getClass(r4, r5, r6)     // Catch: java.lang.ClassNotFoundException -> L46
            return r4
        L46:
            throw r0
    }

    public static java.lang.Class<?> getClass(java.lang.String r1) throws java.lang.ClassNotFoundException {
            r0 = 1
            java.lang.Class r1 = getClass(r1, r0)
            return r1
    }

    public static java.lang.Class<?> getClass(java.lang.String r1, boolean r2) throws java.lang.ClassNotFoundException {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r0 = r0.getContextClassLoader()
            if (r0 != 0) goto L10
            java.lang.Class<org.apache.commons.lang3.ClassUtils> r0 = org.apache.commons.lang3.ClassUtils.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
        L10:
            java.lang.Class r1 = getClass(r0, r1, r2)
            return r1
    }

    public static java.lang.String getName(java.lang.Class<?> r1) {
            java.lang.String r0 = ""
            java.lang.String r1 = getName(r1, r0)
            return r1
    }

    public static java.lang.String getName(java.lang.Class<?> r0, java.lang.String r1) {
            if (r0 != 0) goto L3
            goto L7
        L3:
            java.lang.String r1 = r0.getName()
        L7:
            return r1
    }

    public static java.lang.String getName(java.lang.Object r1) {
            java.lang.String r0 = ""
            java.lang.String r1 = getName(r1, r0)
            return r1
    }

    public static java.lang.String getName(java.lang.Object r0, java.lang.String r1) {
            if (r0 != 0) goto L3
            goto Lb
        L3:
            java.lang.Class r0 = r0.getClass()
            java.lang.String r1 = r0.getName()
        Lb:
            return r1
    }

    public static java.lang.String getPackageCanonicalName(java.lang.Class<?> r0) {
            if (r0 != 0) goto L5
            java.lang.String r0 = ""
            return r0
        L5:
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = getPackageCanonicalName(r0)
            return r0
    }

    public static java.lang.String getPackageCanonicalName(java.lang.Object r0, java.lang.String r1) {
            if (r0 != 0) goto L3
            return r1
        L3:
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = getPackageCanonicalName(r0)
            return r0
    }

    public static java.lang.String getPackageCanonicalName(java.lang.String r0) {
            java.lang.String r0 = getCanonicalName(r0)
            java.lang.String r0 = getPackageName(r0)
            return r0
    }

    public static java.lang.String getPackageName(java.lang.Class<?> r0) {
            if (r0 != 0) goto L5
            java.lang.String r0 = ""
            return r0
        L5:
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = getPackageName(r0)
            return r0
    }

    public static java.lang.String getPackageName(java.lang.Object r0, java.lang.String r1) {
            if (r0 != 0) goto L3
            return r1
        L3:
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = getPackageName(r0)
            return r0
    }

    public static java.lang.String getPackageName(java.lang.String r5) {
            boolean r0 = org.apache.commons.lang3.StringUtils.isEmpty(r5)
            java.lang.String r1 = ""
            if (r0 == 0) goto L9
            return r1
        L9:
            r0 = 0
            char r2 = r5.charAt(r0)
            r3 = 91
            r4 = 1
            if (r2 != r3) goto L18
            java.lang.String r5 = r5.substring(r4)
            goto L9
        L18:
            char r2 = r5.charAt(r0)
            r3 = 76
            if (r2 != r3) goto L31
            int r2 = r5.length()
            int r2 = r2 - r4
            char r2 = r5.charAt(r2)
            r3 = 59
            if (r2 != r3) goto L31
            java.lang.String r5 = r5.substring(r4)
        L31:
            r2 = 46
            int r2 = r5.lastIndexOf(r2)
            r3 = -1
            if (r2 != r3) goto L3b
            return r1
        L3b:
            java.lang.String r5 = r5.substring(r0, r2)
            return r5
    }

    public static java.lang.reflect.Method getPublicMethod(java.lang.Class<?> r2, java.lang.String r3, java.lang.Class<?>... r4) throws java.lang.NoSuchMethodException {
            java.lang.reflect.Method r0 = r2.getMethod(r3, r4)
            java.lang.Class r1 = r0.getDeclaringClass()
            int r1 = r1.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isPublic(r1)
            if (r1 == 0) goto L13
            return r0
        L13:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r1 = getAllInterfaces(r2)
            r0.addAll(r1)
            java.util.List r2 = getAllSuperclasses(r2)
            r0.addAll(r2)
            java.util.Iterator r2 = r0.iterator()
        L2a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L56
            java.lang.Object r0 = r2.next()
            java.lang.Class r0 = (java.lang.Class) r0
            int r1 = r0.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isPublic(r1)
            if (r1 != 0) goto L41
            goto L2a
        L41:
            java.lang.reflect.Method r0 = r0.getMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L54
            java.lang.Class r1 = r0.getDeclaringClass()
            int r1 = r1.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isPublic(r1)
            if (r1 == 0) goto L2a
            return r0
        L54:
            goto L2a
        L56:
            java.lang.NoSuchMethodException r2 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Can't find a public method for "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " "
            r0.append(r3)
            java.lang.String r3 = org.apache.commons.lang3.ArrayUtils.toString(r4)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    public static java.lang.String getShortCanonicalName(java.lang.Class<?> r0) {
            if (r0 != 0) goto L5
            java.lang.String r0 = ""
            return r0
        L5:
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = getShortCanonicalName(r0)
            return r0
    }

    public static java.lang.String getShortCanonicalName(java.lang.Object r0, java.lang.String r1) {
            if (r0 != 0) goto L3
            return r1
        L3:
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = getShortCanonicalName(r0)
            return r0
    }

    public static java.lang.String getShortCanonicalName(java.lang.String r0) {
            java.lang.String r0 = getCanonicalName(r0)
            java.lang.String r0 = getShortClassName(r0)
            return r0
    }

    public static java.lang.String getShortClassName(java.lang.Class<?> r0) {
            if (r0 != 0) goto L5
            java.lang.String r0 = ""
            return r0
        L5:
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = getShortClassName(r0)
            return r0
    }

    public static java.lang.String getShortClassName(java.lang.Object r0, java.lang.String r1) {
            if (r0 != 0) goto L3
            return r1
        L3:
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = getShortClassName(r0)
            return r0
    }

    public static java.lang.String getShortClassName(java.lang.String r7) {
            boolean r0 = org.apache.commons.lang3.StringUtils.isEmpty(r7)
            if (r0 == 0) goto L9
            java.lang.String r7 = ""
            return r7
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            boolean r1 = r7.startsWith(r1)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L56
        L18:
            char r1 = r7.charAt(r2)
            r4 = 91
            if (r1 != r4) goto L2a
            java.lang.String r7 = r7.substring(r3)
            java.lang.String r1 = "[]"
            r0.append(r1)
            goto L18
        L2a:
            char r1 = r7.charAt(r2)
            r4 = 76
            if (r1 != r4) goto L48
            int r1 = r7.length()
            int r1 = r1 - r3
            char r1 = r7.charAt(r1)
            r4 = 59
            if (r1 != r4) goto L48
            int r1 = r7.length()
            int r1 = r1 - r3
            java.lang.String r7 = r7.substring(r3, r1)
        L48:
            java.util.Map<java.lang.String, java.lang.String> r1 = org.apache.commons.lang3.ClassUtils.reverseAbbreviationMap
            boolean r4 = r1.containsKey(r7)
            if (r4 == 0) goto L56
            java.lang.Object r7 = r1.get(r7)
            java.lang.String r7 = (java.lang.String) r7
        L56:
            r1 = 46
            int r4 = r7.lastIndexOf(r1)
            r5 = -1
            if (r4 != r5) goto L60
            goto L62
        L60:
            int r2 = r4 + 1
        L62:
            r6 = 36
            int r2 = r7.indexOf(r6, r2)
            int r4 = r4 + r3
            java.lang.String r7 = r7.substring(r4)
            if (r2 == r5) goto L73
            java.lang.String r7 = r7.replace(r6, r1)
        L73:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            r1.append(r0)
            java.lang.String r7 = r1.toString()
            return r7
    }

    public static java.lang.String getSimpleName(java.lang.Class<?> r1) {
            java.lang.String r0 = ""
            java.lang.String r1 = getSimpleName(r1, r0)
            return r1
    }

    public static java.lang.String getSimpleName(java.lang.Class<?> r0, java.lang.String r1) {
            if (r0 != 0) goto L3
            goto L7
        L3:
            java.lang.String r1 = r0.getSimpleName()
        L7:
            return r1
    }

    public static java.lang.String getSimpleName(java.lang.Object r1) {
            java.lang.String r0 = ""
            java.lang.String r1 = getSimpleName(r1, r0)
            return r1
    }

    public static java.lang.String getSimpleName(java.lang.Object r0, java.lang.String r1) {
            if (r0 != 0) goto L3
            goto Lb
        L3:
            java.lang.Class r0 = r0.getClass()
            java.lang.String r1 = r0.getSimpleName()
        Lb:
            return r1
    }

    public static java.lang.Iterable<java.lang.Class<?>> hierarchy(java.lang.Class<?> r1) {
            org.apache.commons.lang3.ClassUtils$Interfaces r0 = org.apache.commons.lang3.ClassUtils.Interfaces.EXCLUDE
            java.lang.Iterable r1 = hierarchy(r1, r0)
            return r1
    }

    public static java.lang.Iterable<java.lang.Class<?>> hierarchy(java.lang.Class<?> r1, org.apache.commons.lang3.ClassUtils.Interfaces r2) {
            org.apache.commons.lang3.ClassUtils$1 r0 = new org.apache.commons.lang3.ClassUtils$1
            r0.<init>(r1)
            org.apache.commons.lang3.ClassUtils$Interfaces r1 = org.apache.commons.lang3.ClassUtils.Interfaces.INCLUDE
            if (r2 == r1) goto La
            return r0
        La:
            org.apache.commons.lang3.ClassUtils$2 r1 = new org.apache.commons.lang3.ClassUtils$2
            r1.<init>(r0)
            return r1
    }

    public static boolean isAssignable(java.lang.Class<?> r1, java.lang.Class<?> r2) {
            r0 = 1
            boolean r1 = isAssignable(r1, r2, r0)
            return r1
    }

    public static boolean isAssignable(java.lang.Class<?> r5, java.lang.Class<?> r6, boolean r7) {
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            r1 = 1
            if (r5 != 0) goto Ld
            boolean r5 = r6.isPrimitive()
            r5 = r5 ^ r1
            return r5
        Ld:
            if (r7 == 0) goto L35
            boolean r7 = r5.isPrimitive()
            if (r7 == 0) goto L22
            boolean r7 = r6.isPrimitive()
            if (r7 != 0) goto L22
            java.lang.Class r5 = primitiveToWrapper(r5)
            if (r5 != 0) goto L22
            return r0
        L22:
            boolean r7 = r6.isPrimitive()
            if (r7 == 0) goto L35
            boolean r7 = r5.isPrimitive()
            if (r7 != 0) goto L35
            java.lang.Class r5 = wrapperToPrimitive(r5)
            if (r5 != 0) goto L35
            return r0
        L35:
            boolean r7 = r5.equals(r6)
            if (r7 == 0) goto L3c
            return r1
        L3c:
            boolean r7 = r5.isPrimitive()
            if (r7 == 0) goto L11a
            boolean r7 = r6.isPrimitive()
            if (r7 != 0) goto L49
            return r0
        L49:
            java.lang.Class r7 = java.lang.Integer.TYPE
            boolean r2 = r7.equals(r5)
            if (r2 == 0) goto L6b
            java.lang.Class r5 = java.lang.Long.TYPE
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L69
            java.lang.Class r5 = java.lang.Float.TYPE
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L69
            java.lang.Class r5 = java.lang.Double.TYPE
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L6a
        L69:
            r0 = 1
        L6a:
            return r0
        L6b:
            java.lang.Class r2 = java.lang.Long.TYPE
            boolean r3 = r2.equals(r5)
            if (r3 == 0) goto L85
            java.lang.Class r5 = java.lang.Float.TYPE
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L83
            java.lang.Class r5 = java.lang.Double.TYPE
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L84
        L83:
            r0 = 1
        L84:
            return r0
        L85:
            java.lang.Class r3 = java.lang.Boolean.TYPE
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L8e
            return r0
        L8e:
            java.lang.Class r3 = java.lang.Double.TYPE
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L97
            return r0
        L97:
            java.lang.Class r3 = java.lang.Float.TYPE
            boolean r4 = r3.equals(r5)
            if (r4 == 0) goto La6
            java.lang.Class r5 = java.lang.Double.TYPE
            boolean r5 = r5.equals(r6)
            return r5
        La6:
            java.lang.Class r4 = java.lang.Character.TYPE
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto Lca
            boolean r5 = r7.equals(r6)
            if (r5 != 0) goto Lc8
            boolean r5 = r2.equals(r6)
            if (r5 != 0) goto Lc8
            boolean r5 = r3.equals(r6)
            if (r5 != 0) goto Lc8
            java.lang.Class r5 = java.lang.Double.TYPE
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto Lc9
        Lc8:
            r0 = 1
        Lc9:
            return r0
        Lca:
            java.lang.Class r4 = java.lang.Short.TYPE
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto Lee
            boolean r5 = r7.equals(r6)
            if (r5 != 0) goto Lec
            boolean r5 = r2.equals(r6)
            if (r5 != 0) goto Lec
            boolean r5 = r3.equals(r6)
            if (r5 != 0) goto Lec
            java.lang.Class r5 = java.lang.Double.TYPE
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto Led
        Lec:
            r0 = 1
        Led:
            return r0
        Lee:
            java.lang.Class r4 = java.lang.Byte.TYPE
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L119
            java.lang.Class r5 = java.lang.Short.TYPE
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L118
            boolean r5 = r7.equals(r6)
            if (r5 != 0) goto L118
            boolean r5 = r2.equals(r6)
            if (r5 != 0) goto L118
            boolean r5 = r3.equals(r6)
            if (r5 != 0) goto L118
            java.lang.Class r5 = java.lang.Double.TYPE
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L119
        L118:
            r0 = 1
        L119:
            return r0
        L11a:
            boolean r5 = r6.isAssignableFrom(r5)
            return r5
    }

    public static boolean isAssignable(java.lang.Class<?>[] r1, java.lang.Class<?>... r2) {
            r0 = 1
            boolean r1 = isAssignable(r1, r2, r0)
            return r1
    }

    public static boolean isAssignable(java.lang.Class<?>[] r4, java.lang.Class<?>[] r5, boolean r6) {
            boolean r0 = org.apache.commons.lang3.ArrayUtils.isSameLength(r4, r5)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            if (r4 != 0) goto Lc
            java.lang.Class<?>[] r4 = org.apache.commons.lang3.ArrayUtils.EMPTY_CLASS_ARRAY
        Lc:
            if (r5 != 0) goto L10
            java.lang.Class<?>[] r5 = org.apache.commons.lang3.ArrayUtils.EMPTY_CLASS_ARRAY
        L10:
            r0 = 0
        L11:
            int r2 = r4.length
            if (r0 >= r2) goto L22
            r2 = r4[r0]
            r3 = r5[r0]
            boolean r2 = isAssignable(r2, r3, r6)
            if (r2 != 0) goto L1f
            return r1
        L1f:
            int r0 = r0 + 1
            goto L11
        L22:
            r4 = 1
            return r4
    }

    public static boolean isInnerClass(java.lang.Class<?> r0) {
            if (r0 == 0) goto La
            java.lang.Class r0 = r0.getEnclosingClass()
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public static boolean isPrimitiveOrWrapper(java.lang.Class<?> r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            boolean r1 = r2.isPrimitive()
            if (r1 != 0) goto L10
            boolean r2 = isPrimitiveWrapper(r2)
            if (r2 == 0) goto L11
        L10:
            r0 = 1
        L11:
            return r0
    }

    public static boolean isPrimitiveWrapper(java.lang.Class<?> r1) {
            java.util.Map<java.lang.Class<?>, java.lang.Class<?>> r0 = org.apache.commons.lang3.ClassUtils.wrapperPrimitiveMap
            boolean r1 = r0.containsKey(r1)
            return r1
    }

    public static java.lang.Class<?> primitiveToWrapper(java.lang.Class<?> r1) {
            if (r1 == 0) goto L10
            boolean r0 = r1.isPrimitive()
            if (r0 == 0) goto L10
            java.util.Map<java.lang.Class<?>, java.lang.Class<?>> r0 = org.apache.commons.lang3.ClassUtils.primitiveWrapperMap
            java.lang.Object r1 = r0.get(r1)
            java.lang.Class r1 = (java.lang.Class) r1
        L10:
            return r1
    }

    public static java.lang.Class<?>[] primitivesToWrappers(java.lang.Class<?>... r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r3.length
            if (r0 != 0) goto L8
            return r3
        L8:
            int r0 = r3.length
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
        Lc:
            int r2 = r3.length
            if (r1 >= r2) goto L1a
            r2 = r3[r1]
            java.lang.Class r2 = primitiveToWrapper(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto Lc
        L1a:
            return r0
    }

    private static java.lang.String toCanonicalName(java.lang.String r4) {
            java.lang.String r4 = org.apache.commons.lang3.StringUtils.deleteWhitespace(r4)
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "className must not be null."
            org.apache.commons.lang3.Validate.notNull(r4, r2, r1)
            java.lang.String r1 = "[]"
            boolean r2 = r4.endsWith(r1)
            if (r2 == 0) goto L4e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
        L19:
            boolean r3 = r4.endsWith(r1)
            if (r3 == 0) goto L2f
            int r3 = r4.length()
            int r3 = r3 + (-2)
            java.lang.String r4 = r4.substring(r0, r3)
            java.lang.String r3 = "["
            r2.append(r3)
            goto L19
        L2f:
            java.util.Map<java.lang.String, java.lang.String> r0 = org.apache.commons.lang3.ClassUtils.abbreviationMap
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L3d
            r2.append(r0)
            goto L4a
        L3d:
            java.lang.String r0 = "L"
            r2.append(r0)
            r2.append(r4)
            java.lang.String r4 = ";"
            r2.append(r4)
        L4a:
            java.lang.String r4 = r2.toString()
        L4e:
            return r4
    }

    public static java.lang.Class<?>[] toClass(java.lang.Object... r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r4.length
            if (r1 != 0) goto La
            java.lang.Class<?>[] r4 = org.apache.commons.lang3.ArrayUtils.EMPTY_CLASS_ARRAY
            return r4
        La:
            int r1 = r4.length
            java.lang.Class[] r1 = new java.lang.Class[r1]
            r2 = 0
        Le:
            int r3 = r4.length
            if (r2 >= r3) goto L22
            r3 = r4[r2]
            if (r3 != 0) goto L17
            r3 = r0
            goto L1d
        L17:
            r3 = r4[r2]
            java.lang.Class r3 = r3.getClass()
        L1d:
            r1[r2] = r3
            int r2 = r2 + 1
            goto Le
        L22:
            return r1
    }

    public static java.lang.Class<?> wrapperToPrimitive(java.lang.Class<?> r1) {
            java.util.Map<java.lang.Class<?>, java.lang.Class<?>> r0 = org.apache.commons.lang3.ClassUtils.wrapperPrimitiveMap
            java.lang.Object r1 = r0.get(r1)
            java.lang.Class r1 = (java.lang.Class) r1
            return r1
    }

    public static java.lang.Class<?>[] wrappersToPrimitives(java.lang.Class<?>... r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r3.length
            if (r0 != 0) goto L8
            return r3
        L8:
            int r0 = r3.length
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
        Lc:
            int r2 = r3.length
            if (r1 >= r2) goto L1a
            r2 = r3[r1]
            java.lang.Class r2 = wrapperToPrimitive(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto Lc
        L1a:
            return r0
    }
}
