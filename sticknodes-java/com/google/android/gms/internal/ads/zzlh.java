package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzlh implements com.google.android.gms.internal.ads.zzky {
    public final com.google.android.gms.internal.ads.zzut zza;
    public final java.lang.Object zzb;
    public final java.util.List zzc;
    public int zzd;
    public boolean zze;

    public zzlh(com.google.android.gms.internal.ads.zzva r2, boolean r3) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzut r0 = new com.google.android.gms.internal.ads.zzut
            r0.<init>(r2, r3)
            r1.zza = r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.zzc = r2
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r1.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzky
    public final com.google.android.gms.internal.ads.zzcc zza() {
            r1 = this;
            com.google.android.gms.internal.ads.zzut r0 = r1.zza
            com.google.android.gms.internal.ads.zzcc r0 = r0.zzC()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzky
    public final java.lang.Object zzb() {
            r1 = this;
            java.lang.Object r0 = r1.zzb
            return r0
    }

    public final void zzc(int r1) {
            r0 = this;
            r0.zzd = r1
            r1 = 0
            r0.zze = r1
            java.util.List r1 = r0.zzc
            r1.clear()
            return
    }
}
