package com.google.common.base;

/* loaded from: classes2.dex */
public final class Preconditions {
    private static java.lang.String badElementIndex(int r4, int r5, java.lang.String r6) {
            r0 = 1
            r1 = 0
            r2 = 2
            if (r4 >= 0) goto L16
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r1] = r6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5[r0] = r4
            java.lang.String r4 = "%s (%s) must not be negative"
            java.lang.String r4 = com.google.common.base.Strings.lenientFormat(r4, r5)
            return r4
        L16:
            if (r5 < 0) goto L30
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r1] = r6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r0] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r3[r2] = r4
            java.lang.String r4 = "%s (%s) must be less than size (%s)"
            java.lang.String r4 = com.google.common.base.Strings.lenientFormat(r4, r3)
            return r4
        L30:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r6 = 26
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r6)
            java.lang.String r6 = "negative size: "
            r0.append(r6)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
    }

    private static java.lang.String badPositionIndex(int r4, int r5, java.lang.String r6) {
            r0 = 1
            r1 = 0
            r2 = 2
            if (r4 >= 0) goto L16
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r1] = r6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5[r0] = r4
            java.lang.String r4 = "%s (%s) must not be negative"
            java.lang.String r4 = com.google.common.base.Strings.lenientFormat(r4, r5)
            return r4
        L16:
            if (r5 < 0) goto L30
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r1] = r6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r0] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r3[r2] = r4
            java.lang.String r4 = "%s (%s) must not be greater than size (%s)"
            java.lang.String r4 = com.google.common.base.Strings.lenientFormat(r4, r3)
            return r4
        L30:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r6 = 26
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r6)
            java.lang.String r6 = "negative size: "
            r0.append(r6)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
    }

    private static java.lang.String badPositionIndexes(int r1, int r2, int r3) {
            if (r1 < 0) goto L29
            if (r1 <= r3) goto L5
            goto L29
        L5:
            if (r2 < 0) goto L22
            if (r2 <= r3) goto La
            goto L22
        La:
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r0 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3[r0] = r2
            r2 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3[r2] = r1
            java.lang.String r1 = "end index (%s) must not be less than start index (%s)"
            java.lang.String r1 = com.google.common.base.Strings.lenientFormat(r1, r3)
            return r1
        L22:
            java.lang.String r1 = "end index"
            java.lang.String r1 = badPositionIndex(r2, r3, r1)
            return r1
        L29:
            java.lang.String r2 = "start index"
            java.lang.String r1 = badPositionIndex(r1, r3, r2)
            return r1
    }

    public static void checkArgument(boolean r0) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
    }

    public static void checkArgument(boolean r0, java.lang.Object r1) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            throw r0
    }

    public static int checkElementIndex(int r1, int r2) {
            java.lang.String r0 = "index"
            int r1 = checkElementIndex(r1, r2, r0)
            return r1
    }

    public static int checkElementIndex(int r1, int r2, java.lang.String r3) {
            if (r1 < 0) goto L5
            if (r1 >= r2) goto L5
            return r1
        L5:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = badElementIndex(r1, r2, r3)
            r0.<init>(r1)
            throw r0
    }

    public static <T> T checkNotNull(T r0) {
            java.util.Objects.requireNonNull(r0)
            return r0
    }

    public static <T> T checkNotNull(T r0, java.lang.Object r1) {
            if (r0 == 0) goto L3
            return r0
        L3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            throw r0
    }

    public static int checkPositionIndex(int r1, int r2) {
            java.lang.String r0 = "index"
            int r1 = checkPositionIndex(r1, r2, r0)
            return r1
    }

    public static int checkPositionIndex(int r1, int r2, java.lang.String r3) {
            if (r1 < 0) goto L5
            if (r1 > r2) goto L5
            return r1
        L5:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = badPositionIndex(r1, r2, r3)
            r0.<init>(r1)
            throw r0
    }

    public static void checkPositionIndexes(int r1, int r2, int r3) {
            if (r1 < 0) goto L7
            if (r2 < r1) goto L7
            if (r2 > r3) goto L7
            return
        L7:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = badPositionIndexes(r1, r2, r3)
            r0.<init>(r1)
            throw r0
    }

    public static void checkState(boolean r0) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    public static void checkState(boolean r0, java.lang.Object r1) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            throw r0
    }

    public static void checkState(boolean r2, java.lang.String r3, java.lang.Object r4) {
            if (r2 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            java.lang.String r3 = com.google.common.base.Strings.lenientFormat(r3, r0)
            r2.<init>(r3)
            throw r2
    }
}
