package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbwj extends com.google.android.gms.internal.ads.zzbwl {
    private final java.lang.String zza;
    private final int zzb;

    public zzbwj(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L28
            boolean r1 = r4 instanceof com.google.android.gms.internal.ads.zzbwj
            if (r1 != 0) goto L8
            goto L28
        L8:
            com.google.android.gms.internal.ads.zzbwj r4 = (com.google.android.gms.internal.ads.zzbwj) r4
            java.lang.String r1 = r3.zza
            java.lang.String r2 = r4.zza
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r2)
            if (r1 == 0) goto L28
            int r1 = r3.zzb
            int r4 = r4.zzb
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r1, r4)
            if (r4 == 0) goto L28
            r4 = 1
            return r4
        L28:
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final int zzb() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final java.lang.String zzc() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }
}
