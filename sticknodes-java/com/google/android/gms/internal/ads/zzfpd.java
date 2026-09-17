package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfpd {
    private static final com.google.android.gms.internal.ads.zzfpd zza = null;
    private final java.util.ArrayList zzb;
    private final java.util.ArrayList zzc;

    static {
            com.google.android.gms.internal.ads.zzfpd r0 = new com.google.android.gms.internal.ads.zzfpd
            r0.<init>()
            com.google.android.gms.internal.ads.zzfpd.zza = r0
            return
    }

    private zzfpd() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.zzb = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.zzc = r0
            return
    }

    public static com.google.android.gms.internal.ads.zzfpd zza() {
            com.google.android.gms.internal.ads.zzfpd r0 = com.google.android.gms.internal.ads.zzfpd.zza
            return r0
    }

    public final java.util.Collection zzb() {
            r1 = this;
            java.util.ArrayList r0 = r1.zzc
            java.util.Collection r0 = java.util.Collections.unmodifiableCollection(r0)
            return r0
    }

    public final java.util.Collection zzc() {
            r1 = this;
            java.util.ArrayList r0 = r1.zzb
            java.util.Collection r0 = java.util.Collections.unmodifiableCollection(r0)
            return r0
    }

    public final void zzd(com.google.android.gms.internal.ads.zzfom r2) {
            r1 = this;
            java.util.ArrayList r0 = r1.zzb
            r0.add(r2)
            return
    }

    public final void zze(com.google.android.gms.internal.ads.zzfom r3) {
            r2 = this;
            java.util.ArrayList r0 = r2.zzb
            boolean r1 = r2.zzg()
            r0.remove(r3)
            java.util.ArrayList r0 = r2.zzc
            r0.remove(r3)
            if (r1 == 0) goto L1d
            boolean r3 = r2.zzg()
            if (r3 != 0) goto L1d
            com.google.android.gms.internal.ads.zzfpl r3 = com.google.android.gms.internal.ads.zzfpl.zzb()
            r3.zzg()
        L1d:
            return
    }

    public final void zzf(com.google.android.gms.internal.ads.zzfom r3) {
            r2 = this;
            java.util.ArrayList r0 = r2.zzc
            boolean r1 = r2.zzg()
            r0.add(r3)
            if (r1 != 0) goto L12
            com.google.android.gms.internal.ads.zzfpl r3 = com.google.android.gms.internal.ads.zzfpl.zzb()
            r3.zzf()
        L12:
            return
    }

    public final boolean zzg() {
            r1 = this;
            java.util.ArrayList r0 = r1.zzc
            int r0 = r0.size()
            if (r0 <= 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }
}
