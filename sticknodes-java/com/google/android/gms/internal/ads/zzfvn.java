package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzfvn extends com.google.android.gms.internal.ads.zzfwp {
    private final int zza;
    private final java.lang.String zzb;

    /* synthetic */ zzfvn(int r1, java.lang.String r2, com.google.android.gms.internal.ads.zzfvm r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.internal.ads.zzfwp
            r2 = 0
            if (r1 == 0) goto L2a
            com.google.android.gms.internal.ads.zzfwp r5 = (com.google.android.gms.internal.ads.zzfwp) r5
            int r1 = r4.zza
            int r3 = r5.zza()
            if (r1 != r3) goto L2a
            java.lang.String r1 = r4.zzb
            if (r1 != 0) goto L1e
            java.lang.String r5 = r5.zzb()
            if (r5 != 0) goto L2a
            goto L29
        L1e:
            java.lang.String r5 = r5.zzb()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L29
            goto L2a
        L29:
            return r0
        L2a:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.zzb
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            int r1 = r3.zza
            r2 = 1000003(0xf4243, float:1.401303E-39)
            r1 = r1 ^ r2
            int r1 = r1 * r2
            r0 = r0 ^ r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "OverlayDisplayState{statusCode="
            r0.append(r1)
            int r1 = r2.zza
            r0.append(r1)
            java.lang.String r1 = ", sessionToken="
            r0.append(r1)
            java.lang.String r1 = r2.zzb
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfwp
    public final int zza() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfwp
    public final java.lang.String zzb() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }
}
