package kotlin.text;

/* compiled from: StringsJVM.kt */
/* loaded from: classes2.dex */
class StringsKt__StringsJVMKt extends kotlin.text.StringsKt__StringNumberConversionsKt {
    public static java.lang.String decodeToString(byte[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
            r0.<init>(r2, r1)
            return r0
    }

    public static byte[] encodeToByteArray(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.nio.charset.Charset r0 = kotlin.text.Charsets.UTF_8
            byte[] r1 = r1.getBytes(r0)
            java.lang.String r0 = "this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
    }

    public static final boolean isBlank(java.lang.CharSequence r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r4.length()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L3e
            kotlin.ranges.IntRange r0 = kotlin.text.StringsKt__StringsKt.getIndices(r4)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L20
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L20
        L1e:
            r4 = 1
            goto L3c
        L20:
            java.util.Iterator r0 = r0.iterator()
        L24:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L1e
            r3 = r0
            kotlin.collections.IntIterator r3 = (kotlin.collections.IntIterator) r3
            int r3 = r3.nextInt()
            char r3 = r4.charAt(r3)
            boolean r3 = kotlin.text.CharsKt__CharJVMKt.isWhitespace(r3)
            if (r3 != 0) goto L24
            r4 = 0
        L3c:
            if (r4 == 0) goto L3f
        L3e:
            r1 = 1
        L3f:
            return r1
    }

    public static final boolean regionMatches(java.lang.String r6, int r7, java.lang.String r8, int r9, int r10, boolean r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            if (r11 != 0) goto L11
            boolean r6 = r6.regionMatches(r7, r8, r9, r10)
            goto L1b
        L11:
            r0 = r6
            r1 = r11
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            boolean r6 = r0.regionMatches(r1, r2, r3, r4, r5)
        L1b:
            return r6
    }

    public static final java.lang.String replace(java.lang.String r6, java.lang.String r7, java.lang.String r8, boolean r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "oldValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "newValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
            int r1 = kotlin.text.StringsKt__StringsKt.indexOf(r6, r7, r0, r9)
            if (r1 >= 0) goto L17
            return r6
        L17:
            int r2 = r7.length()
            r3 = 1
            int r3 = kotlin.ranges.RangesKt.coerceAtLeast(r2, r3)
            int r4 = r6.length()
            int r4 = r4 - r2
            int r5 = r8.length()
            int r4 = r4 + r5
            if (r4 < 0) goto L57
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
        L31:
            r5.append(r6, r0, r1)
            r5.append(r8)
            int r0 = r1 + r2
            int r4 = r6.length()
            if (r1 >= r4) goto L46
            int r1 = r1 + r3
            int r1 = kotlin.text.StringsKt__StringsKt.indexOf(r6, r7, r1, r9)
            if (r1 > 0) goto L31
        L46:
            int r7 = r6.length()
            r5.append(r6, r0, r7)
            java.lang.String r6 = r5.toString()
            java.lang.String r7 = "stringBuilder.append(this, i, length).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            return r6
        L57:
            java.lang.OutOfMemoryError r6 = new java.lang.OutOfMemoryError
            r6.<init>()
            throw r6
    }

    public static /* synthetic */ java.lang.String replace$default(java.lang.String r0, java.lang.String r1, java.lang.String r2, boolean r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            java.lang.String r0 = replace(r0, r1, r2, r3)
            return r0
    }

    public static final boolean startsWith(java.lang.String r6, java.lang.String r7, boolean r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            if (r8 != 0) goto L11
            boolean r6 = r6.startsWith(r7)
            return r6
        L11:
            r1 = 0
            r3 = 0
            int r4 = r7.length()
            r0 = r6
            r2 = r7
            r5 = r8
            boolean r6 = regionMatches(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static /* synthetic */ boolean startsWith$default(java.lang.String r0, java.lang.String r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            boolean r0 = startsWith(r0, r1, r2)
            return r0
    }
}
