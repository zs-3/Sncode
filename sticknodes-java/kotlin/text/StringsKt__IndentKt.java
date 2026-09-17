package kotlin.text;

/* compiled from: Indent.kt */
/* loaded from: classes2.dex */
class StringsKt__IndentKt extends kotlin.text.StringsKt__AppendableKt {
    private static final kotlin.jvm.functions.Function1<java.lang.String, java.lang.String> getIndentFunction$StringsKt__IndentKt(java.lang.String r1) {
            int r0 = r1.length()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto Le
            kotlin.text.StringsKt__IndentKt$getIndentFunction$1 r1 = kotlin.text.StringsKt__IndentKt$getIndentFunction$1.INSTANCE
            goto L14
        Le:
            kotlin.text.StringsKt__IndentKt$getIndentFunction$2 r0 = new kotlin.text.StringsKt__IndentKt$getIndentFunction$2
            r0.<init>(r1)
            r1 = r0
        L14:
            return r1
    }

    private static final int indentWidth$StringsKt__IndentKt(java.lang.String r4) {
            int r0 = r4.length()
            r1 = 0
        L5:
            r2 = -1
            if (r1 >= r0) goto L18
            char r3 = r4.charAt(r1)
            boolean r3 = kotlin.text.CharsKt__CharJVMKt.isWhitespace(r3)
            r3 = r3 ^ 1
            if (r3 == 0) goto L15
            goto L19
        L15:
            int r1 = r1 + 1
            goto L5
        L18:
            r1 = -1
        L19:
            if (r1 != r2) goto L1f
            int r1 = r4.length()
        L1f:
            return r1
    }

    public static final java.lang.String replaceIndent(java.lang.String r14, java.lang.String r15) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "newIndent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.util.List r0 = kotlin.text.StringsKt__StringsKt.lines(r14)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r0.iterator()
        L17:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L30
            java.lang.Object r3 = r2.next()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = kotlin.text.StringsKt__StringsJVMKt.isBlank(r4)
            r4 = r4 ^ 1
            if (r4 == 0) goto L17
            r1.add(r3)
            goto L17
        L30:
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L3f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L57
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            int r3 = indentWidth$StringsKt__IndentKt(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.add(r3)
            goto L3f
        L57:
            java.lang.Comparable r1 = kotlin.collections.CollectionsKt.minOrNull(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r2 = 0
            if (r1 == 0) goto L65
            int r1 = r1.intValue()
            goto L66
        L65:
            r1 = 0
        L66:
            int r14 = r14.length()
            int r3 = r15.length()
            int r4 = r0.size()
            int r3 = r3 * r4
            int r14 = r14 + r3
            kotlin.jvm.functions.Function1 r15 = getIndentFunction$StringsKt__IndentKt(r15)
            int r3 = kotlin.collections.CollectionsKt.getLastIndex(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L86:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto Lbc
            java.lang.Object r5 = r0.next()
            int r6 = r2 + 1
            if (r2 >= 0) goto L97
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L97:
            java.lang.String r5 = (java.lang.String) r5
            if (r2 == 0) goto L9d
            if (r2 != r3) goto La5
        L9d:
            boolean r2 = kotlin.text.StringsKt__StringsJVMKt.isBlank(r5)
            if (r2 == 0) goto La5
            r5 = 0
            goto Lb5
        La5:
            java.lang.String r2 = kotlin.text.StringsKt___StringsKt.drop(r5, r1)
            if (r2 == 0) goto Lb5
            java.lang.Object r2 = r15.invoke(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto Lb4
            goto Lb5
        Lb4:
            r5 = r2
        Lb5:
            if (r5 == 0) goto Lba
            r4.add(r5)
        Lba:
            r2 = r6
            goto L86
        Lbc:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r14)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 124(0x7c, float:1.74E-43)
            r13 = 0
            java.lang.String r6 = "\n"
            java.lang.Appendable r14 = kotlin.collections.CollectionsKt.joinTo$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.StringBuilder r14 = (java.lang.StringBuilder) r14
            java.lang.String r14 = r14.toString()
            java.lang.String r15 = "mapIndexedNotNull { inde…\"\\n\")\n        .toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r15)
            return r14
    }

    public static java.lang.String trimIndent(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = ""
            java.lang.String r1 = replaceIndent(r1, r0)
            return r1
    }
}
