package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfur {
    private final java.lang.String zza;
    private final java.time.Instant zzb;

    public zzfur() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.zza = r0
            r0 = -1
            java.time.Instant r0 = java.time.Instant.ofEpochMilli(r0)
            r2.zzb = r0
            return
    }

    public zzfur(java.lang.String r1, java.time.Instant r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public final java.lang.String zza() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    public final java.time.Instant zzb() {
            r1 = this;
            java.time.Instant r0 = r1.zzb
            return r0
    }

    public final boolean zzc() {
            r2 = this;
            java.lang.String r0 = r2.zza
            if (r0 == 0) goto L10
            java.time.Instant r0 = r2.zzb
            java.time.Instant r1 = java.time.Instant.EPOCH
            boolean r0 = r0.isAfter(r1)
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }
}
