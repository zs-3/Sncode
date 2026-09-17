package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzvw implements com.google.android.gms.internal.ads.zzwn {
    final /* synthetic */ com.google.android.gms.internal.ads.zzvz zza;
    private final int zzb;

    public zzvw(com.google.android.gms.internal.ads.zzvz r1, int r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            r0.zzb = r2
            return
    }

    static /* bridge */ /* synthetic */ int zzc(com.google.android.gms.internal.ads.zzvw r0) {
            int r0 = r0.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzwn
    public final int zza(com.google.android.gms.internal.ads.zzkm r3, com.google.android.gms.internal.ads.zzhq r4, int r5) {
            r2 = this;
            com.google.android.gms.internal.ads.zzvz r0 = r2.zza
            int r1 = r2.zzb
            int r3 = r0.zzf(r1, r3, r4, r5)
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzwn
    public final int zzb(long r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzvz r0 = r2.zza
            int r1 = r2.zzb
            int r3 = r0.zzh(r1, r3)
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzwn
    public final void zzd() throws java.io.IOException {
            r2 = this;
            com.google.android.gms.internal.ads.zzvz r0 = r2.zza
            int r1 = r2.zzb
            r0.zzI(r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzwn
    public final boolean zze() {
            r2 = this;
            com.google.android.gms.internal.ads.zzvz r0 = r2.zza
            int r1 = r2.zzb
            boolean r0 = r0.zzP(r1)
            return r0
    }
}
