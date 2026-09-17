package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcuy implements com.google.android.gms.internal.ads.zzczo, com.google.android.gms.ads.internal.client.zza, com.google.android.gms.internal.ads.zzday, com.google.android.gms.internal.ads.zzcyu, com.google.android.gms.internal.ads.zzcya, com.google.android.gms.internal.ads.zzddk {
    private final com.google.android.gms.common.util.Clock zza;
    private final com.google.android.gms.internal.ads.zzbzw zzb;

    public zzcuy(com.google.android.gms.common.util.Clock r1, com.google.android.gms.internal.ads.zzbzw r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
            r1 = this;
            com.google.android.gms.internal.ads.zzbzw r0 = r1.zzb
            r0.zzd()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zza() {
            r1 = this;
            com.google.android.gms.internal.ads.zzbzw r0 = r1.zzb
            r0.zze()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzb() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzc() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzday
    public final void zzdn(com.google.android.gms.internal.ads.zzbwa r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzday
    public final void zzdo(com.google.android.gms.internal.ads.zzfgt r4) {
            r3 = this;
            com.google.android.gms.common.util.Clock r4 = r3.zza
            com.google.android.gms.internal.ads.zzbzw r0 = r3.zzb
            long r1 = r4.elapsedRealtime()
            r0.zzk(r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzds(com.google.android.gms.internal.ads.zzbwm r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zze() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzf() {
            r0 = this;
            return
    }

    public final java.lang.String zzg() {
            r1 = this;
            com.google.android.gms.internal.ads.zzbzw r0 = r1.zzb
            java.lang.String r0 = r0.zzc()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzddk
    public final void zzh() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzddk
    public final void zzi(com.google.android.gms.internal.ads.zzbcb.zzb r1) {
            r0 = this;
            com.google.android.gms.internal.ads.zzbzw r1 = r0.zzb
            r1.zzi()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzddk
    public final void zzj(com.google.android.gms.internal.ads.zzbcb.zzb r1) {
            r0 = this;
            return
    }

    public final void zzk(com.google.android.gms.ads.internal.client.zzm r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbzw r0 = r1.zzb
            r0.zzj(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzddk
    public final void zzl(boolean r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzddk
    public final void zzm(com.google.android.gms.internal.ads.zzbcb.zzb r1) {
            r0 = this;
            com.google.android.gms.internal.ads.zzbzw r1 = r0.zzb
            r1.zzg()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzddk
    public final void zzn(boolean r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcyu
    public final void zzr() {
            r1 = this;
            com.google.android.gms.internal.ads.zzbzw r0 = r1.zzb
            r0.zzf()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzs() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbzw r0 = r2.zzb
            r1 = 1
            r0.zzh(r1)
            return
    }
}
