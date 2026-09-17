package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzhbb implements com.google.android.gms.internal.ads.zzhas {
    final int zza;
    final com.google.android.gms.internal.ads.zzhel zzb;
    final boolean zzc;
    final boolean zzd;

    zzhbb(com.google.android.gms.internal.ads.zzhbj r1, int r2, com.google.android.gms.internal.ads.zzhel r3, boolean r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r5
            return
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.lang.Object r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzhbb r2 = (com.google.android.gms.internal.ads.zzhbb) r2
            int r2 = r2.zza
            int r0 = r1.zza
            int r0 = r0 - r2
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhas
    public final int zza() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhas
    public final com.google.android.gms.internal.ads.zzhel zzb() {
            r1 = this;
            com.google.android.gms.internal.ads.zzhel r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhas
    public final com.google.android.gms.internal.ads.zzhem zzc() {
            r1 = this;
            com.google.android.gms.internal.ads.zzhel r0 = r1.zzb
            com.google.android.gms.internal.ads.zzhem r0 = r0.zza()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhas
    public final boolean zzd() {
            r1 = this;
            boolean r0 = r1.zzd
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhas
    public final boolean zze() {
            r1 = this;
            boolean r0 = r1.zzc
            return r0
    }
}
