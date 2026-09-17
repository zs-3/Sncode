package kotlin.comparisons;

/* compiled from: Comparisons.kt */
/* loaded from: classes2.dex */
class ComparisonsKt__ComparisonsKt {
    public static <T extends java.lang.Comparable<?>> int compareValues(T r0, T r1) {
            if (r0 != r1) goto L4
            r0 = 0
            return r0
        L4:
            if (r0 != 0) goto L8
            r0 = -1
            return r0
        L8:
            if (r1 != 0) goto Lc
            r0 = 1
            return r0
        Lc:
            int r0 = r0.compareTo(r1)
            return r0
    }
}
