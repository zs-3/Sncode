package org.apache.commons.lang3;

/* loaded from: classes2.dex */
public class EnumUtils {
    private static final java.lang.String CANNOT_STORE_S_S_VALUES_IN_S_BITS = "Cannot store %s %s values in %s bits";
    private static final java.lang.String ENUM_CLASS_MUST_BE_DEFINED = "EnumClass must be defined.";
    private static final java.lang.String NULL_ELEMENTS_NOT_PERMITTED = "null elements not permitted";
    private static final java.lang.String S_DOES_NOT_SEEM_TO_BE_AN_ENUM_TYPE = "%s does not seem to be an Enum type";

    public EnumUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    private static <E extends java.lang.Enum<E>> java.lang.Class<E> asEnum(java.lang.Class<E> r3) {
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "EnumClass must be defined."
            org.apache.commons.lang3.Validate.notNull(r3, r2, r1)
            boolean r1 = r3.isEnum()
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r0] = r3
            java.lang.String r0 = "%s does not seem to be an Enum type"
            org.apache.commons.lang3.Validate.isTrue(r1, r0, r2)
            return r3
    }

    private static <E extends java.lang.Enum<E>> java.lang.Class<E> checkBitVectorable(java.lang.Class<E> r6) {
            java.lang.Class r0 = asEnum(r6)
            java.lang.Object[] r0 = r0.getEnumConstants()
            java.lang.Enum[] r0 = (java.lang.Enum[]) r0
            int r1 = r0.length
            r2 = 1
            r3 = 0
            r4 = 64
            if (r1 > r4) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            int r0 = r0.length
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5[r3] = r0
            java.lang.String r0 = r6.getSimpleName()
            r5[r2] = r0
            r0 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r5[r0] = r2
            java.lang.String r0 = "Cannot store %s %s values in %s bits"
            org.apache.commons.lang3.Validate.isTrue(r1, r0, r5)
            return r6
    }

    public static <E extends java.lang.Enum<E>> long generateBitVector(java.lang.Class<E> r5, java.lang.Iterable<? extends E> r6) {
            checkBitVectorable(r5)
            org.apache.commons.lang3.Validate.notNull(r6)
            java.util.Iterator r5 = r6.iterator()
            r0 = 0
        Lc:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L2e
            java.lang.Object r6 = r5.next()
            java.lang.Enum r6 = (java.lang.Enum) r6
            r2 = 0
            if (r6 == 0) goto L1d
            r3 = 1
            goto L1e
        L1d:
            r3 = 0
        L1e:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = "null elements not permitted"
            org.apache.commons.lang3.Validate.isTrue(r3, r4, r2)
            r2 = 1
            int r6 = r6.ordinal()
            long r2 = r2 << r6
            long r0 = r0 | r2
            goto Lc
        L2e:
            return r0
    }

    @java.lang.SafeVarargs
    public static <E extends java.lang.Enum<E>> long generateBitVector(java.lang.Class<E> r0, E... r1) {
            org.apache.commons.lang3.Validate.noNullElements(r1)
            java.util.List r1 = java.util.Arrays.asList(r1)
            long r0 = generateBitVector(r0, r1)
            return r0
    }

    public static <E extends java.lang.Enum<E>> long[] generateBitVectors(java.lang.Class<E> r6, java.lang.Iterable<? extends E> r7) {
            asEnum(r6)
            org.apache.commons.lang3.Validate.notNull(r7)
            java.util.EnumSet r0 = java.util.EnumSet.noneOf(r6)
            java.util.Iterator r7 = r7.iterator()
        Le:
            boolean r1 = r7.hasNext()
            r2 = 1
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r7.next()
            java.lang.Enum r1 = (java.lang.Enum) r1
            r3 = 0
            if (r1 == 0) goto L1f
            goto L20
        L1f:
            r2 = 0
        L20:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "null elements not permitted"
            org.apache.commons.lang3.Validate.isTrue(r2, r4, r3)
            r0.add(r1)
            goto Le
        L2b:
            java.lang.Object[] r6 = r6.getEnumConstants()
            java.lang.Enum[] r6 = (java.lang.Enum[]) r6
            int r6 = r6.length
            int r6 = r6 - r2
            int r6 = r6 / 64
            int r6 = r6 + r2
            long[] r6 = new long[r6]
            java.util.Iterator r7 = r0.iterator()
        L3c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L5d
            java.lang.Object r0 = r7.next()
            java.lang.Enum r0 = (java.lang.Enum) r0
            int r1 = r0.ordinal()
            int r1 = r1 / 64
            r2 = r6[r1]
            r4 = 1
            int r0 = r0.ordinal()
            int r0 = r0 % 64
            long r4 = r4 << r0
            long r2 = r2 | r4
            r6[r1] = r2
            goto L3c
        L5d:
            org.apache.commons.lang3.ArrayUtils.reverse(r6)
            return r6
    }

    @java.lang.SafeVarargs
    public static <E extends java.lang.Enum<E>> long[] generateBitVectors(java.lang.Class<E> r6, E... r7) {
            asEnum(r6)
            org.apache.commons.lang3.Validate.noNullElements(r7)
            java.util.EnumSet r0 = java.util.EnumSet.noneOf(r6)
            java.util.Collections.addAll(r0, r7)
            java.lang.Object[] r6 = r6.getEnumConstants()
            java.lang.Enum[] r6 = (java.lang.Enum[]) r6
            int r6 = r6.length
            int r6 = r6 + (-1)
            int r6 = r6 / 64
            int r6 = r6 + 1
            long[] r6 = new long[r6]
            java.util.Iterator r7 = r0.iterator()
        L20:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L41
            java.lang.Object r0 = r7.next()
            java.lang.Enum r0 = (java.lang.Enum) r0
            int r1 = r0.ordinal()
            int r1 = r1 / 64
            r2 = r6[r1]
            r4 = 1
            int r0 = r0.ordinal()
            int r0 = r0 % 64
            long r4 = r4 << r0
            long r2 = r2 | r4
            r6[r1] = r2
            goto L20
        L41:
            org.apache.commons.lang3.ArrayUtils.reverse(r6)
            return r6
    }

    public static <E extends java.lang.Enum<E>> E getEnum(java.lang.Class<E> r1, java.lang.String r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.Enum r1 = java.lang.Enum.valueOf(r1, r2)     // Catch: java.lang.IllegalArgumentException -> L9
            return r1
        L9:
            return r0
    }

    public static <E extends java.lang.Enum<E>> E getEnumIgnoreCase(java.lang.Class<E> r5, java.lang.String r6) {
            r0 = 0
            if (r6 == 0) goto L24
            boolean r1 = r5.isEnum()
            if (r1 != 0) goto La
            goto L24
        La:
            java.lang.Object[] r5 = r5.getEnumConstants()
            java.lang.Enum[] r5 = (java.lang.Enum[]) r5
            int r1 = r5.length
            r2 = 0
        L12:
            if (r2 >= r1) goto L24
            r3 = r5[r2]
            java.lang.String r4 = r3.name()
            boolean r4 = r4.equalsIgnoreCase(r6)
            if (r4 == 0) goto L21
            return r3
        L21:
            int r2 = r2 + 1
            goto L12
        L24:
            return r0
    }

    public static <E extends java.lang.Enum<E>> java.util.List<E> getEnumList(java.lang.Class<E> r1) {
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.Object[] r1 = r1.getEnumConstants()
            java.lang.Enum[] r1 = (java.lang.Enum[]) r1
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            return r0
    }

    public static <E extends java.lang.Enum<E>> java.util.Map<java.lang.String, E> getEnumMap(java.lang.Class<E> r5) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.Object[] r5 = r5.getEnumConstants()
            java.lang.Enum[] r5 = (java.lang.Enum[]) r5
            int r1 = r5.length
            r2 = 0
        Ld:
            if (r2 >= r1) goto L1b
            r3 = r5[r2]
            java.lang.String r4 = r3.name()
            r0.put(r4, r3)
            int r2 = r2 + 1
            goto Ld
        L1b:
            return r0
    }

    public static <E extends java.lang.Enum<E>> boolean isValidEnum(java.lang.Class<E> r0, java.lang.String r1) {
            java.lang.Enum r0 = getEnum(r0, r1)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static <E extends java.lang.Enum<E>> boolean isValidEnumIgnoreCase(java.lang.Class<E> r0, java.lang.String r1) {
            java.lang.Enum r0 = getEnumIgnoreCase(r0, r1)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static <E extends java.lang.Enum<E>> java.util.EnumSet<E> processBitVector(java.lang.Class<E> r2, long r3) {
            java.lang.Class r0 = checkBitVectorable(r2)
            r0.getEnumConstants()
            r0 = 1
            long[] r0 = new long[r0]
            r1 = 0
            r0[r1] = r3
            java.util.EnumSet r2 = processBitVectors(r2, r0)
            return r2
    }

    public static <E extends java.lang.Enum<E>> java.util.EnumSet<E> processBitVectors(java.lang.Class<E> r9, long... r10) {
            java.lang.Class r0 = asEnum(r9)
            java.util.EnumSet r0 = java.util.EnumSet.noneOf(r0)
            java.lang.Object r10 = org.apache.commons.lang3.Validate.notNull(r10)
            long[] r10 = (long[]) r10
            long[] r10 = org.apache.commons.lang3.ArrayUtils.clone(r10)
            org.apache.commons.lang3.ArrayUtils.reverse(r10)
            java.lang.Object[] r9 = r9.getEnumConstants()
            java.lang.Enum[] r9 = (java.lang.Enum[]) r9
            int r1 = r9.length
            r2 = 0
        L1d:
            if (r2 >= r1) goto L42
            r3 = r9[r2]
            int r4 = r3.ordinal()
            int r4 = r4 / 64
            int r5 = r10.length
            if (r4 >= r5) goto L3f
            r4 = r10[r4]
            r6 = 1
            int r8 = r3.ordinal()
            int r8 = r8 % 64
            long r6 = r6 << r8
            long r4 = r4 & r6
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L3f
            r0.add(r3)
        L3f:
            int r2 = r2 + 1
            goto L1d
        L42:
            return r0
    }
}
