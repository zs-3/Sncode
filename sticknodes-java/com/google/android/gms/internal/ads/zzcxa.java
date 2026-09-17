package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzcxa implements com.google.android.gms.internal.ads.zzczo, com.google.android.gms.internal.ads.zzcyv {
    private final com.google.android.gms.internal.ads.zzfgh zza;

    public zzcxa(android.content.Context r1, com.google.android.gms.internal.ads.zzfgh r2, com.google.android.gms.internal.ads.zzbtr r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final void zzdj(android.content.Context r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final void zzdl(android.content.Context r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final void zzdm(android.content.Context r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzs() {
            r2 = this;
            com.google.android.gms.internal.ads.zzfgh r0 = r2.zza
            com.google.android.gms.internal.ads.zzbts r0 = r0.zzad
            if (r0 == 0) goto L25
            boolean r0 = r0.zza
            if (r0 != 0) goto Lb
            goto L25
        Lb:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.internal.ads.zzfgh r1 = r2.zza
            com.google.android.gms.internal.ads.zzbts r1 = r1.zzad
            java.lang.String r1 = r1.zzb
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L25
            com.google.android.gms.internal.ads.zzfgh r1 = r2.zza
            com.google.android.gms.internal.ads.zzbts r1 = r1.zzad
            java.lang.String r1 = r1.zzb
            r0.add(r1)
        L25:
            return
    }
}
