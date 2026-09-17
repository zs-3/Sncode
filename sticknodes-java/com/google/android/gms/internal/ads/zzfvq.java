package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzfvq extends com.google.android.gms.internal.ads.zzfws {
    private final java.lang.String zza;
    private final java.lang.String zzb;

    /* synthetic */ zzfvq(java.lang.String r1, java.lang.String r2, com.google.android.gms.internal.ads.zzfvp r3) {
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
            boolean r1 = r5 instanceof com.google.android.gms.internal.ads.zzfws
            r2 = 0
            if (r1 == 0) goto L37
            com.google.android.gms.internal.ads.zzfws r5 = (com.google.android.gms.internal.ads.zzfws) r5
            java.lang.String r1 = r4.zza
            if (r1 != 0) goto L16
            java.lang.String r1 = r5.zzb()
            if (r1 != 0) goto L37
            goto L20
        L16:
            java.lang.String r3 = r5.zzb()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L37
        L20:
            java.lang.String r1 = r4.zzb
            if (r1 != 0) goto L2b
            java.lang.String r5 = r5.zza()
            if (r5 != 0) goto L37
            goto L36
        L2b:
            java.lang.String r5 = r5.zza()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L36
            goto L37
        L36:
            return r0
        L37:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.zza
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            java.lang.String r2 = r3.zzb
            if (r2 != 0) goto L10
            goto L14
        L10:
            int r1 = r2.hashCode()
        L14:
            r2 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r2
            int r0 = r0 * r2
            r0 = r0 ^ r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "OverlayDisplayUpdateRequest{sessionToken="
            r0.append(r1)
            java.lang.String r1 = r2.zza
            r0.append(r1)
            java.lang.String r1 = ", appId="
            r0.append(r1)
            java.lang.String r1 = r2.zzb
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfws
    public final java.lang.String zza() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfws
    public final java.lang.String zzb() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }
}
