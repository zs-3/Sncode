package kotlin.text;

/* compiled from: CharJVM.kt */
/* loaded from: classes2.dex */
class CharsKt__CharJVMKt {
    public static final int checkRadix(int r5) {
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            r1 = 2
            r2 = 36
            r0.<init>(r1, r2)
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto Lf
            return r5
        Lf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "radix "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r5 = " was not in valid range "
            r3.append(r5)
            kotlin.ranges.IntRange r5 = new kotlin.ranges.IntRange
            r5.<init>(r1, r2)
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            r0.<init>(r5)
            throw r0
    }

    public static final int digitOf(char r0, int r1) {
            int r0 = java.lang.Character.digit(r0, r1)
            return r0
    }

    public static final boolean isWhitespace(char r1) {
            boolean r0 = java.lang.Character.isWhitespace(r1)
            if (r0 != 0) goto Lf
            boolean r1 = java.lang.Character.isSpaceChar(r1)
            if (r1 == 0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            goto L10
        Lf:
            r1 = 1
        L10:
            return r1
    }
}
