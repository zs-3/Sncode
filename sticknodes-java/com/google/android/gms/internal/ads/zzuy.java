package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzuy {
    public final java.lang.Object zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final int zze;

    public zzuy(java.lang.Object r8, int r9, int r10, long r11) {
            r7 = this;
            r6 = -1
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r6)
            return
    }

    private zzuy(java.lang.Object r1, int r2, int r3, long r4, int r6) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r6
            return
    }

    public zzuy(java.lang.Object r8, long r9) {
            r7 = this;
            r2 = -1
            r3 = -1
            r6 = -1
            r0 = r7
            r1 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r6)
            return
    }

    public zzuy(java.lang.Object r8, long r9, int r11) {
            r7 = this;
            r2 = -1
            r3 = -1
            r0 = r7
            r1 = r8
            r4 = r9
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r6)
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.android.gms.internal.ads.zzuy
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.internal.ads.zzuy r8 = (com.google.android.gms.internal.ads.zzuy) r8
            java.lang.Object r1 = r7.zza
            java.lang.Object r3 = r8.zza
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L31
            int r1 = r7.zzb
            int r3 = r8.zzb
            if (r1 != r3) goto L31
            int r1 = r7.zzc
            int r3 = r8.zzc
            if (r1 != r3) goto L31
            long r3 = r7.zzd
            long r5 = r8.zzd
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L31
            int r1 = r7.zze
            int r8 = r8.zze
            if (r1 != r8) goto L31
            return r0
        L31:
            return r2
    }

    public final int hashCode() {
            r4 = this;
            java.lang.Object r0 = r4.zza
            int r0 = r0.hashCode()
            int r0 = r0 + 527
            long r1 = r4.zzd
            int r0 = r0 * 31
            int r3 = r4.zzb
            int r0 = r0 + r3
            int r0 = r0 * 31
            int r3 = r4.zzc
            int r0 = r0 + r3
            int r0 = r0 * 31
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r1 = r4.zze
            int r0 = r0 + r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzuy zza(java.lang.Object r9) {
            r8 = this;
            java.lang.Object r0 = r8.zza
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L9
            return r8
        L9:
            int r3 = r8.zzb
            int r4 = r8.zzc
            long r5 = r8.zzd
            int r7 = r8.zze
            com.google.android.gms.internal.ads.zzuy r0 = new com.google.android.gms.internal.ads.zzuy
            r1 = r0
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r7)
            return r0
    }

    public final boolean zzb() {
            r2 = this;
            int r0 = r2.zzb
            r1 = -1
            if (r0 == r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }
}
