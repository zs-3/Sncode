package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzfrf extends com.google.android.gms.internal.ads.zzfrb {
    private final java.lang.String zza;
    private final boolean zzb;
    private final boolean zzc;

    /* synthetic */ zzfrf(java.lang.String r1, boolean r2, boolean r3, com.google.android.gms.internal.ads.zzfre r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.internal.ads.zzfrb
            r2 = 0
            if (r1 == 0) goto L28
            com.google.android.gms.internal.ads.zzfrb r5 = (com.google.android.gms.internal.ads.zzfrb) r5
            java.lang.String r1 = r4.zza
            java.lang.String r3 = r5.zzb()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L28
            boolean r1 = r4.zzb
            boolean r3 = r5.zzd()
            if (r1 != r3) goto L28
            boolean r1 = r4.zzc
            boolean r5 = r5.zzc()
            if (r1 != r5) goto L28
            return r0
        L28:
            return r2
    }

    public final int hashCode() {
            r6 = this;
            java.lang.String r0 = r6.zza
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            boolean r2 = r6.zzb
            r3 = 1237(0x4d5, float:1.733E-42)
            r4 = 1231(0x4cf, float:1.725E-42)
            r5 = 1
            if (r5 == r2) goto L16
            r2 = 1237(0x4d5, float:1.733E-42)
            goto L18
        L16:
            r2 = 1231(0x4cf, float:1.725E-42)
        L18:
            int r0 = r0 * r1
            r0 = r0 ^ r2
            int r0 = r0 * r1
            boolean r1 = r6.zzc
            if (r5 == r1) goto L22
            goto L24
        L22:
            r3 = 1231(0x4cf, float:1.725E-42)
        L24:
            r0 = r0 ^ r3
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AdShield2Options{clientVersion="
            r0.append(r1)
            java.lang.String r1 = r2.zza
            r0.append(r1)
            java.lang.String r1 = ", shouldGetAdvertisingId="
            r0.append(r1)
            boolean r1 = r2.zzb
            r0.append(r1)
            java.lang.String r1 = ", isGooglePlayServicesAvailable="
            r0.append(r1)
            boolean r1 = r2.zzc
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfrb
    public final java.lang.String zzb() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfrb
    public final boolean zzc() {
            r1 = this;
            boolean r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfrb
    public final boolean zzd() {
            r1 = this;
            boolean r0 = r1.zzb
            return r0
    }
}
