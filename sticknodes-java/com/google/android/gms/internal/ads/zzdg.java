package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdg {
    public static void zza(android.text.Spannable r5, float r6, int r7, int r8, int r9) {
            java.lang.Class<android.text.style.RelativeSizeSpan> r9 = android.text.style.RelativeSizeSpan.class
            java.lang.Object[] r9 = r5.getSpans(r7, r8, r9)
            android.text.style.RelativeSizeSpan[] r9 = (android.text.style.RelativeSizeSpan[]) r9
            int r0 = r9.length
            r1 = 0
        La:
            r2 = 33
            if (r1 >= r0) goto L28
            r3 = r9[r1]
            int r4 = r5.getSpanStart(r3)
            if (r4 > r7) goto L22
            int r4 = r5.getSpanEnd(r3)
            if (r4 < r8) goto L22
            float r4 = r3.getSizeChange()
            float r6 = r6 * r4
        L22:
            zzc(r5, r3, r7, r8, r2)
            int r1 = r1 + 1
            goto La
        L28:
            android.text.style.RelativeSizeSpan r9 = new android.text.style.RelativeSizeSpan
            r9.<init>(r6)
            r5.setSpan(r9, r7, r8, r2)
            return
    }

    public static void zzb(android.text.Spannable r4, java.lang.Object r5, int r6, int r7, int r8) {
            java.lang.Class r8 = r5.getClass()
            java.lang.Object[] r8 = r4.getSpans(r6, r7, r8)
            int r0 = r8.length
            r1 = 0
        La:
            r2 = 33
            if (r1 >= r0) goto L16
            r3 = r8[r1]
            zzc(r4, r3, r6, r7, r2)
            int r1 = r1 + 1
            goto La
        L16:
            r4.setSpan(r5, r6, r7, r2)
            return
    }

    private static void zzc(android.text.Spannable r0, java.lang.Object r1, int r2, int r3, int r4) {
            int r4 = r0.getSpanStart(r1)
            if (r4 != r2) goto L17
            int r2 = r0.getSpanEnd(r1)
            if (r2 != r3) goto L17
            int r2 = r0.getSpanFlags(r1)
            r3 = 33
            if (r2 != r3) goto L17
            r0.removeSpan(r1)
        L17:
            return
    }
}
