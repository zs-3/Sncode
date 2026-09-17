package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public class zzadz implements com.google.android.gms.internal.ads.zzaea {
    private final long zza;
    private final com.google.android.gms.internal.ads.zzady zzb;

    public zzadz(long r3, long r5) {
            r2 = this;
            r2.<init>()
            r2.zza = r3
            r3 = 0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            com.google.android.gms.internal.ads.zzady r1 = new com.google.android.gms.internal.ads.zzady
            if (r0 != 0) goto L10
            com.google.android.gms.internal.ads.zzaeb r3 = com.google.android.gms.internal.ads.zzaeb.zza
            goto L16
        L10:
            com.google.android.gms.internal.ads.zzaeb r0 = new com.google.android.gms.internal.ads.zzaeb
            r0.<init>(r3, r5)
            r3 = r0
        L16:
            r1.<init>(r3, r3)
            r2.zzb = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final long zza() {
            r2 = this;
            long r0 = r2.zza
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final com.google.android.gms.internal.ads.zzady zzg(long r1) {
            r0 = this;
            com.google.android.gms.internal.ads.zzady r1 = r0.zzb
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final boolean zzh() {
            r1 = this;
            r0 = 0
            return r0
    }
}
