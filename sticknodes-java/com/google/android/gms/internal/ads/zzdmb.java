package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdmb {
    private final com.google.android.gms.internal.ads.zzdre zza;
    private final com.google.android.gms.internal.ads.zzdpt zzb;
    private final com.google.android.gms.internal.ads.zzcpw zzc;
    private final com.google.android.gms.internal.ads.zzdkx zzd;

    public zzdmb(com.google.android.gms.internal.ads.zzdre r1, com.google.android.gms.internal.ads.zzdpt r2, com.google.android.gms.internal.ads.zzcpw r3, com.google.android.gms.internal.ads.zzdkx r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    public final android.view.View zza() throws com.google.android.gms.internal.ads.zzcga {
            r5 = this;
            com.google.android.gms.internal.ads.zzdre r0 = r5.zza
            com.google.android.gms.ads.internal.client.zzs r1 = com.google.android.gms.ads.internal.client.zzs.zzc()
            r2 = 0
            com.google.android.gms.internal.ads.zzcfo r0 = r0.zza(r1, r2, r2)
            android.view.View r1 = r0.zzF()
            r2 = 8
            r1.setVisibility(r2)
            com.google.android.gms.internal.ads.zzdlw r1 = new com.google.android.gms.internal.ads.zzdlw
            r1.<init>(r5)
            java.lang.String r2 = "/sendMessageToSdk"
            r0.zzag(r2, r1)
            com.google.android.gms.internal.ads.zzdlx r1 = new com.google.android.gms.internal.ads.zzdlx
            r1.<init>(r5)
            java.lang.String r2 = "/adMuted"
            r0.zzag(r2, r1)
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
            com.google.android.gms.internal.ads.zzdly r2 = new com.google.android.gms.internal.ads.zzdly
            r2.<init>(r5)
            com.google.android.gms.internal.ads.zzdpt r3 = r5.zzb
            java.lang.String r4 = "/loadHtml"
            r3.zzm(r1, r4, r2)
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
            com.google.android.gms.internal.ads.zzdlz r2 = new com.google.android.gms.internal.ads.zzdlz
            r2.<init>(r5)
            com.google.android.gms.internal.ads.zzdpt r3 = r5.zzb
            java.lang.String r4 = "/showOverlay"
            r3.zzm(r1, r4, r2)
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
            com.google.android.gms.internal.ads.zzdma r2 = new com.google.android.gms.internal.ads.zzdma
            r2.<init>(r5)
            com.google.android.gms.internal.ads.zzdpt r3 = r5.zzb
            java.lang.String r4 = "/hideOverlay"
            r3.zzm(r1, r4, r2)
            android.view.View r0 = r0.zzF()
            return r0
    }

    final /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzcfo r2, java.util.Map r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzdpt r2 = r1.zzb
            java.lang.String r0 = "sendMessageToNativeJs"
            r2.zzj(r0, r3)
            return
    }

    final /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzcfo r1, java.util.Map r2) {
            r0 = this;
            com.google.android.gms.internal.ads.zzdkx r1 = r0.zzd
            r1.zzg()
            return
    }

    final /* synthetic */ void zzd(java.util.Map r1, boolean r2, int r3, java.lang.String r4, java.lang.String r5) {
            r0 = this;
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r3 = "messageType"
            java.lang.String r4 = "htmlLoaded"
            r2.put(r3, r4)
            java.lang.String r3 = "id"
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            r2.put(r3, r1)
            com.google.android.gms.internal.ads.zzdpt r1 = r0.zzb
            java.lang.String r3 = "sendMessageToNativeJs"
            r1.zzj(r3, r2)
            return
    }

    final /* synthetic */ void zze(com.google.android.gms.internal.ads.zzcfo r1, java.util.Map r2) {
            r0 = this;
            java.lang.String r2 = "Showing native ads overlay."
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r2)
            android.view.View r1 = r1.zzF()
            r2 = 0
            r1.setVisibility(r2)
            com.google.android.gms.internal.ads.zzcpw r1 = r0.zzc
            r2 = 1
            r1.zze(r2)
            return
    }

    final /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzcfo r1, java.util.Map r2) {
            r0 = this;
            java.lang.String r2 = "Hiding native ads overlay."
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r2)
            android.view.View r1 = r1.zzF()
            r2 = 8
            r1.setVisibility(r2)
            com.google.android.gms.internal.ads.zzcpw r1 = r0.zzc
            r2 = 0
            r1.zze(r2)
            return
    }
}
