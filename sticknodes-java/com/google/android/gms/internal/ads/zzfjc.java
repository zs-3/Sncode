package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfjc implements com.google.android.gms.internal.ads.zzfja {
    private final java.lang.String zza;

    public zzfjc(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzfja
    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.gms.internal.ads.zzfjc
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            com.google.android.gms.internal.ads.zzfjc r2 = (com.google.android.gms.internal.ads.zzfjc) r2
            java.lang.String r0 = r1.zza
            java.lang.String r2 = r2.zza
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzfja
    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.zza
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }
}
