package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaz {
    public static final com.google.android.gms.internal.ads.zzaz zza = null;
    public final android.net.Uri zzb;
    public final java.lang.String zzc;
    public final android.os.Bundle zzd;

    static {
            com.google.android.gms.internal.ads.zzay r0 = new com.google.android.gms.internal.ads.zzay
            r0.<init>()
            com.google.android.gms.internal.ads.zzaz r1 = new com.google.android.gms.internal.ads.zzaz
            r1.<init>(r0)
            com.google.android.gms.internal.ads.zzaz.zza = r1
            r0 = 0
            r1 = 36
            java.lang.Integer.toString(r0, r1)
            r0 = 1
            java.lang.Integer.toString(r0, r1)
            r0 = 2
            java.lang.Integer.toString(r0, r1)
            return
    }

    private zzaz(com.google.android.gms.internal.ads.zzay r1) {
            r0 = this;
            r0.<init>()
            r1 = 0
            r0.zzb = r1
            r0.zzc = r1
            r0.zzd = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof com.google.android.gms.internal.ads.zzaz
            if (r1 != 0) goto La
            r3 = 0
            return r3
        La:
            com.google.android.gms.internal.ads.zzaz r3 = (com.google.android.gms.internal.ads.zzaz) r3
            android.net.Uri r3 = r3.zzb
            return r0
    }

    public final int hashCode() {
            r1 = this;
            r0 = 0
            return r0
    }
}
