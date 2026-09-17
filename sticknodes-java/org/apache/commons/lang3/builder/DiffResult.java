package org.apache.commons.lang3.builder;

/* loaded from: classes2.dex */
public class DiffResult implements java.lang.Iterable<org.apache.commons.lang3.builder.Diff<?>> {
    private static final java.lang.String DIFFERS_STRING = "differs from";
    public static final java.lang.String OBJECTS_SAME_STRING = "";
    private final java.util.List<org.apache.commons.lang3.builder.Diff<?>> diffs;
    private final java.lang.Object lhs;
    private final java.lang.Object rhs;
    private final org.apache.commons.lang3.builder.ToStringStyle style;

    DiffResult(java.lang.Object r6, java.lang.Object r7, java.util.List<org.apache.commons.lang3.builder.Diff<?>> r8, org.apache.commons.lang3.builder.ToStringStyle r9) {
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
            java.lang.String r4 = "Left hand object cannot be null"
            org.apache.commons.lang3.Validate.isTrue(r2, r4, r3)
            if (r7 == 0) goto L15
            r2 = 1
            goto L16
        L15:
            r2 = 0
        L16:
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r4 = "Right hand object cannot be null"
            org.apache.commons.lang3.Validate.isTrue(r2, r4, r3)
            if (r8 == 0) goto L20
            goto L21
        L20:
            r0 = 0
        L21:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "List of differences cannot be null"
            org.apache.commons.lang3.Validate.isTrue(r0, r2, r1)
            r5.diffs = r8
            r5.lhs = r6
            r5.rhs = r7
            if (r9 != 0) goto L35
            org.apache.commons.lang3.builder.ToStringStyle r6 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE
            r5.style = r6
            goto L37
        L35:
            r5.style = r9
        L37:
            return
    }

    public java.util.List<org.apache.commons.lang3.builder.Diff<?>> getDiffs() {
            r1 = this;
            java.util.List<org.apache.commons.lang3.builder.Diff<?>> r0 = r1.diffs
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    public int getNumberOfDiffs() {
            r1 = this;
            java.util.List<org.apache.commons.lang3.builder.Diff<?>> r0 = r1.diffs
            int r0 = r0.size()
            return r0
    }

    public org.apache.commons.lang3.builder.ToStringStyle getToStringStyle() {
            r1 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r1.style
            return r0
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<org.apache.commons.lang3.builder.Diff<?>> iterator() {
            r1 = this;
            java.util.List<org.apache.commons.lang3.builder.Diff<?>> r0 = r1.diffs
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r1.style
            java.lang.String r0 = r1.toString(r0)
            return r0
    }

    public java.lang.String toString(org.apache.commons.lang3.builder.ToStringStyle r6) {
            r5 = this;
            java.util.List<org.apache.commons.lang3.builder.Diff<?>> r0 = r5.diffs
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            java.lang.String r6 = ""
            return r6
        Lb:
            org.apache.commons.lang3.builder.ToStringBuilder r0 = new org.apache.commons.lang3.builder.ToStringBuilder
            java.lang.Object r1 = r5.lhs
            r0.<init>(r1, r6)
            org.apache.commons.lang3.builder.ToStringBuilder r1 = new org.apache.commons.lang3.builder.ToStringBuilder
            java.lang.Object r2 = r5.rhs
            r1.<init>(r2, r6)
            java.util.List<org.apache.commons.lang3.builder.Diff<?>> r6 = r5.diffs
            java.util.Iterator r6 = r6.iterator()
        L1f:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L42
            java.lang.Object r2 = r6.next()
            org.apache.commons.lang3.builder.Diff r2 = (org.apache.commons.lang3.builder.Diff) r2
            java.lang.String r3 = r2.getFieldName()
            java.lang.Object r4 = r2.getLeft()
            r0.append(r3, r4)
            java.lang.String r3 = r2.getFieldName()
            java.lang.Object r2 = r2.getRight()
            r1.append(r3, r2)
            goto L1f
        L42:
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r2 = 0
            java.lang.String r0 = r0.build2()
            r6[r2] = r0
            r0 = 1
            java.lang.String r2 = "differs from"
            r6[r0] = r2
            r0 = 2
            java.lang.String r1 = r1.build2()
            r6[r0] = r1
            java.lang.String r0 = "%s %s %s"
            java.lang.String r6 = java.lang.String.format(r0, r6)
            return r6
    }
}
