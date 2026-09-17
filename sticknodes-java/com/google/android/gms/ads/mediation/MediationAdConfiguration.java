package com.google.android.gms.ads.mediation;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public class MediationAdConfiguration {
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;
    private final java.lang.String zza;
    private final android.os.Bundle zzb;
    private final android.os.Bundle zzc;
    private final android.content.Context zzd;
    private final boolean zze;
    private final int zzf;
    private final int zzg;
    private final java.lang.String zzh;
    private final java.lang.String zzi;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface TagForChildDirectedTreatment {
    }

    public MediationAdConfiguration(android.content.Context r1, java.lang.String r2, android.os.Bundle r3, android.os.Bundle r4, boolean r5, android.location.Location r6, int r7, int r8, java.lang.String r9, java.lang.String r10) {
            r0 = this;
            r0.<init>()
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r1
            r0.zze = r5
            r0.zzf = r7
            r0.zzg = r8
            r0.zzh = r9
            r0.zzi = r10
            return
    }

    public java.lang.String getBidResponse() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    public android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.zzd
            return r0
    }

    public java.lang.String getMaxAdContentRating() {
            r1 = this;
            java.lang.String r0 = r1.zzh
            return r0
    }

    public android.os.Bundle getMediationExtras() {
            r1 = this;
            android.os.Bundle r0 = r1.zzc
            return r0
    }

    public android.os.Bundle getServerParameters() {
            r1 = this;
            android.os.Bundle r0 = r1.zzb
            return r0
    }

    public java.lang.String getWatermark() {
            r1 = this;
            java.lang.String r0 = r1.zzi
            return r0
    }

    public boolean isTestRequest() {
            r1 = this;
            boolean r0 = r1.zze
            return r0
    }

    public int taggedForChildDirectedTreatment() {
            r1 = this;
            int r0 = r1.zzf
            return r0
    }

    public int taggedForUnderAgeTreatment() {
            r1 = this;
            int r0 = r1.zzg
            return r0
    }
}
