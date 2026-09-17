package kotlin.text;

/* compiled from: _Strings.kt */
/* loaded from: classes2.dex */
class StringsKt___StringsKt extends kotlin.text.StringsKt___StringsJvmKt {
    public static final java.lang.String drop(java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            if (r2 < 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            if (r0 == 0) goto L1e
            int r0 = r1.length()
            int r2 = kotlin.ranges.RangesKt.coerceAtMost(r2, r0)
            java.lang.String r1 = r1.substring(r2)
            java.lang.String r2 = "this as java.lang.String).substring(startIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
        L1e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Requested character count "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r2 = " is less than zero."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    public static char last(java.lang.CharSequence r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r0 = r1.length()
            if (r0 != 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 != 0) goto L19
            int r0 = kotlin.text.StringsKt__StringsKt.getLastIndex(r1)
            char r1 = r1.charAt(r0)
            return r1
        L19:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = "Char sequence is empty."
            r1.<init>(r0)
            throw r1
    }
}
