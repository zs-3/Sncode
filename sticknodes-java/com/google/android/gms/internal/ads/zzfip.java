package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzfip {
    private final java.util.LinkedList zza;
    private final int zzb;
    private final int zzc;
    private final com.google.android.gms.internal.ads.zzfjo zzd;

    public zzfip(int r2, int r3) {
            r1 = this;
            r1.<init>()
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.zza = r0
            r1.zzb = r2
            r1.zzc = r3
            com.google.android.gms.internal.ads.zzfjo r2 = new com.google.android.gms.internal.ads.zzfjo
            r2.<init>()
            r1.zzd = r2
            return
    }

    private final void zzi() {
            r5 = this;
        L0:
            java.util.LinkedList r0 = r5.zza
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2d
            java.util.LinkedList r0 = r5.zza
            java.lang.Object r0 = r0.getFirst()
            com.google.android.gms.internal.ads.zzfiz r0 = (com.google.android.gms.internal.ads.zzfiz) r0
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzu.zzB()
            long r1 = r1.currentTimeMillis()
            long r3 = r0.zzd
            long r1 = r1 - r3
            int r0 = r5.zzc
            long r3 = (long) r0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L2d
            com.google.android.gms.internal.ads.zzfjo r0 = r5.zzd
            r0.zzg()
            java.util.LinkedList r0 = r5.zza
            r0.remove()
            goto L0
        L2d:
            return
    }

    public final int zza() {
            r1 = this;
            com.google.android.gms.internal.ads.zzfjo r0 = r1.zzd
            int r0 = r0.zza()
            return r0
    }

    public final int zzb() {
            r1 = this;
            r1.zzi()
            java.util.LinkedList r0 = r1.zza
            int r0 = r0.size()
            return r0
    }

    public final long zzc() {
            r2 = this;
            com.google.android.gms.internal.ads.zzfjo r0 = r2.zzd
            long r0 = r0.zzb()
            return r0
    }

    public final long zzd() {
            r2 = this;
            com.google.android.gms.internal.ads.zzfjo r0 = r2.zzd
            long r0 = r0.zzc()
            return r0
    }

    public final com.google.android.gms.internal.ads.zzfiz zze() {
            r2 = this;
            com.google.android.gms.internal.ads.zzfjo r0 = r2.zzd
            r0.zzf()
            r2.zzi()
            java.util.LinkedList r0 = r2.zza
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L12
            r0 = 0
            return r0
        L12:
            java.util.LinkedList r0 = r2.zza
            java.lang.Object r0 = r0.remove()
            com.google.android.gms.internal.ads.zzfiz r0 = (com.google.android.gms.internal.ads.zzfiz) r0
            if (r0 == 0) goto L21
            com.google.android.gms.internal.ads.zzfjo r1 = r2.zzd
            r1.zzh()
        L21:
            return r0
    }

    public final com.google.android.gms.internal.ads.zzfjn zzf() {
            r1 = this;
            com.google.android.gms.internal.ads.zzfjo r0 = r1.zzd
            com.google.android.gms.internal.ads.zzfjn r0 = r0.zzd()
            return r0
    }

    public final java.lang.String zzg() {
            r1 = this;
            com.google.android.gms.internal.ads.zzfjo r0 = r1.zzd
            java.lang.String r0 = r0.zze()
            return r0
    }

    public final boolean zzh(com.google.android.gms.internal.ads.zzfiz r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzfjo r0 = r2.zzd
            r0.zzf()
            r2.zzi()
            java.util.LinkedList r0 = r2.zza
            int r0 = r0.size()
            int r1 = r2.zzb
            if (r0 != r1) goto L14
            r3 = 0
            return r3
        L14:
            java.util.LinkedList r0 = r2.zza
            r0.add(r3)
            r3 = 1
            return r3
    }
}
