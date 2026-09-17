package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public class zzdul {
    protected final java.util.Map zza;
    protected final android.content.Context zzb;
    protected final java.util.concurrent.Executor zzc;
    protected final com.google.android.gms.ads.internal.util.client.zzr zzd;
    protected final boolean zze;
    private final com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final java.util.concurrent.atomic.AtomicBoolean zzi;
    private final java.util.concurrent.atomic.AtomicReference zzj;

    protected zzdul(java.util.concurrent.Executor r3, com.google.android.gms.ads.internal.util.client.zzr r4, com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder r5, android.content.Context r6) {
            r2 = this;
            r2.<init>()
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbel.zza
            java.lang.Object r0 = r0.zze()
            java.lang.String r0 = (java.lang.String) r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.zza = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r2.zzi = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r0.<init>(r1)
            r2.zzj = r0
            r2.zzc = r3
            r2.zzd = r4
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzca
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r2.zze = r3
            r2.zzf = r5
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzcd
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r2.zzg = r3
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzgL
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r2.zzh = r3
            r2.zzb = r6
            return
    }

    private final void zza(java.util.Map r5, boolean r6) {
            r4 = this;
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L90
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L12
            java.lang.String r0 = "Empty or null paramMap."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)
            goto L5f
        L12:
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.zzi
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 != 0) goto L37
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkf
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.String r0 = (java.lang.String) r0
            android.content.Context r1 = r4.zzb
            com.google.android.gms.internal.ads.zzduk r2 = new com.google.android.gms.internal.ads.zzduk
            r2.<init>(r4, r0)
            android.os.Bundle r0 = com.google.android.gms.ads.internal.util.zzad.zza(r1, r0, r2)
            java.util.concurrent.atomic.AtomicReference r1 = r4.zzj
            r1.set(r0)
        L37:
            java.util.concurrent.atomic.AtomicReference r0 = r4.zzj
            java.lang.Object r0 = r0.get()
            android.os.Bundle r0 = (android.os.Bundle) r0
            java.util.Set r1 = r0.keySet()
            java.util.Iterator r1 = r1.iterator()
        L47:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5f
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r0.get(r2)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r5.put(r2, r3)
            goto L47
        L5f:
            com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder r0 = r4.zzf
            java.lang.String r0 = r0.generateUrl(r5)
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            java.lang.String r1 = "scar"
            java.lang.Object r5 = r5.get(r1)
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = java.lang.Boolean.parseBoolean(r5)
            boolean r1 = r4.zze
            if (r1 == 0) goto L8f
            if (r6 == 0) goto L7e
            boolean r6 = r4.zzg
            if (r6 == 0) goto L8f
        L7e:
            if (r5 == 0) goto L85
            boolean r5 = r4.zzh
            if (r5 != 0) goto L85
            goto L8f
        L85:
            java.util.concurrent.Executor r5 = r4.zzc
            com.google.android.gms.internal.ads.zzduj r6 = new com.google.android.gms.internal.ads.zzduj
            r6.<init>(r4, r0)
            r5.execute(r6)
        L8f:
            return
        L90:
            java.lang.String r5 = "Empty paramMap."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r5)
            return
    }

    protected final java.lang.String zzb(java.util.Map r2) {
            r1 = this;
            com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder r0 = r1.zzf
            java.lang.String r2 = r0.generateUrl(r2)
            return r2
    }

    public final java.util.concurrent.ConcurrentHashMap zzc() {
            r2 = this;
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            java.util.Map r1 = r2.zza
            r0.<init>(r1)
            return r0
    }

    final /* synthetic */ void zzd(java.lang.String r1, android.content.SharedPreferences r2, java.lang.String r3) {
            r0 = this;
            android.content.Context r2 = r0.zzb
            java.util.concurrent.atomic.AtomicReference r3 = r0.zzj
            android.os.Bundle r1 = com.google.android.gms.ads.internal.util.zzad.zzb(r2, r1)
            r3.set(r1)
            return
    }

    public final void zze(java.util.Map r2) {
            r1 = this;
            r0 = 1
            r1.zza(r2, r0)
            return
    }

    public final void zzf(java.util.Map r2) {
            r1 = this;
            r0 = 0
            r1.zza(r2, r0)
            return
    }
}
