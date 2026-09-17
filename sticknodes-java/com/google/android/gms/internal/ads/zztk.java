package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zztk {
    public final java.lang.String zza;
    public final boolean zzb;
    public final boolean zzc;

    public zztk(java.lang.String r1, boolean r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L29
            java.lang.Class r2 = r5.getClass()
            java.lang.Class<com.google.android.gms.internal.ads.zztk> r3 = com.google.android.gms.internal.ads.zztk.class
            if (r2 == r3) goto L10
            goto L29
        L10:
            com.google.android.gms.internal.ads.zztk r5 = (com.google.android.gms.internal.ads.zztk) r5
            java.lang.String r2 = r4.zza
            java.lang.String r3 = r5.zza
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L29
            boolean r2 = r4.zzb
            boolean r3 = r5.zzb
            if (r2 != r3) goto L29
            boolean r2 = r4.zzc
            boolean r5 = r5.zzc
            if (r2 != r5) goto L29
            return r0
        L29:
            return r1
    }

    public final int hashCode() {
            r5 = this;
            java.lang.String r0 = r5.zza
            int r0 = r0.hashCode()
            int r0 = r0 + 31
            boolean r1 = r5.zzb
            r2 = 1237(0x4d5, float:1.733E-42)
            r3 = 1231(0x4cf, float:1.725E-42)
            r4 = 1
            if (r4 == r1) goto L14
            r1 = 1237(0x4d5, float:1.733E-42)
            goto L16
        L14:
            r1 = 1231(0x4cf, float:1.725E-42)
        L16:
            int r0 = r0 * 31
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r5.zzc
            if (r4 == r1) goto L20
            goto L22
        L20:
            r2 = 1231(0x4cf, float:1.725E-42)
        L22:
            int r0 = r0 + r2
            return r0
    }
}
