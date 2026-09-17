package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzib {
    public final java.lang.String zza;
    public final com.google.android.gms.internal.ads.zzaf zzb;
    public final com.google.android.gms.internal.ads.zzaf zzc;
    public final int zzd;
    public final int zze;

    public zzib(java.lang.String r3, com.google.android.gms.internal.ads.zzaf r4, com.google.android.gms.internal.ads.zzaf r5, int r6, int r7) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r1 = 1
            if (r6 == 0) goto La
            if (r7 != 0) goto Lb
            r7 = 0
        La:
            r0 = 1
        Lb:
            com.google.android.gms.internal.ads.zzdi.zzd(r0)
            com.google.android.gms.internal.ads.zzdi.zzc(r3)
            r2.zza = r3
            r2.zzb = r4
            java.util.Objects.requireNonNull(r5)
            r2.zzc = r5
            r2.zzd = r6
            r2.zze = r7
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L3d
            java.lang.Class<com.google.android.gms.internal.ads.zzib> r2 = com.google.android.gms.internal.ads.zzib.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L3d
        L10:
            com.google.android.gms.internal.ads.zzib r5 = (com.google.android.gms.internal.ads.zzib) r5
            int r2 = r4.zzd
            int r3 = r5.zzd
            if (r2 != r3) goto L3d
            int r2 = r4.zze
            int r3 = r5.zze
            if (r2 != r3) goto L3d
            java.lang.String r2 = r4.zza
            java.lang.String r3 = r5.zza
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L3d
            com.google.android.gms.internal.ads.zzaf r2 = r4.zzb
            com.google.android.gms.internal.ads.zzaf r3 = r5.zzb
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L3d
            com.google.android.gms.internal.ads.zzaf r2 = r4.zzc
            com.google.android.gms.internal.ads.zzaf r5 = r5.zzc
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L3d
            return r0
        L3d:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.zzd
            int r0 = r0 + 527
            java.lang.String r1 = r3.zza
            int r0 = r0 * 31
            int r2 = r3.zze
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            com.google.android.gms.internal.ads.zzaf r1 = r3.zzb
            int r0 = r0 * 31
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            com.google.android.gms.internal.ads.zzaf r1 = r3.zzc
            int r0 = r0 * 31
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }
}
