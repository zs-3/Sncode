package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzb {
    public static final com.google.android.gms.internal.ads.zzb zza = null;
    private static final com.google.android.gms.internal.ads.zza zze = null;
    public final int zzb;
    public final long zzc;
    public final int zzd;
    private final com.google.android.gms.internal.ads.zza[] zzf;

    static {
            com.google.android.gms.internal.ads.zzb r8 = new com.google.android.gms.internal.ads.zzb
            r9 = 0
            com.google.android.gms.internal.ads.zza[] r2 = new com.google.android.gms.internal.ads.zza[r9]
            r1 = 0
            r3 = 0
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r7)
            com.google.android.gms.internal.ads.zzb.zza = r8
            com.google.android.gms.internal.ads.zza r0 = new com.google.android.gms.internal.ads.zza
            r1 = 0
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zza r0 = r0.zzb(r9)
            com.google.android.gms.internal.ads.zzb.zze = r0
            r0 = 1
            r1 = 36
            java.lang.Integer.toString(r0, r1)
            r0 = 2
            java.lang.Integer.toString(r0, r1)
            r0 = 3
            java.lang.Integer.toString(r0, r1)
            r0 = 4
            java.lang.Integer.toString(r0, r1)
            return
    }

    private zzb(java.lang.Object r1, com.google.android.gms.internal.ads.zza[] r2, long r3, long r5, int r7) {
            r0 = this;
            r0.<init>()
            r3 = 0
            r0.zzc = r3
            r1 = 0
            r0.zzb = r1
            r0.zzf = r2
            r0.zzd = r1
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L1d
            java.lang.Class<com.google.android.gms.internal.ads.zzb> r2 = com.google.android.gms.internal.ads.zzb.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L1d
        L10:
            com.google.android.gms.internal.ads.zzb r5 = (com.google.android.gms.internal.ads.zzb) r5
            com.google.android.gms.internal.ads.zza[] r2 = r4.zzf
            com.google.android.gms.internal.ads.zza[] r5 = r5.zzf
            boolean r5 = java.util.Arrays.equals(r2, r5)
            if (r5 == 0) goto L1d
            return r0
        L1d:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (int) r0
            com.google.android.gms.internal.ads.zza[] r0 = r2.zzf
            int r1 = r1 * 961
            int r0 = java.util.Arrays.hashCode(r0)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AdPlaybackState(adsId="
            r0.append(r1)
            r1 = 0
            r0.append(r1)
            java.lang.String r1 = ", adResumePositionUs=0, adGroups=["
            r0.append(r1)
            java.lang.String r1 = "])"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final com.google.android.gms.internal.ads.zza zza(int r2) {
            r1 = this;
            if (r2 >= 0) goto L5
            com.google.android.gms.internal.ads.zza r2 = com.google.android.gms.internal.ads.zzb.zze
            goto L9
        L5:
            com.google.android.gms.internal.ads.zza[] r0 = r1.zzf
            r2 = r0[r2]
        L9:
            return r2
    }

    public final boolean zzb(int r1) {
            r0 = this;
            r1 = -1
            r0.zza(r1)
            int r1 = com.google.android.gms.internal.ads.zza.zzi
            r1 = 0
            return r1
    }
}
