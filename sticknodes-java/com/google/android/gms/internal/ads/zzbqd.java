package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbqd implements com.google.android.gms.ads.mediation.MediationAdRequest {
    private final java.util.Date zza;
    private final int zzb;
    private final java.util.Set zzc;
    private final boolean zzd;
    private final android.location.Location zze;
    private final int zzf;
    private final boolean zzg;

    public zzbqd(java.util.Date r1, int r2, java.util.Set r3, android.location.Location r4, boolean r5, int r6, boolean r7, int r8, java.lang.String r9) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zze = r4
            r0.zzd = r5
            r0.zzf = r6
            r0.zzg = r7
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @java.lang.Deprecated
    public final java.util.Date getBirthday() {
            r1 = this;
            java.util.Date r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @java.lang.Deprecated
    public final int getGender() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final java.util.Set<java.lang.String> getKeywords() {
            r1 = this;
            java.util.Set r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final android.location.Location getLocation() {
            r1 = this;
            android.location.Location r0 = r1.zze
            return r0
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @java.lang.Deprecated
    public final boolean isDesignedForFamilies() {
            r1 = this;
            boolean r0 = r1.zzg
            return r0
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isTesting() {
            r1 = this;
            boolean r0 = r1.zzd
            return r0
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int taggedForChildDirectedTreatment() {
            r1 = this;
            int r0 = r1.zzf
            return r0
    }
}
