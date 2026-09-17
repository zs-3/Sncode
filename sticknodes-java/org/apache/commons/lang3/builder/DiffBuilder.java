package org.apache.commons.lang3.builder;

/* loaded from: classes2.dex */
public class DiffBuilder implements org.apache.commons.lang3.builder.Builder<org.apache.commons.lang3.builder.DiffResult> {
    private final java.util.List<org.apache.commons.lang3.builder.Diff<?>> diffs;
    private final java.lang.Object left;
    private final boolean objectsTriviallyEqual;
    private final java.lang.Object right;
    private final org.apache.commons.lang3.builder.ToStringStyle style;



















    public DiffBuilder(java.lang.Object r2, java.lang.Object r3, org.apache.commons.lang3.builder.ToStringStyle r4) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public DiffBuilder(java.lang.Object r6, java.lang.Object r7, org.apache.commons.lang3.builder.ToStringStyle r8, boolean r9) {
            r5 = this;
            r5.<init>()
            r0 = 1
            r1 = 0
            if (r6 == 0) goto L9
            r2 = 1
            goto La
        L9:
            r2 = 0
        La:
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r4 = "lhs cannot be null"
            org.apache.commons.lang3.Validate.isTrue(r2, r4, r3)
            if (r7 == 0) goto L15
            r2 = 1
            goto L16
        L15:
            r2 = 0
        L16:
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r4 = "rhs cannot be null"
            org.apache.commons.lang3.Validate.isTrue(r2, r4, r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r5.diffs = r2
            r5.left = r6
            r5.right = r7
            r5.style = r8
            if (r9 == 0) goto L35
            if (r6 == r7) goto L36
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L35
            goto L36
        L35:
            r0 = 0
        L36:
            r5.objectsTriviallyEqual = r0
            return
    }

    private void validateFieldNameNotNull(java.lang.String r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L5
            r3 = 1
            goto L6
        L5:
            r3 = 0
        L6:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Field name cannot be null"
            org.apache.commons.lang3.Validate.isTrue(r3, r1, r0)
            return
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(java.lang.String r3, byte r4, byte r5) {
            r2 = this;
            r2.validateFieldNameNotNull(r3)
            boolean r0 = r2.objectsTriviallyEqual
            if (r0 == 0) goto L8
            return r2
        L8:
            if (r4 == r5) goto L14
            java.util.List<org.apache.commons.lang3.builder.Diff<?>> r0 = r2.diffs
            org.apache.commons.lang3.builder.DiffBuilder$3 r1 = new org.apache.commons.lang3.builder.DiffBuilder$3
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
        L14:
            return r2
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(java.lang.String r3, char r4, char r5) {
            r2 = this;
            r2.validateFieldNameNotNull(r3)
            boolean r0 = r2.objectsTriviallyEqual
            if (r0 == 0) goto L8
            return r2
        L8:
            if (r4 == r5) goto L14
            java.util.List<org.apache.commons.lang3.builder.Diff<?>> r0 = r2.diffs
            org.apache.commons.lang3.builder.DiffBuilder$5 r1 = new org.apache.commons.lang3.builder.DiffBuilder$5
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
        L14:
            return r2
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(java.lang.String r10, double r11, double r13) {
            r9 = this;
            r9.validateFieldNameNotNull(r10)
            boolean r0 = r9.objectsTriviallyEqual
            if (r0 == 0) goto L8
            return r9
        L8:
            long r0 = java.lang.Double.doubleToLongBits(r11)
            long r2 = java.lang.Double.doubleToLongBits(r13)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L23
            java.util.List<org.apache.commons.lang3.builder.Diff<?>> r0 = r9.diffs
            org.apache.commons.lang3.builder.DiffBuilder$7 r8 = new org.apache.commons.lang3.builder.DiffBuilder$7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r13
            r1.<init>(r2, r3, r4, r6)
            r0.add(r8)
        L23:
            return r9
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(java.lang.String r3, float r4, float r5) {
            r2 = this;
            r2.validateFieldNameNotNull(r3)
            boolean r0 = r2.objectsTriviallyEqual
            if (r0 == 0) goto L8
            return r2
        L8:
            int r0 = java.lang.Float.floatToIntBits(r4)
            int r1 = java.lang.Float.floatToIntBits(r5)
            if (r0 == r1) goto L1c
            java.util.List<org.apache.commons.lang3.builder.Diff<?>> r0 = r2.diffs
            org.apache.commons.lang3.builder.DiffBuilder$9 r1 = new org.apache.commons.lang3.builder.DiffBuilder$9
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
        L1c:
            return r2
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(java.lang.String r3, int r4, int r5) {
            r2 = this;
            r2.validateFieldNameNotNull(r3)
            boolean r0 = r2.objectsTriviallyEqual
            if (r0 == 0) goto L8
            return r2
        L8:
            if (r4 == r5) goto L14
            java.util.List<org.apache.commons.lang3.builder.Diff<?>> r0 = r2.diffs
            org.apache.commons.lang3.builder.DiffBuilder$11 r1 = new org.apache.commons.lang3.builder.DiffBuilder$11
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
        L14:
            return r2
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(java.lang.String r10, long r11, long r13) {
            r9 = this;
            r9.validateFieldNameNotNull(r10)
            boolean r0 = r9.objectsTriviallyEqual
            if (r0 == 0) goto L8
            return r9
        L8:
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 == 0) goto L1b
            java.util.List<org.apache.commons.lang3.builder.Diff<?>> r0 = r9.diffs
            org.apache.commons.lang3.builder.DiffBuilder$13 r8 = new org.apache.commons.lang3.builder.DiffBuilder$13
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r13
            r1.<init>(r2, r3, r4, r6)
            r0.add(r8)
        L1b:
            return r9
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(java.lang.String r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
            r2.validateFieldNameNotNull(r3)
            boolean r0 = r2.objectsTriviallyEqual
            if (r0 == 0) goto L8
            return r2
        L8:
            if (r4 != r5) goto Lb
            return r2
        Lb:
            if (r4 == 0) goto Lf
            r0 = r4
            goto L10
        Lf:
            r0 = r5
        L10:
            java.lang.Class r1 = r0.getClass()
            boolean r1 = r1.isArray()
            if (r1 == 0) goto L8b
            boolean r1 = r0 instanceof boolean[]
            if (r1 == 0) goto L27
            boolean[] r4 = (boolean[]) r4
            boolean[] r5 = (boolean[]) r5
            org.apache.commons.lang3.builder.DiffBuilder r3 = r2.append(r3, r4, r5)
            return r3
        L27:
            boolean r1 = r0 instanceof byte[]
            if (r1 == 0) goto L34
            byte[] r4 = (byte[]) r4
            byte[] r5 = (byte[]) r5
            org.apache.commons.lang3.builder.DiffBuilder r3 = r2.append(r3, r4, r5)
            return r3
        L34:
            boolean r1 = r0 instanceof char[]
            if (r1 == 0) goto L41
            char[] r4 = (char[]) r4
            char[] r5 = (char[]) r5
            org.apache.commons.lang3.builder.DiffBuilder r3 = r2.append(r3, r4, r5)
            return r3
        L41:
            boolean r1 = r0 instanceof double[]
            if (r1 == 0) goto L4e
            double[] r4 = (double[]) r4
            double[] r5 = (double[]) r5
            org.apache.commons.lang3.builder.DiffBuilder r3 = r2.append(r3, r4, r5)
            return r3
        L4e:
            boolean r1 = r0 instanceof float[]
            if (r1 == 0) goto L5b
            float[] r4 = (float[]) r4
            float[] r5 = (float[]) r5
            org.apache.commons.lang3.builder.DiffBuilder r3 = r2.append(r3, r4, r5)
            return r3
        L5b:
            boolean r1 = r0 instanceof int[]
            if (r1 == 0) goto L68
            int[] r4 = (int[]) r4
            int[] r5 = (int[]) r5
            org.apache.commons.lang3.builder.DiffBuilder r3 = r2.append(r3, r4, r5)
            return r3
        L68:
            boolean r1 = r0 instanceof long[]
            if (r1 == 0) goto L75
            long[] r4 = (long[]) r4
            long[] r5 = (long[]) r5
            org.apache.commons.lang3.builder.DiffBuilder r3 = r2.append(r3, r4, r5)
            return r3
        L75:
            boolean r0 = r0 instanceof short[]
            if (r0 == 0) goto L82
            short[] r4 = (short[]) r4
            short[] r5 = (short[]) r5
            org.apache.commons.lang3.builder.DiffBuilder r3 = r2.append(r3, r4, r5)
            return r3
        L82:
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            org.apache.commons.lang3.builder.DiffBuilder r3 = r2.append(r3, r4, r5)
            return r3
        L8b:
            if (r4 == 0) goto L94
            boolean r0 = r4.equals(r5)
            if (r0 == 0) goto L94
            return r2
        L94:
            java.util.List<org.apache.commons.lang3.builder.Diff<?>> r0 = r2.diffs
            org.apache.commons.lang3.builder.DiffBuilder$17 r1 = new org.apache.commons.lang3.builder.DiffBuilder$17
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            return r2
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(java.lang.String r4, org.apache.commons.lang3.builder.DiffResult r5) {
            r3 = this;
            r3.validateFieldNameNotNull(r4)
            r0 = 0
            if (r5 == 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "Diff result cannot be null"
            org.apache.commons.lang3.Validate.isTrue(r1, r2, r0)
            boolean r0 = r3.objectsTriviallyEqual
            if (r0 == 0) goto L15
            return r3
        L15:
            java.util.List r5 = r5.getDiffs()
            java.util.Iterator r5 = r5.iterator()
        L1d:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L4d
            java.lang.Object r0 = r5.next()
            org.apache.commons.lang3.builder.Diff r0 = (org.apache.commons.lang3.builder.Diff) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r2 = "."
            r1.append(r2)
            java.lang.String r2 = r0.getFieldName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r2 = r0.getLeft()
            java.lang.Object r0 = r0.getRight()
            r3.append(r1, r2, r0)
            goto L1d
        L4d:
            return r3
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(java.lang.String r3, short r4, short r5) {
            r2 = this;
            r2.validateFieldNameNotNull(r3)
            boolean r0 = r2.objectsTriviallyEqual
            if (r0 == 0) goto L8
            return r2
        L8:
            if (r4 == r5) goto L14
            java.util.List<org.apache.commons.lang3.builder.Diff<?>> r0 = r2.diffs
            org.apache.commons.lang3.builder.DiffBuilder$15 r1 = new org.apache.commons.lang3.builder.DiffBuilder$15
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
        L14:
            return r2
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(java.lang.String r3, boolean r4, boolean r5) {
            r2 = this;
            r2.validateFieldNameNotNull(r3)
            boolean r0 = r2.objectsTriviallyEqual
            if (r0 == 0) goto L8
            return r2
        L8:
            if (r4 == r5) goto L14
            java.util.List<org.apache.commons.lang3.builder.Diff<?>> r0 = r2.diffs
            org.apache.commons.lang3.builder.DiffBuilder$1 r1 = new org.apache.commons.lang3.builder.DiffBuilder$1
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
        L14:
            return r2
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(java.lang.String r3, byte[] r4, byte[] r5) {
            r2 = this;
            r2.validateFieldNameNotNull(r3)
            boolean r0 = r2.objectsTriviallyEqual
            if (r0 == 0) goto L8
            return r2
        L8:
            boolean r0 = java.util.Arrays.equals(r4, r5)
            if (r0 != 0) goto L18
            java.util.List<org.apache.commons.lang3.builder.Diff<?>> r0 = r2.diffs
            org.apache.commons.lang3.builder.DiffBuilder$4 r1 = new org.apache.commons.lang3.builder.DiffBuilder$4
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
        L18:
            return r2
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(java.lang.String r3, char[] r4, char[] r5) {
            r2 = this;
            r2.validateFieldNameNotNull(r3)
            boolean r0 = r2.objectsTriviallyEqual
            if (r0 == 0) goto L8
            return r2
        L8:
            boolean r0 = java.util.Arrays.equals(r4, r5)
            if (r0 != 0) goto L18
            java.util.List<org.apache.commons.lang3.builder.Diff<?>> r0 = r2.diffs
            org.apache.commons.lang3.builder.DiffBuilder$6 r1 = new org.apache.commons.lang3.builder.DiffBuilder$6
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
        L18:
            return r2
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(java.lang.String r3, double[] r4, double[] r5) {
            r2 = this;
            r2.validateFieldNameNotNull(r3)
            boolean r0 = r2.objectsTriviallyEqual
            if (r0 == 0) goto L8
            return r2
        L8:
            boolean r0 = java.util.Arrays.equals(r4, r5)
            if (r0 != 0) goto L18
            java.util.List<org.apache.commons.lang3.builder.Diff<?>> r0 = r2.diffs
            org.apache.commons.lang3.builder.DiffBuilder$8 r1 = new org.apache.commons.lang3.builder.DiffBuilder$8
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
        L18:
            return r2
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(java.lang.String r3, float[] r4, float[] r5) {
            r2 = this;
            r2.validateFieldNameNotNull(r3)
            boolean r0 = r2.objectsTriviallyEqual
            if (r0 == 0) goto L8
            return r2
        L8:
            boolean r0 = java.util.Arrays.equals(r4, r5)
            if (r0 != 0) goto L18
            java.util.List<org.apache.commons.lang3.builder.Diff<?>> r0 = r2.diffs
            org.apache.commons.lang3.builder.DiffBuilder$10 r1 = new org.apache.commons.lang3.builder.DiffBuilder$10
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
        L18:
            return r2
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(java.lang.String r3, int[] r4, int[] r5) {
            r2 = this;
            r2.validateFieldNameNotNull(r3)
            boolean r0 = r2.objectsTriviallyEqual
            if (r0 == 0) goto L8
            return r2
        L8:
            boolean r0 = java.util.Arrays.equals(r4, r5)
            if (r0 != 0) goto L18
            java.util.List<org.apache.commons.lang3.builder.Diff<?>> r0 = r2.diffs
            org.apache.commons.lang3.builder.DiffBuilder$12 r1 = new org.apache.commons.lang3.builder.DiffBuilder$12
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
        L18:
            return r2
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(java.lang.String r3, long[] r4, long[] r5) {
            r2 = this;
            r2.validateFieldNameNotNull(r3)
            boolean r0 = r2.objectsTriviallyEqual
            if (r0 == 0) goto L8
            return r2
        L8:
            boolean r0 = java.util.Arrays.equals(r4, r5)
            if (r0 != 0) goto L18
            java.util.List<org.apache.commons.lang3.builder.Diff<?>> r0 = r2.diffs
            org.apache.commons.lang3.builder.DiffBuilder$14 r1 = new org.apache.commons.lang3.builder.DiffBuilder$14
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
        L18:
            return r2
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(java.lang.String r3, java.lang.Object[] r4, java.lang.Object[] r5) {
            r2 = this;
            r2.validateFieldNameNotNull(r3)
            boolean r0 = r2.objectsTriviallyEqual
            if (r0 == 0) goto L8
            return r2
        L8:
            boolean r0 = java.util.Arrays.equals(r4, r5)
            if (r0 != 0) goto L18
            java.util.List<org.apache.commons.lang3.builder.Diff<?>> r0 = r2.diffs
            org.apache.commons.lang3.builder.DiffBuilder$18 r1 = new org.apache.commons.lang3.builder.DiffBuilder$18
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
        L18:
            return r2
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(java.lang.String r3, short[] r4, short[] r5) {
            r2 = this;
            r2.validateFieldNameNotNull(r3)
            boolean r0 = r2.objectsTriviallyEqual
            if (r0 == 0) goto L8
            return r2
        L8:
            boolean r0 = java.util.Arrays.equals(r4, r5)
            if (r0 != 0) goto L18
            java.util.List<org.apache.commons.lang3.builder.Diff<?>> r0 = r2.diffs
            org.apache.commons.lang3.builder.DiffBuilder$16 r1 = new org.apache.commons.lang3.builder.DiffBuilder$16
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
        L18:
            return r2
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(java.lang.String r3, boolean[] r4, boolean[] r5) {
            r2 = this;
            r2.validateFieldNameNotNull(r3)
            boolean r0 = r2.objectsTriviallyEqual
            if (r0 == 0) goto L8
            return r2
        L8:
            boolean r0 = java.util.Arrays.equals(r4, r5)
            if (r0 != 0) goto L18
            java.util.List<org.apache.commons.lang3.builder.Diff<?>> r0 = r2.diffs
            org.apache.commons.lang3.builder.DiffBuilder$2 r1 = new org.apache.commons.lang3.builder.DiffBuilder$2
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
        L18:
            return r2
    }

    @Override // org.apache.commons.lang3.builder.Builder
    public /* bridge */ /* synthetic */ org.apache.commons.lang3.builder.DiffResult build() {
            r1 = this;
            org.apache.commons.lang3.builder.DiffResult r0 = r1.build2()
            return r0
    }

    @Override // org.apache.commons.lang3.builder.Builder
    /* renamed from: build, reason: avoid collision after fix types in other method */
    public org.apache.commons.lang3.builder.DiffResult build2() {
            r5 = this;
            org.apache.commons.lang3.builder.DiffResult r0 = new org.apache.commons.lang3.builder.DiffResult
            java.lang.Object r1 = r5.left
            java.lang.Object r2 = r5.right
            java.util.List<org.apache.commons.lang3.builder.Diff<?>> r3 = r5.diffs
            org.apache.commons.lang3.builder.ToStringStyle r4 = r5.style
            r0.<init>(r1, r2, r3, r4)
            return r0
    }
}
