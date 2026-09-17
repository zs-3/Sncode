package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzys {
    public final int zza;
    public final com.google.android.gms.internal.ads.zzlv[] zzb;
    public final com.google.android.gms.internal.ads.zzyl[] zzc;
    public final com.google.android.gms.internal.ads.zzck zzd;
    public final java.lang.Object zze;

    public zzys(com.google.android.gms.internal.ads.zzlv[] r3, com.google.android.gms.internal.ads.zzyl[] r4, com.google.android.gms.internal.ads.zzck r5, java.lang.Object r6) {
            r2 = this;
            r2.<init>()
            int r0 = r3.length
            int r1 = r4.length
            if (r0 != r1) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            com.google.android.gms.internal.ads.zzdi.zzd(r1)
            r2.zzb = r3
            java.lang.Object r3 = r4.clone()
            com.google.android.gms.internal.ads.zzyl[] r3 = (com.google.android.gms.internal.ads.zzyl[]) r3
            r2.zzc = r3
            r2.zzd = r5
            r2.zze = r6
            r2.zza = r0
            return
    }

    public final boolean zza(com.google.android.gms.internal.ads.zzys r4, int r5) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.google.android.gms.internal.ads.zzlv[] r1 = r3.zzb
            r1 = r1[r5]
            com.google.android.gms.internal.ads.zzlv[] r2 = r4.zzb
            r2 = r2[r5]
            boolean r1 = java.util.Objects.equals(r1, r2)
            if (r1 == 0) goto L22
            com.google.android.gms.internal.ads.zzyl[] r1 = r3.zzc
            r1 = r1[r5]
            com.google.android.gms.internal.ads.zzyl[] r4 = r4.zzc
            r4 = r4[r5]
            boolean r4 = java.util.Objects.equals(r1, r4)
            if (r4 == 0) goto L22
            r4 = 1
            return r4
        L22:
            return r0
    }

    public final boolean zzb(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzlv[] r0 = r1.zzb
            r2 = r0[r2]
            if (r2 == 0) goto L8
            r2 = 1
            return r2
        L8:
            r2 = 0
            return r2
    }
}
