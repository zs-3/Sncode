package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfqb {
    public static void zza() {
            boolean r0 = com.google.android.gms.internal.ads.zzfog.zzb()
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Method called before OM SDK activation"
            r0.<init>(r1)
            throw r0
    }

    public static void zzb(java.lang.String r0, java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
    }

    public static void zzc(java.lang.Object r0, java.lang.String r1) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
    }

    public static void zzd(java.lang.String r0, int r1, java.lang.String r2) {
            int r0 = r0.length()
            r1 = 256(0x100, float:3.59E-43)
            if (r0 > r1) goto L9
            return
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "CustomReferenceData is greater than 256 characters"
            r0.<init>(r1)
            throw r0
    }
}
