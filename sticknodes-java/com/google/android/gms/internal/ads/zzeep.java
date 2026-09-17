package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzeep extends com.google.android.gms.internal.ads.zzefl {
    private final android.app.Activity zza;
    private final com.google.android.gms.ads.internal.overlay.zzm zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;

    /* synthetic */ zzeep(android.app.Activity r1, com.google.android.gms.ads.internal.overlay.zzm r2, java.lang.String r3, java.lang.String r4, com.google.android.gms.internal.ads.zzeeo r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.internal.ads.zzefl
            r2 = 0
            if (r1 == 0) goto L58
            com.google.android.gms.internal.ads.zzefl r5 = (com.google.android.gms.internal.ads.zzefl) r5
            android.app.Activity r1 = r4.zza
            android.app.Activity r3 = r5.zza()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L58
            com.google.android.gms.ads.internal.overlay.zzm r1 = r4.zzb
            if (r1 != 0) goto L22
            com.google.android.gms.ads.internal.overlay.zzm r1 = r5.zzb()
            if (r1 != 0) goto L58
            goto L2c
        L22:
            com.google.android.gms.ads.internal.overlay.zzm r3 = r5.zzb()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L58
        L2c:
            java.lang.String r1 = r4.zzc
            if (r1 != 0) goto L37
            java.lang.String r1 = r5.zzc()
            if (r1 != 0) goto L58
            goto L41
        L37:
            java.lang.String r3 = r5.zzc()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L58
        L41:
            java.lang.String r1 = r4.zzd
            if (r1 != 0) goto L4c
            java.lang.String r5 = r5.zzd()
            if (r5 != 0) goto L58
            goto L57
        L4c:
            java.lang.String r5 = r5.zzd()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L57
            goto L58
        L57:
            return r0
        L58:
            return r2
    }

    public final int hashCode() {
            r4 = this;
            android.app.Activity r0 = r4.zza
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            com.google.android.gms.ads.internal.overlay.zzm r2 = r4.zzb
            r3 = 0
            if (r2 != 0) goto L11
            r2 = 0
            goto L15
        L11:
            int r2 = r2.hashCode()
        L15:
            int r0 = r0 * r1
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.String r2 = r4.zzc
            if (r2 != 0) goto L20
            r2 = 0
            goto L24
        L20:
            int r2 = r2.hashCode()
        L24:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.String r1 = r4.zzd
            if (r1 != 0) goto L2c
            goto L30
        L2c:
            int r3 = r1.hashCode()
        L30:
            r0 = r0 ^ r3
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            com.google.android.gms.ads.internal.overlay.zzm r0 = r4.zzb
            android.app.Activity r1 = r4.zza
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "OfflineUtilsParams{activity="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = ", adOverlay="
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = ", gwsQueryId="
            r2.append(r0)
            java.lang.String r0 = r4.zzc
            r2.append(r0)
            java.lang.String r0 = ", uri="
            r2.append(r0)
            java.lang.String r0 = r4.zzd
            r2.append(r0)
            java.lang.String r0 = "}"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzefl
    public final android.app.Activity zza() {
            r1 = this;
            android.app.Activity r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzefl
    public final com.google.android.gms.ads.internal.overlay.zzm zzb() {
            r1 = this;
            com.google.android.gms.ads.internal.overlay.zzm r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzefl
    public final java.lang.String zzc() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzefl
    public final java.lang.String zzd() {
            r1 = this;
            java.lang.String r0 = r1.zzd
            return r0
    }
}
