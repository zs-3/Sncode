package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdlt implements android.view.View.OnClickListener {
    java.lang.String zza;
    java.lang.Long zzb;
    java.lang.ref.WeakReference zzc;
    private final com.google.android.gms.internal.ads.zzdpt zzd;
    private final com.google.android.gms.common.util.Clock zze;
    private com.google.android.gms.internal.ads.zzbhw zzf;
    private com.google.android.gms.internal.ads.zzbjw zzg;

    public zzdlt(com.google.android.gms.internal.ads.zzdpt r1, com.google.android.gms.common.util.Clock r2) {
            r0 = this;
            r0.<init>()
            r0.zzd = r1
            r0.zze = r2
            return
    }

    private final void zzd() {
            r3 = this;
            r0 = 0
            r3.zza = r0
            r3.zzb = r0
            java.lang.ref.WeakReference r1 = r3.zzc
            if (r1 != 0) goto La
            goto L1b
        La:
            java.lang.Object r1 = r1.get()
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L1b
            r2 = 0
            r1.setClickable(r2)
            r1.setOnClickListener(r0)
            r3.zzc = r0
        L1b:
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r5) {
            r4 = this;
            java.lang.ref.WeakReference r0 = r4.zzc
            if (r0 == 0) goto L46
            java.lang.Object r0 = r0.get()
            if (r0 == r5) goto Lb
            goto L46
        Lb:
            java.lang.String r5 = r4.zza
            if (r5 == 0) goto L43
            java.lang.Long r5 = r4.zzb
            if (r5 == 0) goto L43
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.lang.String r0 = r4.zza
            java.lang.String r1 = "id"
            r5.put(r1, r0)
            com.google.android.gms.common.util.Clock r0 = r4.zze
            long r0 = r0.currentTimeMillis()
            java.lang.Long r2 = r4.zzb
            long r2 = r2.longValue()
            long r0 = r0 - r2
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "time_interval"
            r5.put(r1, r0)
            java.lang.String r0 = "messageType"
            java.lang.String r1 = "onePointFiveClick"
            r5.put(r0, r1)
            com.google.android.gms.internal.ads.zzdpt r0 = r4.zzd
            java.lang.String r1 = "sendMessageToNativeJs"
            r0.zzj(r1, r5)
        L43:
            r4.zzd()
        L46:
            return
    }

    public final com.google.android.gms.internal.ads.zzbhw zza() {
            r1 = this;
            com.google.android.gms.internal.ads.zzbhw r0 = r1.zzf
            return r0
    }

    public final void zzb() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbhw r0 = r2.zzf
            if (r0 != 0) goto L5
            goto L18
        L5:
            java.lang.Long r0 = r2.zzb
            if (r0 == 0) goto L18
            r2.zzd()
            com.google.android.gms.internal.ads.zzbhw r0 = r2.zzf     // Catch: android.os.RemoteException -> L12
            r0.zze()     // Catch: android.os.RemoteException -> L12
            return
        L12:
            r0 = move-exception
            java.lang.String r1 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r1, r0)
        L18:
            return
    }

    public final void zzc(com.google.android.gms.internal.ads.zzbhw r4) {
            r3 = this;
            r3.zzf = r4
            com.google.android.gms.internal.ads.zzbjw r0 = r3.zzg
            java.lang.String r1 = "/unconfirmedClick"
            if (r0 == 0) goto Ld
            com.google.android.gms.internal.ads.zzdpt r2 = r3.zzd
            r2.zzn(r1, r0)
        Ld:
            com.google.android.gms.internal.ads.zzdls r0 = new com.google.android.gms.internal.ads.zzdls
            r0.<init>(r3, r4)
            r3.zzg = r0
            com.google.android.gms.internal.ads.zzdpt r4 = r3.zzd
            r4.zzl(r1, r0)
            return
    }
}
