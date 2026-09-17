package org.apache.commons.lang3.builder;

/* loaded from: classes2.dex */
public class HashCodeBuilder implements org.apache.commons.lang3.builder.Builder<java.lang.Integer> {
    private static final int DEFAULT_INITIAL_VALUE = 17;
    private static final int DEFAULT_MULTIPLIER_VALUE = 37;
    private static final java.lang.ThreadLocal<java.util.Set<org.apache.commons.lang3.builder.IDKey>> REGISTRY = null;
    private final int iConstant;
    private int iTotal;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            org.apache.commons.lang3.builder.HashCodeBuilder.REGISTRY = r0
            return
    }

    public HashCodeBuilder() {
            r1 = this;
            r1.<init>()
            r0 = 37
            r1.iConstant = r0
            r0 = 17
            r1.iTotal = r0
            return
    }

    public HashCodeBuilder(int r6, int r7) {
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.iTotal = r0
            int r1 = r6 % 2
            r2 = 1
            if (r1 == 0) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r4 = "HashCodeBuilder requires an odd initial value"
            org.apache.commons.lang3.Validate.isTrue(r1, r4, r3)
            int r1 = r7 % 2
            if (r1 == 0) goto L1a
            goto L1b
        L1a:
            r2 = 0
        L1b:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "HashCodeBuilder requires an odd multiplier"
            org.apache.commons.lang3.Validate.isTrue(r2, r1, r0)
            r5.iConstant = r7
            r5.iTotal = r6
            return
    }

    private void appendArray(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof long[]
            if (r0 == 0) goto La
            long[] r2 = (long[]) r2
            r1.append(r2)
            goto L55
        La:
            boolean r0 = r2 instanceof int[]
            if (r0 == 0) goto L14
            int[] r2 = (int[]) r2
            r1.append(r2)
            goto L55
        L14:
            boolean r0 = r2 instanceof short[]
            if (r0 == 0) goto L1e
            short[] r2 = (short[]) r2
            r1.append(r2)
            goto L55
        L1e:
            boolean r0 = r2 instanceof char[]
            if (r0 == 0) goto L28
            char[] r2 = (char[]) r2
            r1.append(r2)
            goto L55
        L28:
            boolean r0 = r2 instanceof byte[]
            if (r0 == 0) goto L32
            byte[] r2 = (byte[]) r2
            r1.append(r2)
            goto L55
        L32:
            boolean r0 = r2 instanceof double[]
            if (r0 == 0) goto L3c
            double[] r2 = (double[]) r2
            r1.append(r2)
            goto L55
        L3c:
            boolean r0 = r2 instanceof float[]
            if (r0 == 0) goto L46
            float[] r2 = (float[]) r2
            r1.append(r2)
            goto L55
        L46:
            boolean r0 = r2 instanceof boolean[]
            if (r0 == 0) goto L50
            boolean[] r2 = (boolean[]) r2
            r1.append(r2)
            goto L55
        L50:
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r1.append(r2)
        L55:
            return
    }

    static java.util.Set<org.apache.commons.lang3.builder.IDKey> getRegistry() {
            java.lang.ThreadLocal<java.util.Set<org.apache.commons.lang3.builder.IDKey>> r0 = org.apache.commons.lang3.builder.HashCodeBuilder.REGISTRY
            java.lang.Object r0 = r0.get()
            java.util.Set r0 = (java.util.Set) r0
            return r0
    }

    static boolean isRegistered(java.lang.Object r2) {
            java.util.Set r0 = getRegistry()
            if (r0 == 0) goto L13
            org.apache.commons.lang3.builder.IDKey r1 = new org.apache.commons.lang3.builder.IDKey
            r1.<init>(r2)
            boolean r2 = r0.contains(r1)
            if (r2 == 0) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            return r2
    }

    private static void reflectionAppend(java.lang.Object r5, java.lang.Class<?> r6, org.apache.commons.lang3.builder.HashCodeBuilder r7, boolean r8, java.lang.String[] r9) {
            boolean r0 = isRegistered(r5)
            if (r0 == 0) goto L7
            return
        L7:
            register(r5)     // Catch: java.lang.Throwable -> L63
            java.lang.reflect.Field[] r6 = r6.getDeclaredFields()     // Catch: java.lang.Throwable -> L63
            r0 = 1
            java.lang.reflect.AccessibleObject.setAccessible(r6, r0)     // Catch: java.lang.Throwable -> L63
            int r0 = r6.length     // Catch: java.lang.Throwable -> L63
            r1 = 0
        L14:
            if (r1 >= r0) goto L5f
            r2 = r6[r1]     // Catch: java.lang.Throwable -> L63
            java.lang.String r3 = r2.getName()     // Catch: java.lang.Throwable -> L63
            boolean r3 = org.apache.commons.lang3.ArrayUtils.contains(r9, r3)     // Catch: java.lang.Throwable -> L63
            if (r3 != 0) goto L5c
            java.lang.String r3 = r2.getName()     // Catch: java.lang.Throwable -> L63
            java.lang.String r4 = "$"
            boolean r3 = r3.contains(r4)     // Catch: java.lang.Throwable -> L63
            if (r3 != 0) goto L5c
            if (r8 != 0) goto L3a
            int r3 = r2.getModifiers()     // Catch: java.lang.Throwable -> L63
            boolean r3 = java.lang.reflect.Modifier.isTransient(r3)     // Catch: java.lang.Throwable -> L63
            if (r3 != 0) goto L5c
        L3a:
            int r3 = r2.getModifiers()     // Catch: java.lang.Throwable -> L63
            boolean r3 = java.lang.reflect.Modifier.isStatic(r3)     // Catch: java.lang.Throwable -> L63
            if (r3 != 0) goto L5c
            java.lang.Class<org.apache.commons.lang3.builder.HashCodeExclude> r3 = org.apache.commons.lang3.builder.HashCodeExclude.class
            boolean r3 = r2.isAnnotationPresent(r3)     // Catch: java.lang.Throwable -> L63
            if (r3 != 0) goto L5c
            java.lang.Object r2 = r2.get(r5)     // Catch: java.lang.IllegalAccessException -> L54 java.lang.Throwable -> L63
            r7.append(r2)     // Catch: java.lang.IllegalAccessException -> L54 java.lang.Throwable -> L63
            goto L5c
        L54:
            java.lang.InternalError r6 = new java.lang.InternalError     // Catch: java.lang.Throwable -> L63
            java.lang.String r7 = "Unexpected IllegalAccessException"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L63
            throw r6     // Catch: java.lang.Throwable -> L63
        L5c:
            int r1 = r1 + 1
            goto L14
        L5f:
            unregister(r5)
            return
        L63:
            r6 = move-exception
            unregister(r5)
            throw r6
    }

    public static int reflectionHashCode(int r7, int r8, java.lang.Object r9) {
            r0 = 0
            java.lang.String[] r6 = new java.lang.String[r0]
            r4 = 0
            r5 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            int r7 = reflectionHashCode(r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static int reflectionHashCode(int r7, int r8, java.lang.Object r9, boolean r10) {
            r0 = 0
            java.lang.String[] r6 = new java.lang.String[r0]
            r5 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            int r7 = reflectionHashCode(r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static <T> int reflectionHashCode(int r3, int r4, T r5, boolean r6, java.lang.Class<? super T> r7, java.lang.String... r8) {
            r0 = 0
            if (r5 == 0) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = 0
        L6:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "The object to build a hash code for must not be null"
            org.apache.commons.lang3.Validate.isTrue(r1, r2, r0)
            org.apache.commons.lang3.builder.HashCodeBuilder r0 = new org.apache.commons.lang3.builder.HashCodeBuilder
            r0.<init>(r3, r4)
            java.lang.Class r3 = r5.getClass()
            reflectionAppend(r5, r3, r0, r6, r8)
        L19:
            java.lang.Class r4 = r3.getSuperclass()
            if (r4 == 0) goto L29
            if (r3 == r7) goto L29
            java.lang.Class r3 = r3.getSuperclass()
            reflectionAppend(r5, r3, r0, r6, r8)
            goto L19
        L29:
            int r3 = r0.toHashCode()
            return r3
    }

    public static int reflectionHashCode(java.lang.Object r0, java.util.Collection<java.lang.String> r1) {
            java.lang.String[] r1 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toNoNullStringArray(r1)
            int r0 = reflectionHashCode(r0, r1)
            return r0
    }

    public static int reflectionHashCode(java.lang.Object r7, boolean r8) {
            r0 = 0
            java.lang.String[] r6 = new java.lang.String[r0]
            r1 = 17
            r2 = 37
            r5 = 0
            r3 = r7
            r4 = r8
            int r7 = reflectionHashCode(r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static int reflectionHashCode(java.lang.Object r6, java.lang.String... r7) {
            r0 = 17
            r1 = 37
            r3 = 0
            r4 = 0
            r2 = r6
            r5 = r7
            int r6 = reflectionHashCode(r0, r1, r2, r3, r4, r5)
            return r6
    }

    private static void register(java.lang.Object r2) {
            java.util.Set r0 = getRegistry()
            if (r0 != 0) goto L10
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.lang.ThreadLocal<java.util.Set<org.apache.commons.lang3.builder.IDKey>> r1 = org.apache.commons.lang3.builder.HashCodeBuilder.REGISTRY
            r1.set(r0)
        L10:
            org.apache.commons.lang3.builder.IDKey r1 = new org.apache.commons.lang3.builder.IDKey
            r1.<init>(r2)
            r0.add(r1)
            return
    }

    private static void unregister(java.lang.Object r2) {
            java.util.Set r0 = getRegistry()
            if (r0 == 0) goto L19
            org.apache.commons.lang3.builder.IDKey r1 = new org.apache.commons.lang3.builder.IDKey
            r1.<init>(r2)
            r0.remove(r1)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L19
            java.lang.ThreadLocal<java.util.Set<org.apache.commons.lang3.builder.IDKey>> r2 = org.apache.commons.lang3.builder.HashCodeBuilder.REGISTRY
            r2.remove()
        L19:
            return
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(byte r3) {
            r2 = this;
            int r0 = r2.iTotal
            int r1 = r2.iConstant
            int r0 = r0 * r1
            int r0 = r0 + r3
            r2.iTotal = r0
            return r2
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(char r3) {
            r2 = this;
            int r0 = r2.iTotal
            int r1 = r2.iConstant
            int r0 = r0 * r1
            int r0 = r0 + r3
            r2.iTotal = r0
            return r2
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(double r1) {
            r0 = this;
            long r1 = java.lang.Double.doubleToLongBits(r1)
            org.apache.commons.lang3.builder.HashCodeBuilder r1 = r0.append(r1)
            return r1
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(float r3) {
            r2 = this;
            int r0 = r2.iTotal
            int r1 = r2.iConstant
            int r0 = r0 * r1
            int r3 = java.lang.Float.floatToIntBits(r3)
            int r0 = r0 + r3
            r2.iTotal = r0
            return r2
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(int r3) {
            r2 = this;
            int r0 = r2.iTotal
            int r1 = r2.iConstant
            int r0 = r0 * r1
            int r0 = r0 + r3
            r2.iTotal = r0
            return r2
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(long r4) {
            r3 = this;
            int r0 = r3.iTotal
            int r1 = r3.iConstant
            int r0 = r0 * r1
            r1 = 32
            long r1 = r4 >> r1
            long r4 = r4 ^ r1
            int r5 = (int) r4
            int r0 = r0 + r5
            r3.iTotal = r0
            return r3
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(java.lang.Object r3) {
            r2 = this;
            if (r3 != 0) goto Lb
            int r3 = r2.iTotal
            int r0 = r2.iConstant
            int r3 = r3 * r0
            r2.iTotal = r3
            goto L26
        Lb:
            java.lang.Class r0 = r3.getClass()
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L19
            r2.appendArray(r3)
            goto L26
        L19:
            int r0 = r2.iTotal
            int r1 = r2.iConstant
            int r0 = r0 * r1
            int r3 = r3.hashCode()
            int r0 = r0 + r3
            r2.iTotal = r0
        L26:
            return r2
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(short r3) {
            r2 = this;
            int r0 = r2.iTotal
            int r1 = r2.iConstant
            int r0 = r0 * r1
            int r0 = r0 + r3
            r2.iTotal = r0
            return r2
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(boolean r3) {
            r2 = this;
            int r0 = r2.iTotal
            int r1 = r2.iConstant
            int r0 = r0 * r1
            r3 = r3 ^ 1
            int r0 = r0 + r3
            r2.iTotal = r0
            return r2
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(byte[] r4) {
            r3 = this;
            if (r4 != 0) goto Lb
            int r4 = r3.iTotal
            int r0 = r3.iConstant
            int r4 = r4 * r0
            r3.iTotal = r4
            goto L17
        Lb:
            int r0 = r4.length
            r1 = 0
        Ld:
            if (r1 >= r0) goto L17
            r2 = r4[r1]
            r3.append(r2)
            int r1 = r1 + 1
            goto Ld
        L17:
            return r3
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(char[] r4) {
            r3 = this;
            if (r4 != 0) goto Lb
            int r4 = r3.iTotal
            int r0 = r3.iConstant
            int r4 = r4 * r0
            r3.iTotal = r4
            goto L17
        Lb:
            int r0 = r4.length
            r1 = 0
        Ld:
            if (r1 >= r0) goto L17
            char r2 = r4[r1]
            r3.append(r2)
            int r1 = r1 + 1
            goto Ld
        L17:
            return r3
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(double[] r5) {
            r4 = this;
            if (r5 != 0) goto Lb
            int r5 = r4.iTotal
            int r0 = r4.iConstant
            int r5 = r5 * r0
            r4.iTotal = r5
            goto L17
        Lb:
            int r0 = r5.length
            r1 = 0
        Ld:
            if (r1 >= r0) goto L17
            r2 = r5[r1]
            r4.append(r2)
            int r1 = r1 + 1
            goto Ld
        L17:
            return r4
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(float[] r4) {
            r3 = this;
            if (r4 != 0) goto Lb
            int r4 = r3.iTotal
            int r0 = r3.iConstant
            int r4 = r4 * r0
            r3.iTotal = r4
            goto L17
        Lb:
            int r0 = r4.length
            r1 = 0
        Ld:
            if (r1 >= r0) goto L17
            r2 = r4[r1]
            r3.append(r2)
            int r1 = r1 + 1
            goto Ld
        L17:
            return r3
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(int[] r4) {
            r3 = this;
            if (r4 != 0) goto Lb
            int r4 = r3.iTotal
            int r0 = r3.iConstant
            int r4 = r4 * r0
            r3.iTotal = r4
            goto L17
        Lb:
            int r0 = r4.length
            r1 = 0
        Ld:
            if (r1 >= r0) goto L17
            r2 = r4[r1]
            r3.append(r2)
            int r1 = r1 + 1
            goto Ld
        L17:
            return r3
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(long[] r5) {
            r4 = this;
            if (r5 != 0) goto Lb
            int r5 = r4.iTotal
            int r0 = r4.iConstant
            int r5 = r5 * r0
            r4.iTotal = r5
            goto L17
        Lb:
            int r0 = r5.length
            r1 = 0
        Ld:
            if (r1 >= r0) goto L17
            r2 = r5[r1]
            r4.append(r2)
            int r1 = r1 + 1
            goto Ld
        L17:
            return r4
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(java.lang.Object[] r4) {
            r3 = this;
            if (r4 != 0) goto Lb
            int r4 = r3.iTotal
            int r0 = r3.iConstant
            int r4 = r4 * r0
            r3.iTotal = r4
            goto L17
        Lb:
            int r0 = r4.length
            r1 = 0
        Ld:
            if (r1 >= r0) goto L17
            r2 = r4[r1]
            r3.append(r2)
            int r1 = r1 + 1
            goto Ld
        L17:
            return r3
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(short[] r4) {
            r3 = this;
            if (r4 != 0) goto Lb
            int r4 = r3.iTotal
            int r0 = r3.iConstant
            int r4 = r4 * r0
            r3.iTotal = r4
            goto L17
        Lb:
            int r0 = r4.length
            r1 = 0
        Ld:
            if (r1 >= r0) goto L17
            short r2 = r4[r1]
            r3.append(r2)
            int r1 = r1 + 1
            goto Ld
        L17:
            return r3
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(boolean[] r4) {
            r3 = this;
            if (r4 != 0) goto Lb
            int r4 = r3.iTotal
            int r0 = r3.iConstant
            int r4 = r4 * r0
            r3.iTotal = r4
            goto L17
        Lb:
            int r0 = r4.length
            r1 = 0
        Ld:
            if (r1 >= r0) goto L17
            boolean r2 = r4[r1]
            r3.append(r2)
            int r1 = r1 + 1
            goto Ld
        L17:
            return r3
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder appendSuper(int r3) {
            r2 = this;
            int r0 = r2.iTotal
            int r1 = r2.iConstant
            int r0 = r0 * r1
            int r0 = r0 + r3
            r2.iTotal = r0
            return r2
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.commons.lang3.builder.Builder
    public java.lang.Integer build() {
            r1 = this;
            int r0 = r1.toHashCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    @Override // org.apache.commons.lang3.builder.Builder
    public /* bridge */ /* synthetic */ java.lang.Integer build() {
            r1 = this;
            java.lang.Integer r0 = r1.build()
            return r0
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.toHashCode()
            return r0
    }

    public int toHashCode() {
            r1 = this;
            int r0 = r1.iTotal
            return r0
    }
}
