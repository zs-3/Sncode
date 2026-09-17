package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbcm {
    private final int zza;
    private final java.lang.String zzb;
    private final java.lang.Object zzc;
    private final java.lang.Object zzd;

    /* synthetic */ zzbcm(int r1, java.lang.String r2, java.lang.Object r3, java.lang.Object r4, com.google.android.gms.internal.ads.zzbcl r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            com.google.android.gms.internal.ads.zzbcn r1 = com.google.android.gms.ads.internal.client.zzbe.zza()
            r1.zzd(r0)
            return
    }

    public static com.google.android.gms.internal.ads.zzbcm zzf(int r1, java.lang.String r2, float r3, float r4) {
            com.google.android.gms.internal.ads.zzbcj r1 = new com.google.android.gms.internal.ads.zzbcj
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r0 = 1
            r1.<init>(r0, r2, r3, r4)
            return r1
    }

    public static com.google.android.gms.internal.ads.zzbcm zzg(int r1, java.lang.String r2, int r3, int r4) {
            com.google.android.gms.internal.ads.zzbch r1 = new com.google.android.gms.internal.ads.zzbch
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0 = 1
            r1.<init>(r0, r2, r3, r4)
            return r1
    }

    public static com.google.android.gms.internal.ads.zzbcm zzh(int r0, java.lang.String r1, long r2, long r4) {
            com.google.android.gms.internal.ads.zzbci r0 = new com.google.android.gms.internal.ads.zzbci
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Long r3 = java.lang.Long.valueOf(r4)
            r4 = 1
            r0.<init>(r4, r1, r2, r3)
            return r0
    }

    public static com.google.android.gms.internal.ads.zzbcm zzi(int r2, java.lang.String r3) {
            com.google.android.gms.internal.ads.zzbck r2 = new com.google.android.gms.internal.ads.zzbck
            r3 = 1
            java.lang.String r0 = "gads:sdk_core_constants:experiment_id"
            r1 = 0
            r2.<init>(r3, r0, r1, r1)
            com.google.android.gms.internal.ads.zzbcn r3 = com.google.android.gms.ads.internal.client.zzbe.zza()
            r3.zzc(r2)
            return r2
    }

    protected abstract java.lang.Object zza(org.json.JSONObject r1);

    public abstract java.lang.Object zzb(android.os.Bundle r1);

    protected abstract java.lang.Object zzc(android.content.SharedPreferences r1);

    public abstract void zzd(android.content.SharedPreferences.Editor r1, java.lang.Object r2);

    public final int zze() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }

    public final java.lang.Object zzj() {
            r1 = this;
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r0.zza(r1)
            return r0
    }

    public final java.lang.Object zzk() {
            r1 = this;
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            boolean r0 = r0.zzf()
            if (r0 == 0) goto Ld
            java.lang.Object r0 = r1.zzd
            goto Lf
        Ld:
            java.lang.Object r0 = r1.zzc
        Lf:
            return r0
    }

    public final java.lang.String zzl() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }
}
