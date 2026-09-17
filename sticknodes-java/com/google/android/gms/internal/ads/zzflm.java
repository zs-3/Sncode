package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzflm implements com.google.android.gms.internal.ads.zzdff, com.google.android.gms.internal.ads.zzcyq, com.google.android.gms.internal.ads.zzdfj {
    private final com.google.android.gms.internal.ads.zzfma zza;
    private final com.google.android.gms.internal.ads.zzflp zzb;

    zzflm(android.content.Context r1, com.google.android.gms.internal.ads.zzfma r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r2
            r2 = 13
            com.google.android.gms.internal.ads.zzflp r1 = com.google.android.gms.internal.ads.zzflo.zza(r1, r2)
            r0.zzb = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdfj
    public final void zza() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdfj
    public final void zzb() {
            r3 = this;
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbek.zzd
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L19
            com.google.android.gms.internal.ads.zzfma r0 = r3.zza
            com.google.android.gms.internal.ads.zzflp r1 = r3.zzb
            r2 = 1
            r1.zzg(r2)
            r0.zza(r1)
        L19:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdff
    public final void zzk() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdff
    public final void zzl() {
            r1 = this;
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbek.zzd
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L13
            com.google.android.gms.internal.ads.zzflp r0 = r1.zzb
            r0.zzi()
        L13:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzq(com.google.android.gms.ads.internal.client.zze r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbek.zzd
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L24
            com.google.android.gms.internal.ads.zzfma r0 = r2.zza
            com.google.android.gms.internal.ads.zzflp r1 = r2.zzb
            com.google.android.gms.ads.AdError r3 = r3.zza()
            java.lang.String r3 = r3.toString()
            r1.zzc(r3)
            r3 = 0
            r1.zzg(r3)
            r0.zza(r1)
        L24:
            return
    }
}
