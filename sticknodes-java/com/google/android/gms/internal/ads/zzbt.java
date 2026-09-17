package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbt {
    private final com.google.android.gms.internal.ads.zzab zza;

    static {
            com.google.android.gms.internal.ads.zzbr r0 = new com.google.android.gms.internal.ads.zzbr
            r0.<init>()
            r0.zze()
            r0 = 0
            r1 = 36
            java.lang.Integer.toString(r0, r1)
            return
    }

    /* synthetic */ zzbt(com.google.android.gms.internal.ads.zzab r1, com.google.android.gms.internal.ads.zzbs r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzab zza(com.google.android.gms.internal.ads.zzbt r0) {
            com.google.android.gms.internal.ads.zzab r0 = r0.zza
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.google.android.gms.internal.ads.zzbt
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            com.google.android.gms.internal.ads.zzbt r2 = (com.google.android.gms.internal.ads.zzbt) r2
            com.google.android.gms.internal.ads.zzab r0 = r1.zza
            com.google.android.gms.internal.ads.zzab r2 = r2.zza
            boolean r2 = r0.equals(r2)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            com.google.android.gms.internal.ads.zzab r0 = r1.zza
            int r0 = r0.hashCode()
            return r0
    }
}
