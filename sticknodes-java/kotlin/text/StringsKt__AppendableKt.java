package kotlin.text;

/* compiled from: Appendable.kt */
/* loaded from: classes2.dex */
class StringsKt__AppendableKt {
    public static <T> void appendElement(java.lang.Appendable r1, T r2, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.CharSequence> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            if (r3 == 0) goto L11
            java.lang.Object r2 = r3.invoke(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.append(r2)
            goto L34
        L11:
            if (r2 != 0) goto L15
            r3 = 1
            goto L17
        L15:
            boolean r3 = r2 instanceof java.lang.CharSequence
        L17:
            if (r3 == 0) goto L1f
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.append(r2)
            goto L34
        L1f:
            boolean r3 = r2 instanceof java.lang.Character
            if (r3 == 0) goto L2d
            java.lang.Character r2 = (java.lang.Character) r2
            char r2 = r2.charValue()
            r1.append(r2)
            goto L34
        L2d:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.append(r2)
        L34:
            return
    }
}
