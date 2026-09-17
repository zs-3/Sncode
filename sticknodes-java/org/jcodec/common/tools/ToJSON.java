package org.jcodec.common.tools;

/* loaded from: classes2.dex */
public class ToJSON {
    static java.util.Set<java.lang.String> omitMethods;
    static java.util.Set<java.lang.Class> primitive;

    static {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            org.jcodec.common.tools.ToJSON.primitive = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            org.jcodec.common.tools.ToJSON.omitMethods = r0
            java.util.Set<java.lang.Class> r0 = org.jcodec.common.tools.ToJSON.primitive
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            r0.add(r1)
            java.util.Set<java.lang.Class> r0 = org.jcodec.common.tools.ToJSON.primitive
            java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
            r0.add(r1)
            java.util.Set<java.lang.Class> r0 = org.jcodec.common.tools.ToJSON.primitive
            java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
            r0.add(r1)
            java.util.Set<java.lang.Class> r0 = org.jcodec.common.tools.ToJSON.primitive
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            r0.add(r1)
            java.util.Set<java.lang.Class> r0 = org.jcodec.common.tools.ToJSON.primitive
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            r0.add(r1)
            java.util.Set<java.lang.Class> r0 = org.jcodec.common.tools.ToJSON.primitive
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            r0.add(r1)
            java.util.Set<java.lang.Class> r0 = org.jcodec.common.tools.ToJSON.primitive
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            r0.add(r1)
            java.util.Set<java.lang.Class> r0 = org.jcodec.common.tools.ToJSON.primitive
            java.lang.Class<java.lang.Character> r1 = java.lang.Character.class
            r0.add(r1)
            java.util.Set<java.lang.String> r0 = org.jcodec.common.tools.ToJSON.omitMethods
            java.lang.String r1 = "getClass"
            r0.add(r1)
            java.util.Set<java.lang.String> r0 = org.jcodec.common.tools.ToJSON.omitMethods
            java.lang.String r1 = "get"
            r0.add(r1)
            return
    }

    public static java.util.List<java.lang.String> allFields(java.lang.Class r1) {
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.util.List r1 = allFieldsExcept(r1, r0)
            return r1
    }

    public static java.util.List<java.lang.String> allFieldsExcept(java.lang.Class r4, java.lang.String[] r5) {
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.reflect.Method[] r4 = org.jcodec.platform.Platform.getDeclaredMethods(r4)
            int r0 = r4.length
            r1 = 0
        Lb:
            if (r1 >= r0) goto L20
            r2 = r4[r1]
            boolean r3 = isGetter(r2)
            if (r3 != 0) goto L16
            goto L1d
        L16:
            java.lang.String r2 = toName(r2)     // Catch: java.lang.Exception -> L1d
            r5.add(r2)     // Catch: java.lang.Exception -> L1d
        L1d:
            int r1 = r1 + 1
            goto Lb
        L20:
            return r5
    }

    private static void escape(java.lang.String r5, java.lang.StringBuilder r6) {
            char[] r5 = r5.toCharArray()
            int r0 = r5.length
            r1 = 0
            r2 = 0
        L7:
            if (r2 >= r0) goto L28
            char r3 = r5[r2]
            r4 = 32
            if (r3 >= r4) goto L22
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4[r1] = r3
            java.lang.String r3 = "\\%02x"
            java.lang.String r3 = java.lang.String.format(r3, r4)
            r6.append(r3)
            goto L25
        L22:
            r6.append(r3)
        L25:
            int r2 = r2 + 1
            goto L7
        L28:
            return
    }

    public static void fieldsToJSON(java.lang.Object r6, java.lang.StringBuilder r7, java.lang.String[] r8) {
            java.lang.Class r0 = r6.getClass()
            java.lang.reflect.Method[] r0 = org.jcodec.platform.Platform.getMethods(r0)
            int r1 = r8.length
            r2 = 0
        La:
            if (r2 >= r1) goto L1f
            r3 = r8[r2]
            java.lang.reflect.Method r4 = findGetter(r0, r3)
            if (r4 != 0) goto L15
            goto L1c
        L15:
            org.jcodec.common.IntArrayList r5 = org.jcodec.common.IntArrayList.createIntArrayList()
            invoke(r6, r5, r7, r4, r3)
        L1c:
            int r2 = r2 + 1
            goto La
        L1f:
            return
    }

    private static java.lang.reflect.Method findGetter(java.lang.reflect.Method[] r5, java.lang.String r6) {
            java.lang.String r0 = "is"
            java.lang.String r0 = getterName(r0, r6)
            java.lang.String r1 = "get"
            java.lang.String r6 = getterName(r1, r6)
            int r1 = r5.length
            r2 = 0
        Le:
            if (r2 >= r1) goto L30
            r3 = r5[r2]
            java.lang.String r4 = r3.getName()
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L26
            java.lang.String r4 = r3.getName()
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L2d
        L26:
            boolean r4 = isGetter(r3)
            if (r4 == 0) goto L2d
            return r3
        L2d:
            int r2 = r2 + 1
            goto Le
        L30:
            r5 = 0
            return r5
    }

    private static java.lang.String getterName(java.lang.String r3, java.lang.String r4) {
            java.lang.String r0 = "Passed null string as field name"
            java.util.Objects.requireNonNull(r4, r0)
            char[] r4 = r4.toCharArray()
            int r0 = r4.length
            if (r0 != 0) goto Ld
            return r3
        Ld:
            int r0 = r4.length
            r1 = 1
            r2 = 0
            if (r0 <= r1) goto L23
            char r0 = r4[r1]
            boolean r0 = java.lang.Character.isUpperCase(r0)
            if (r0 == 0) goto L23
            char r0 = r4[r2]
            char r0 = java.lang.Character.toLowerCase(r0)
            r4[r2] = r0
            goto L2b
        L23:
            char r0 = r4[r2]
            char r0 = java.lang.Character.toUpperCase(r0)
            r4[r2] = r0
        L2b:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r0)
            java.lang.String r3 = r4.toString()
            return r3
    }

    private static void invoke(java.lang.Object r1, org.jcodec.common.IntArrayList r2, java.lang.StringBuilder r3, java.lang.reflect.Method r4, java.lang.String r5) {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L2e
            java.lang.Object r1 = r4.invoke(r1, r0)     // Catch: java.lang.Exception -> L2e
            r4 = 34
            r3.append(r4)     // Catch: java.lang.Exception -> L2e
            r3.append(r5)     // Catch: java.lang.Exception -> L2e
            java.lang.String r4 = "\":"
            r3.append(r4)     // Catch: java.lang.Exception -> L2e
            if (r1 == 0) goto L26
            java.util.Set<java.lang.Class> r4 = org.jcodec.common.tools.ToJSON.primitive     // Catch: java.lang.Exception -> L2e
            java.lang.Class r5 = r1.getClass()     // Catch: java.lang.Exception -> L2e
            boolean r4 = r4.contains(r5)     // Catch: java.lang.Exception -> L2e
            if (r4 == 0) goto L26
            r3.append(r1)     // Catch: java.lang.Exception -> L2e
            goto L29
        L26:
            toJSONSub(r1, r2, r3)     // Catch: java.lang.Exception -> L2e
        L29:
            java.lang.String r1 = ","
            r3.append(r1)     // Catch: java.lang.Exception -> L2e
        L2e:
            return
    }

    public static boolean isGetter(java.lang.reflect.Method r3) {
            int r0 = r3.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            java.lang.String r0 = r3.getName()
            java.lang.String r2 = "get"
            boolean r0 = r0.startsWith(r2)
            if (r0 != 0) goto L2d
            java.lang.String r0 = r3.getName()
            java.lang.String r2 = "is"
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L2c
            java.lang.Class r0 = r3.getReturnType()
            java.lang.Class r2 = java.lang.Boolean.TYPE
            if (r0 == r2) goto L2d
        L2c:
            return r1
        L2d:
            java.lang.Class[] r0 = r3.getParameterTypes()
            int r0 = r0.length
            if (r0 == 0) goto L35
            return r1
        L35:
            java.lang.Class r0 = java.lang.Void.TYPE
            java.lang.Class r3 = r3.getReturnType()
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L42
            return r1
        L42:
            r3 = 1
            return r3
    }

    public static java.lang.String toJSON(java.lang.Object r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            org.jcodec.common.IntArrayList r1 = org.jcodec.common.IntArrayList.createIntArrayList()
            toJSONSub(r2, r1, r0)
            java.lang.String r2 = r0.toString()
            return r2
    }

    private static void toJSONSub(java.lang.Object r10, org.jcodec.common.IntArrayList r11, java.lang.StringBuilder r12) {
            java.lang.String r0 = "null"
            if (r10 != 0) goto L8
            r12.append(r0)
            return
        L8:
            java.lang.Class r1 = r10.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "java.lang"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L24
            java.lang.String r2 = "java.lang.String"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L24
            r12.append(r0)
            return
        L24:
            int r1 = java.lang.System.identityHashCode(r10)
            boolean r2 = r11.contains(r1)
            if (r2 == 0) goto L32
            r12.append(r0)
            return
        L32:
            r11.push(r1)
            boolean r1 = r10 instanceof java.nio.ByteBuffer
            if (r1 == 0) goto L3f
            java.nio.ByteBuffer r10 = (java.nio.ByteBuffer) r10
            byte[] r10 = org.jcodec.common.io.NIOUtils.toArray(r10)
        L3f:
            if (r10 != 0) goto L46
            r12.append(r0)
            goto L26d
        L46:
            boolean r0 = r10 instanceof java.lang.String
            java.lang.String r1 = "\""
            if (r0 == 0) goto L59
            r12.append(r1)
            java.lang.String r10 = (java.lang.String) r10
            escape(r10, r12)
            r12.append(r1)
            goto L26d
        L59:
            boolean r0 = r10 instanceof java.util.Map
            java.lang.String r2 = "}"
            java.lang.String r3 = "{"
            java.lang.String r4 = ","
            if (r0 == 0) goto La1
            java.util.Map r10 = (java.util.Map) r10
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
            r12.append(r3)
        L70:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L9c
            java.lang.Object r0 = r10.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r12.append(r1)
            java.lang.Object r3 = r0.getKey()
            r12.append(r3)
            java.lang.String r3 = "\":"
            r12.append(r3)
            java.lang.Object r0 = r0.getValue()
            toJSONSub(r0, r11, r12)
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L70
            r12.append(r4)
            goto L70
        L9c:
            r12.append(r2)
            goto L26d
        La1:
            boolean r0 = r10 instanceof java.lang.Iterable
            java.lang.String r1 = "]"
            java.lang.String r5 = "["
            if (r0 == 0) goto Lce
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
            r12.append(r5)
        Lb2:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto Lc9
            java.lang.Object r0 = r10.next()
            toJSONSub(r0, r11, r12)
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto Lb2
            r12.append(r4)
            goto Lb2
        Lc9:
            r12.append(r1)
            goto L26d
        Lce:
            boolean r0 = r10 instanceof java.lang.Object[]
            r6 = 0
            if (r0 == 0) goto Lf2
            r12.append(r5)
            int r0 = java.lang.reflect.Array.getLength(r10)
        Lda:
            if (r6 >= r0) goto Led
            java.lang.Object r2 = java.lang.reflect.Array.get(r10, r6)
            toJSONSub(r2, r11, r12)
            int r2 = r0 + (-1)
            if (r6 >= r2) goto Lea
            r12.append(r4)
        Lea:
            int r6 = r6 + 1
            goto Lda
        Led:
            r12.append(r1)
            goto L26d
        Lf2:
            boolean r0 = r10 instanceof long[]
            r7 = 1
            if (r0 == 0) goto L122
            long[] r10 = (long[]) r10
            r12.append(r5)
            r0 = 0
        Lfd:
            int r2 = r10.length
            if (r0 >= r2) goto L11d
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r8 = r10[r0]
            java.lang.Long r3 = java.lang.Long.valueOf(r8)
            r2[r6] = r3
            java.lang.String r3 = "0x%016x"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r12.append(r2)
            int r2 = r10.length
            int r2 = r2 - r7
            if (r0 >= r2) goto L11a
            r12.append(r4)
        L11a:
            int r0 = r0 + 1
            goto Lfd
        L11d:
            r12.append(r1)
            goto L26d
        L122:
            boolean r0 = r10 instanceof int[]
            if (r0 == 0) goto L151
            int[] r10 = (int[]) r10
            r12.append(r5)
            r0 = 0
        L12c:
            int r2 = r10.length
            if (r0 >= r2) goto L14c
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r3 = r10[r0]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r6] = r3
            java.lang.String r3 = "0x%08x"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r12.append(r2)
            int r2 = r10.length
            int r2 = r2 - r7
            if (r0 >= r2) goto L149
            r12.append(r4)
        L149:
            int r0 = r0 + 1
            goto L12c
        L14c:
            r12.append(r1)
            goto L26d
        L151:
            boolean r0 = r10 instanceof float[]
            if (r0 == 0) goto L180
            float[] r10 = (float[]) r10
            r12.append(r5)
            r0 = 0
        L15b:
            int r2 = r10.length
            if (r0 >= r2) goto L17b
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r3 = r10[r0]
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r2[r6] = r3
            java.lang.String r3 = "%.3f"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r12.append(r2)
            int r2 = r10.length
            int r2 = r2 - r7
            if (r0 >= r2) goto L178
            r12.append(r4)
        L178:
            int r0 = r0 + 1
            goto L15b
        L17b:
            r12.append(r1)
            goto L26d
        L180:
            boolean r0 = r10 instanceof double[]
            if (r0 == 0) goto L1af
            double[] r10 = (double[]) r10
            r12.append(r5)
            r0 = 0
        L18a:
            int r2 = r10.length
            if (r0 >= r2) goto L1aa
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r8 = r10[r0]
            java.lang.Double r3 = java.lang.Double.valueOf(r8)
            r2[r6] = r3
            java.lang.String r3 = "%.6f"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r12.append(r2)
            int r2 = r10.length
            int r2 = r2 - r7
            if (r0 >= r2) goto L1a7
            r12.append(r4)
        L1a7:
            int r0 = r0 + 1
            goto L18a
        L1aa:
            r12.append(r1)
            goto L26d
        L1af:
            boolean r0 = r10 instanceof short[]
            if (r0 == 0) goto L1de
            short[] r10 = (short[]) r10
            r12.append(r5)
            r0 = 0
        L1b9:
            int r2 = r10.length
            if (r0 >= r2) goto L1d9
            java.lang.Object[] r2 = new java.lang.Object[r7]
            short r3 = r10[r0]
            java.lang.Short r3 = java.lang.Short.valueOf(r3)
            r2[r6] = r3
            java.lang.String r3 = "0x%04x"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r12.append(r2)
            int r2 = r10.length
            int r2 = r2 - r7
            if (r0 >= r2) goto L1d6
            r12.append(r4)
        L1d6:
            int r0 = r0 + 1
            goto L1b9
        L1d9:
            r12.append(r1)
            goto L26d
        L1de:
            boolean r0 = r10 instanceof byte[]
            if (r0 == 0) goto L20c
            byte[] r10 = (byte[]) r10
            r12.append(r5)
            r0 = 0
        L1e8:
            int r2 = r10.length
            if (r0 >= r2) goto L208
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r3 = r10[r0]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r2[r6] = r3
            java.lang.String r3 = "0x%02x"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r12.append(r2)
            int r2 = r10.length
            int r2 = r2 - r7
            if (r0 >= r2) goto L205
            r12.append(r4)
        L205:
            int r0 = r0 + 1
            goto L1e8
        L208:
            r12.append(r1)
            goto L26d
        L20c:
            boolean r0 = r10 instanceof boolean[]
            if (r0 == 0) goto L22b
            boolean[] r10 = (boolean[]) r10
            r12.append(r5)
        L215:
            int r0 = r10.length
            if (r6 >= r0) goto L227
            boolean r0 = r10[r6]
            r12.append(r0)
            int r0 = r10.length
            int r0 = r0 - r7
            if (r6 >= r0) goto L224
            r12.append(r4)
        L224:
            int r6 = r6 + 1
            goto L215
        L227:
            r12.append(r1)
            goto L26d
        L22b:
            java.lang.Class r0 = r10.getClass()
            boolean r0 = r0.isEnum()
            if (r0 == 0) goto L23d
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r12.append(r10)
            goto L26d
        L23d:
            r12.append(r3)
            java.lang.Class r0 = r10.getClass()
            java.lang.reflect.Method[] r0 = org.jcodec.platform.Platform.getMethods(r0)
            int r1 = r0.length
        L249:
            if (r6 >= r1) goto L26a
            r3 = r0[r6]
            java.util.Set<java.lang.String> r4 = org.jcodec.common.tools.ToJSON.omitMethods
            java.lang.String r5 = r3.getName()
            boolean r4 = r4.contains(r5)
            if (r4 != 0) goto L267
            boolean r4 = isGetter(r3)
            if (r4 != 0) goto L260
            goto L267
        L260:
            java.lang.String r4 = toName(r3)
            invoke(r10, r11, r12, r3, r4)
        L267:
            int r6 = r6 + 1
            goto L249
        L26a:
            r12.append(r2)
        L26d:
            r11.pop()
            return
    }

    private static java.lang.String toName(java.lang.reflect.Method r3) {
            boolean r0 = isGetter(r3)
            if (r0 == 0) goto L28
            java.lang.String r3 = r3.getName()
            char[] r3 = r3.toCharArray()
            r0 = 0
            char r0 = r3[r0]
            r1 = 103(0x67, float:1.44E-43)
            if (r0 != r1) goto L17
            r0 = 3
            goto L18
        L17:
            r0 = 2
        L18:
            char r1 = r3[r0]
            char r1 = java.lang.Character.toLowerCase(r1)
            r3[r0] = r1
            java.lang.String r1 = new java.lang.String
            int r2 = r3.length
            int r2 = r2 - r0
            r1.<init>(r3, r0, r2)
            return r1
        L28:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Not a getter"
            r3.<init>(r0)
            throw r3
    }
}
