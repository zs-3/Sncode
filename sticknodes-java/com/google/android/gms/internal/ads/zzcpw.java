package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcpw implements com.google.android.gms.internal.ads.zzayv {
    private com.google.android.gms.internal.ads.zzcfo zza;
    private final java.util.concurrent.Executor zzb;
    private final com.google.android.gms.internal.ads.zzcpi zzc;
    private final com.google.android.gms.common.util.Clock zzd;
    private boolean zze;
    private boolean zzf;
    private final com.google.android.gms.internal.ads.zzcpl zzg;

    public zzcpw(java.util.concurrent.Executor r2, com.google.android.gms.internal.ads.zzcpi r3, com.google.android.gms.common.util.Clock r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zze = r0
            r1.zzf = r0
            com.google.android.gms.internal.ads.zzcpl r0 = new com.google.android.gms.internal.ads.zzcpl
            r0.<init>()
            r1.zzg = r0
            r1.zzb = r2
            r1.zzc = r3
            r1.zzd = r4
            return
    }

    private final void zzg() {
            r3 = this;
            com.google.android.gms.internal.ads.zzcpi r0 = r3.zzc     // Catch: org.json.JSONException -> L17
            com.google.android.gms.internal.ads.zzcpl r1 = r3.zzg     // Catch: org.json.JSONException -> L17
            org.json.JSONObject r0 = r0.zza(r1)     // Catch: org.json.JSONException -> L17
            com.google.android.gms.internal.ads.zzcfo r1 = r3.zza     // Catch: org.json.JSONException -> L17
            if (r1 == 0) goto L16
            java.util.concurrent.Executor r1 = r3.zzb     // Catch: org.json.JSONException -> L17
            com.google.android.gms.internal.ads.zzcpv r2 = new com.google.android.gms.internal.ads.zzcpv     // Catch: org.json.JSONException -> L17
            r2.<init>(r3, r0)     // Catch: org.json.JSONException -> L17
            r1.execute(r2)     // Catch: org.json.JSONException -> L17
        L16:
            return
        L17:
            r0 = move-exception
            java.lang.String r1 = "Failed to call video active view js"
            com.google.android.gms.ads.internal.util.zze.zzb(r1, r0)
            return
    }

    public final void zza() {
            r1 = this;
            r0 = 0
            r1.zze = r0
            return
    }

    public final void zzb() {
            r1 = this;
            r0 = 1
            r1.zze = r0
            r1.zzg()
            return
    }

    final /* synthetic */ void zzd(org.json.JSONObject r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r2.zza
            java.lang.String r1 = "AFMA_updateActiveView"
            r0.zzl(r1, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzayv
    public final void zzdp(com.google.android.gms.internal.ads.zzayu r5) {
            r4 = this;
            boolean r0 = r4.zzf
            if (r0 == 0) goto L6
            r0 = 0
            goto L8
        L6:
            boolean r0 = r5.zzj
        L8:
            com.google.android.gms.internal.ads.zzcpl r1 = r4.zzg
            r1.zza = r0
            com.google.android.gms.common.util.Clock r0 = r4.zzd
            long r2 = r0.elapsedRealtime()
            r1.zzd = r2
            com.google.android.gms.internal.ads.zzcpl r0 = r4.zzg
            r0.zzf = r5
            boolean r5 = r4.zze
            if (r5 == 0) goto L1f
            r4.zzg()
        L1f:
            return
    }

    public final void zze(boolean r1) {
            r0 = this;
            r0.zzf = r1
            return
    }

    public final void zzf(com.google.android.gms.internal.ads.zzcfo r1) {
            r0 = this;
            r0.zza = r1
            return
    }
}
